/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Dealer.Dealer;
import Business.Dealer.DealerDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Product.ProductDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.WholeSaleSupplier.WholeSaleSupplier;
import Business.WholeSaleSupplier.WholeSaleSupplierDirectory;
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

    public DealerDirectory getDealerDir() {
        return dealerDir;
    }

    public void setDealerDir(DealerDirectory dealerDir) {
        this.dealerDir = dealerDir;
    }
    private ProductDirectory productDirectory;

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
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
