package com.example.demo.add_task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add_task")
public class AddTaskController {

    @GetMapping
    public String add_task(Model model) {
        return "add_task/add_task.html";
    }

}
