/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Ads;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Customer.Post;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vishakha
 */
public class PostAdJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private CustomerDirectory customerDirectory;
    private Ads adsList;
   
    
    private EcoSystem ecosystem;

    /**
     * Creates new form PostAdJPanel
     */
    public PostAdJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        adsList = ecosystem.getAdsList();
       
        customerDirectory = ecosystem.getCustomerDirectory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        requestTestJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProductCategory = new javax.swing.JTextField();
        jTextFieldProductPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaProductDescription = new javax.swing.JTextArea();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Post");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Post Ad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 740, -1));

        jLabel2.setText("Product :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 74, 60, 20));
        jPanel1.add(jTextFieldProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 130, -1));

        jLabel1.setText("Product Category:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 120, 100, -1));

        jLabel3.setText("Price:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 160, 40, 20));

        jLabel4.setText("Description:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 204, 70, 20));
        jPanel1.add(jTextFieldProductCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 130, -1));
        jPanel1.add(jTextFieldProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 130, -1));

        jTextAreaProductDescription.setColumns(20);
        jTextAreaProductDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaProductDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
         if (jTextFieldProductName.getText().isEmpty() || jTextFieldProductPrice.getText().isEmpty()
                 || jTextFieldProductCategory.getText().isEmpty() || jTextAreaProductDescription.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        /*if(customer.getAdsList() != null){
        for (Post post : customer.getAdsList().getAdsList()) {
            if (jTextFieldProductName.getText().equals(post.getName())) {
                JOptionPane.showMessageDialog(null, " Duplicate Items not allowed");
                return;
            }
        }
        }*/
        double price = 0.0;
        try {
            price = Double.valueOf(jTextFieldProductPrice.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Please enter a decimal number for Item Price!!");
            return;
        }

        Post post = new Post(jTextFieldProductName.getText(), Double.valueOf(jTextFieldProductPrice.getText()),
        jTextFieldProductCategory.getText(),jTextAreaProductDescription.getText());

        // ecosystem.getItemList().addItem(item);
        if(adsList!= null){
            adsList.addItem(post);
            ecosystem.setAdsList(adsList);
        
        /*populateTable();
        itemName.setText("");
        itemPrice.setText("");*/
        } else{
             Ads adsList = new Ads();
             adsList.addItem(post);
             ecosystem.setAdsList(adsList);
             
            
        }
        
        JOptionPane.showMessageDialog(null, "Ad posted Successfully!!");
        ViewAdsJPanel viewAdsJPanel = new ViewAdsJPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("ViewAdsJPanel", viewAdsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        /*if (createOrder()) {
            JOptionPane.showMessageDialog(null, "Ordered Placed Successfully");
            OrderStatusJPanel orderStatusJPanel = new OrderStatusJPanel(userProcessContainer, ecosystem, customer);
            userProcessContainer.add("OrderStatusJPanel", orderStatusJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }*/

    }//GEN-LAST:event_requestTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaProductDescription;
    private javax.swing.JTextField jTextFieldProductCategory;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldProductPrice;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
