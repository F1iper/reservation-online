package com.kamann.user.service.impl;

import com.kamann.exception.ResourceNotFoundException;
import com.kamann.user.domain.User;
import com.kamann.user.repository.UserRepository;
import com.kamann.user.service.UserDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDeleteServiceImpl implements UserDeleteService {

    private final UserRepository userRepository;

    @Override
    public boolean delete(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found: " + id));
        userRepository.deleteById(user.getId());
        return !userRepository.existsById(id);
    }
}
