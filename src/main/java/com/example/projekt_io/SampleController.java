package com.example.projekt_io;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/test")
    public String firstMethod() {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    }
    @GetMapping("/getUserData")
    public userData getUserData() {
        return new userData(1,"Janek","abc@wp.pl","123abc");
    }
}
