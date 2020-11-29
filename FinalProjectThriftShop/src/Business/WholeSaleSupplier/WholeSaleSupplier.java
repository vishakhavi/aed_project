/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WholeSaleSupplier;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Product.ProductDirectory;
import Business.Role.SystemAdminRole;
import Business.Role.WholeSaleDealerRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class WholeSaleSupplier {
    
    private String name;
    private int id;
    private static int count = 1;
    private UserAccount userAccountAssoc;
    private ProductDirectory productDirectory;

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

    public WholeSaleSupplier() {
        id = count;
        
        //Empty List of products - TODO
        this.productDirectory = new ProductDirectory();
        
        count++;
    }
    
    public WholeSaleSupplier(String name, EcoSystem system) {
        id = count;
        this.name = name;
        
        //Create a UserAccount by trimming spaces in between, and associate it to the Supplier Object
        Employee employee = system.getEmployeeDirectory().createEmployee(name.replaceAll("\\s", ""));
        this.userAccountAssoc = system.getUserAccountDirectory().createUserAccount(name.replaceAll("\\s", ""), "wholeSaleAdmin", employee, new WholeSaleDealerRole());
        
        //Empty List of products - TODO
        this.productDirectory = new ProductDirectory();
        
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
    
    
}
