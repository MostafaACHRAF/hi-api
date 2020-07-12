package com.docker.api.spring_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BaseController {

    @GetMapping(value = "/hi/{name}", produces = "application/json")
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }
}
