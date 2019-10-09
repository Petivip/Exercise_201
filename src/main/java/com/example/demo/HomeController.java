package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/form")
    public String pageForm(){
        return "index";
    }


    @RequestMapping("/processform")
    public String submitResult(@RequestParam("email") String email, Model model){
        model.addAttribute("emailVal",email);
                return "view";
    }
}
