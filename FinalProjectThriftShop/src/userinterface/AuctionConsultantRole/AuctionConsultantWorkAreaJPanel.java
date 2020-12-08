/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AuctionConsultantRole;


import Business.Auction.AuctionProduct;
import Business.Auction.AuctionProductDirectory;
import Business.Dealer.Dealer;
import userinterface.wholeSaleSupplierRole.*;
import Business.EcoSystem;
import Business.Product.Product;

import Business.UserAccount.UserAccount;
import Business.WholeSaleSupplier.WholeSaleSupplier;
import Business.WorkQueue.CustomerWorkOrder;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
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
    /**
     * Creates new form DoctorWorkAreaJPanel
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
        
        setListenerForTableSelection();
        populateEligProductsTable();
        populateAuctionProducts();
    }
    
    public void populateEligProductsTable(){
        DefaultTableModel model = (DefaultTableModel)productsJTable.getModel();
        model.setRowCount(0);
        
        for (Product p : this.ecosystem.getProductDirectory().getProducts()) {
                Object row[] = new Object[5];
                row[0] = p.getId();
                row[1] = p;
                row[2] = p.getPrice();
                row[3] = p.getQty();
                row[4] = p.getDealer();
                model.addRow(row); 
        }
    }
    
     public void populateAuctionProducts(){
        DefaultTableModel model = (DefaultTableModel)auctionProductsJTable.getModel();
        model.setRowCount(0);
        
        for (AuctionProduct p : this.ecosystem.getAuctionProductDirectory().getAuctionProducts()) {
                Object row[] = new Object[model.getColumnCount()];;
                row[0] = p.getId();
                row[1] = p;
                row[2] = p.getBidPrice();
                row[3] = p.getBidCount();
                row[4] = p.getMaxBidAskPrice();
                row[5] = (p.getBidWinCustomer() != null) ? p.getBidWinCustomer() : "No Bids Yet";
                model.addRow(row);
        }
    }
    
    private void setListenerForTableSelection() {
      productsJTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
          public void valueChanged(ListSelectionEvent event) {
              if (productsJTable.getSelectedRow() != -1) {
                  Product prod = (Product) productsJTable.getValueAt(productsJTable.getSelectedRow(), 1);
                  jLabelGlobalProdPicture.setIcon(finalImage(prod.getProductImagePath()));
              }
          }
      });
      
      //For Auction Products List
       auctionProductsJTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
          public void valueChanged(ListSelectionEvent event) {
              if (auctionProductsJTable.getSelectedRow() != -1) {
                  AuctionProduct prod = (AuctionProduct) auctionProductsJTable.getValueAt(auctionProductsJTable.getSelectedRow(), 1);
                  jLabelAuctionProdPicture.setIcon(finalImage(prod.getProductImagePath()));
              }
          }
      });
    }
    
     public ImageIcon finalImage(String imagePath) {
        ImageIcon image  = new ImageIcon(imagePath);
        Image img = image.getImage();
        Image modifiedImg = img.getScaledInstance(jLabelGlobalProdPicture.getWidth(), jLabelGlobalProdPicture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalImage = new ImageIcon(modifiedImg);
        return finalImage;
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
        jLabelGlobalProdPicture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtAuctionQty = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        auctionProductsJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        sellToCustomer = new javax.swing.JButton();
        jLabelAuctionProdPicture = new javax.swing.JLabel();
        resetAuctionListButton = new javax.swing.JButton();

        productsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Price", "Inventory", "Dealer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productsJTable);

        addToAuction.setText("Add to Auction List");
        addToAuction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToAuctionActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Auction Consultant Company Name");

        auctionCompNameLabel.setText("<value>");

        jLabel1.setText("List of Products - that qualify for auctioning (Less than 2 Orders placed)");

        jLabel2.setText("# of Units to Add to Auction");

        auctionProductsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Original Price", "Bids Asked Count", "Max Bid Price", "Best bid Customer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(auctionProductsJTable);

        jLabel3.setText("Auction Products");

        sellToCustomer.setText("Sell to best-bid Customer");
        sellToCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellToCustomerActionPerformed(evt);
            }
        });

        resetAuctionListButton.setText("Reset Auction List");
        resetAuctionListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAuctionListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtAuctionQty, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(202, 202, 202))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(477, 477, 477)
                                        .addComponent(resetAuctionListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(refreshTestJButton)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(jLabelAuctionProdPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(212, 212, 212)
                                        .addComponent(sellToCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(addToAuction, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelGlobalProdPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(auctionCompNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(auctionCompNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetAuctionListButton)
                    .addComponent(refreshTestJButton))
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAuctionProdPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(sellToCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelGlobalProdPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtAuctionQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(addToAuction, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelGlobalProdPicture.setBounds(10, 10, 650, 250);
        jLabelGlobalProdPicture.setBounds(10, 10, 650, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void addToAuctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToAuctionActionPerformed
        int selectedProdRow = productsJTable.getSelectedRow();
        String qtyText = jTxtAuctionQty.getText().trim();
        
        
         if (selectedProdRow >= 0 && !qtyText.isEmpty()){
             //TODO: Loop over the selected quantity of products and create Auction Products, add to the Auction Product directory. Keep refreshing the list..
             Product selectedProduct = (Product) productsJTable.getValueAt(selectedProdRow, 1);
             AuctionProductDirectory apd = this.ecosystem.getAuctionProductDirectory();
             
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
             
             
             //TODO - Update Dealer Inventory Count only when Customer gets the product*************************
             
             JOptionPane.showMessageDialog(null, "Added Products to Auction Products Inventory successfully !!!");
             
             //Refresh Product Inventory
             populateEligProductsTable();
             //Refresh Auction Lists automatically
             populateAuctionProducts();
             
             //Refresh the image labels in case they were showing
             jLabelAuctionProdPicture.setIcon(null);
             jLabelGlobalProdPicture.setIcon(null);
             
         }else {
            JOptionPane.showMessageDialog(null,"Please select a Product and # of units to add to Auction", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_addToAuctionActionPerformed

    
    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateEligProductsTable();
        populateAuctionProducts();
        jLabelGlobalProdPicture.setIcon(null);
        jLabelAuctionProdPicture.setIcon(null);
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void sellToCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellToCustomerActionPerformed
        // Create a work request for the Customer. Update inventory count of the dealer. Remove item from AuctionProductsDirectory
        int selectedAuctionProductRow = auctionProductsJTable.getSelectedRow();
        
        if (selectedAuctionProductRow >= 0){
            try {
                UserAccount customerUserAccount = (UserAccount) auctionProductsJTable.getValueAt(selectedAuctionProductRow, 5);
                AuctionProduct selectedAuctionProduct = (AuctionProduct) auctionProductsJTable.getValueAt(selectedAuctionProductRow, 1);
                
                CustomerWorkOrder cwo = new CustomerWorkOrder();
                
                cwo.setAuctionProduct(selectedAuctionProduct);
                cwo.setStatus("NEW");
                cwo.setRequestDate(new Date());
                cwo.setSender(this.userAccount);
                
                customerUserAccount.getWorkQueue().getWorkRequestList().add(cwo);
                
                //Update Dealer Inventory
                Dealer dealer = selectedAuctionProduct.getDealer();
                Product prodRecord = dealer.getProductDirectory().findProduct(selectedAuctionProduct.getName());
                prodRecord.setQty(prodRecord.getQty() - 1);
                
                //Delete record from Auction product list.
                this.ecosystem.getAuctionProductDirectory().removeAuctionProduct(selectedAuctionProduct);
                
                JOptionPane.showMessageDialog(null, "Sold the chosen Auction Product successfully !!!");
                
                //Reload Auction Products Table
                populateAuctionProducts();
                jLabelAuctionProdPicture.setIcon(null);   
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
        jLabelAuctionProdPicture.setIcon(null);
        populateEligProductsTable();
        jLabelGlobalProdPicture.setIcon(null);
    }//GEN-LAST:event_resetAuctionListButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToAuction;
    private javax.swing.JLabel auctionCompNameLabel;
    private javax.swing.JTable auctionProductsJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAuctionProdPicture;
    private javax.swing.JLabel jLabelGlobalProdPicture;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTxtAuctionQty;
    private javax.swing.JTable productsJTable;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton resetAuctionListButton;
    private javax.swing.JButton sellToCustomer;
    // End of variables declaration//GEN-END:variables
}
