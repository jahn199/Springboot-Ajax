package com.kh.AjaxSpringProject.controller;


import com.kh.AjaxSpringProject.dto.Person;
import com.kh.AjaxSpringProject.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonServiceImpl personService;

    /**
     * /api/person 주소로
     * DB에서 가져온 Users 정보를 전달
     *
     */

    @GetMapping("/api/person")
    public List<Person> getAllperson() {
        return personService.getAllPerson();
    }

    @GetMapping("/api/person/{id}")
    public Person getPersonById(@PathVariable("id") int id) {
        return personService.getPersonById(id);
    }
}
