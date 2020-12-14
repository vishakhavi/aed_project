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
import Business.Organization.WholeSaleSupplierOrganization;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.DealerRole.DealerWorkAreaJPanel;
import userinterface.wholeSaleSupplierRole.WholeSaleSupplierWorkAreaJPanel;

/**
 *
 * @author Arthi
 */
public class DealerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        DealerOrganization dealer = system.getDealerDir().getDealerBasedOnUserName(account);
        
        return new DealerWorkAreaJPanel(userProcessContainer, account, system, dealer);
    }
    
}
