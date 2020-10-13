package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseString {

    @RequestMapping(path = "/rev")
    public String reverseString(@RequestParam(value = "stringToReverse", required = false) String input){

        StringBuilder result = new StringBuilder();

        result.append(input);
        result = result.reverse();

        return result.toString();
    }
}
