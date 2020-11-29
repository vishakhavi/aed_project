/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MaintenanceStaffRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class QualityCheckOrganization extends Organization{

    public QualityCheckOrganization() {
        super(Organization.Type.QualityCheckOfficer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MaintenanceStaffRole());
        return roles;
    }
     
   
    
    
}
