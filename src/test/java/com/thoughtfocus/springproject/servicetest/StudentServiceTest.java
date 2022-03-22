package com.thoughtfocus.springproject.servicetest;

import com.thoughtfocus.springproject.detailsentity.StudentDetailsEntity;
import com.thoughtfocus.springproject.dto.StudentDto;
import com.thoughtfocus.springproject.repository.StudentRepository;
import com.thoughtfocus.springproject.service.StudentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
    @InjectMocks
    StudentServiceImpl studentService;

    @Mock
    StudentRepository studentRepository;

    @Mock
    StudentDetailsEntity studentDetailsEntity;

    @Mock
    StudentDto studentDto;

    @BeforeEach
    void setUp() {
        studentDto.setName("Sunil ");
        studentDto.setAge(22);
        studentDto.setId(101);
        studentDto.setEmail("sunil@258");
    }
    @Test
    public void saveStudentTest() {

        boolean expected=true;

        when(studentRepository.save(any(StudentDetailsEntity.class))).thenReturn(studentDetailsEntity);

        boolean result=studentService.saveStudent(studentDto);

        assertEquals(result,expected);

    }

}
