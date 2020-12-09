/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;


import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class ManufacturerDirectory {
     private ArrayList<Manufacturer> manufacturersList;
     public ManufacturerDirectory() {
        manufacturersList = new ArrayList();
    }

    public ArrayList<Manufacturer> getManufacturerDirectory() {
        return manufacturersList;
    }
    
   
    public void addManufacturer(Manufacturer manufacturer){
        manufacturersList.add(manufacturer);
    }
    public void removeManufacturer(Manufacturer manufacturer){
        manufacturersList.remove(manufacturer);
    }
}
