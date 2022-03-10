package com.thoughtfocus.springproject;

import com.thoughtfocus.springproject.detailsentity.DetailsEntity;
import com.thoughtfocus.springproject.dto.Student;
import com.thoughtfocus.springproject.repository.Details;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.BeanUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
    @Mock
    Details details;

    @Mock
    DetailsEntity entity;

    @Mock
    Student student;

    @BeforeEach
    void setup(){
        student.setName("Sunil");
        student.setAge(22);
        student.setId(101);
        student.setEmail("sunil@258");
    }

    @Test
    public void ValidateStudentTest(){
        DetailsEntity detailsEntity=new DetailsEntity();
        detailsEntity.setName("Sunil");
        detailsEntity.setId(101);
        detailsEntity.setEmail("sunil@258");
        detailsEntity.setAge(22);
    when(details.save(any(DetailsEntity.class))).thenReturn(detailsEntity);

        BeanUtils.copyProperties(student,entity);
        DetailsEntity result=details.save(entity);
        assertTrue(result instanceof DetailsEntity);
    }



}
