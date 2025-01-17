package com.kh.AjaxSpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonrestController {
    @GetMapping("/all/person")
    public String allPersons() {
        return "person";
    }

    @GetMapping("/all/inone")
    public String infoid(@RequestParam("id")int id) {
        return "personDetail";
    }
}
