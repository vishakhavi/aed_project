/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import userinterface.wholeSaleSupplierRole.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Product.Product;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.WholeSaleSupplier.WholeSaleSupplier;
import Business.WorkQueue.CustomerWorkOrder;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Arthishravan
 */
public class ViewCustomerServiceConvoJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    CustomerWorkOrder customerWorkOrder;
    /**
     * Creates new form CreateResaurantJPanel
     */
    public ViewCustomerServiceConvoJPanel(JPanel upc, CustomerWorkOrder cwo) {
        this.userProcessContainer = upc;
        this.customerWorkOrder = cwo;
        initComponents();
        
        jTextAreaCustomerServiceConvo.setLineWrap(true);
        jTextAreaCustomerServiceConvo.setWrapStyleWord(true);
        
        //Set the value of the convo
        jTextAreaCustomerServiceConvo.setText(cwo.getCustomerServiceComments());
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
        jBtnCreateProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCustomerServiceConvo = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Customer Service Conversation");

        jBtnCreateProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnCreateProduct.setText("<< Back");
        jBtnCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreateProductActionPerformed(evt);
            }
        });

        jTextAreaCustomerServiceConvo.setColumns(20);
        jTextAreaCustomerServiceConvo.setRows(5);
        jTextAreaCustomerServiceConvo.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaCustomerServiceConvo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jBtnCreateProduct)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jBtnCreateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateProductActionPerformed
        //Populate previous screen table and navigate back.
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        
         //        Restore prev screen's state
        Component[] comps = userProcessContainer.getComponents();

          for (Component comp : comps){
            if (comp instanceof CustomerServiceRequestJPanel){
                CustomerServiceRequestJPanel customerServicePanel = (CustomerServiceRequestJPanel) comp;
                customerServicePanel.populateOrders();
            }
        }
          
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_jBtnCreateProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCreateProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaCustomerServiceConvo;
    // End of variables declaration//GEN-END:variables
}