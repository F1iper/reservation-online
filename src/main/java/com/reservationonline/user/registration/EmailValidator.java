package com.reservationonline.user.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {
    
    @Override
    public boolean test(final String s) {
        // TODO: 10.04.2022 Regex to validate Email
        
        return true;
    }
}
