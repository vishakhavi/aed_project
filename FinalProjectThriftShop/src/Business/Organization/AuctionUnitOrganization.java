/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Auction.AuctionProductDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Product.ProductDirectory;
import Business.Role.AuctionConsultantRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Vishakha
 */
public class AuctionUnitOrganization extends Organization{
    
    private String name;
    private int id;
    private static int count = 1;
    private UserAccount userAccountAssoc;
    private AuctionProductDirectory auctionProductDirectory;

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


    public AuctionUnitOrganization(String name, EcoSystem system) {
        super(Organization.Type.AuctionConsultant.getValue());
        
        id = count;
        this.name = name;
        
        //Create a UserAccount by trimming spaces in between, and associate it to the Supplier Object
        Employee employee = system.getEmployeeDirectory().createEmployee(name.replaceAll("\\s", ""));
        this.userAccountAssoc = system.getUserAccountDirectory().createUserAccount(name.replaceAll("\\s", ""), "auctionAdmin", employee, new AuctionConsultantRole());
        
        //Empty List of products - TODO
        this.auctionProductDirectory = new AuctionProductDirectory();
        
        count++;
    }
    
    public AuctionUnitOrganization() {
        super(Organization.Type.AuctionConsultant.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AuctionConsultantRole());
        return roles;
    }
}
