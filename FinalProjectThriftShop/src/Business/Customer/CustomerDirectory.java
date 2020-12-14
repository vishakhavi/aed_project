/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Vishakha
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList<Customer>();
    }
    public ArrayList<Customer> getCustomerList() {
        return customerList;
        
    }
    public Customer getCustomerDetails(UserAccount ua) {
        for(Customer ca:customerList){
            if(ca.getUsername().equals(ua.getUsername())){
                return ca;
            }
        }
        return null;
    }
    
    public void addCustomer(Customer c){
       
        customerList.add(c);
   
    }
     public ArrayList<Customer> removeCustomer(Customer c){
       
        customerList.remove(c);
        return customerList;
    }
}
