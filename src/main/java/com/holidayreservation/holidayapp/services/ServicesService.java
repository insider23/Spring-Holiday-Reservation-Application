package com.holidayreservation.holidayapp.services;

import com.holidayreservation.holidayapp.entity.Services;
import com.holidayreservation.holidayapp.entity.Traveler;
import com.holidayreservation.holidayapp.repository.ServicesRepository;
import com.holidayreservation.holidayapp.repository.TravelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServicesService {

    @Autowired
    ServicesRepository servicesRepository;

    public void addService(Services service){
      servicesRepository.save(service);
    }
    public List<Services> getAllServices(){

        return (List<Services>) servicesRepository.findAll();
    }

    public Optional<Services> getServicesById(int id){
        return servicesRepository.findById(id);
    }

    public void deleteServiceByID(int id){
        servicesRepository.deleteById(id);
    }
}
