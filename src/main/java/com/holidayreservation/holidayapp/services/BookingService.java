package com.holidayreservation.holidayapp.services;

import com.holidayreservation.holidayapp.entity.Booking;
import com.holidayreservation.holidayapp.entity.Housing;
import com.holidayreservation.holidayapp.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public void addBooking(Booking booking){
        bookingRepository.save(booking);
    }

    public List<Booking> getAllBooking(){
        return (List<Booking>) bookingRepository.findAll();
    }

    public Optional<Booking> getBookingById(int id){
        return bookingRepository.findById(id);
    }

    public void deleteBookingById(int id){
        bookingRepository.deleteById(id);
    }
}
