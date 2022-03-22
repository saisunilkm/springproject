package com.thoughtfocus.springproject.servicetest;

import com.thoughtfocus.springproject.detailsentity.StudentDetailsEntity;
import com.thoughtfocus.springproject.dto.UpdateStudentAgeDto;
import com.thoughtfocus.springproject.repository.StudentRepository;
import com.thoughtfocus.springproject.service.UpdateStudentAgeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UpdateStudentAgeServiceTest {

    @InjectMocks
    UpdateStudentAgeServiceImpl updateStudentAgeService;

    @Mock
    StudentRepository studentRepository;

    @Mock
    StudentDetailsEntity studentdetailsEntity;

    @Mock
    UpdateStudentAgeDto updateStudentAgeDto;


    @BeforeEach
    void setUp(){
        updateStudentAgeDto.setId(25);
        updateStudentAgeDto.setAge(50);

    }
    @Test
    public void validateUpdateAgeTest(){
        boolean expected = true;
        when(studentRepository.getById(anyInt())).thenReturn(studentdetailsEntity);
        boolean result = updateStudentAgeService.updateStudentAgeUsingId(updateStudentAgeDto);
        assertEquals(result,expected);
    }
}
