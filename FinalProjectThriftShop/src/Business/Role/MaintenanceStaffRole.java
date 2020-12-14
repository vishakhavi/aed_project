/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerServiceRole.MaintenanceWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class MaintenanceStaffRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MaintenanceWorkAreaJPanel(userProcessContainer, account, business);
        //ToDo: ************Make sure to create the Jpanel for this role and write appropriate code***********
        //return null;
    }
    
}
