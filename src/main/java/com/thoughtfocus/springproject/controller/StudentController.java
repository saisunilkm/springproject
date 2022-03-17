package com.thoughtfocus.springproject.controller;

import com.thoughtfocus.springproject.dto.Student;
import com.thoughtfocus.springproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping("/save")
    String student(@RequestBody Student student) {
        if (student != null) {
            service.saveStudent(student);
            return "Data has been saved successfully.....";

        }else{
            return "Data not saved";
        }
    }
}
