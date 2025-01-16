package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SummerController {

    @GetMapping("/all/cafe")
    public String allcafe() {
        return "cafe";
    }
}
