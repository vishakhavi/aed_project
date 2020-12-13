/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ThriftShopUnitWorkArea.ThriftShopUnitWorkRequestJPanel;


/**
 *
 * @author Vishakha
 */
public class ThriftShopAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        //throw new Volun("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new ThriftShopUnitWorkRequestJPanel(userProcessContainer, account, enterprise, ecosystem);
    }
  
    @Override
    public String toString(){
        return (RoleType.ThriftShopAdmin.getValue());
    }
}
