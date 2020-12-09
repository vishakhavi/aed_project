/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Product.ProductDirectory;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class OrderWorkRequest {

    private int orderId;
    private Customer customer;
    private ProductDirectory prodDir;
    private double totalPrice;
    private String paymentType;
    public static int idCounter = 1;
    private Date orderDate;
    private Date deliveryDate;

   public OrderWorkRequest() {
        this.orderId = idCounter;
        idCounter ++;
        this.orderDate = new Date();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ProductDirectory getProdDir() {
        return prodDir;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProdDir(ProductDirectory prodDir) {
        this.prodDir = prodDir;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
