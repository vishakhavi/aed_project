/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.CustomerService.getValue())){
            organization = new CustomerServiceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MaintenanceStaff.getValue())){
            organization = new MaintenanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new ThriftOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CustomerService.getValue())){
            organization = new CustomerServiceOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.QualityCheckOfficer.getValue())){
            organization = new QualityCheckOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ManufacturerAdmin.getValue())){
            organization = new ManufacturingUnitOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InsuranceManager.getValue())){
            organization = new InsuranceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AuctionConsultant.getValue())){
            organization = new AuctionUnitOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
     public Organization createOrganization(Type type,String name){
        Organization organization = null;
        if (type.getValue().equals(Type.ShippingCompany.getValue())){
            organization = new ShippingUnitOrganization(name);
            organizationList.add(organization);
        }
        return organization;
     }
     
    public WholeSaleSupplierOrganization getWholeSaleSupplierBasedOnUserName(UserAccount ua) {
        WholeSaleSupplierOrganization supplier = null;

            for (Organization org : this.organizationList) {
                if ((org instanceof WholeSaleSupplierOrganization) && ((WholeSaleSupplierOrganization) org).getUserAccountAssoc().equals(ua)) {
                        supplier = (WholeSaleSupplierOrganization) org;
                        break;
                }
            }

        return supplier;
    }
    
    public DealerOrganization getDealerBasedOnUserName(UserAccount ua) {
        DealerOrganization dealer = null;

            for (Organization org : this.organizationList) {
                if ((org instanceof DealerOrganization) && ((DealerOrganization) org).getUserAccountAssoc().equals(ua)) {
                        dealer = (DealerOrganization) org;
                        break;
                }
            }

        return dealer;
    }
}