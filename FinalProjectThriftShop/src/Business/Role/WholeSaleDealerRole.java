/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Organization.WholeSaleSupplierOrganization;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.wholeSaleSupplierRole.WholeSaleSupplierWorkAreaJPanel;

/**
 *
 * @author Arthi
 */
public class WholeSaleDealerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        WholeSaleSupplierOrganization supplier = system.getWholeSaleSupplierDir().getWholeSaleSupplierBasedOnUserName(account);
        
        return new WholeSaleSupplierWorkAreaJPanel(userProcessContainer, account, system, supplier);
    }
    
}
