/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Organization.DealerOrganization;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DealerRole.DealerWorkAreaJPanel;

/**
 *
 * @author Vishakha
 */
public class ManufacturerAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //ToDo: ************Make sure to create the Jpanel for this role and write appropriate code***********
        DealerOrganization dealer = business.getDealerDir().getDealerBasedOnUserName(account);
        
        return new DealerWorkAreaJPanel(userProcessContainer, account, business, dealer);
    }
  
    @Override
    public String toString(){
        return (RoleType.ManufacturerAdmin.getValue());
    }
    
    
    
}
