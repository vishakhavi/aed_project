/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author Vishakha
 */
public class Ads {
    ArrayList<Post> adsList = new ArrayList<Post>();

    public ArrayList<Post> getAdsList() {
        return adsList;
    }

    public void setItemList(ArrayList<Post> adsList) {
        this.adsList = adsList;
    }
    
    public void addItem(Post post){
        adsList.add(post);
    }
    
    public void removeItem(Post post){
        adsList.remove(post);
    }
}
