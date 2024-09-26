package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController { // Renamed the class to avoid conflict with the annotation

    @RequestMapping("/home")
    public String returnHome() {
        return "home"; // This should correspond to a home.html file in src/main/resources/templates
    }

}
