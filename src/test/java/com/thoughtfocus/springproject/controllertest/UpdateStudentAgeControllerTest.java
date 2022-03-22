package com.thoughtfocus.springproject.controllertest;

import com.thoughtfocus.springproject.controller.UpdateStudentAgeController;
import com.thoughtfocus.springproject.dto.UpdateStudentAgeDto;
import com.thoughtfocus.springproject.service.UpdateStudentAgeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UpdateStudentAgeControllerTest {
    @InjectMocks
    UpdateStudentAgeController updateStudentAgeController;

    @Mock
    UpdateStudentAgeService updateStudentAgeService;

    @Test
    public void updateAgeUsingId(){

        when(updateStudentAgeService.updateStudentAgeUsingId(any(UpdateStudentAgeDto.class))).thenReturn(true);

        String expected = "Age updated Successfully...";

        UpdateStudentAgeDto updateStudentAgeDto = new UpdateStudentAgeDto(5,29);
        String result = updateStudentAgeController.updateAge(updateStudentAgeDto);
        assertEquals(expected,result);

    }
}
