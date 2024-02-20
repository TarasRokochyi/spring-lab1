package com.example.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String index(Model model){
        model.addAttribute("pageTitle", "Hello Spring!");
        model.addAttribute("languages", List.of("java", "kotlin", "groovy"));

        User user1 = new User("Taras");
        model.addAttribute("user", user1);

        HashMap<Integer, String> films = new HashMap<Integer, String>();
        films.put(2001, "The Fellowship Of The Ring");
        films.put(2002, "The Two Towers");
        films.put(2003, "The Return Of The King");
        model.addAttribute("films", films);

        int[] array = { 123, 432, 923,};
        model.addAttribute("array", array);

        Computer computer = new Computer("amd ryzen 5 1400", "amd radeon R9 380", "kingston 248gb", 16);
        model.addAttribute("computer", computer);

        model.addAttribute("search", "c-3po");

        model.addAttribute("expression", "haven`t");

        model.addAttribute("game", "The Witness");

        return "index";
    }

}
