package com.example.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String index(Model model){
        model.addAttribute("pageTitle", "Hello Spring!");
        model.addAttribute("languages", List.of("java", "kotlin", "groovy"));
        return "index";
    }

}
