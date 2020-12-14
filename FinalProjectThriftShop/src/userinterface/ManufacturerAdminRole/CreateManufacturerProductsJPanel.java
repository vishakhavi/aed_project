/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManufacturerAdminRole;

import Business.Organization.DealerOrganization;
import Business.EcoSystem;
import Business.Product.Product;
import Business.Product.ProductDirectory;
import Business.Organization.WholeSaleSupplierOrganization;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import userinterface.DealerRole.DealerWorkAreaJPanel;

/**
 *
 * @author Vishakha
 */
public class CreateManufacturerProductsJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    WholeSaleSupplierOrganization supplier;
    DealerOrganization dealer;
    EcoSystem ecoSystem;
    ProductDirectory dealerPd ;
    ProductDirectory globalPd;
    /**
     * Creates new form CreateResaurantJPanel
     */
    public CreateManufacturerProductsJPanel(JPanel upc, DealerOrganization dealer, EcoSystem ecoSystem) {
        this.userProcessContainer = upc;
        this.dealer = dealer;
        this.ecoSystem = ecoSystem;
        this.dealerPd = this.dealer.getProductDirectory();
        this.globalPd = this.ecoSystem.getProductDirectory();
        initComponents();
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
        jTxtProductName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtProductPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtProductCat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBtnCreateProduct = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTxtProductQty = new javax.swing.JTextField();
        jBtnBrowse = new javax.swing.JButton();
        jLabelImagePath = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Create Supplier - Product");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Price");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Category");

        jBtnCreateProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnCreateProduct.setText("Create Product");
        jBtnCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreateProductActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");

        jBtnBrowse.setText("Browse");
        jBtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBrowseActionPerformed(evt);
            }
        });

        jLabelImagePath.setText("<<Product Image Path>>");

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtProductCat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jTxtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(70, 70, 70)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtProductQty)
                                    .addComponent(jLabelImagePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41)
                                .addComponent(jBtnCreateProduct)))))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtProductCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtProductQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnBrowse)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCreateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(214, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateProductActionPerformed
             
      
            Product dealerProduct = new Product();
            Product globalDirectoryProduct = new Product(); //Make sure to have another Copy.. this helps during separate update process
            
            dealerProduct.setDealer(this.dealer);
            dealerProduct.setName(jTxtProductName.getText().trim());
            dealerProduct.setPrice(Double.parseDouble(jTxtProductPrice.getText().trim())); //Dealers sell at 10% profit
            dealerProduct.setQty(Integer.parseInt(jTxtProductQty.getText().trim()));
            dealerProduct.setCategory(jTxtProductCat.getText().trim());
            dealerProduct.setProductImagePath(jLabelImagePath.getText());
            
            //Update Global Product directory with same params
           globalDirectoryProduct.setDealer(this.dealer);
            globalDirectoryProduct.setName(jTxtProductName.getText().trim());
            globalDirectoryProduct.setPrice(Double.parseDouble(jTxtProductPrice.getText().trim())); //Dealers sell at 10% profit
            globalDirectoryProduct.setQty(Integer.parseInt(jTxtProductQty.getText().trim()));
            globalDirectoryProduct.setCategory(jTxtProductCat.getText().trim());
            globalDirectoryProduct.setProductImagePath(jLabelImagePath.getText());
           addProductToDirectory(dealerProduct, dealerPd);
            addProductToDirectory(globalDirectoryProduct, globalPd);
        //Add the product to the Supplier's inventory
     //   this.dealer.getProductDirectory().getProducts().add(dealerProduct);
      //   this.ecoSystem.getProductDirectory().getProducts().add(globalDirectoryProduct);
        
        JOptionPane.showMessageDialog(null, "Created Product successfully");
        
        //Populate previous screen table and navigate back.
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        
         //        Restore prev screen's state
        Component[] comps = userProcessContainer.getComponents();

          for (Component comp : comps){
            if (comp instanceof DealerWorkAreaJPanel ){
                DealerWorkAreaJPanel manageWS = (DealerWorkAreaJPanel) comp;
                manageWS.populateRequestTable();
            }
        }
          
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_jBtnCreateProductActionPerformed
 private void addProductToDirectory(Product product, ProductDirectory productDirectory) {
     //Check if product already exists, if so add the qty alone and if not, create the product itself
     if(productDirectory.getProducts() != null){
        Product foundProduct = productDirectory.findProductBasedOnDealer(product.getName(), product.getDealer().getName());
        
        if (foundProduct != null) {
            
            foundProduct.setQty(foundProduct.getQty() + product.getQty());
        } else {
            productDirectory.getProducts().add(product);
        }
    }else{
         productDirectory.addProductQuantity(product.getName(), dealer.getName(), product.getQty());
}
}
    private void jBtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBrowseActionPerformed
         // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "gif", "png", "jpg");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
//            product.setProductImagePath(path);
            jLabelImagePath.setText(path);
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("Did not select a file");
        }
    }//GEN-LAST:event_jBtnBrowseActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton jBtnBrowse;
    private javax.swing.JButton jBtnCreateProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelImagePath;
    private javax.swing.JTextField jTxtProductCat;
    private javax.swing.JTextField jTxtProductName;
    private javax.swing.JTextField jTxtProductPrice;
    private javax.swing.JTextField jTxtProductQty;
    // End of variables declaration//GEN-END:variables
}
