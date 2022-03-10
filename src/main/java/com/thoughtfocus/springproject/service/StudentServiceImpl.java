package com.thoughtfocus.springproject.service;

import com.thoughtfocus.springproject.detailsentity.DetailsEntity;
import com.thoughtfocus.springproject.dto.Student;
import com.thoughtfocus.springproject.repository.Details;
import com.thoughtfocus.springproject.detailsentity.DetailsEntity;
import com.thoughtfocus.springproject.dto.Student;
import com.thoughtfocus.springproject.repository.Details;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired(required = true)
    Details details;


    @Override
    public boolean saveStudent(Student student) {
        try {
            if(student!=null){
                DetailsEntity entity = new DetailsEntity();
                BeanUtils.copyProperties(student,entity);
                details.save(entity);
                return true;
            }
        }catch (BeansException e){
            e.printStackTrace();
        }
        return false;
    }
}
