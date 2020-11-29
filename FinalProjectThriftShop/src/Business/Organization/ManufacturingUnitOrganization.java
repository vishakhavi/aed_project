/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ManufacturerAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vishakha
 */
public class ManufacturingUnitOrganization extends Organization{

    public ManufacturingUnitOrganization() {
        super(Organization.Type.ManufacturerAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManufacturerAdminRole());
        return roles;
    }
}
