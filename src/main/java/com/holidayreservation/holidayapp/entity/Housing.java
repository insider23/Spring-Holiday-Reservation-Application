package com.holidayreservation.holidayapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "housing")
public class Housing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String room;
    private String house;
    private double price;
    private int startDate;
    private int endDate;


    public Housing(int id, String room, String house, double price, int startDate, int endDate) {
        this.id = id;
        this.room = room;
        this.house = house;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Housing() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
