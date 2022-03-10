package com.thoughtfocus.springproject.service;

import com.thoughtfocus.springproject.detailsentity.DetailsEntity;
import com.thoughtfocus.springproject.dto.UpdateAgeDto;
import com.thoughtfocus.springproject.repository.Details;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateAgeServiceImpl implements UpdateAgeService{
    @Autowired
    Details details;

    @Override
    public boolean updateAgeUsingId(UpdateAgeDto ageDto) {
        try {
            DetailsEntity detailsEntity = details.getById(ageDto.getId());
            if(ageDto!=null){
                detailsEntity.setAge(ageDto.getAge());
                details.save(detailsEntity);
                return true;
            }
        }catch (BeansException e){
            e.printStackTrace();
        }
        return false;
    }
}
