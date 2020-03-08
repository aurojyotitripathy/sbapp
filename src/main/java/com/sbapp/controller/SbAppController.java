package com.sbapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbAppController {

    @GetMapping(value = {"","/"})
    public @ResponseBody String index(){
        return "Hello World";
    }
}
