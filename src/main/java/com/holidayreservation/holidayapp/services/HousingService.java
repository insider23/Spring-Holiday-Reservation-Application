package com.holidayreservation.holidayapp.services;

import com.holidayreservation.holidayapp.entity.Housing;
import com.holidayreservation.holidayapp.entity.Traveler;
import com.holidayreservation.holidayapp.repository.HousingRepository;
import com.holidayreservation.holidayapp.restController.HousingRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HousingService {

    @Autowired
    HousingRepository housingRepository;

    public void addHousing(Housing housing){
        housingRepository.save(housing);
    }

    public List<Housing> getAllHousing(){
        return (List<Housing>) housingRepository.findAll();
    }

    public Optional<Housing> getHousingById(int id){
        return housingRepository.findById(id);
    }

    public void deleteHousingById(int id){
        housingRepository.deleteById(id);
    }

}
