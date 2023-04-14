package com.genspark.SpringBootdemoApplication.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/")
    public String home()
    {
        return "<HTML><H1>Welcome to Spring Boot Project 1 Applications</H1><HTML>";
    }
}
