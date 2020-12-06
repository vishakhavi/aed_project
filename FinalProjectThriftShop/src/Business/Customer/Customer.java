/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer extends UserAccount{
    private String customerName;
    private String postId;
    private String address;
    private String phone;
    private Ads adsList;
    private Cart cart;

    
   
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    

    public String getName() {
        return customerName;
    }

    public void setName(String customerName) {
        this.customerName = customerName;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Ads getAdsList() {
        return adsList;
    }

    public void setAdsList(Ads adsList) {
        this.adsList = adsList;
    }


    public Cart getCart() {
        return cart;
    }
    
    @Override
    public String toString() {
        return customerName;
    }
    
    public Cart newCart()
    {
        Cart cart = new Cart();
        cart.setTotalPrice(0);
        return cart;
    }
}
