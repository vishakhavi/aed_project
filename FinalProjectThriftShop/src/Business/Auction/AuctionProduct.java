/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Auction;

import Business.Customer.Customer;
import Business.Product.*;
import Business.Organization.DealerOrganization;
import Business.Employee.*;
import Business.Organization.AuctionUnitOrganization;
import Business.UserAccount.UserAccount;
import Business.Organization.WholeSaleSupplierOrganization;

/**
 *
 * @author raunak
 */
public class AuctionProduct {
    
    private String name;
    private int id;
    private static int count = 1;

    private double bidPrice;
    private double maxBidAskPrice; //This will get updated when the Customer asks for an auction price
    private int bidCount = 0; //Auction Consultant can choose to give this to best bid price, based on his discretion. Max attempts for a product is 3.
    private String category;
    private String productImagePath;
    private AuctionUnitOrganization auctionCompany;
    private UserAccount bidWinCustomer; //This will be updated based on the the bid asked customer.
    private DealerOrganization dealer;

    public DealerOrganization getDealer() {
        return dealer;
    }

    public void setDealer(DealerOrganization dealer) {
        this.dealer = dealer;
    }

    
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        AuctionProduct.count = count;
    }
    
    public UserAccount getBidWinCustomer() {
        return bidWinCustomer;
    }

    public void setBidWinCustomer(UserAccount bidWinCustomer) {
        this.bidWinCustomer = bidWinCustomer;
    }

    public double getMaxBidAskPrice() {
        return maxBidAskPrice;
    }

    public void setMaxBidAskPrice(double maxBidAskPrice) {
        this.maxBidAskPrice = maxBidAskPrice;
    }
    
    
    public int getBidCount() {
        return bidCount;
    }

    public void setBidCount(int bidCount) {
        this.bidCount = bidCount;
    }
   

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
