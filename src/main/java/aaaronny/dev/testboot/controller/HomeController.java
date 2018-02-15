package aaaronny.dev.testboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/mapPage")
    public String getHome() {
        return "mapped_page";
    }
}
