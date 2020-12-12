/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Dealer.Dealer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ManufacturerAdminRole.ManufacturerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ManufacturerAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
         //        return new DoctorWorkAreaJPanel(userProcessContainer, account, (CustomerServiceOrganization)organization, enterprise);
        //ToDo: ************Make sure to create the Jpanel for this role and write appropriate code***********
        Dealer dealer = business.getDealerDir().getDealerBasedOnUserName(account);
        
        return new ManufacturerWorkAreaJPanel(userProcessContainer, account, business, dealer);
    }
  
    @Override
    public String toString(){
        return (RoleType.ManufacturerAdmin.getValue());
    }
    
    
    
}
