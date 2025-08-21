package com.example.customerservice.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("api/test")
public class CustomerController {
    private final List<String> messages = new ArrayList<>(List.of("Hi", "Hello"));

    @GetMapping
    public List<String> getMessages(){
        return messages;
    }
}
