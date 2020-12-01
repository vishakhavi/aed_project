/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Dealer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Arthi Ganesan
 */
public class DealerDirectory {
    
    private ArrayList<Dealer> dealersList;

    public DealerDirectory() {
        dealersList = new ArrayList();
    }

    public ArrayList<Dealer> getDealersList() {
        return dealersList;
    }
    
    public Dealer createDealer(String name){
        Dealer wsSupplier = new Dealer();
        wsSupplier.setName(name);
        dealersList.add(wsSupplier);
        return wsSupplier;
    }
    
    
        public Dealer getDealerBasedOnUserName(UserAccount ua) {
            Dealer dealer = null;

                for (Dealer deal : dealersList) {
                    if(deal.getUserAccountAssoc().equals(ua))
                        dealer = deal;
                }

            return dealer;
        }
}