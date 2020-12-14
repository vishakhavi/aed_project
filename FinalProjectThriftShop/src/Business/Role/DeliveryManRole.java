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
import userinterface.ShippingAdmin.ShippingOrderDetailsJPanel;

/**
 *
 * @author Arthi
 */
public class DeliveryManRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //ToDo: ************Make sure to create the Jpanel for this role and write appropriate code***********
         return new ShippingOrderDetailsJPanel(userProcessContainer, account, business);
    }
    
    
}
