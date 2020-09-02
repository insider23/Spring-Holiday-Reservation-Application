package com.holidayreservation.holidayapp.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Traveler {
    @Id
    @GeneratedValue
    private int traveler_id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    @OneToMany
    private List<Booking> bookingList;



    public Traveler(String username, String password, String firstName, String lastName, String email, int id, int traveler_id, Date dateOfBirth ) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.traveler_id = traveler_id;
        this.dateOfBirth = dateOfBirth;
    }

    public Traveler() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public int getTraveler_id() {
        return traveler_id;
    }

    public void setTraveler_id(int traveler_id) {
        this.traveler_id = traveler_id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
