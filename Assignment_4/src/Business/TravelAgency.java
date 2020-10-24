/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vishakha
 */
public class TravelAgency {
    CustomerDirectory customerDirectory;
    ArrayList<Flight> flightList;
    ArrayList<Airliner> arlinerDirectory;
    private static TravelAgency travelAgency;
    
     public Flight addFlight(){
        Flight flight = new Flight();
        flightList.add(flight);
        return flight;
    }
     public static TravelAgency getInstance(){
        if(travelAgency==null){
            travelAgency=new TravelAgency();
        }
        return travelAgency;
    }
    
    public Flight searchCustomer(String flightNumber){
        for(Flight flight : flightList){
            if(flight.getFlightNumber().equals(flightNumber)){
                return flight;
            }
        }
        return null;
    }
    
}
