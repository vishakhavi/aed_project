/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkOrder;
import Business.WorkQueue.OrderWorkRequest;

import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vishakha
 */
public class OrderStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderStatusJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount account;
    private Customer customer;
    public OrderStatusJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount account) {
        initComponents();
        //initListners();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.customer = (Customer) this.account;
        populateRequestTable();
        populateAuctionWorkOrders();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblCustomerOrderStatus.getModel();
        model.setRowCount(0);
        for (OrderWorkRequest request : this.ecosystem.getOrderWorkQueue().getWorkRequestList()) 
        {
                if (request.getCustomer().equals(this.customer)) {
                   Object[] row = new Object[tblCustomerOrderStatus.getColumnCount()];
                    row[0] = request;
                    row[1] = request.getOrderDate();
                    row[2] = request.getTotalPrice();
                    model.addRow(row); 
                }     
        }
    }
    
    public void populateAuctionWorkOrders() {
        DefaultTableModel model = (DefaultTableModel) tblCustomerOrderAuctionStatus.getModel();
        model.setRowCount(0);
        for (WorkRequest request : this.account.getWorkQueue().getWorkRequestList()) 
        {
            if (request instanceof CustomerWorkOrder) {
               CustomerWorkOrder cwo = (CustomerWorkOrder) request;
            
                Object[] row = new Object[tblCustomerOrderAuctionStatus.getColumnCount()];
                row[0] = cwo;
                row[1] = cwo.getRequestDate();
                row[2] = request.getStatus();
                row[3] = request.getShippingUnitOrganization();
                model.addRow(row); 
            }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerOrderAuctionStatus = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomerOrderStatus = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDER STATUS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 840, -1));

        tblCustomerOrderAuctionStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Requested Date", "Status", "Shipping Company"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomerOrderAuctionStatus.getTableHeader().setReorderingAllowed(false);
        tblCustomerOrderAuctionStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerOrderAuctionStatusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomerOrderAuctionStatus);
        if (tblCustomerOrderAuctionStatus.getColumnModel().getColumnCount() > 0) {
            tblCustomerOrderAuctionStatus.getColumnModel().getColumn(3).setHeaderValue("");
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 610, 190));

        jScrollPane2.setOpaque(false);

        tblCustomerOrderStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Order Date", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomerOrderStatus.getTableHeader().setReorderingAllowed(false);
        tblCustomerOrderStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerOrderStatusMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCustomerOrderStatus);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 610, 190));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Auction Orders");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 230, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Ecommerce Orders");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/orderStatusBg.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 390, 220));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/orderStatusIcon.jpeg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tblCustomerOrderAuctionStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerOrderAuctionStatusMouseClicked
        //Dont need this
    }//GEN-LAST:event_tblCustomerOrderAuctionStatusMouseClicked

    private void tblCustomerOrderStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerOrderStatusMouseClicked
        // TODO add your handling code here:
        if (tblCustomerOrderStatus.getSelectedRow() != -1)
        {
            OrderWorkRequest order = (OrderWorkRequest) tblCustomerOrderStatus.getValueAt(tblCustomerOrderStatus.getSelectedRow(), 0);
            CustomerReciept cr = new CustomerReciept(userProcessContainer, order);
            userProcessContainer.add("customerReciept", cr);
            CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_tblCustomerOrderStatusMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCustomerOrderAuctionStatus;
    private javax.swing.JTable tblCustomerOrderStatus;
    // End of variables declaration//GEN-END:variables
}
