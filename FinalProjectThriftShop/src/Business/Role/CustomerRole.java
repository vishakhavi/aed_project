/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       // System.out.println("customer work area" + account.getRole());
      //  System.out.println("customer list-->" + organization.getCustomerDirectory().getCustomerDetails(account));
        return new CustomerWorkAreaJPanel(userProcessContainer, account,  business,organization);
        //ToDo: ************Make sure to create the Jpanel for this role and write appropriate code***********
    }
    
    
}
