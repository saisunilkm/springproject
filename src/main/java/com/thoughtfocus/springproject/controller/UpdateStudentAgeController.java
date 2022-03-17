package com.thoughtfocus.springproject.controller;

import com.thoughtfocus.springproject.dto.UpdateStudentAgeDto;
import com.thoughtfocus.springproject.service.UpdateAgeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UpdateStudentAgeController {
    Logger logger = LoggerFactory.getLogger(UpdateStudentAgeController.class);
    @Autowired
    UpdateAgeService updateAgeService;

    @PostMapping("/updateAge")
    public String updateAge(@RequestBody UpdateStudentAgeDto updateStudentAgeDto){
        try {
            boolean status = updateAgeService.updateAgeUsingId(updateStudentAgeDto);
            if(status){
                return "Age updated Successfully...";
            }
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return "Age Not Updated";
    }

}
