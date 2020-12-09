/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.Ads;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    public ArrayList<Role> roles;
    private Ads adsList;
    private CustomerDirectory customerDirectory;
    private static int counter=0;
    private DeliveryManDirectory deliveryManDirectory;
   
    
    public enum Type{
        Admin("Admin Organization"), CustomerService("Customer Service Organization"), 
        MaintenanceStaff("Maintenance Organization"), QualityCheckOfficer("Quality Check Organzation"),
        ManufacturerAdmin("Manufacturing Unit Organization"),DeliveryMan("Shipping Unit Organization"),
        AuctionConsultant("Auction Unit Organization"), InsuranceManager("Insurance Organization"),
        Customer("Ads Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        customerDirectory = new CustomerDirectory();
        adsList = new Ads();
        deliveryManDirectory = new DeliveryManDirectory();
        organizationID = counter;
        ++counter;
    }
    /*public Organization(){
        
    }*/
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
  
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    public Ads getAdsList() {
        return adsList;
    }

    public void setAdsList(Ads adsList) {
        this.adsList = adsList;
    }
    public CustomerDirectory getCustomerDirectory(){
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    @Override
    public String toString() {
        return name;
    }
    
    
}
