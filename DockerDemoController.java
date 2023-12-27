package com.jhooq.demo.Roshandockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoshanDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Docker Demo - Hello Jhooq";
    }
}
