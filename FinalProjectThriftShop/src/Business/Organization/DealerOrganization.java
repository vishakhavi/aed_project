/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Product.ProductDirectory;
import Business.Role.DealerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Arthi Ganesan
 */
public class DealerOrganization extends Organization {
    
    private String name;
    private int id;
    private static int count = 1;
    private UserAccount userAccountAssoc;
    private ProductDirectory productDirectory;
    private WorkQueue workQueue;
    private double revenue;

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }

    public UserAccount getUserAccountAssoc() {
        return userAccountAssoc;
    }

    public void setUserAccountAssoc(UserAccount userAccountAssoc) {
        this.userAccountAssoc = userAccountAssoc;
    }

    public DealerOrganization() {
        super(Organization.Type.DealerAdmin.getValue());
        
        id = count;
        
        //Empty List of products - TODO
        this.productDirectory = new ProductDirectory();
        this.workQueue = new WorkQueue();
        
        count++;
    }
    
    public DealerOrganization(String name, EcoSystem system) {
        super(Organization.Type.DealerAdmin.getValue());
        
        id = count;
        this.name = name;
        
        //Create a UserAccount by trimming spaces in between, and associate it to the Supplier Object
        Employee employee = system.getEmployeeDirectory().createEmployee(name.replaceAll("\\s", ""));
        this.userAccountAssoc = system.getUserAccountDirectory().createUserAccount(name.replaceAll("\\s", ""), "dealerAdmin", employee, new DealerRole());
        
        //Empty List of products - TODO
        this.productDirectory = new ProductDirectory();
        this.workQueue = new WorkQueue();
        this.revenue = 0;
        
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
