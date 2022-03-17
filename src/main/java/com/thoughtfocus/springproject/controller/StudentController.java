package com.thoughtfocus.springproject.controller;

import com.thoughtfocus.springproject.dto.StudentDto;
import com.thoughtfocus.springproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public String student (@RequestBody StudentDto studentDto) {
        if (studentDto != null) {
            studentService.saveStudent(studentDto);
            return "Data has been saved successfully....";

        }else{
            return "Data not saved";
        }
    }

}
