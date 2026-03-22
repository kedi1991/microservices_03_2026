package com.microservicios.devops.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<String> getUsers(){
        return List.of("henry", "Omach", "Cooper");
    }
}
