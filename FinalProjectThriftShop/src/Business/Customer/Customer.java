/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author harold
 */
public class Customer extends UserAccount{
    private String customerName;
    private String address;
    private String phone;
    private Ads adsList;
   
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


    @Override
    public String toString() {
        return customerName;
    }
    
    
}
