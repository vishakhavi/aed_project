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
    JPanel currentVisitedPanel;

    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        //this.set

        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.currentVisitedPanel = null; //update this value everytime when we visit a right panel.
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
        eAuctionButtonPanel = new javax.swing.JPanel();
        eAuctionLabel = new javax.swing.JLabel();
        ecommerceButtonPanel = new javax.swing.JPanel();
        ecommerceLabel = new javax.swing.JLabel();
        myAdsButtonPanel = new javax.swing.JPanel();
        myAdsLabel = new javax.swing.JLabel();
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
                .addComponent(viewAdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
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

        eAuctionButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eAuctionButtonPanelMousePressed(evt);
            }
        });

        eAuctionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eAuctionLabel.setText("View e-Auction");
        eAuctionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eAuctionLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout eAuctionButtonPanelLayout = new javax.swing.GroupLayout(eAuctionButtonPanel);
        eAuctionButtonPanel.setLayout(eAuctionButtonPanelLayout);
        eAuctionButtonPanelLayout.setHorizontalGroup(
            eAuctionButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eAuctionButtonPanelLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(eAuctionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        eAuctionButtonPanelLayout.setVerticalGroup(
            eAuctionButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eAuctionButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eAuctionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(eAuctionButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 280, 50));

        ecommerceButtonPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        ecommerceButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ecommerceButtonPanelMousePressed(evt);
            }
        });

        ecommerceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ecommerceLabel.setText("Ecommerce Main");
        ecommerceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ecommerceLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ecommerceButtonPanelLayout = new javax.swing.GroupLayout(ecommerceButtonPanel);
        ecommerceButtonPanel.setLayout(ecommerceButtonPanelLayout);
        ecommerceButtonPanelLayout.setHorizontalGroup(
            ecommerceButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
            .addGroup(ecommerceButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ecommerceButtonPanelLayout.createSequentialGroup()
                    .addContainerGap(85, Short.MAX_VALUE)
                    .addComponent(ecommerceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );
        ecommerceButtonPanelLayout.setVerticalGroup(
            ecommerceButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(ecommerceButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ecommerceButtonPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ecommerceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(ecommerceButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, 40));

        myAdsButtonPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        myAdsButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                myAdsButtonPanelMousePressed(evt);
            }
        });

        myAdsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myAdsLabel.setText("My Ads");
        myAdsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                myAdsLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout myAdsButtonPanelLayout = new javax.swing.GroupLayout(myAdsButtonPanel);
        myAdsButtonPanel.setLayout(myAdsButtonPanelLayout);
        myAdsButtonPanelLayout.setHorizontalGroup(
            myAdsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
            .addGroup(myAdsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myAdsButtonPanelLayout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(myAdsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );
        myAdsButtonPanelLayout.setVerticalGroup(
            myAdsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(myAdsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myAdsButtonPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(myAdsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(myAdsButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 270, 40));

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
        
        if(this.currentVisitedPanel != null)
            this.rightSystemAdminPanel.remove(this.currentVisitedPanel); //Remove previous visited JPanel
        
        PostAdJPanel postAdJPanel = new PostAdJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        this.currentVisitedPanel = postAdJPanel; //Store the current visited information
        rightSystemAdminPanel.add("PostAdJPanel", postAdJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);

    }

    private void postAdButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postAdButtonPanelMousePressed
        placeOrder();
    }//GEN-LAST:event_postAdButtonPanelMousePressed

    private void serviceRequestLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceRequestLabelMousePressed
        navigateToCustomerServiceRequest();
    }//GEN-LAST:event_serviceRequestLabelMousePressed

    private void viewAdButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAdButtonPanelMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_viewAdButtonPanelMousePressed

    private void viewAdLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAdLabelMousePressed
        navigateToViewAd();
    }//GEN-LAST:event_viewAdLabelMousePressed

    private void navigateToViewAd() {
        // TODO add your handling code here:
        ViewAdsJPanel viewAdsJPanel = new ViewAdsJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("ViewAdsJPanel", viewAdsJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    
    private void orderStatusLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderStatusLabelMousePressed
        orderStatus();
    }//GEN-LAST:event_orderStatusLabelMousePressed

    private void serviceRequestStatusButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceRequestStatusButtonPanelMousePressed
       navigateToCustomerServiceRequest();
    }//GEN-LAST:event_serviceRequestStatusButtonPanelMousePressed

    private void navigateToCustomerServiceRequest() {
         // TODO add your handling code here:
        if(this.currentVisitedPanel != null)
            this.rightSystemAdminPanel.remove(this.currentVisitedPanel); //Remove previous visited JPanel
        
        CustomerServiceRequestJPanel customerServiceRequestJPanel = new CustomerServiceRequestJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        this.currentVisitedPanel = customerServiceRequestJPanel; //Store the current visited information
        rightSystemAdminPanel.add("CustomerServiceRequestJPanel", customerServiceRequestJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    
    private void orderStatusButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderStatusButtonPanelMousePressed
        // TODO add your handling code here:
        orderStatus();
    }//GEN-LAST:event_orderStatusButtonPanelMousePressed

private void eCommerceLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCommerceLabelMousePressed
        // TODO add your handling code here:
        navigateToECommerce();
    }//GEN-LAST:event_eCommerceLabelMousePressed

