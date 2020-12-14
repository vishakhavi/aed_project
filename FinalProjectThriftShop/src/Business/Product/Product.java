/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Organization.DealerOrganization;
import Business.Organization.WholeSaleSupplierOrganization;

/**
 *
 * @author Arthi
 */
public class Product {
    
    private String name;
    private int id;
    private static int count = 1;
    private double price;
    private String category;
    private int qty = 0;
    private WholeSaleSupplierOrganization supplier = null;
    private DealerOrganization dealer = null;
    private String productImagePath;
    

    public String getProductImagePath() {
        return productImagePath;
    }

    public void setProductImagePath(String productImagePath) {
        this.productImagePath = productImagePath;
    }

    public DealerOrganization getDealer() {
        return dealer;
    }

    public void setDealer(DealerOrganization dealer) {
        this.dealer = dealer;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
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

    public WholeSaleSupplierOrganization getSupplier() {
        return supplier;
    }

    public void setSupplier(WholeSaleSupplierOrganization supplier) {
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
