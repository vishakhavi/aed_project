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
public class CustomerDirectory {
    ArrayList<Customer> customerDirectory;
    public CustomerDirectory() {
        this.customerDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerDirectory;
    }

    public void setCustomerList(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer addCustomer(){
        Customer customer = new Customer();
        customerDirectory.add(customer);
        return customer;
    }
    
    public void deleteCustomer(Customer customer){
        customerDirectory.remove(customer);
    }
    
    public Customer searchCustomer(String customerName){
        for(Customer customer : customerDirectory){
            if(customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }
}
