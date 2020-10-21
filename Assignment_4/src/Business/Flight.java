/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Vishakha
 */
public class Flight {
    private String flightNumber;
    private String airline;
    private double price;
    private String fromLocation;
    private String toLocation;
    private LocalTime timeOfFlight;
    private LocalDate dateOfFlight;
    private LocalTime arrivalTime;
    private int totalSeats = 150;
    private int availSeats;
    private boolean isScheduled;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    private int[][] seat_assignment = new int[6][25];

    
    public Flight(){
        this.createdOn = LocalDateTime.now();
        this.updatedOn = LocalDateTime.now();
    }
    
    public Flight(String Airline, String flightNumber, String From, String To, int price, LocalDate dateOfFlight, LocalTime timeOfFlight, int availSeats){
        this.createdOn = LocalDateTime.now();
        this.updatedOn = LocalDateTime.now();
        this.flightNumber = flightNumber;
        this.fromLocation = From;
        this.toLocation = To;
        this.price = price;
        this.dateOfFlight = dateOfFlight;
        this.timeOfFlight = timeOfFlight;
        this.airline = Airline;
        this.availSeats = availSeats;
        
    }
    
    public Flight(String flightNumber, String airline, double price, boolean isScheduled,int totalSeats){
        this.createdOn = LocalDateTime.now();
        this.updatedOn = LocalDateTime.now();
        this.price = price;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.isScheduled = isScheduled;
        this.totalSeats = totalSeats;
        this.availSeats = totalSeats;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public int[][] getSeat_assignment() {
        return seat_assignment;
    }

    public void setSeat_assignment(int i,int j) {
        this.seat_assignment[i][j] = 1;
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

    public LocalTime getTimeOfFlight() {
        return timeOfFlight;
    }

    public void setTimeOfFlight(LocalTime timeOfFlight) {
        this.timeOfFlight = timeOfFlight;
    }

    public LocalDate getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(LocalDate dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailSeats() {
        return availSeats;
    }

    public void setAvailSeats(int availSeats) {
        this.availSeats = availSeats;
    }

    public boolean isIsScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

  
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }
    
    public void setCreatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }
    public String toString(){
        return flightNumber;
    }
    
}

