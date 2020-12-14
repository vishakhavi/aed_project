/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Auction;

import Business.Product.*;
import Business.Employee.*;
import Business.Organization.AuctionUnitOrganization;
import java.util.ArrayList;

/**
 *
 * @author Arthi
 */
public class AuctionProductDirectory {
    
    private ArrayList<AuctionProduct> auctionProducts;

    public AuctionProductDirectory() {
        auctionProducts = new ArrayList();
    }

    public ArrayList<AuctionProduct> getAuctionProducts() {
        return auctionProducts;
    }
    
    public AuctionProduct createAuctionProduct(String name, double price, String imagePath, AuctionUnitOrganization auctionComp){
        AuctionProduct auctionProduct = new AuctionProduct();
        auctionProduct.setName(name);
        auctionProduct.setBidPrice(price);
        auctionProduct.setProductImagePath(imagePath);
        auctionProduct.setAuctionCompany(auctionComp);
        
        auctionProducts.add(auctionProduct);
        return auctionProduct;
    }
    
    public AuctionProduct findAuctionProduct(String name) {
        for (AuctionProduct p : this.auctionProducts) {
            if (p.getName().equals(name))
                return p;
        }
        return null;
    }
    
    public void removeAuctionProduct(AuctionProduct ap) {
        for(AuctionProduct aucProd : auctionProducts) {
            if (aucProd.equals(ap)) {
                auctionProducts.remove(aucProd);
                break;
            }
        }
    }
}