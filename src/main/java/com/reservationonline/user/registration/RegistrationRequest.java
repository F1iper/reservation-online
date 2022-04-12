package com.reservationonline.user.registration;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
class RegistrationRequest {
    
    RegistrationRequest() {
    }
    
    RegistrationRequest(final String firstname, final String lastname, final String password, final String email) {
        
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
    }
    
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    
}
