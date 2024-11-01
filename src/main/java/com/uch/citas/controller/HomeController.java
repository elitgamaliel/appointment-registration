package com.uch.citas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class HomeController {
    @GetMapping
    public String redirectToLogin() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestBody String entity) {
        System.out.println(entity);        
        return "home";
    }
    

    @GetMapping("/register")
    public String register() {
        return "register";
    }


    @GetMapping("/forgot-password")
    public String forgotPassword() {
        return "forgot-password";
    }



    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/appointments")
    public String appointments() {
        return "appointments";
    }

    @GetMapping("/patients")
    public String patients() {
        return "patients";
    }

    @GetMapping("/specialties")
    public String specialties() {
        return "specialties";
    }

    @GetMapping("/schedules")
    public String schedules() {
        return "schedules";
    }

    @GetMapping("/users")
    public String users() {
        return "users";
    }

    @GetMapping("/settings")
    public String settings() {
        return "settings";
    }
}