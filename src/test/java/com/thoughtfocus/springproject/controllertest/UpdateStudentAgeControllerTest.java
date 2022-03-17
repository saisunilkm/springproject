package com.thoughtfocus.springproject.controllertest;

import com.thoughtfocus.springproject.controller.UpdateStudentAgeController;
import com.thoughtfocus.springproject.dto.UpdateStudentAgeDto;
import com.thoughtfocus.springproject.service.UpdateAgeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UpdateStudentAgeControllerTest {

    @InjectMocks
    UpdateStudentAgeController updateStudentAgeController;

    @Mock
    UpdateAgeService updateAgeService;

    @Test
    public void updateAgeUsingId(){

        when(updateAgeService.updateAgeUsingId(any(UpdateStudentAgeDto.class))).thenReturn(true);

        String expected = "Age updated Successfully...";

        UpdateStudentAgeDto updateStudentAgeDto = new UpdateStudentAgeDto(5,29);
        String result = updateStudentAgeController.updateAge(updateStudentAgeDto);
        assertEquals(expected,result);

    }

}
