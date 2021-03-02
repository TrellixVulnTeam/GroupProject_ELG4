package com.groupProject.groupProject.controlles;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class RegistrationRequest {

    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email should be valid")
    @Pattern(regexp = "^$|^[a-zA-Z0-9_.+-]+@(?:(?:[a-zA-Z0-9-]+\\.)?[a-zA-Z]+\\.)?(knu)\\.ua$",message = "Not knu user")
    private String email;

    @NotEmpty(message = "Password cannot be empty")
    @Min(value = 7, message
            = "Password must be not less than 7")
    private String password;
    @NotNull(message = "Name cannot be null")
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 2, max = 30, message
            = "Name must be between 2 and 30 characters")
    private String name;
    @Size(min = 2, max = 30, message
            = "Surname must be between 2 and 30 characters")
    @NotNull(message = "Surname cannot be null")
    @NotEmpty(message = "Surname cannot be empty")
    private String surname;

}
