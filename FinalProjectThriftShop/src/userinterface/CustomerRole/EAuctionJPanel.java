/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Auction.AuctionProduct;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Organization.MaintenanceOrganization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.ShippingUnitOrganization;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.imageio.ImageIO;
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
public class EAuctionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ECommerceMainJPanel
     */
    JPanel rightSystemAdminPanel;
    UserAccount userAccount;
    EcoSystem ecosystem;
    private DefaultTableModel viewTable;
    
    private static final Object[] columnNames = {"Product Name","Dealer","Base Price", "Last bid Price", "Image"};
    public EAuctionJPanel(JPanel rightSystemAdminPanel, UserAccount userAccount, EcoSystem ecosystem){
        initComponents();
        this.rightSystemAdminPanel = rightSystemAdminPanel;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        //Find all product categories and add here
        populateProductCategories();
        tbAuctionlProducts.setAutoCreateRowSorter(true);
        
        populateTable();
    }
    
    private void populateProductCategories() {
        ArrayList<String> catList = new ArrayList <String>();
        
        for(AuctionProduct ap : this.ecosystem.getAuctionProductDirectory().getAuctionProducts()) {
            if (!catList.contains(ap.getCategory())) {
                catList.add(ap.getCategory());
            }
        }
        
        jComboCategory.addItem("All");
        
        for(String cat : catList) 
            jComboCategory.addItem(cat);
    }
    
    public void populateTable()
    {
        
        viewTable =  new DefaultTableModel(null,columnNames){
          @Override
          public Class<?> getColumnClass(int column) {
              if (column==4) return Icon.class;
              return Object.class;
           }
        };
        
        String category = (String) this.jComboCategory.getSelectedItem();
        String searchText = txtSearch.getText().trim();
        boolean invalidSearchText = !searchText.isEmpty() && !searchText.equals("Enter a search string");
        
        if(!category.equals("All") || invalidSearchText) { //Search logic
            viewTable.setRowCount(0);
                 
            for(AuctionProduct ap : this.ecosystem.getAuctionProductDirectory().getAuctionProducts())
            {                
                if(
                    ((!category.equals("All") && invalidSearchText) && (ap.getCategory().equals(category) && ap.getName().toLowerCase().contains(searchText.toLowerCase()))) || //When both cat (is all) & searchText present
                    ((!category.equals("All") && !invalidSearchText) && ap.getCategory().equals(category)) || //When only Cat is not all
                    ((category.equals("All") && invalidSearchText) && ap.getName().toLowerCase().contains(searchText.toLowerCase())) //when only searchText is not empty
                    )
                {
                   Object[] row = new Object[viewTable.getColumnCount()];
                    row[0] = ap;
                    row[1] = ap.getDealer();
                    row[2] = ap.getBidPrice();
                    row[3] = ap.getMaxBidAskPrice();
                    
                    String temp = ap.getProductImagePath();
                    if(temp != null)
                    {
                        ImageIcon ii = new ImageIcon(temp);
                        Image resizedImage = ii.getImage();
                        ii = new ImageIcon(resizedImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
                        row[4] = ii;
                    }
                    else
                    {    
                        row[4] = "Should have been an image";
                    }
                    
                    viewTable.addRow(row); 
                }
            }
               
        }
        else //For usual load of this screen
        {
            viewTable.setRowCount(0);
            for(AuctionProduct ap : this.ecosystem.getAuctionProductDirectory().getAuctionProducts())
            {                   
                Object[] row = new Object[viewTable.getColumnCount()];
                row[0] = ap;
                row[1] = ap.getDealer();
                row[2] = ap.getBidPrice();
                row[3] = ap.getMaxBidAskPrice();
                String temp = ap.getProductImagePath();
                if(temp != null)
                {
                    ImageIcon ii = new ImageIcon(temp);
                    Image resizedImage = ii.getImage();
                    ii = new ImageIcon(resizedImage.getScaledInstance(60, 60, Image.SCALE_SMOOTH));
                    row[4] = ii;
                }
                else
                {    
                    row[4] = "Should have been an image";
                }
                viewTable.addRow(row);                   
            }          
        }
        
    
        tbAuctionlProducts.setRowHeight(80);
        tbAuctionlProducts.setModel(viewTable);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAuctionlProducts = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboCategory = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jTxtBidAskPrice = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        jBtnPlaceBid = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Welcome to the e-Auction Page");
        add(jLabel1);
        jLabel1.setBounds(360, 60, 339, 32);

        tbAuctionlProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Dealer", "Base Price", "Last Bid Price", "Product Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAuctionlProducts.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tbAuctionlProducts.setSelectionForeground(new java.awt.Color(0, 204, 204));
        tbAuctionlProducts.setShowHorizontalLines(false);
        tbAuctionlProducts.setShowVerticalLines(false);
        tbAuctionlProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAuctionlProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAuctionlProducts);

        add(jScrollPane1);
        jScrollPane1.setBounds(130, 170, 768, 317);

        txtSearch.setText("Enter a search string");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        add(txtSearch);
        txtSearch.setBounds(600, 120, 158, 30);

        jLabel3.setText("Search by category: ");
        add(jLabel3);
        jLabel3.setBounds(130, 130, 130, 20);

        jComboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCategoryActionPerformed(evt);
            }
        });
        add(jComboCategory);
        jComboCategory.setBounds(270, 130, 150, 20);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(830, 130, 80, 23);

        jTxtBidAskPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(jTxtBidAskPrice);
        jTxtBidAskPrice.setBounds(340, 510, 124, 30);

        jLabel5.setText("Enter a higher Bid Price");
        add(jLabel5);
        jLabel5.setBounds(140, 510, 136, 30);

        jBtnPlaceBid.setText("Place Bid");
        jBtnPlaceBid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlaceBidActionPerformed(evt);
            }
        });
        add(jBtnPlaceBid);
        jBtnPlaceBid.setBounds(560, 510, 111, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download_120x120.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 120, 120);
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Auction_ecommerce_4_720x400.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(140, 480, 720, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCategoryActionPerformed
        populateTable();
    }//GEN-LAST:event_jComboCategoryActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       populateTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tbAuctionlProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAuctionlProductsMouseClicked

    }//GEN-LAST:event_tbAuctionlProductsMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMouseClicked

    private void jBtnPlaceBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlaceBidActionPerformed
        int selectedAucProdRow = tbAuctionlProducts.getSelectedRow();
        String bidAskPrice = jTxtBidAskPrice.getText().trim();
        
        if (selectedAucProdRow >= 0 && !bidAskPrice.isEmpty()){
            AuctionProduct selectedAuctionProduct = (AuctionProduct) tbAuctionlProducts.getValueAt(selectedAucProdRow, 0);
            
            //Set the bid Price as asked by userAccount, and set the userAccount relationship on the Auction product
            if (selectedAuctionProduct.getMaxBidAskPrice() == 0 && (selectedAuctionProduct.getBidPrice() >= Double.parseDouble((bidAskPrice)))) { //If a product was never bid, and the first bid is lesser than the base auction price of the product
                JOptionPane.showMessageDialog(null,"Cannot Bid a lesser than/same price as the Base price of the product", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (selectedAuctionProduct.getMaxBidAskPrice() >= Double.parseDouble(bidAskPrice)) //Do not let the user to bid if the ask price is lesser than the max asked price.
                JOptionPane.showMessageDialog(null,"Cannot Bid a lesser than/same price as the previous max Bid amount", "Warning", JOptionPane.WARNING_MESSAGE);
            else {
                selectedAuctionProduct.setMaxBidAskPrice(Double.parseDouble(bidAskPrice));
                selectedAuctionProduct.setBidWinCustomer(this.userAccount);
                selectedAuctionProduct.setBidCount(selectedAuctionProduct.getBidCount() + 1);
                
                JOptionPane.showMessageDialog(null, "Succesfully placed your Bid, you will see your orders if the Dealer/Auction Consutants agree with your bid price !!!");
                
                //Reload the table data.
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null,"Please select an Auction Product and enter a bid price to proceed", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnPlaceBidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jBtnPlaceBid;
    private javax.swing.JComboBox<String> jComboCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField jTxtBidAskPrice;
    private javax.swing.JTable tbAuctionlProducts;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
