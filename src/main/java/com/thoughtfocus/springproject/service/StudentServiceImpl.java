package com.thoughtfocus.springproject.service;

import com.thoughtfocus.springproject.detailsentity.StudentDetailsEntity;
import com.thoughtfocus.springproject.dto.StudentDto;
import com.thoughtfocus.springproject.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
    StudentRepository details;

    @Override
    public boolean saveStudent(StudentDto student) {
        try {
            if(student!=null){
                StudentDetailsEntity entity = new StudentDetailsEntity();
                BeanUtils.copyProperties(student,entity);
                details.save(entity);
                return true;
            }
        } catch (BeansException e){
            logger.error(e.getMessage());
        }
        return false;
    }
}
