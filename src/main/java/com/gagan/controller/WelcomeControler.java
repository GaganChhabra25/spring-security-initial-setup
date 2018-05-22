package com.gagan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeControler {

    @RequestMapping(name = "/welcome", method = RequestMethod.GET)
    @ResponseBody
    public String welcome() {
        return " Welcome gagan";

    }
}
