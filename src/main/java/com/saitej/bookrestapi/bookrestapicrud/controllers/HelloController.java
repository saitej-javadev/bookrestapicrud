package com.saitej.bookrestapi.bookrestapicrud.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello(){
        return "Hello Spring Framework Guru!!";
    }
}
