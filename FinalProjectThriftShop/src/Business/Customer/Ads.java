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

    public void setPostList(ArrayList<Post> adsList) {
        this.adsList = adsList;
    }
    
    public void addPost(Post post){
        adsList.add(post);
    }
    
    public void removePost(Post post){
        adsList.remove(post);
    }
}
