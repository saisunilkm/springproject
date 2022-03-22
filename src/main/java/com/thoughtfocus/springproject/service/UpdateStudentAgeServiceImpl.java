package com.thoughtfocus.springproject.service;

import com.thoughtfocus.springproject.detailsentity.StudentDetailsEntity;
import com.thoughtfocus.springproject.dto.UpdateStudentAgeDto;
import com.thoughtfocus.springproject.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateStudentAgeServiceImpl implements UpdateStudentAgeService{
    Logger logger = LoggerFactory.getLogger(UpdateStudentAgeServiceImpl.class);
    @Autowired
    StudentRepository studentRepository;

    @Override
    public boolean updateStudentAgeUsingId(UpdateStudentAgeDto updateStudentAgeDto) {
        try {
            StudentDetailsEntity detailsEntity = studentRepository.getById(updateStudentAgeDto.getId());
            if(updateStudentAgeDto!=null){
                detailsEntity.setAge(updateStudentAgeDto.getAge());
                studentRepository.save(detailsEntity);
                return true;
            }
        } catch (BeansException e) {
            logger.error(e.getMessage());
        }
        return false;
    }
}
