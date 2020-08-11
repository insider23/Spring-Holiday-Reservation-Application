package com.holidayreservation.holidayapp.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;
    private int housing_id;
    private int services_Id;
    private int traveler_id;
    private Date startDate;
    private Date endDate;

    public Booking(int booking_id, int housing_id, int services_Id, int traveler_id, Date startDate, Date endDate) {
        this.booking_id = booking_id;
        this.housing_id = housing_id;
        this.services_Id = services_Id;
        this.traveler_id = traveler_id;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Booking() {
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getHousing_id() {
        return housing_id;
    }

    public void setHousing_id(int housing_id) {
        this.housing_id = housing_id;
    }

    public int getServices_Id() {
        return services_Id;
    }

    public void setServices_Id(int services_Id) {
        this.services_Id = services_Id;
    }

    public int getTraveler_id() {
        return traveler_id;
    }

    public void setTraveler_id(int traveler_id) {
        this.traveler_id = traveler_id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}

