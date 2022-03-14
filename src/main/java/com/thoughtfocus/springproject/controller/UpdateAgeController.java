package com.thoughtfocus.springproject.controller;

import com.thoughtfocus.springproject.dto.UpdateAgeDto;
import com.thoughtfocus.springproject.service.UpdateAgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UpdateAgeController {
    @Autowired
    UpdateAgeService updateage;

    @PostMapping("/updateAge")
    String updateAge(@RequestBody UpdateAgeDto upagedto){
        try {
            boolean status = updateage.updateAgeUsingId(upagedto);
            if(status){
                return "Successfully updated age";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Age Not Updated..";
    }

}
