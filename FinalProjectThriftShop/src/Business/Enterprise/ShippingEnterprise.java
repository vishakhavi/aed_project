/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.DeliveryManRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class ShippingEnterprise extends Enterprise {
    
    public ShippingEnterprise(String name){
        super(name,EnterpriseType.Shipping);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
         roles = new ArrayList<Role>();
        roles.add(new DeliveryManRole());
        return roles;
    }
    
}
