/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Auction;

import Business.Product.*;
import Business.Dealer.Dealer;
import Business.Employee.*;
import Business.Organization.AuctionUnitOrganization;
import Business.WholeSaleSupplier.WholeSaleSupplier;

/**
 *
 * @author raunak
 */
public class AuctionProduct {
    
    private String name;
    private int id;
    private static int count = 1;
    private double bidPrice;
    private String category;
    private String productImagePath;
    private AuctionUnitOrganization auctionCompany;

    public AuctionUnitOrganization getAuctionCompany() {
        return auctionCompany;
    }

    public void setAuctionCompany(AuctionUnitOrganization auctionCompany) {
        this.auctionCompany = auctionCompany;
    }

    public String getProductImagePath() {
        return productImagePath;
    }

    public void setProductImagePath(String productImagePath) {
        this.productImagePath = productImagePath;
    }    
   

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public AuctionProduct() {
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
