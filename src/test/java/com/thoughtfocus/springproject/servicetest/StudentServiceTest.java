package com.thoughtfocus.springproject.servicetest;

import com.thoughtfocus.springproject.entity.StudentDetailsEntity;
import com.thoughtfocus.springproject.dto.StudentDto;
import com.thoughtfocus.springproject.repository.StudentRepository;
import com.thoughtfocus.springproject.service.StudentService;
import com.thoughtfocus.springproject.service.StudentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.BeanUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @InjectMocks
    StudentServiceImpl studentService;

    @Mock
    StudentRepository details;

    @Mock
    StudentDetailsEntity detailsEntity;

    @Mock
    StudentDto student;

    @BeforeEach
        void setUp() {
            student.setName("Sunil ");
            student.setAge(22);
            student.setId(101);
            student.setEmail("sunil@258");
        }
        @Test
        public void saveStudentTest() {

            boolean expected=true;

            when(details.save(any(StudentDetailsEntity.class))).thenReturn(detailsEntity);

            boolean result=studentService.saveStudent(student);

            assertEquals(result,expected);

        }
    }

