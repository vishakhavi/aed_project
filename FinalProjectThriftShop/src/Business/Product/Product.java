/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Employee.*;
import Business.WholeSaleSupplier.WholeSaleSupplier;

/**
 *
 * @author raunak
 */
public class Product {
    
    private String name;
    private int id;
    private static int count = 1;
    private double price;
    private String category;
    private WholeSaleSupplier supplier = null;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public WholeSaleSupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(WholeSaleSupplier supplier) {
        this.supplier = supplier;
    }

    public Product() {
        id = count;
        
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
