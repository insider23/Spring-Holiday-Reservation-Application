package com.holidayreservation.holidayapp.restController;

import com.holidayreservation.holidayapp.entity.Services;
import com.holidayreservation.holidayapp.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class ServicesRestController {

    @Autowired
    ServicesService services;

    @PostMapping("/service")
    public void saveService(@RequestBody Services service) {
        services.addService(service);
    }

    @GetMapping("/getAllServices")
    public List<Services> getAllServices() {
        return services.getAllServices();
    }

    @GetMapping("/getServiceId/{id}")
    public Optional<Services> getServiceById(@PathVariable int id) {
         return services.getServicesById(id);

    }

    @PutMapping("/service")
    public Services saveOrUpdateService(@RequestBody Services service) {
        services.addService(service);
        return service;
    }
    @DeleteMapping("/deleteService/{id}")
    public void deleteService(@PathVariable int id){
        services.deleteServiceByID(id);

    }
}
