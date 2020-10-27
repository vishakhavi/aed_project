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
public class AirlinerDirectory {
    private ArrayList<Flight> flightDirectory;
    private ArrayList<Flight> flightDirectory1;
    private ArrayList<Airliner> airlinerDirectory;
    private Airliner airliner;
    
    
    public AirlinerDirectory() {
        airlinerDirectory = new ArrayList<Airliner>();
        //flightDirectory = new ArrayList<Flight>();
        //flightDirectory1 = new ArrayList<Flight>();
        //initialize();
    }
     
    private void initialize(){
    Flight f1 = new Flight("AK100", "Emirates", 500, true,150);
    Flight f2 = new Flight("BS100", "Emirates", 400, true,150);
    Flight f3 = new Flight("LK100", "Emirates", 500, false,150);
    Flight f4 = new Flight("JK100", "Emirates", 500, true,150);
    Flight f5 = new Flight("MK100", "Emirates", 500, true,150);
    Flight f6 = new Flight("HHK100", "Qatar", 500, true,150);
    Flight f7 = new Flight("MS100", "Qatar", 400, true,150);
    Flight f8 = new Flight("MYY100", "Qatar", 500, false,150);
    Flight f9 = new Flight("KP100", "Qatar", 500, true,150);
    Flight f10 = new Flight("TT100", "Qatar", 500, true,150);
    
    flightDirectory.add(f1);
    flightDirectory.add(f2);
    flightDirectory.add(f3);
    flightDirectory.add(f4);
    flightDirectory.add(f5);
    
    flightDirectory1.add(f6);
    flightDirectory1.add(f7);
    flightDirectory1.add(f8);
    flightDirectory1.add(f9);
    flightDirectory1.add(f10);
    
    
    }
    public ArrayList<Flight> getFlightDirectory(){
        return flightDirectory;
    }

    public void setFlightDirectory(ArrayList<Flight> flightDirectory) {
        this.flightDirectory = flightDirectory;
    }
    
    
     public Airliner addAirline(Airliner f1){
        airlinerDirectory.add(f1);
        return f1;
    }

    public ArrayList<Airliner> getAirlineDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<Airliner> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
    
    
    public Flight searchbySerial (String flightNumber){
        for(Flight flight: airliner.getFlightCatalog()){
            if(flight.getFlightNumber().equals(flightNumber)){
                return flight;
            }
        }
        return null;
    }
}
