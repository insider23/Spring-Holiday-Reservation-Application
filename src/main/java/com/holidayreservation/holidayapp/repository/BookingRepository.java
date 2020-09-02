package com.holidayreservation.holidayapp.repository;

import com.holidayreservation.holidayapp.entity.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository <Booking, Integer> {
}
