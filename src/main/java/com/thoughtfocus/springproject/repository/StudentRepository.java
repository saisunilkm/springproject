package com.thoughtfocus.springproject.repository;

import com.thoughtfocus.springproject.entity.StudentDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<StudentDetailsEntity,Integer> {
    StudentDetailsEntity getById  (int id);

}
