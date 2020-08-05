package com.holidayreservation.holidayapp.model;

public class Booking {
    private User user;
    private Housing housing;
    private Services services;
    private int booking_id;

    public Booking(User user, Housing housing, Services services, int booking_id) {
        this.user = user;
        this.housing = housing;
        this.services = services;
        this.booking_id = booking_id;
    }

    public Booking(){

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Housing getHousing() {
        return housing;
    }

    public void setHousing(Housing housing) {
        this.housing = housing;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }
}
