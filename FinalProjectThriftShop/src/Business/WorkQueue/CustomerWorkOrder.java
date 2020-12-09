/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Auction.AuctionProduct;
import Business.Organization.MaintenanceOrganization;
import Business.Organization.ShippingUnitOrganization;
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
    private String customerServiceHistoryComments;
    private String latestCustomerComment;
    private ShippingUnitOrganization shippingAssigned;

    public ShippingUnitOrganization getShippingAssigned() {
        return shippingAssigned;
    }

    public void setShippingAssigned(ShippingUnitOrganization shippingAssigned) {
        this.shippingAssigned = shippingAssigned;
    }

    public MaintenanceOrganization getMaintenanceOpAssigned() {
        return maintenanceOpAssigned;
    }

    public void setMaintenanceOpAssigned(MaintenanceOrganization maintenanceOpAssigned) {
        this.maintenanceOpAssigned = maintenanceOpAssigned;
    }
    private MaintenanceOrganization maintenanceOpAssigned;

    public String getLatestCustomerComment() {
        return latestCustomerComment;
    }

    public void setLatestCustomerComment(String latestCustomerComment) {
        this.latestCustomerComment = latestCustomerComment;
    }

    public boolean isRequireCustomerService() {
        return requireCustomerService;
    }

    public void setRequireCustomerService(boolean requireCustomerService) {
        this.requireCustomerService = requireCustomerService;
    }

    public String getCustomerServiceHistoryComments() {
        return customerServiceHistoryComments;
    }

    public void setCustomerServiceHistoryComments(String customerServiceHistoryComments) {
        this.customerServiceHistoryComments = customerServiceHistoryComments;
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
