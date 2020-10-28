/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Vishakha
 */
public class Airliner {
    private String airlinerName;
    private String serialNum;
    private Flight flight;
    private ArrayList<Flight> flightCatalog;

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }
    

    public Airliner(){
        flightCatalog = new ArrayList<Flight>();
    }
    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }
    
    public Flight getFilght() {
        return flight;
    }

    public void setFlight(Flight flght) {
        this.flight = flight;
    }

    public ArrayList<Flight> getFlightCatalog() {
        return flightCatalog;
    }
    
    
    public Flight addFlight(){
        Flight myFlight = new Flight();
        flightCatalog.add(myFlight);
        return myFlight;
    }

    @Override
    public String toString() {
        return getSerialNum();
    }
}
