/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Location.LocationPoint;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer extends UserAccount{
    private String customerName;
    private String address;
    private String phone;
    private Ads adsList;
    private Cart cart;
    private String emailAddress;
    private LocationPoint location;

 
    
   

    public Customer() {
        this.cart = new Cart();
        this.location = new LocationPoint();
    }
  
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    

    public String getName() {
        return customerName;
    }

    public void setName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Ads getAdsList() {
        return adsList;
    }

    public void setAdsList(Ads adsList) {
        this.adsList = adsList;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    @Override
    public String toString() {
        return customerName;
    }
    
    public LocationPoint getLocation() {
        return location;
    }

    public void setLocation(LocationPoint location) {
        this.location = location;
    }

    /*public Cart newCart()
    {
        Cart cart = new Cart();
        cart.setTotalPrice(0);
        return cart;
    }*/

    public Cart getCart() {
        return cart;
    }
}
