package com.example.project.model.binding;

import com.example.project.model.validators.FieldMatch;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@FieldMatch(
        first = "password",
        second = "confirmPassword"
)

public class UserRegistrationBindingModel {
   private String username;
   private String email;
   private String password;
   private String confirmPassword;

    public UserRegistrationBindingModel() {
    }

    @NotEmpty
    @Size(min = 4)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Email
    @NotEmpty
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotEmpty
    @Size(min = 5, max = 15)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotEmpty
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
