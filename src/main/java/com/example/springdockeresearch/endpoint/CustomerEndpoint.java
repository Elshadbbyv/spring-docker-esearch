package com.example.springdockeresearch.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerEndpoint {
    @GetMapping("/all")
    public String getAll(){
        return "Salam";
    }
}
