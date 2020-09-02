package com.holidayreservation.holidayapp.entity;

import javax.persistence.*;

@Entity
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int services_id;
    private int quantity;
    private double price;
    private String serviceType;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Booking booking;

    public Services(int services_id, int quantity, double price, String serviceType) {
        this.services_id = services_id;
        this.quantity = quantity;
        this.price = price;
        this.serviceType = serviceType;
    }

    public Services(){

    }

    public int getServices_id() {
        return services_id;
    }

    public void setServices_id(int services_id) {
        this.services_id = services_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
