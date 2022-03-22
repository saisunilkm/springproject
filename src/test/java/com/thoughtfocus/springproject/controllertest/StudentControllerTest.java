package com.thoughtfocus.springproject.controllertest;

import com.thoughtfocus.springproject.controller.StudentController;
import com.thoughtfocus.springproject.dto.StudentDto;
import com.thoughtfocus.springproject.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {
    @InjectMocks
    StudentController studentController;


    @Mock
    StudentService studentService;

    @Test
    public void saveStudent(){
        String expected="Data has been saved successfully....";

        StudentDto student = new StudentDto(5,"Ravi","ravi@123",29);
        String result = studentController.student(student);

        assertEquals(expected,result);
    }
}
