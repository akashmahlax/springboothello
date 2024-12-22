package com.example.ecom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello") // Maps to http://localhost:8080/hello
    public String sayHello() {
        return "Hello, World!";
    }

     @GetMapping("/") // Maps to http://localhost:8080/ (root path)
    public String home() {
        return "Welcome to the Home Page!";
    }
}