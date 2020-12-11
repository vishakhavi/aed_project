/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Auction.AuctionProductDirectory;
import Business.Dealer.Dealer;
import Business.Dealer.DealerDirectory;
import Business.Dealer.ThriftDealer;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Network.Network;
import Business.Organization.AuctionUnitOrganization;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.MaintenanceOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.ShippingUnitOrganization;
import Business.Product.ProductDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.WholeSaleSupplier.WholeSaleSupplier;
import Business.WholeSaleSupplier.WholeSaleSupplierDirectory;
import Business.WorkQueue.OrderWorkQueue;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private WholeSaleSupplierDirectory wholeSaleSupplierDir;
    private DealerDirectory dealerDir; 
    private WorkQueue workQueue;
    private OrderWorkQueue orderWorkQueue;
    private DeliveryManDirectory deliveryManDirectory;

    private ProductDirectory productDirectory;
    private AuctionUnitOrganization auctionUnitOrg;
    private CustomerServiceOrganization customerServiceOrg;

   
    private OrganizationDirectory shippingCompanies;
    private OrganizationDirectory maintenanceOperators;
    private AuctionProductDirectory auctionProductDirectory;

    
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


    public DealerDirectory getDealerDir() {
        return dealerDir;
    }

    public void setDealerDir(DealerDirectory dealerDir) {
        this.dealerDir = dealerDir;
    }
   

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }

    public WholeSaleSupplierDirectory getWholeSaleSupplierDir() {
        return wholeSaleSupplierDir;
    }

    public void setWholeSaleSupplierDir(WholeSaleSupplierDirectory wholeSaleSupplierDir) {
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
        
        //Initialize a Global - Product Directory
        this.productDirectory = new ProductDirectory();
        
        //Initialize a Global - Auction Product Directory
        this.auctionProductDirectory = new AuctionProductDirectory();

        //Test Data - Suppliers
        //Add a couple of suppliers
        wholeSaleSupplierDir = new WholeSaleSupplierDirectory();
        
        
        this.getWholeSaleSupplierDir().getwholeSaleSupplierList().add(new WholeSaleSupplier("Lots WholeSale", this));
        this.getWholeSaleSupplierDir().getwholeSaleSupplierList().add(new WholeSaleSupplier("CostCo WholeSale", this));
        this.getWholeSaleSupplierDir().getwholeSaleSupplierList().add(new WholeSaleSupplier("Walmart WholeSale", this));
        
        
        //Test Data - Dealers
        //Add a couple of dealers
        dealerDir = new DealerDirectory();
        
        this.getDealerDir().getDealersList().add(new Dealer("Daves Store", this));
        this.getDealerDir().getDealersList().add(new Dealer("Joes Store", this));
        this.getDealerDir().getDealersList().add(new Dealer("Alwin Electronics", this));
        
        //Test Data - Add one Auction consultant
        this.auctionUnitOrg = new AuctionUnitOrganization("Phoenix Auction Consultants", this);
        
        //Initialize order work queue globally for orders
        this.orderWorkQueue = new OrderWorkQueue();
        
        //Test Data - Add one CustomerService roled person
        this.customerServiceOrg = new CustomerServiceOrganization("Customer Service 1", this);
        
        //Test Data - Add one Manufacturing Unit roled person
        //this.manufacturingUnitOrganization = new ManufacturingUnitOrganization();
       
        this.getDealerDir().getThriftDealersList().add(new ThriftDealer("Thrift Store Manufacturer", this));
        //this.getManufacturerDirectory().addManufacturer(new Manufacturer("Thrift Store Manufacturer",this));
        
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
    
    
}
