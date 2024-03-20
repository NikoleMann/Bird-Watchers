package com.birdwatchers.BirdTracker.model;

import jakarta.persistence.*;

import java.text.SimpleDateFormat;


@Table(name="bird")
@Entity
public class Bird {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="bird_species")
    private String bird_species;

    @Column(name="location")
    private String location;

    @Column(name="date")
    private SimpleDateFormat date;

    public Bird() {
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getBird_species() {
        return bird_species;
    }

    public void setBird_species(String bird_species) {
        this.bird_species = bird_species;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public SimpleDateFormat getDate() {
        return date;
    }

    public void setDate(SimpleDateFormat date) {
        this.date = date;
    }


}