package com.example.demo.controller; 
 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 
 
@RestController 
public class HelloController { 
    @GetMapping("/") 
    public String home() { 
        return "<h1>Welcome to My Spring Boot App!</h1>"; 
    } 
} 
  