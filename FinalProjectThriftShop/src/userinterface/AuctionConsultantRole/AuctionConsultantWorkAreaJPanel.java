/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AuctionConsultantRole;


import Business.Auction.AuctionProduct;
import Business.Auction.AuctionProductDirectory;
import Business.Organization.DealerOrganization;
import userinterface.wholeSaleSupplierRole.*;
import Business.EcoSystem;
import Business.Product.Product;

import Business.UserAccount.UserAccount;
import Business.Organization.WholeSaleSupplierOrganization;
import Business.WorkQueue.CustomerWorkOrder;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthi
 */
public class AuctionConsultantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    EcoSystem ecosystem;
    private DefaultTableModel viewTable;
    
    private static final Object[] columnNamesAuctionProducts = {"Product Name", "Original Price", "Bids Asked Count", "Max Bid Price", "Best Bid Customer", "Product Image"};
    private static final Object[] columnNamesProductsElig = {"Product Name", "Price", "Inventory", "Dealer", "Product Image"};
    /**
     * Creates new form AuctionConsultantWorkAreaJPanel
     */
    public AuctionConsultantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
      
        this.userAccount = account;
        this.ecosystem = system;
        
        auctionCompNameLabel.setText(this.ecosystem.getAuctionUnitOrg().getName());
        
        //Setting Sort setting on tables
        productsJTable.setAutoCreateRowSorter(true);
        auctionProductsJTable.setAutoCreateRowSorter(true);
        populateEligProductsTable();
        populateAuctionProducts();
    }
    
    public void populateEligProductsTable(){
        viewTable =  new DefaultTableModel(null,columnNamesProductsElig){
          @Override
          public Class<?> getColumnClass(int column) {
              if (column==4) return Icon.class;
              return Object.class;
           }
        };
        
        viewTable.setRowCount(0);
        
        for (Product p : this.ecosystem.leastBoughtProductDirectory().getProducts()) {
            Object row[] = new Object[5];
            row[0] = p;
            row[1] = p.getPrice();
            row[2] = p.getQty();
            row[3] = p.getDealer();
                
            String temp = p.getProductImagePath();
            if(temp != null)
            {
                ImageIcon ii = new ImageIcon(temp);
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
                row[4] = ii;
            }
            else
            {    
                row[4] = "No image";
            }
                
            viewTable.addRow(row); 
        }
        
        productsJTable.setRowHeight(80);
        productsJTable.setModel(viewTable);
    }
    
     public void populateAuctionProducts(){
         viewTable =  new DefaultTableModel(null,columnNamesAuctionProducts){
          @Override
          public Class<?> getColumnClass(int column) {
              if (column==5) return Icon.class;
              return Object.class;
           }
        };
         
        viewTable.setRowCount(0);
        
        for (AuctionProduct p : this.ecosystem.getAuctionProductDirectory().getAuctionProducts()) {
            Object row[] = new Object[viewTable.getColumnCount()];
            row[0] = p;
            row[1] = p.getBidPrice();
            row[2] = p.getBidCount();
            row[3] = p.getMaxBidAskPrice();
            row[4] = (p.getBidWinCustomer() != null) ? p.getBidWinCustomer() : "No Bids Yet";
                
            String temp = p.getProductImagePath();
            if(temp != null)
            {
                ImageIcon ii = new ImageIcon(temp);
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
                row[5] = ii;
            }
            else
            {    
                row[5] = "No image";
            }
                
            viewTable.addRow(row);
        }
        
        auctionProductsJTable.setRowHeight(80);
        auctionProductsJTable.setModel(viewTable);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productsJTable = new javax.swing.JTable();
        addToAuction = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        auctionCompNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtAuctionQty = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        auctionProductsJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        sellToCustomer = new javax.swing.JButton();
        resetAuctionListButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        productsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Price", "Inventory", "Dealer", "Product Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productsJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(230, 480, 729, 180);

        addToAuction.setText("Add to Auction List");
        addToAuction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToAuctionActionPerformed(evt);
            }
        });
        add(addToAuction);
        addToAuction.setBounds(460, 740, 196, 31);

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton);
        refreshTestJButton.setBounds(980, 80, 100, 23);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Auction Consultant Company Name");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(230, 80, 334, 30);

        auctionCompNameLabel.setText("<value>");
        add(auctionCompNameLabel);
        auctionCompNameLabel.setBounds(590, 80, 219, 26);

        jLabel1.setText("List of Products - that qualify for auctioning (Less than 2 Orders placed)");
        add(jLabel1);
        jLabel1.setBounds(230, 450, 545, 14);
        add(jTxtAuctionQty);
        jTxtAuctionQty.setBounds(380, 690, 155, 30);

        jLabel2.setText("# of Units to Add to Auction");
        add(jLabel2);
        jLabel2.setBounds(230, 700, 167, 14);

        auctionProductsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Original Price", "Bids Asked Count", "Max Bid Price", "Best bid Customer", "Product Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(auctionProductsJTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(230, 160, 729, 210);

        jLabel3.setText("Auction Products");
        add(jLabel3);
        jLabel3.setBounds(230, 130, 545, 14);

        sellToCustomer.setText("Sell to best-bid Customer");
        sellToCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellToCustomerActionPerformed(evt);
            }
        });
        add(sellToCustomer);
        sellToCustomer.setBounds(460, 380, 187, 31);

        resetAuctionListButton.setText("Reset Auction List");
        resetAuctionListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAuctionListButtonActionPerformed(evt);
            }
        });
        add(resetAuctionListButton);
        resetAuctionListButton.setBounds(810, 80, 147, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Optimized-online auction.jpg"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(10, 0, 120, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Auction1.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(410, 300, 810, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void addToAuctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToAuctionActionPerformed
        int selectedProdRow = productsJTable.getSelectedRow();
        String qtyText = jTxtAuctionQty.getText().trim();
        
        
         if (selectedProdRow >= 0 && !qtyText.isEmpty()){
             //TODO: Loop over the selected quantity of products and create Auction Products, add to the Auction Product directory. Keep refreshing the list..
             Product selectedProduct = (Product) productsJTable.getValueAt(selectedProdRow, 0);
             AuctionProductDirectory apd = this.ecosystem.getAuctionProductDirectory();
             
             
             if (Integer.parseInt(qtyText) > selectedProduct.getQty()) {
                 JOptionPane.showMessageDialog(null,"# of units greater than available inventory - Cannot Add", "Warning", JOptionPane.WARNING_MESSAGE);
             } else {
                //Create one Auction Product per count of qty, in ProductDirectory when looped through
                for (int i =0; i < Integer.parseInt(qtyText); i++) {
                    AuctionProduct ap = new AuctionProduct();
                    ap.setName(selectedProduct.getName());
                    ap.setBidPrice(EcoSystem.round(selectedProduct.getPrice() - (selectedProduct.getPrice() * 0.4), 2)); //Start Auction with 40% reduced price
                    ap.setProductImagePath(selectedProduct.getProductImagePath());
                    ap.setAuctionCompany(this.ecosystem.getAuctionUnitOrg());
                    ap.setDealer(selectedProduct.getDealer());
                    ap.setCategory(selectedProduct.getCategory());
                    ap.setBidCount(0);
                    ap.setBidWinCustomer(null); //Initially no customer would have bid anything
                    ap.setMaxBidAskPrice(0.00); //Initially no bids would be placed, the the amount will be 0 and no customers bid info

                    apd.getAuctionProducts().add(ap);
                }

                //Update Global Inventory Count
                selectedProduct.setQty(selectedProduct.getQty() - Integer.parseInt(qtyText));


                //TODO - Update DealerOrganization Inventory Count only when Customer gets the product*************************

                JOptionPane.showMessageDialog(null, "Added Products to Auction Products Inventory successfully !!!");

                //Refresh Product Inventory
                populateEligProductsTable();
                //Refresh Auction Lists automatically
                populateAuctionProducts();
             }
             
            
             
             
         }else {
            JOptionPane.showMessageDialog(null,"Please select a Product and # of units to add to Auction", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_addToAuctionActionPerformed

    
    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateEligProductsTable();
        populateAuctionProducts();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void sellToCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellToCustomerActionPerformed
        // Create a work request for the Customer. Update inventory count of the dealer. Remove item from AuctionProductsDirectory
        //Finally add the work request, to the DealerOrganization WorkQueue too.
        int selectedAuctionProductRow = auctionProductsJTable.getSelectedRow();
        
        if (selectedAuctionProductRow >= 0){
            try {
                UserAccount customerUserAccount = (UserAccount) auctionProductsJTable.getValueAt(selectedAuctionProductRow, 4);
                AuctionProduct selectedAuctionProduct = (AuctionProduct) auctionProductsJTable.getValueAt(selectedAuctionProductRow, 0);
                
                CustomerWorkOrder cwo = new CustomerWorkOrder();
                
                cwo.setAuctionProduct(selectedAuctionProduct);
                cwo.setStatus("New");
                cwo.setRequestDate(new Date());
                cwo.setSender(customerUserAccount);
                cwo.setReceiver(selectedAuctionProduct.getDealer().getUserAccountAssoc());
                cwo.setRequireCustomerService(false);
                cwo.setBestBidCustomer(auctionProductsJTable.getValueAt(selectedAuctionProductRow, 4).toString());
                
                customerUserAccount.getWorkQueue().getWorkRequestList().add(cwo); //Adding to customer WRs.
                selectedAuctionProduct.getDealer().getWorkQueue().addWorkRequest(cwo); //Adding the order to a dealer.
                
                //Update DealerOrganization Inventory
                DealerOrganization dealer = selectedAuctionProduct.getDealer();
                Product prodRecord = dealer.getProductDirectory().findProduct(selectedAuctionProduct.getName());
                prodRecord.setQty(prodRecord.getQty() - 1);
                ecosystem.getWorkQueue().getWorkRequestList().add(cwo);
                
                //Delete record from Auction product list.
                this.ecosystem.getAuctionProductDirectory().removeAuctionProduct(selectedAuctionProduct);
                
                JOptionPane.showMessageDialog(null, "Sold the chosen Auction Product successfully !!!");
                
                //Reload Auction Products Table
                populateAuctionProducts();
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null,"A Customer is not assigned yet to this row, please choose a different one to sell", "Warning", JOptionPane.WARNING_MESSAGE);
            }  
        } else {
            JOptionPane.showMessageDialog(null,"Please select a an Auction Item to sell to a customer", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_sellToCustomerActionPerformed

    private void resetAuctionListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAuctionListButtonActionPerformed
        //Update The Global products inventory back, before clearing the list
        HashMap<String, Integer> auctionListCount = new HashMap<String, Integer>();
        
        //Create the count of deletions first
        for (AuctionProduct ap : this.ecosystem.getAuctionProductDirectory().getAuctionProducts()) {
            if(auctionListCount.get(ap.getName() + "-" + ap.getDealer().getName()) != null) {
                int count = auctionListCount.get(ap.getName() + "-" + ap.getDealer().getName());
                auctionListCount.put(ap.getName() + "-" + ap.getDealer().getName(), count + 1);
            } else {
                auctionListCount.put(ap.getName() + "-" + ap.getDealer().getName(), 1);
            }
        }
        
        //Loop over the hashmap, update global product directory - inventory back to how it was.
         for (Map.Entry<String,Integer> entry : auctionListCount.entrySet())  {
             String productName = entry.getKey().split("-")[0];
             String dealerName = entry.getKey().split("-")[1];
             
             this.ecosystem.getProductDirectory().addProductQuantity(productName, dealerName, entry.getValue());
         }
        
        
        this.ecosystem.getAuctionProductDirectory().getAuctionProducts().clear(); //Clear/clean Auction Products
        //Reset AuctionProducts Static count back to 0
        AuctionProduct.setCount(1);
        
        JOptionPane.showMessageDialog(null, "Resetted Auction Products Inventory successfully !!!");
        
        //Populate tables again
        populateAuctionProducts();
        populateEligProductsTable();
    }//GEN-LAST:event_resetAuctionListButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToAuction;
    private javax.swing.JLabel auctionCompNameLabel;
    private javax.swing.JTable auctionProductsJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTxtAuctionQty;
    private javax.swing.JTable productsJTable;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton resetAuctionListButton;
    private javax.swing.JButton sellToCustomer;
    // End of variables declaration//GEN-END:variables
}
