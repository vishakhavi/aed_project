/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Auction.AuctionProductDirectory;
import Business.Customer.Ads;
import Business.Customer.CustomerDirectory;
import Business.Dealer.Dealer;
import Business.Dealer.DealerDirectory;
import Business.Network.Network;
import Business.Organization.AuctionUnitOrganization;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.Product.ProductDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.WholeSaleSupplier.WholeSaleSupplier;
import Business.WholeSaleSupplier.WholeSaleSupplierDirectory;
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
    private Ads adsDirectory;
    private CustomerDirectory customerDirectory;

    
    private WorkQueue workQueue;


    private ProductDirectory productDirectory;
    private AuctionUnitOrganization auctionUnitOrg;
    private AuctionProductDirectory auctionProductDirectory;

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
}
