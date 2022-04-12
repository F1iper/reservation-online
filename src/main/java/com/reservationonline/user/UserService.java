package com.reservationonline.user;

import com.reservationonline.user.registration.token.ConfirmationToken;
import com.reservationonline.user.registration.token.ConfirmationTokenService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {
    
    private final static String USER_NOT_FOUND_MSG = "User with email %s not found";
    private final UserRepository userRepository;
    private final ConfirmationTokenService tokenService;
    private final BCryptPasswordEncoder encoder;
    
    @Override
    public UserDetails loadUserByUsername(final String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
    }
    
    public void enableUser(String email) {
        userRepository.enableUser(email);
    }
    
    @Transactional
    public String signUpUser(User user) {
        final boolean userExists = userRepository.findByEmail(user.getEmail())
                .isPresent();
        if (userExists) {
            // TODO: 11.04.2022 check if attributes are the same
            // TODO: if email not confirmed -> send confirmation email
            
            
            throw new IllegalStateException("Email already taken");
        }
        
        final String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        String token = UUID.randomUUID().toString();
        ConfirmationToken confirmationToken = new ConfirmationToken(
                token,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(15),
                user
        );
        userRepository.save(user);
        tokenService.saveConfirmationToken(confirmationToken);
        
        // TODO: 10.04.2022 Send Email
        
        return token;
    }
    
    List<User> getUsers() {
        return userRepository.findAll();
    }
    
    User addNewUser(final User user) {
        final Optional<User> optionalUser = userRepository.findByEmail(user.getEmail());
        if (optionalUser.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        return userRepository.save(user);
    }
    
    void deleteUser(final Long id) {
        final boolean exists = userRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("User with id: " + id + " does not exists.");
        }
        userRepository.deleteById(id);
    }
    
    @Transactional
    void updateUser(Long id,
                    String name,
                    String email) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("User with id: " + id + " does not exist."));
        
        if (name != null && name.length() > 0 && !Objects.equals(user.getFirstName(), name)) {
            user.setFirstname(name);
        }
        userRepository.save(user);
        
        if (email != null && email.length() > 0 && !Objects.equals(user.getEmail(), email)) {
            Optional<User> optionalUser = userRepository.findByEmail(email);
            if (optionalUser.isPresent()) {
                throw new IllegalStateException("Email taken");
            }
            user.setEmail(email);
            userRepository.save(user);
        }
    }
}
