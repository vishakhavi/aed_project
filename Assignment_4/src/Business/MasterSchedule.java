/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Vishakha
 */
public class MasterSchedule {
    private ArrayList<Flight> flightDirectory;
    private LocalTime timeOfFlight = LocalTime.now() ;
    
    private LocalDate today = LocalDate.now() ;
    private LocalDate tommorrow = LocalDate.now().plusDays(1) ;
    private LocalDate dayAfter = LocalDate.now().plusDays(-1) ;
    private ArrayList <Flight> tempFlightDirectory; 
    private ArrayList <Flight> temp1FlightDirectory;

    public MasterSchedule() {
        this.flightDirectory = new ArrayList<>();
        initialize();
    }

    public void initialize(){
    Flight f1 = new Flight("Spirit", "MK100", "Boston", "New York", 500, today,timeOfFlight, 150);
    Flight f2 = new Flight("Spirit","MS100", "LA", "Boston", 400, tommorrow,timeOfFlight.plusHours(5),150);
    Flight f3 = new Flight("Jet Airways","JK101", "Boston", "New Jersey", 500, tommorrow,timeOfFlight.plusHours(8),150);
    Flight f4 = new Flight("Jet Airways","JK102", "California", "New York", 500, dayAfter,timeOfFlight, 150);
    Flight f5 = new Flight("Indigo","MI100", "LA", "New York", 500, dayAfter,timeOfFlight, 150);
    Flight f6 = new Flight("GoAir","GA100", "LA", "Boston", 500, dayAfter,timeOfFlight, 150);
    Flight f7 = new Flight("Spirit","MK102", "LA", "California", 500, dayAfter,timeOfFlight.plusHours(2), 150);
    Flight f8 = new Flight("Indigo","MI105", "LA", "Boston", 500, dayAfter,timeOfFlight.plusHours(1), 150);
    
    flightDirectory.add(f1);
    flightDirectory.add(f2);
    flightDirectory.add(f3);
    flightDirectory.add(f4);
    flightDirectory.add(f5);
    flightDirectory.add(f6);
    flightDirectory.add(f7);
    flightDirectory.add(f8);
    
    
    }
    
    public ArrayList<Flight> getFlightDirectory() {
        return flightDirectory;
    }
    
    public ArrayList<Flight> getFlightDirectory( ArrayList<Flight> tempFlightDirectory) {
        return tempFlightDirectory;
    }

    public void setFlightDirectory(ArrayList<Flight> flightDirectory) {
        this.flightDirectory = flightDirectory;
    } 
    
    public Flight addFlight(){
        Flight flight = new Flight();
        flightDirectory.add(flight);
        return flight;
    }
    
    public void deleteFlight(Flight flight){
         flightDirectory.remove(flight);
    }
    
    public Flight searchbySerial (String flightNumber){
        for(Flight flight: flightDirectory){
            if(flight.getFlightNumber().equals(flightNumber)){
                return flight;
            }
        }
        return null;
    }
    
    public ArrayList<Flight> searchFlight(String from, String to, Date date, String time){
        tempFlightDirectory = new ArrayList<Flight>(flightDirectory);
        temp1FlightDirectory = new ArrayList<Flight>();
        try{
      
        String timeRangeStart;
        String timeRangeEnd;
        if( time.equals("Morning(6-12 pm)")){
            timeRangeStart = "06:00:00";
            timeRangeEnd = "11:59:59";
        }else if( time.equals("Afternoon(12-6pm)")){
            timeRangeStart = "12:00:00";
            timeRangeEnd = "17:59:59";
        }else if( time.equals("Evening(6-12am)")){
            timeRangeStart = "18:00:00";
            timeRangeEnd = "23:59:59";
        }else {
            timeRangeStart = "00:00:00";
            timeRangeEnd = "05:59:59";
        }
        if ((!from.isEmpty())){
            for (Flight flight: tempFlightDirectory){
                if (! (flight.getFromLocation().equals(from))){
                temp1FlightDirectory.add(flight);
                }    
            }
        }
        
        if ((!to.isEmpty())){
            for (Flight flight: tempFlightDirectory){
                if (! (flight.getToLocation().equals(to))){
                temp1FlightDirectory.add(flight);
                }    
            }
        }
        
         if ((null != date)){
            for (Flight flight: tempFlightDirectory){
                
                if (date.after(Date.from(flight.getDateOfFlight().atStartOfDay(ZoneId.systemDefault().systemDefault()).toInstant()))){
                 
                    temp1FlightDirectory.add(flight);
                }    
            }
        }
         for (Flight flight: tempFlightDirectory){
         if(!(LocalTime.parse(timeRangeStart).isBefore(flight.getTimeOfFlight())) && 
                    !(flight.getTimeOfFlight().isAfter(LocalTime.parse(timeRangeStart)))){
                    System.out.println("time of flight2222"+flight.getTimeOfFlight());
                    System.out.println("time of flight111"+flight.getTimeOfFlight());
                  System.out.println("condition111"+flight.getTimeOfFlight().isBefore(LocalTime.parse(timeRangeStart)));
                   System.out.println("condition222"+flight.getTimeOfFlight().isAfter(LocalTime.parse(timeRangeEnd)));
                    temp1FlightDirectory.add(flight);
                    }
          }

    System.out.println(temp1FlightDirectory);
    System.out.println("Directory "+tempFlightDirectory);
        tempFlightDirectory.removeAll(temp1FlightDirectory);
        System.out.println("final "+tempFlightDirectory);
        }catch(Exception e){
            System.err.println("Cannot parse date"+e);
        }
        return tempFlightDirectory;
    }
}
