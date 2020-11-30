/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList<Customer>();
    }
    public ArrayList<Customer> getCustomerList() {
        return customerList;
        
    }
    
    public ArrayList<Customer> addCustomer(Customer c){
       
        customerList.add(c);
        return customerList;
    }
     public ArrayList<Customer> removeCustomer(Customer c){
       
        customerList.remove(c);
        return customerList;
    }
}
