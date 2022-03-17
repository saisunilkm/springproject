package com.thoughtfocus.springproject.servicetest;

import com.thoughtfocus.springproject.entity.StudentDetailsEntity;
import com.thoughtfocus.springproject.dto.UpdateStudentAgeDto;
import com.thoughtfocus.springproject.repository.StudentRepository;
import com.thoughtfocus.springproject.service.UpdateAgeServiceImpl;
import org.junit.jupiter.api.BeforeAll;
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
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UpdateAgeServiceTest {

    @InjectMocks
    UpdateAgeServiceImpl updateAgeService;

    @Mock
    StudentRepository details;

    @Mock
    StudentDetailsEntity detailsEntity;

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
        when(details.getById(anyInt())).thenReturn(detailsEntity);
        boolean result = updateAgeService.updateAgeUsingId(updateStudentAgeDto);
        assertEquals(result,expected);
    }



}
