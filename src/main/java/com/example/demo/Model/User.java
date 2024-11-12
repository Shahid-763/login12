package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;        
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User<role> {
    private String username;
    private String password;
    private String role;
}
