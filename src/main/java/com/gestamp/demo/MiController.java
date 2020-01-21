package com.gestamp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MiController {
    @GetMapping
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }
    @RequestMapping("/api")
    public String welcomeAPI() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }

}
