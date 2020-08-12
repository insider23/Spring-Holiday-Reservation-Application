package com.holidayreservation.holidayapp.restController;

import com.holidayreservation.holidayapp.entity.Traveler;
import com.holidayreservation.holidayapp.services.TravelerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TravelerRestController {

    @Autowired
    TravelerService travelerService;

    @PostMapping("/traveler")
    public void saveTraveler(@RequestBody Traveler traveler) {
        travelerService.addTraveler(traveler);
    }

    @GetMapping("/getAllTravelers")
    public List<Traveler> getAllTravelers() {
        return travelerService.getAllTravelers();
    }

    @GetMapping("/getTravelerById/{id}")
    public Optional<Traveler> getTravelerById(@PathVariable int id) {
        return travelerService.getTravelerById(id);
    }

    @PutMapping("/traveler")
    public Traveler saveOrUpdateTraveler(@RequestBody Traveler traveler) {
        travelerService.addTraveler(traveler);
        return traveler;
    }
    @DeleteMapping("/deleteTraveler/{id}")
    public void deleteTraveler(@PathVariable int id){
        travelerService.deleteTravelerById(id);
    }
}