package com.thoughtfocus.springproject.repository;

import com.thoughtfocus.springproject.detailsentity.DetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Details extends JpaRepository<DetailsEntity,Integer> {
    DetailsEntity getById(int id);

}
