/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Employee.*;
import java.util.ArrayList;

/**
 *
 * @author Arthi
 */
public class ProductDirectory {
    
    private ArrayList<Product> products;

    public ProductDirectory() {
        products = new ArrayList();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public Product createProduct(String name){
        Product product = new Product();
        product.setName(name);
        products.add(product);
        return product;
    }
    
    public Product findProduct(String name) {
        for (Product p : this.products) {
            if (p.getName().equals(name))
                return p;
        }
        return null;
    }
    
    public Product findProductBasedOnDealer(String name, String dealerName) {
         for (Product p : this.products) {
            if (p.getName().equals(name) && p.getDealer().getName().equals(dealerName))
                return p;
        }
        return null;
    }
    
    public void addProductQuantity(String prodName, String dealerName, int qty) {
        Product p = findProductBasedOnDealer(prodName, dealerName);
        p.setQty(p.getQty() + qty);
    }
    
    public Product deleteProduct(String name) {
        for (Product p : this.products) {
            if (p.getName().equals(name))
                this.products.remove(p);
        }
        return null;
    }
}