/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WholeSaleSupplier.WholeSaleSupplier;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.wholeSaleSupplierRole.WholeSaleSupplierWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class WholeSaleDealerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        WholeSaleSupplier supplier = system.getWholeSaleSupplierDir().getWholeSaleSupplierBasedOnUserName(account);
        
        return new WholeSaleSupplierWorkAreaJPanel(userProcessContainer, account, system, supplier);
    }
    
}
