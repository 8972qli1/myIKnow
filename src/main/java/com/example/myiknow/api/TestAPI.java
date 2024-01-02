package com.example.myiknow.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestAPI {



    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test success";
    }

}
