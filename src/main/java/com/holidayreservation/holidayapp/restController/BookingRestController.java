package com.holidayreservation.holidayapp.restController;

import com.holidayreservation.holidayapp.entity.Booking;
import com.holidayreservation.holidayapp.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class
BookingRestController {
    @Autowired
    BookingService bookingService;

    @PostMapping("/booking")
    public void saveBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
    }

    @GetMapping("/getAllBookings")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBooking();

    }

    @GetMapping("/getBookingId/{id}")
    public Optional<Booking> getBookingById(@PathVariable int id) {
        return bookingService.getBookingById(id);
    }

    @PutMapping("/booking")
    public Booking saveOrUpdateBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
        return booking;
    }
    @DeleteMapping("/deleteBooking/{id}")
    public void deleteBooking(@PathVariable int id){
        bookingService.deleteBookingById(id);
    }
}
