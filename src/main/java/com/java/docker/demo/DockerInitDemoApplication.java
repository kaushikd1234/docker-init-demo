package com.java.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/testdocker")
public class DockerInitDemoApplication {

    @GetMapping
    public String message() {
        return "app is deployed via docker!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerInitDemoApplication.class, args);
    }

}
