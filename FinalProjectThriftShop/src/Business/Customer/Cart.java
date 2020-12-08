/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Product.Product;
import Business.Product.ProductDirectory;
import Business.UserAccount.UserAccount;

/**
 *
 * @author madhurimachatterjee
 */
public class Cart {
    private int cartId;
    private UserAccount userAccount;
    private ProductDirectory prodDir;
    private double totalPrice;
    public static int idCounter = 1;

    public Cart(UserAccount useracc) {
        this.cartId = idCounter;
        idCounter ++;
        this.prodDir = new ProductDirectory();
        this.setUserAccount(useracc);
        this.setTotalPrice(0);
    }

    public ProductDirectory getProdDir() {
        return prodDir;
    }

    public void setProdDir(ProductDirectory prodDir) {
        this.prodDir = prodDir;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getCartId() {
        return cartId;
    }
    
    public void calculateTotalPrice()
    {
        double sum = 0.0;
        for(Product prod : this.getProdDir().getProducts())
        {
            sum = (sum + (prod.getQty()*prod.getPrice()));
        }
        this.setTotalPrice(sum);
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount ua) {
        this.userAccount = ua;
    }
    
    
}
