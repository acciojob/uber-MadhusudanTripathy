package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "trip_booking")
public
class TripBooking{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String fromLocation;
    private String toLocation;
    private int distanceInKM;
    private TripStatus tripStatus;
    private int bill;

    @ManyToOne
    @JoinColumn
    private Driver driver;

    @ManyToOne
    @JoinColumn
    private Customer customer;

    public TripBooking() {
    }

    public TripBooking(int id, String fromLocation, String toLocation, int distanceInKM, TripStatus tripStatus, int bill, Driver driver, Customer customer) {
        this.id = id;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKM = distanceInKM;
        this.tripStatus = tripStatus;
        this.bill = bill;
        this.driver = driver;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public int getDistanceInKM() {
        return distanceInKM;
    }

    public void setDistanceInKM(int distanceInKM) {
        this.distanceInKM = distanceInKM;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}