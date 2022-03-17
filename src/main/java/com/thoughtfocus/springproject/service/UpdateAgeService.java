package com.thoughtfocus.springproject.service;

import com.thoughtfocus.springproject.dto.UpdateStudentAgeDto;

public interface UpdateAgeService {
    public boolean updateAgeUsingId (UpdateStudentAgeDto ageDto);
}
