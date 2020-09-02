package com.holidayreservation.holidayapp.entity;

import javax.persistence.*;

@Entity
public class Housing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int housing_id;
    private String room;
    private String house;
    private double price;
    private int startDate;
    private int endDate;
    private int NumGuests;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Booking booking;


    public Housing(int housing_id, String room, String house, double price, int startDate, int endDate) {
        this.housing_id = housing_id;
        this.room = room;
        this.house = house;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Housing() {
    }

    public int getNumGuests() {
        return NumGuests;
    }

    public void setNumGuests(int numGuests) {
        this.NumGuests = numGuests;
    }

    public int getHousing_id() {
        return housing_id;
    }

    public void setHousing_id(int housing_id) {
        this.housing_id = housing_id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }
}
