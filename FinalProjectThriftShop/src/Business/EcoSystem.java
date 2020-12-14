/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Auction.AuctionProductDirectory;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Organization.DealerOrganization;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Network.Network;
import Business.Organization.AuctionUnitOrganization;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.MaintenanceOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.ShippingUnitOrganization;
import Business.Product.Product;
import Business.Product.ProductDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.SysAdmin.SysAdminLogs;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Organization.WholeSaleSupplierOrganization;
import Business.WorkQueue.OrderWorkQueue;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private OrganizationDirectory wholeSaleSupplierDir;
    private OrganizationDirectory dealerDir; 
    private WorkQueue workQueue;
    private OrderWorkQueue orderWorkQueue;
    private DeliveryManDirectory deliveryManDirectory;

    private ProductDirectory productDirectory;
    private AuctionUnitOrganization auctionUnitOrg;
    private CustomerServiceOrganization customerServiceOrg;

   
    private OrganizationDirectory shippingCompanies;
    private OrganizationDirectory maintenanceOperators;
    private AuctionProductDirectory auctionProductDirectory;
    
    private ArrayList<SysAdminLogs> sysAdminLogList;
    
    public void addLog(String data)
    {
        SysAdminLogs sysAdminLog = new SysAdminLogs();
        sysAdminLog.setActivity(data);
        this.sysAdminLogList.add(sysAdminLog);
    }

    
    public OrganizationDirectory getMaintenanceOperators() {
        return maintenanceOperators;
    }

    public void setMaintenanceOperators(OrganizationDirectory maintenanceOperators) {
        this.maintenanceOperators = maintenanceOperators;
    }
    

    public OrganizationDirectory getShippingCompanies() {
        return shippingCompanies;
    }

    public void setShippingCompanies(OrganizationDirectory shippingCompanies) {
        this.shippingCompanies = shippingCompanies;
    }
   

    public CustomerServiceOrganization getCustomerServiceOrg() {
        return customerServiceOrg;
    }

    public void setCustomerServiceOrg(CustomerServiceOrganization customerServiceOrg) {
        this.customerServiceOrg = customerServiceOrg;
    }
    

    public AuctionProductDirectory getAuctionProductDirectory() {
        return auctionProductDirectory;
    }

    public void setAuctionProductDirectory(AuctionProductDirectory auctionProductDirectory) {
        this.auctionProductDirectory = auctionProductDirectory;
    }

    public AuctionUnitOrganization getAuctionUnitOrg() {
        return auctionUnitOrg;
    }

    public void setAuctionUnitOrg(AuctionUnitOrganization auctionUnitOrg) {
        this.auctionUnitOrg = auctionUnitOrg;
    }


    public OrganizationDirectory getDealerDir() {
        return dealerDir;
    }

    public void setDealerDir(OrganizationDirectory dealerDir) {
        this.dealerDir = dealerDir;
    }
   

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }

    public OrganizationDirectory getWholeSaleSupplierDir() {
        return wholeSaleSupplierDir;
    }

    public void setWholeSaleSupplierDir(OrganizationDirectory wholeSaleSupplierDir) {
        this.wholeSaleSupplierDir = wholeSaleSupplierDir;
    }
    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        
        this.sysAdminLogList = new ArrayList<SysAdminLogs>();
        //Initialize a Global - Product Directory
        this.productDirectory = new ProductDirectory();
        
        //Initialize a Global - Auction Product Directory
        this.auctionProductDirectory = new AuctionProductDirectory();

        //Test Data - Suppliers
        //Add a couple of suppliers
        wholeSaleSupplierDir = new OrganizationDirectory();
        
        
        this.getWholeSaleSupplierDir().getOrganizationList().add(new WholeSaleSupplierOrganization("Lots WholeSale", this));
        this.getWholeSaleSupplierDir().getOrganizationList().add(new WholeSaleSupplierOrganization("CostCo WholeSale", this));
        this.getWholeSaleSupplierDir().getOrganizationList().add(new WholeSaleSupplierOrganization("Walmart WholeSale", this));
        
        
        //Test Data - Dealers
        //Add a couple of dealers
        dealerDir = new OrganizationDirectory();
        
        this.getDealerDir().getOrganizationList().add(new DealerOrganization("Daves Store", this));
        this.getDealerDir().getOrganizationList().add(new DealerOrganization("Joes Store", this));
        this.getDealerDir().getOrganizationList().add(new DealerOrganization("Alwin Electronics", this));
        this.getDealerDir().getOrganizationList().add(new DealerOrganization("Thrift Store Manufacturer", this));
        
        //Test Data - Add one Auction consultant
        this.auctionUnitOrg = new AuctionUnitOrganization("Phoenix Auction Consultants", this);
        
        //Initialize order work queue globally for orders
        this.orderWorkQueue = new OrderWorkQueue();
        
        //Test Data - Add one CustomerService roled person
        this.customerServiceOrg = new CustomerServiceOrganization("Customer Service 1", this);
        
        //Test Data - Add one Manufacturing Unit roled person
        //this.manufacturingUnitOrganization = new ManufacturingUnitOrganization();
       
  
        //Test Data - Add a few Shipping companies.
        this.shippingCompanies = new OrganizationDirectory();
        
        
        
        this.getShippingCompanies().getOrganizationList().add(new ShippingUnitOrganization("FEDEX", this));
        this.getShippingCompanies().getOrganizationList().add(new ShippingUnitOrganization("USPS", this));
        this.getShippingCompanies().getOrganizationList().add(new ShippingUnitOrganization("UPS", this));
        
        //Test Data - Add a few Maintenance Operators to get started with.
        this.maintenanceOperators = new OrganizationDirectory();
        
        this.getMaintenanceOperators().getOrganizationList().add(new MaintenanceOrganization("Fiery Maintenance Operators", this));
        this.getMaintenanceOperators().getOrganizationList().add(new MaintenanceOrganization("Sharon Maintenance Consultancy", this));
        this.getMaintenanceOperators().getOrganizationList().add(new MaintenanceOrganization("Vantage Maintenance Agency", this));
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    public static void setInstance(EcoSystem system) {
        business = system;
    }
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public OrderWorkQueue getOrderWorkQueue() {
        return orderWorkQueue;
    }

    public ArrayList<SysAdminLogs> getSysAdminLogList() {
        return sysAdminLogList;
    }
