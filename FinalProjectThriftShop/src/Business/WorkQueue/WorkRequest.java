/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Organization.ShippingUnitOrganization;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Arthi
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private double bidPrice;
    private String productName;
    private ShippingUnitOrganization shippingUnitOrganization;
    private DeliveryMan deliverMan;
   

    public ShippingUnitOrganization getShippingUnitOrganization() {
        return shippingUnitOrganization;
    }

    public void setShippingUnitOrganization(ShippingUnitOrganization shippingUnitOrganization) {
        this.shippingUnitOrganization = shippingUnitOrganization;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public DeliveryMan getDeliverMan() {
        return deliverMan;
    }

    public void setDeliverMan(DeliveryMan deliverMan) {
        this.deliverMan = deliverMan;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    private Customer customer;

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    @Override
    public String toString(){
        return this.message;
    }
}
