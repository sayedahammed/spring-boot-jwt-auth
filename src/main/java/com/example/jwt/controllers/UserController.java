package com.example.jwt.controllers;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping()
    public String users() {
        return "OK";
    }
}
