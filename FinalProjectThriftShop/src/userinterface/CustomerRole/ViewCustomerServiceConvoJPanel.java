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
import Business.Organization.WholeSaleSupplierOrganization;
import Business.WorkQueue.CustomerWorkOrder;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import userinterface.CustomerServiceRole.CustomerServiceWorkAreaJPanel;

/**
 *
 * @author Arthishravan
 */
public class ViewCustomerServiceConvoJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    JPanel callingJPanel;
    CustomerWorkOrder customerWorkOrder;
    /**
     * Creates new form CreateResaurantJPanel
     */
    public ViewCustomerServiceConvoJPanel(JPanel upc, CustomerWorkOrder cwo, JPanel sourceCall) {
        this.userProcessContainer = upc;
        this.customerWorkOrder = cwo;
        this.callingJPanel = sourceCall;
        initComponents();
        
        jTextAreaCustomerServiceConvo.setLineWrap(true);
        jTextAreaCustomerServiceConvo.setWrapStyleWord(true);
        
        //Set the value of the convo
        jTextAreaCustomerServiceConvo.setText(cwo.getCustomerServiceHistoryComments());
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
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Customer Service Conversation");
        add(jLabel1);
        jLabel1.setBounds(260, 85, 388, 22);

        jBtnCreateProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnCreateProduct.setText("<< Back");
        jBtnCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreateProductActionPerformed(evt);
            }
        });
        add(jBtnCreateProduct);
        jBtnCreateProduct.setBounds(20, 30, 91, 34);

        jTextAreaCustomerServiceConvo.setEditable(false);
        jTextAreaCustomerServiceConvo.setColumns(20);
        jTextAreaCustomerServiceConvo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCustomerServiceConvo);

        add(jScrollPane1);
        jScrollPane1.setBounds(251, 145, 410, 309);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Capture2.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(50, 180, 1780, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateProductActionPerformed
        //Populate previous screen table and navigate back.
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        
         //        Restore prev screen's state
        Component[] comps = userProcessContainer.getComponents();
        String sourceCallJpanelName = this.callingJPanel.getClass().getName();
        
          for (Component comp : comps){
            if (sourceCallJpanelName.equals("CustomerServiceWorkAreaJPanel") && (comp instanceof CustomerServiceWorkAreaJPanel) ){
                CustomerServiceWorkAreaJPanel customerServicePanel = (CustomerServiceWorkAreaJPanel) comp;
                customerServicePanel.populateOrders();
            } else if (sourceCallJpanelName.equals("CustomerServiceRequestJPanel") && (comp instanceof CustomerServiceRequestJPanel) ) { //Source has to be CustomerServiceRequestJPanel
                CustomerServiceRequestJPanel customerServicePanel = (CustomerServiceRequestJPanel) comp;
                customerServicePanel.populateOrders();
            }
        }
          
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_jBtnCreateProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCreateProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaCustomerServiceConvo;
    // End of variables declaration//GEN-END:variables
}
