package com.example.demo.current_tasks;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class CurrentTasksController {

    @GetMapping
    public String current_tasks(Model model) {
        return "current_tasks/current_tasks.html";
    }
}
