package com.mycompany.airline_reservation_system.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @GetMapping("/health")
    public String checkStatus() {
        return "Admin API is running.";
    }
}
