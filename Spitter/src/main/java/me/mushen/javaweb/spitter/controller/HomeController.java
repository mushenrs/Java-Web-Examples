package me.mushen.javaweb.spitter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Desc
 * @Author Remilia
 * @Create 2016-11-20
 */
@Controller
public class HomeController {

    @RequestMapping(
            path = "/",
            method = RequestMethod.GET
    )
    public String homePage(){

        return "home";
    }
}
