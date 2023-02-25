package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "cab")
public
class Cab{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int ratePerKm;
    private boolean isAvailable;

    @OneToOne
    @JoinColumn
    private Driver driver;

    public Cab(int id, int ratePerKm, boolean isAvailable, Driver driver) {
        this.id = id;
        this.ratePerKm = ratePerKm;
        this.isAvailable = isAvailable;
        this.driver = driver;
    }

    public Cab() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(int ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}