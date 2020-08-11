package com.holidayreservation.holidayapp.repository;

import com.holidayreservation.holidayapp.entity.Traveler;
import org.springframework.data.repository.CrudRepository;

public interface TravelerRepository extends CrudRepository <Traveler, Integer> {

}
