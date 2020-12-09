/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Auction.AuctionProductDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.AuctionConsultantRole;
import Business.Role.CustomerServiceRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Arthi Ganesan
 */
public class CustomerServiceOrganization extends Organization{
    private String name;
    private int id;
    private static int count = 1;
    private UserAccount userAccountAssoc;
    private WorkQueue workQueue;

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserAccount getUserAccountAssoc() {
        return userAccountAssoc;
    }

    
    public void setUserAccountAssoc(UserAccount userAccountAssoc) {
        this.userAccountAssoc = userAccountAssoc;
    }

    
    public CustomerServiceOrganization(String name, EcoSystem system) {
        super(Organization.Type.CustomerService.getValue());
        
        id = count;
        this.name = name;
        
        //Create a UserAccount by trimming spaces in between, and associate it to the Supplier Object
        Employee employee = system.getEmployeeDirectory().createEmployee(name.replaceAll("\\s", ""));
        this.userAccountAssoc = system.getUserAccountDirectory().createUserAccount(name.replaceAll("\\s", ""), "custServiceAdmin", employee, new CustomerServiceRole());
        
        //init workQueue
        this.workQueue = new WorkQueue();
        
        count++;
    }
    
    
    public CustomerServiceOrganization() {
        super(Organization.Type.CustomerService.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerServiceRole());
        return roles;
    }
     
}