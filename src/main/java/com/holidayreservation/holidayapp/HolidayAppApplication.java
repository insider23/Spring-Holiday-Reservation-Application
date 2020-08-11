package com.holidayreservation.holidayapp;

import com.holidayreservation.holidayapp.entity.Traveler;
import com.holidayreservation.holidayapp.repository.TravelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolidayAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HolidayAppApplication.class, args);
    }

}
