package userinterface.CustomerRole;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Business.Customer.Customer;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author MyPC1
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    Customer customer;
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        //this.set

        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
       // placeOrder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        postAdButtonPanel = new javax.swing.JPanel();
        postAdLabel = new javax.swing.JLabel();
        viewAdButtonPanel = new javax.swing.JPanel();
        viewAdLabel = new javax.swing.JLabel();
        serviceRequestStatusButtonPanel = new javax.swing.JPanel();
        serviceRequestLabel = new javax.swing.JLabel();
        orderStatusButtonPanel = new javax.swing.JPanel();
        orderStatusLabel = new javax.swing.JLabel();
        eCommerceButtonPanel = new javax.swing.JPanel();
        eCommerceLabel = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(31, 50, 97));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        postAdButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                postAdButtonPanelMousePressed(evt);
            }
        });

        postAdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postAdLabel.setText("Post Ad");
        postAdLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                postAdLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout postAdButtonPanelLayout = new javax.swing.GroupLayout(postAdButtonPanel);
        postAdButtonPanel.setLayout(postAdButtonPanelLayout);
        postAdButtonPanelLayout.setHorizontalGroup(
            postAdButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, postAdButtonPanelLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(postAdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        postAdButtonPanelLayout.setVerticalGroup(
            postAdButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(postAdButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(postAdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(postAdButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        viewAdButtonPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        viewAdButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewAdButtonPanelMousePressed(evt);
            }
        });

        viewAdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewAdLabel.setText("View Ad");
        viewAdLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewAdLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout viewAdButtonPanelLayout = new javax.swing.GroupLayout(viewAdButtonPanel);
        viewAdButtonPanel.setLayout(viewAdButtonPanelLayout);
        viewAdButtonPanelLayout.setHorizontalGroup(
            viewAdButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewAdButtonPanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(viewAdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        viewAdButtonPanelLayout.setVerticalGroup(
            viewAdButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAdButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewAdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(viewAdButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 50));

        serviceRequestStatusButtonPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        serviceRequestStatusButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                serviceRequestStatusButtonPanelMousePressed(evt);
            }
        });

        serviceRequestLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serviceRequestLabel.setText("Customer Request");
        serviceRequestLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                serviceRequestLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout serviceRequestStatusButtonPanelLayout = new javax.swing.GroupLayout(serviceRequestStatusButtonPanel);
        serviceRequestStatusButtonPanel.setLayout(serviceRequestStatusButtonPanelLayout);
        serviceRequestStatusButtonPanelLayout.setHorizontalGroup(
            serviceRequestStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
            .addGroup(serviceRequestStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, serviceRequestStatusButtonPanelLayout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(serviceRequestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        serviceRequestStatusButtonPanelLayout.setVerticalGroup(
            serviceRequestStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(serviceRequestStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(serviceRequestStatusButtonPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(serviceRequestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(serviceRequestStatusButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 40));

        orderStatusButtonPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        orderStatusButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderStatusButtonPanelMousePressed(evt);
            }
        });

        orderStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderStatusLabel.setText("Order Status");
        orderStatusLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderStatusLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout orderStatusButtonPanelLayout = new javax.swing.GroupLayout(orderStatusButtonPanel);
        orderStatusButtonPanel.setLayout(orderStatusButtonPanelLayout);
        orderStatusButtonPanelLayout.setHorizontalGroup(
            orderStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(orderStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderStatusButtonPanelLayout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addComponent(orderStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
        );
        orderStatusButtonPanelLayout.setVerticalGroup(
            orderStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(orderStatusButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderStatusButtonPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(orderStatusButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, 50));

        eCommerceButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eCommerceButtonPanelMousePressed(evt);
            }
        });

        eCommerceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eCommerceLabel.setText("eCommerce Site");
        eCommerceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eCommerceLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout eCommerceButtonPanelLayout = new javax.swing.GroupLayout(eCommerceButtonPanel);
        eCommerceButtonPanel.setLayout(eCommerceButtonPanelLayout);
        eCommerceButtonPanelLayout.setHorizontalGroup(
            eCommerceButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eCommerceButtonPanelLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(eCommerceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        eCommerceButtonPanelLayout.setVerticalGroup(
            eCommerceButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eCommerceButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eCommerceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(eCommerceButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, 50));

        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(940, 808));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void postAdLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postAdLabelMousePressed
        placeOrder();
    }//GEN-LAST:event_postAdLabelMousePressed

    private void placeOrder() {
        // TODO add your handling code here:
        

        PostAdJPanel postAdJPanel = new PostAdJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("PostAdJPanel", postAdJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);

    }

    private void postAdButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postAdButtonPanelMousePressed
        placeOrder();
    }//GEN-LAST:event_postAdButtonPanelMousePressed

    private void serviceRequestLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceRequestLabelMousePressed
        CustomerServiceRequestJPanel customerServiceRequestJPanel = new CustomerServiceRequestJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("CustomerServiceRequestJPanel", customerServiceRequestJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_serviceRequestLabelMousePressed

    private void viewAdButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAdButtonPanelMousePressed
        // TODO add your handling code here:
        ViewAdsJPanel viewAdsJPanel = new ViewAdsJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("ViewAdsJPanel", viewAdsJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_viewAdButtonPanelMousePressed

    private void viewAdLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAdLabelMousePressed
        // TODO add your handling code here:
        ViewAdsJPanel viewAdsJPanel = new ViewAdsJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("ViewAdsJPanel", viewAdsJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_viewAdLabelMousePressed

    private void orderStatusLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderStatusLabelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderStatusLabelMousePressed

    private void serviceRequestStatusButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceRequestStatusButtonPanelMousePressed
        // TODO add your handling code here:
        CustomerServiceRequestJPanel customerServiceRequestJPanel = new CustomerServiceRequestJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("CustomerServiceRequestJPanel", customerServiceRequestJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_serviceRequestStatusButtonPanelMousePressed

    private void orderStatusButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderStatusButtonPanelMousePressed
        // TODO add your handling code here:
        orderStatus();
    }//GEN-LAST:event_orderStatusButtonPanelMousePressed

    private void eCommerceLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCommerceLabelMousePressed
        // TODO add your handling code here:
        ECommerceMainJPanel eCommerceMain = new ECommerceMainJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("eCM", eCommerceMain);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_eCommerceLabelMousePressed

    private void eCommerceButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCommerceButtonPanelMousePressed
        // TODO add your handling code here:
        ECommerceMainJPanel eCommerceMain = new ECommerceMainJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("eCM", eCommerceMain);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_eCommerceButtonPanelMousePressed

    private void orderStatus() {
        // TODO add your handling code here:
      
        OrderStatusJPanel orderStatusJPanel = new OrderStatusJPanel(rightSystemAdminPanel, ecosystem, userAccount);
        rightSystemAdminPanel.add("OrderStatusJPanel", orderStatusJPanel);
        CardLayout layout = (CardLayout)rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel eCommerceButtonPanel;
    private javax.swing.JLabel eCommerceLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel orderStatusButtonPanel;
    private javax.swing.JLabel orderStatusLabel;
    private javax.swing.JPanel postAdButtonPanel;
    private javax.swing.JLabel postAdLabel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JLabel serviceRequestLabel;
    private javax.swing.JPanel serviceRequestStatusButtonPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JPanel viewAdButtonPanel;
    private javax.swing.JLabel viewAdLabel;
    // End of variables declaration//GEN-END:variables
}
