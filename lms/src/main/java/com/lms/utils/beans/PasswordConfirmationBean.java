package com.lms.utils.beans;


import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by bhushan on 24/4/17.
 */
@Setter @Getter @Builder @AllArgsConstructor @NoArgsConstructor
public class PasswordConfirmationBean {
    @NotEmpty(message = "{password.not.empty}")
    @Size(max = 255, message = "{isbn.max}")
    private String password;
    @Size(max = 255, message = "{isbn.max}")
    @NotEmpty(message = "{confirmPassword.not.empty}")
    private String confirmPassword;
    @NotEmpty(message = "{token.not.empty}")
    private String token;
}