public CustomerDirectory getGlobalCustomerDirectory() {
        CustomerDirectory custDir = new CustomerDirectory();
        
        for (UserAccount ua : this.getUserAccountDirectory().getUserAccountList()) {
            if (ua instanceof Customer)
                custDir.addCustomer((Customer) ua);
        } 
        
        return custDir;
    }
    
    public ProductDirectory leastBoughtProductDirectory() {//Return products in a product directory, which were bought lesser than 2 times by customers
        ProductDirectory leastBoughtPD = new ProductDirectory(); //Start with global list of Products

        for (Product globalProduct : this.getProductDirectory().getProducts())
            leastBoughtPD.getProducts().add(globalProduct);
                
        //First get a map of Products in Work orders, and add a count to it
        HashMap<Product, Integer> productListCountMap = new HashMap<Product, Integer>();

        //A Map of Product and how many times the product - dealer combo based Product was bought by customers
        for (Customer cust : getGlobalCustomerDirectory().getCustomerList()) {
            productListCountMap = cust.getWorkQueue().updateProductMapBasedOnOrders(productListCountMap, this.getProductDirectory());
        }
        
        //Find the lesser than 2 count product from map, and then add all those into PD.. so better start with global directory, and delete the more than count 2 items.
        for (Map.Entry<Product,Integer> entry : productListCountMap.entrySet())  {
           
            //Remove the products from this directory, which were bought more than 2 times
            if (entry.getValue() >= 2) {
               leastBoughtPD.getProducts().remove(entry.getKey());
           } 
        }

        return leastBoughtPD;
    }
    
    public ShippingUnitOrganization findShippingCompany(UserAccount ua) {
        ShippingUnitOrganization foundShippingCompany = null;
        
        for  (Organization org: this.getShippingCompanies().getOrganizationList()) {
            ShippingUnitOrganization ship = (ShippingUnitOrganization) org;
            
            if (ship.getUserAccountAssoc().equals(ua)) {
                foundShippingCompany = ship;
                break;
            }
                
        }
        return foundShippingCompany;
    }
}
