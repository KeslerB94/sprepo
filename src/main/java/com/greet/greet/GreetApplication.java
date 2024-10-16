package com.greet.greet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GreetApplication {

            @GetMapping("/greet")
            public String greet() {
                return "Hello, Beau Kesler";
            }

            @GetMapping("/farewell")
            public String farewell() {
                return "Goodbye, see you soon!";
            }

            @GetMapping("/welcome")
            public String welcome() {
                return "Welcome to the Spring Boot application!";
            }
        }

