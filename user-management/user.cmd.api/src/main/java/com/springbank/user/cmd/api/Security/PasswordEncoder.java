package com.springbank.user.cmd.api.Security;

public interface PasswordEncoder {

    String hashPassword(String password);
}
