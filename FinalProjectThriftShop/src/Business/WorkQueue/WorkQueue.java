/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.ShippingUnitOrganization;
import Business.Auction.AuctionProduct;
import Business.Product.Product;
import Business.Product.ProductDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    public List<WorkRequest> getWorkRequestListCustomer(UserAccount account){
        List<WorkRequest> workRequestListCustomer = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getCustomer() != null){
                UserAccount customerAccount = workRequest.getCustomer();
                if(customerAccount.getUsername().equals(account.getUsername())){
                    workRequestListCustomer.add(workRequest);
                }
            }
        }
        return workRequestListCustomer;
    }
    
    public void addWorkRequest(WorkRequest workRequest){         
        if (!workRequestList.contains(workRequest)) //Add only if the WR doesnt exist
            workRequestList.add(workRequest);
    }  
    
    public HashMap<Product, Integer> updateProductMapBasedOnOrders(HashMap<Product,Integer> productOrderCount, ProductDirectory pd) {
        HashMap<Product, Integer> productOrderListCount = productOrderCount;
        
        for (WorkRequest wr : this.workRequestList) {
            CustomerWorkOrder cwo = (CustomerWorkOrder) wr;
            Product orderProduct = cwo.getProduct();
            AuctionProduct orderAuctionProduct = cwo.getAuctionProduct();
            Product matchedProduct = null; //Use to find the product from global directory
            
            //Sometime workrequests will have Products, sometimes Auction Products. So find the product associated to it
            if (orderProduct == null && orderAuctionProduct != null) {
                matchedProduct = pd.findProductBasedOnDealer(orderAuctionProduct.getName(), orderAuctionProduct.getDealer().getName());
            } else {
                matchedProduct = orderProduct;
            }
            //At this point you will have a product from WR.
            boolean foundExistingProduct = false;
            
            for (Map.Entry<Product,Integer> entry : productOrderCount.entrySet())  {
                Product product =  entry.getKey();

                if (matchedProduct.equals(product)) {
                    entry.setValue(entry.getValue() + 1);
                    foundExistingProduct = true;
                    break;
                }
            }
            
            //If the product never existed in the hashmap, then create it in the map
            if (!foundExistingProduct) {
                productOrderListCount.put(matchedProduct, 1);
            }
        }
        
        return productOrderListCount;
    }
}