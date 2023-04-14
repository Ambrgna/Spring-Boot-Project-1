package com.genspark.SpringBootdemoApplication.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/")
    public String home()
    {
        return "<HTML>" +
                "<H1>Welcome to Spring Boot Project 1 Applications</H1>" +
                "<a href='/album/'>Album Application</a>" +
                "<br>" +
                "<a href='/student/'>Student Application</a>" +
                "<HTML>";
    }
}
