package com.kamann.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@Getter
public class ThereIsNoUserException extends RuntimeException {
    public ThereIsNoUserException(String message) {
        super(message);
    }
}
