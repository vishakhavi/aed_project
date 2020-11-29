/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.wholeSaleSupplier;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Product.Product;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.WholeSaleSupplier.WholeSaleSupplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Arthishravan
 */
public class CreateSupProductsJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    WholeSaleSupplier supplier;
    /**
     * Creates new form CreateResaurantJPanel
     */
    public CreateSupProductsJPanel(JPanel upc, WholeSaleSupplier sup) {
        this.userProcessContainer = upc;
        this.supplier = sup;
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
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jBtnCreateProduct)))
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
                .addGap(47, 47, 47)
                .addComponent(jBtnCreateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateProductActionPerformed
        Product product = new Product();
                
        product.setName(jTxtProductName.getText().trim());
        product.setPrice(Double.parseDouble(jTxtProductPrice.getText().trim()));
        product.setCategory(jTxtProductCat.getText().trim());
        product.setSupplier(this.supplier);
        
        this.supplier.getProductDirectory().getProducts().add(product);
        
        JOptionPane.showMessageDialog(null, "Created Product successfully");
        
        //Populate previous screen table and navigate back.
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        
         //        Restore prev screen's state
        Component[] comps = userProcessContainer.getComponents();

          for (Component comp : comps){
            if (comp instanceof WholeSaleSupplierWorkAreaJPanel){
                WholeSaleSupplierWorkAreaJPanel manageWS = (WholeSaleSupplierWorkAreaJPanel) comp;
                manageWS.populateRequestTable();
            }
        }
          
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_jBtnCreateProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCreateProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTxtProductCat;
    private javax.swing.JTextField jTxtProductName;
    private javax.swing.JTextField jTxtProductPrice;
    // End of variables declaration//GEN-END:variables
}
