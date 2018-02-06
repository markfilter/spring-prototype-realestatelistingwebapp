package com.markzfilter.realestatelistingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping(value = "/")
    public String displayHomePage() {
        return "home";
    }

    @RequestMapping(value = "/about")
    public String displayAboutPage() {
        return "about";
    }

    @RequestMapping(value = "/listing")
    public String displayListingPage() {
        return "listing";
    }

    @RequestMapping(value = "/contact")
    public String displayContactPage() {
        return "contact";
    }

}
