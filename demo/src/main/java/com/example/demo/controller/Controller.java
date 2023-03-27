package com.example.demo.controller;

import com.example.demo.service.MyServiceLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

   // @Autowired
    MyServiceLevel myServiceLevel;

    @Autowired
    public Controller(MyServiceLevel myServiceLevel) {
        this.myServiceLevel = myServiceLevel;
    }

//    @Autowired
//    public void setMyServiceLevel(MyServiceLevel myServiceLevel) {
//        this.myServiceLevel = myServiceLevel;
//    }

    @GetMapping("/index")
    public String getInfo() {
        return "Hello";
    }

    @GetMapping("/info")
    public String getMappingInfo() {
        return myServiceLevel.getSum();
    }
    @RequestMapping(method = RequestMethod.GET, name = "/")
    public String getMappingInfo2() {
        return myServiceLevel.getSum();
    }
}
