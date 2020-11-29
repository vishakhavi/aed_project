/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.MaintenanceStaffRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vishakha
 */
public class MaintenanceOrganization extends Organization{

    public MaintenanceOrganization() {
        super(Organization.Type.MaintenanceStaff.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MaintenanceStaffRole());
        return roles;
    }
}
