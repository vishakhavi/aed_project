/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OrderManagement;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderWorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author madhurimachatterjee
 */
public class OrderManagementWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderManagementWorkAreaJPanel
     */
    EcoSystem system;
    JPanel userProcessContainer;
    UserAccount account;
    public OrderManagementWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.system = system;
        //System.out.println("System" + this.system);
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        //System.out.println("account" + this.account);
        tblOrders.setAutoCreateRowSorter(true);
        populateTable();
    }

    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
        for (OrderWorkRequest owr : system.getOrderWorkQueue().getWorkRequestList()) {
            //System.out.println("Owr" + owr);
            Object[] row = new Object[tblOrders.getColumnCount()];
            row[0] = owr.getOrderDate();
            row[1] = owr;
            row[2] = owr.getCustomer();
            row[3] = owr.getTotalPrice();
            if(owr.getDeliveryDate() == null)
            {
                row[4] = "In Process";
                row[5] = "";
            }
            else
            {
                row[4] = "Delivered";
                row[5] = owr.getDeliveryDate();
            }
            model.addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 724, 52));

        tblOrders.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Date", "Order ID", "Customer Name", "Total Price", "Status", "Order Delivery Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrders.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tblOrders.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblOrders.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblOrders);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 70, 550, 218));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/orderManagementBg.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
