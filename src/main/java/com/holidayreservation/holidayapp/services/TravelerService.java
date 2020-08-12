package com.holidayreservation.holidayapp.services;

import com.holidayreservation.holidayapp.entity.Traveler;
import com.holidayreservation.holidayapp.repository.TravelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelerService {

    @Autowired
    private TravelerRepository travelerRepository;


    public void addTraveler(Traveler traveler){

        travelerRepository.save(traveler);
    }
    public List<Traveler> getAllTravelers(){

        return (List<Traveler>) travelerRepository.findAll();
    }

    public Optional<Traveler> getTravelerById(int id){
        return travelerRepository.findById(id);
    }

    public void deleteTravelerById(int id){
        travelerRepository.deleteById(id);
    }
}
