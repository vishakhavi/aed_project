/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.Role.ThriftShopAdmin;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class ThriftShopEnterprise extends Enterprise {
    
    public ThriftShopEnterprise(String name){
        super(name,EnterpriseType.ThriftShop);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<>();
        roles.add(new ThriftShopAdmin());
        roles.add(new CustomerRole());
       return roles;
    }
    
}
