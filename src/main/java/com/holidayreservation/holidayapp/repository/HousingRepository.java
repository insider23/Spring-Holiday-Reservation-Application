package com.holidayreservation.holidayapp.repository;

import com.holidayreservation.holidayapp.entity.Housing;
import org.springframework.data.repository.CrudRepository;

public interface HousingRepository extends CrudRepository <Housing, Integer> {
}
