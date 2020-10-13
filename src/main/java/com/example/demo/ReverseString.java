package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
public class ReverseString {

    @RequestMapping(method = RequestMethod.GET, path = "/rev")
    public String reverseString(){
        return "first try";
    }
}
