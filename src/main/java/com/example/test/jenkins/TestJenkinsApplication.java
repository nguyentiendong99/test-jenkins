package com.example.test.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestJenkinsApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "nguyen tien dong dep trai";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class, args);
    }

}
