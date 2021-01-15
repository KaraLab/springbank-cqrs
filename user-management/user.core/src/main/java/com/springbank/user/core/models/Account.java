package com.springbank.user.core.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {

    @Size(min = 2, message = "username must have a minimum of two characters")
    private String username;
    @Size(min = 10, message = "password must have a minimum of ten characters")
    private String password;
    @NotNull(message = "specify at least one role")
    private List<Role> roles;
}
