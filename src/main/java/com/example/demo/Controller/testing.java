package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testing {

    @GetMapping("/testing")
    public String getdata()
    {
        return "hello testing";
    }
}
