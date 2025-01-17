package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.dto.Cafe;
import com.kh.AjaxSpringProject.dto.User;
import com.kh.AjaxSpringProject.service.CafeService;
import com.kh.AjaxSpringProject.service.CafeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class SpringController {
    @Autowired
    private CafeServiceImpl cafeService;

    @GetMapping("/api/cafes")
    //CafeServiceImpl.java 파일에
    //getAllCafe() 메서드 자료형으로 List
    //public 다음에 List<Cafe>가 자료형으로
    public List<Cafe> getAllCafes() {
        List<Cafe> cafes = cafeService.getAllCafes();
        log.info("Cafes: {}", cafes);
        return cafes;
        //return cafeService.getAllCafes();
    }

    @GetMapping("/api/cafes/{id}")
    public Cafe getCafeById(@PathVariable("id") int id) {
        return cafeService.getCafeId(id);
    }
}