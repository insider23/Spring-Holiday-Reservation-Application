package com.holidayreservation.holidayapp.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;
    // one user can have many bookings
    //in other words, many bookings can be done by one user - that's correct?
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    // one booking can have many housings - i think it doesn't makes sense?
    //When we are booking, user chooses only one housing object - there is no need to anotate it, are there?
    @ManyToOne
    @JoinColumn(name = "housing_id")
    private Housing housing;
    //one booking to many services - it means that in one booking there could be many different services - how about it?
    @OneToMany
    @JoinColumn(name = "services_id")
    private Services services;
    private Date startDate;
    private Date endDate;



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
