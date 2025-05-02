package com.ahaba.sechedulerBakend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;


public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Hello from Spring!");
    }
}
