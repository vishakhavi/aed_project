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
    private boolean requireCustomerService;
    private String customerServiceComments;

    public boolean isRequireCustomerService() {
        return requireCustomerService;
    }

    public void setRequireCustomerService(boolean requireCustomerService) {
        this.requireCustomerService = requireCustomerService;
    }

    public String getCustomerServiceComments() {
        return customerServiceComments;
    }

    public void setCustomerServiceComments(String customerServiceComments) {
        this.customerServiceComments = customerServiceComments;
    }
   

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
    
    @Override
    public String toString() {
        if (this.auctionProduct != null)
            return auctionProduct.getName();
        else
            return product.getName();
    }
}
