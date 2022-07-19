package edu.escuelaing.arsw.labs.tdd.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @SuppressWarnings("java:S3400")
    public String greet() {
        return "Hello, World";
    }
}
