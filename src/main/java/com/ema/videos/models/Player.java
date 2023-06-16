package com.ema.videos.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Data
@Getter
@Setter
public class Player {
    private Long id;
    @NotNull(message = "UserName can't be null")
    private String userName;
    @NotNull(message = "Password can't be null")
    private String password;
    @NotNull(message = "Email can't be null")
    @Email(message = "The email need to be a valid format")
    private String email;
    private String avatar;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime lastLogin;

}
