package com.reservationonline.user.registration.email;

public interface EmailSender {
    
    void send(String to, String email);
}
