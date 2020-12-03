/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AuctionConsultantRole;


import userinterface.wholeSaleSupplierRole.*;
import Business.EcoSystem;
import Business.Product.Product;

import Business.UserAccount.UserAccount;
import Business.WholeSaleSupplier.WholeSaleSupplier;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
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
        
        setListenerForTableSelection();
        populateEligProductsTable();
    }
    
    public void populateEligProductsTable(){
        DefaultTableModel model = (DefaultTableModel)productsJTable.getModel();
        model.setRowCount(0);
        
        for (Product p : this.ecosystem.getProductDirectory().getProducts()) {
                Object row[] = new Object[4];
                row[0] = p.getId();
                row[1] = p;
                row[2] = p.getPrice();
                row[3] = p.getQty();
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
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        auctionCompNameLabel = new javax.swing.JLabel();
        jLabelGlobalProdPicture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtAuctionQty = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        productsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Price", "Inventory"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productsJTable);

        requestTestJButton.setText("Add to Auction List");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(auctionCompNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(refreshTestJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtAuctionQty, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelGlobalProdPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(auctionCompNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshTestJButton))
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(295, 295, 295)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelGlobalProdPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtAuctionQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jLabelGlobalProdPicture.setBounds(10, 10, 650, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
//        CreateSupProductsJPanel cspj = new CreateSupProductsJPanel(userProcessContainer, this.supplier);
//        userProcessContainer.add("createSupProducts", cspj);
//        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
//        layout.next(userProcessContainer);   
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateEligProductsTable();
        jLabelGlobalProdPicture.setIcon(null);
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel auctionCompNameLabel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelGlobalProdPicture;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtAuctionQty;
    private javax.swing.JTable productsJTable;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
