/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Auction.AuctionProduct;
import Business.Product.Product;
import java.util.Date;

/**
 *
 * @author Arthi Ganesan
 */
public class CustomerWorkOrder extends WorkRequest{
    private Product product;
    private AuctionProduct auctionProduct;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public AuctionProduct getAuctionProduct() {
        return auctionProduct;
    }

    public void setAuctionProduct(AuctionProduct auctionProduct) {
        this.auctionProduct = auctionProduct;
    }
}
