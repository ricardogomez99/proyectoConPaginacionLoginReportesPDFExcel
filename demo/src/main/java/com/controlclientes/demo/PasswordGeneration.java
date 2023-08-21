package com.controlclientes.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGeneration {
    
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String rawPassword = "12345";
        String encodedPassword = encoder.encode(rawPassword);

        System.out.println(encodedPassword);
    }
    
}
