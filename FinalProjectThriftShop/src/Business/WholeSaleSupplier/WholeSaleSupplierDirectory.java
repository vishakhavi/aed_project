/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WholeSaleSupplier;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WholeSaleSupplierDirectory {
    
    private ArrayList<WholeSaleSupplier> wholeSaleSupplierList;

    public WholeSaleSupplierDirectory() {
        wholeSaleSupplierList = new ArrayList();
    }

    public ArrayList<WholeSaleSupplier> getwholeSaleSupplierList() {
        return wholeSaleSupplierList;
    }
    
    public WholeSaleSupplier createWholeSaleSupplier(String name){
        WholeSaleSupplier wsSupplier = new WholeSaleSupplier();
        wsSupplier.setName(name);
        wholeSaleSupplierList.add(wsSupplier);
        return wsSupplier;
    }
    
    
        public WholeSaleSupplier getWholeSaleSupplierBasedOnUserName(UserAccount ua) {
        WholeSaleSupplier supplier = null;
        
            for (WholeSaleSupplier sup : wholeSaleSupplierList) {
                if(sup.getUserAccountAssoc().equals(ua))
                    supplier = sup;
            }
        
        return supplier;
        }
}