package com.hwadee.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    @RequestMapping(value = "/doBusiness",method = {RequestMethod.GET})
    public String doBusiness(){
        return "buyBussiness";
    }
    @RequestMapping(value = "/buy",method = {RequestMethod.GET})
    public String buy(){
        return "buy";
    }
    @RequestMapping(value = "/change",method = {RequestMethod.GET})
    public String closeBusiness(){
        return "changeBusiness";
    }
    @RequestMapping(value = "/close",method = {RequestMethod.GET})
    public String close(){
        return "change";
    }
    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/regist",method = {RequestMethod.GET})
    public String regist(){
        return "regist";
    }
    }

