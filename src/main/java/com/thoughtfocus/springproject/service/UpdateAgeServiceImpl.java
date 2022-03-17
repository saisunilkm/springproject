package com.thoughtfocus.springproject.service;

import com.thoughtfocus.springproject.entity.StudentDetailsEntity;
import com.thoughtfocus.springproject.dto.UpdateStudentAgeDto;
import com.thoughtfocus.springproject.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateAgeServiceImpl implements UpdateAgeService{
    Logger logger = LoggerFactory.getLogger(UpdateAgeServiceImpl.class);
    @Autowired
    StudentRepository details;

    @Override
    public boolean updateAgeUsingId(UpdateStudentAgeDto updateStudentAgeDto) {
        try {
            StudentDetailsEntity detailsEntity = details.getById(updateStudentAgeDto.getId());
            if(updateStudentAgeDto!=null){
                detailsEntity.setAge(updateStudentAgeDto.getAge());
                details.save(detailsEntity);
                return true;
            }
        } catch (BeansException e) {
            logger.error(e.getMessage());
        }
        return false;
    }
}
