/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AuctionConsultantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vishakha
 */
public class AuctionUnitOrganization extends Organization{

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