private void eCommerceButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCommerceButtonPanelMousePressed
        // TODO add your handling code here:
        ECommerceMainJPanel eCommerceMain = new ECommerceMainJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        rightSystemAdminPanel.add("eCM", eCommerceMain);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
 }//GEN-LAST:event_eCommerceButtonPanelMousePressed
                                             

    private void navigateToECommerce() {
         // TODO add your handling code here:
        if(this.currentVisitedPanel != null)
            this.rightSystemAdminPanel.remove(this.currentVisitedPanel); //Remove previous visited JPanel
        
        ECommerceMainJPanel eCommerceMain = new ECommerceMainJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        this.currentVisitedPanel = eCommerceMain; //Store the current visited information
        rightSystemAdminPanel.add("eCM", eCommerceMain);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    
    private void eAuctionLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eAuctionLabelMousePressed
        navigateToAuction();
    }//GEN-LAST:event_eAuctionLabelMousePressed

    private void eAuctionButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eAuctionButtonPanelMousePressed
        navigateToAuction();
    }//GEN-LAST:event_eAuctionButtonPanelMousePressed

    private void ecommerceLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ecommerceLabelMousePressed
        // TODO add your handling code here:
               navigateToECommerce();

    }//GEN-LAST:event_ecommerceLabelMousePressed

    private void ecommerceButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ecommerceButtonPanelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_ecommerceButtonPanelMousePressed

    private void myAdsLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAdsLabelMousePressed
        // TODO add your handling code here:
        
        MyAdsJPanel myAdsJPanel = new MyAdsJPanel(rightSystemAdminPanel, userAccount, ecosystem);
       
        rightSystemAdminPanel.add("MyAdsJPanel", myAdsJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel); 
    }//GEN-LAST:event_myAdsLabelMousePressed

    private void myAdsButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAdsButtonPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_myAdsButtonPanelMousePressed

    private void navigateToAuction() {
        if(this.currentVisitedPanel != null)
           this.rightSystemAdminPanel.remove(this.currentVisitedPanel); //Remove previous visited JPanel
        
        
        EAuctionJPanel eAuction = new EAuctionJPanel(rightSystemAdminPanel, userAccount, ecosystem);
        this.currentVisitedPanel = eAuction; //Store the current visited information
        rightSystemAdminPanel.add("eAuctionPanel", eAuction);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel); 
    }
    
    private void orderStatus() {
        // TODO add your handling code here:
        if(this.currentVisitedPanel != null)
            this.rightSystemAdminPanel.remove(this.currentVisitedPanel); //Remove previous visited JPanel
        
        OrderStatusJPanel orderStatusJPanel = new OrderStatusJPanel(rightSystemAdminPanel, ecosystem, userAccount);
        this.currentVisitedPanel = orderStatusJPanel; //Store the current visited information
        rightSystemAdminPanel.add("OrderStatusJPanel", orderStatusJPanel);
        CardLayout layout = (CardLayout)rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel eAuctionButtonPanel;
    private javax.swing.JLabel eAuctionLabel;
    private javax.swing.JPanel ecommerceButtonPanel;
    private javax.swing.JLabel ecommerceLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel myAdsButtonPanel;
    private javax.swing.JLabel myAdsLabel;
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
