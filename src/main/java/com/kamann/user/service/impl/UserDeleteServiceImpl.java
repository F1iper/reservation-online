package com.kamann.user.service.impl;

import com.kamann.user.repository.UserRepository;
import com.kamann.user.service.UserDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDeleteServiceImpl implements UserDeleteService {

    private final UserRepository userRepository;

    @Override
    public String isDeleted(Long id) {
        if (userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
            return "User is deleted.";
        }
        return "User not found.";
    }
}
