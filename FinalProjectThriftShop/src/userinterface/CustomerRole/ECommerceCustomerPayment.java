/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Product.Product;
import Business.WorkQueue.OrderWorkRequest;
import java.awt.CardLayout;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author madhurimachatterjee
 */
public class ECommerceCustomerPayment extends javax.swing.JPanel {

    /**
     * Creates new form ECommerceCustomerPayment
     */
    JPanel rightSystemAdminPanel;
    Customer customer;
    EcoSystem ecosystem;
    public ECommerceCustomerPayment(JPanel rightSystemAdminPanel, Customer customer, EcoSystem ecosystem) {
        initComponents();
        this.rightSystemAdminPanel = rightSystemAdminPanel;
        this.customer = customer;
        this.ecosystem = ecosystem;
        txtName.setText(this.customer.getName());
        txtAddress.setText(this.customer.getAddress());
        //txtPhone.setText(this.customer.getPhone());
        txtEmail.setText(this.customer.getEmailAddress());
        txtTotalPrice.setText(Double.toString(this.customer.getCart().getTotalPrice()));
        jComboPaymentType.addItem("");
        jComboPaymentType.addItem("Cash on Delivery");
        jComboPaymentType.addItem("Credit Card");
        jComboPaymentType.addItem("Debit Card");
        PanelCard.setVisible(false);
    }

    
    public boolean validation()
    {
        String selected = jComboPaymentType.getSelectedItem().toString();
        if(selected.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please select payment option");
                return false;
        }
        else if(selected.equals("Cash on Delivery"))
        {
            return true;
        }
        else
        {
            String regex = "\\d{16}";
            if(txtCardNumber.getText().matches(regex))
            {
                String regex1 = "\\d{2}";
                if(txtExpMonth.getText().matches(regex1) && txtExpYear.getText().matches(regex1))
                {
                    if(Integer.parseInt(txtExpYear.getText()) > 20)
                    {
                        String regex2 = "\\d{3}";
                        if(txtCvv.getText().matches(regex2))
                        {
                            return true;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Invalid CVV!");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Expiry date before 2020 not acceptable");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Expiry date invalid");
                }
            }
            JOptionPane.showMessageDialog(null, "Invalid card number");
            return false;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboPaymentType = new javax.swing.JComboBox<>();
        btnPayment = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        PanelCard = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtCardNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtExpYear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtExpMonth = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCvv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 17)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment");

        jLabel2.setText("Name:");

        txtName.setEditable(false);

        jLabel3.setText("Address:");

        txtAddress.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Total Price:");

        txtTotalPrice.setEditable(false);
        txtTotalPrice.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        jLabel6.setText("Payment Method:");

        jComboPaymentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPaymentTypeActionPerformed(evt);
            }
        });

        btnPayment.setBackground(new java.awt.Color(153, 204, 255));
        btnPayment.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        btnPayment.setText("Make Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Email:");

        txtEmail.setEditable(false);

        PanelCard.setBackground(new java.awt.Color(255, 255, 255));
        PanelCard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel8.setText("Expiry Date:");

        jLabel7.setText("Card Number:");

        jLabel9.setText("/");

        jLabel11.setText("CVV:");

        javax.swing.GroupLayout PanelCardLayout = new javax.swing.GroupLayout(PanelCard);
        PanelCard.setLayout(PanelCardLayout);
        PanelCardLayout.setHorizontalGroup(
            PanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCardLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(PanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(PanelCardLayout.createSequentialGroup()
                        .addGroup(PanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(11, 11, 11)
                        .addGroup(PanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCardLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(PanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelCardLayout.createSequentialGroup()
                                        .addComponent(txtExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtExpYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        PanelCardLayout.setVerticalGroup(
            PanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(PanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtExpYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cash.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jComboPaymentType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtTotalPrice)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addComponent(jComboPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton2)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // TODO add your handling code here:
        //System.out.println(ecosystem.getOrderWorkQueue().getWorkRequestList().size());
        if(validation())
        {
            OrderWorkRequest orderWorkRequest = new OrderWorkRequest();
            orderWorkRequest.setCustomer(customer);
            orderWorkRequest.setPaymentType(jComboPaymentType.getSelectedItem().toString());
            for(Product p : customer.getCart().getProdDir().getProducts())
            {
                orderWorkRequest.getProdDir().getProducts().add(p);
            }
            //orderWorkRequest.setProdDir(customer.getCart().getProdDir());
            //System.out.println(customer.getCart().getProdDir().getProducts().size());
            //Collections.copy(orderWorkRequest.getProdDir().getProducts(), customer.getCart().getProdDir().getProducts());
            orderWorkRequest.setTotalPrice(customer.getCart().getTotalPrice());
            orderWorkRequest.setPaymentType(jComboPaymentType.getSelectedItem().toString());
            ecosystem.getOrderWorkQueue().addOrderWorkRequest(orderWorkRequest);
            for(Product prodInCart : customer.getCart().getProdDir().getProducts())
            {
                Product prodInShop = ecosystem.getProductDirectory().findProduct(prodInCart.getName());
                if(prodInShop.getQty() - prodInCart.getQty() < 0)
                {
                    JOptionPane.showMessageDialog(null, "Oops, quantity for " + prodInShop.getName() + " not available, max limit " 
                            + prodInShop.getQty() + ". Please go back to cart and reduce quantity");
                    return;
                }
                else
                {
                    prodInShop.setQty(prodInShop.getQty() - prodInCart.getQty());
                }
            }
            customer.getCart().emptyCart();
            JOptionPane.showMessageDialog(null, "Payment Successful for Order ID: " + orderWorkRequest.getOrderId());
            //for(Product prod : ecosystem.getProductDirectory().findProduct(TOOL_TIP_TEXT_KEY))
        }
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        rightSystemAdminPanel.remove(this);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.previous(rightSystemAdminPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboPaymentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPaymentTypeActionPerformed
        // TODO add your handling code here:
        String selected = jComboPaymentType.getSelectedItem().toString();
        if(selected.equals("") || selected.equals("Cash on Delivery"))
        {
            PanelCard.setVisible(false);
        }
        else
        {
            PanelCard.setVisible(true);
        }
    }//GEN-LAST:event_jComboPaymentTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCard;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboPaymentType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtExpMonth;
    private javax.swing.JTextField txtExpYear;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
