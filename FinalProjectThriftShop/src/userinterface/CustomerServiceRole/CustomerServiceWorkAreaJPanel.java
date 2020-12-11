/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerServiceRole;

import userinterface.CustomerRole.*;
import Business.Customer.Ads;
import Business.Customer.Customer;
import Business.Customer.Post;
import Business.EcoSystem;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.MaintenanceOrganization;
import Business.Organization.Organization;
import Business.Organization.ShippingUnitOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkOrder;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.List;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import userinterface.wholeSaleSupplierRole.CreateSupProductsJPanel;

/**
 *
 * @author Arthi
 */
public class CustomerServiceWorkAreaJPanel extends javax.swing.JPanel implements TableModelListener {
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount userAccount;

    /**
     * Creates new form ViewAdsJPanel
     */
    public CustomerServiceWorkAreaJPanel(JPanel userProcessContainer, UserAccount ua,  EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = ua;
       
        jTextAreaCustServiceComments.setLineWrap(true);
        jTextAreaCustServiceComments.setWrapStyleWord(true);
        
        populateOrders();
        populateShippingCompanies();
        populateMaintenanceOperators();
        
        tblCustomerServiceOrders.getModel().addTableModelListener(this);
    }
    
        public void tableChanged(TableModelEvent e) {
            int row = e.getFirstRow();
            int column = e.getColumn();
            TableModel model = (TableModel)e.getSource();
            String columnName = model.getColumnName(column);
            
            if  (columnName.equals("Status")) {
                JOptionPane.showMessageDialog(null,"This will not update the record yet, please click \"Submit Response\" if you intend to save the information", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        
        }

   
    public void populateOrders() {
        DefaultTableModel model = (DefaultTableModel)tblCustomerServiceOrders.getModel();
        model.setRowCount(0);
        
        for (WorkRequest wr :  this.ecosystem.getCustomerServiceOrg().getWorkQueue().getWorkRequestList()) {
            Object row[] = new Object[tblCustomerServiceOrders.getColumnCount()];
            CustomerWorkOrder cwo = (CustomerWorkOrder) wr;
            row[0] = cwo;
            row[1] = cwo.getRequestDate();
            row[2] = cwo.getStatus();
            row[3] = cwo.getLatestCustomerComment();
            row[4] = (cwo.getShippingAssigned() != null) ? cwo.getShippingAssigned() : "Not Assigned";
            row[5] = (cwo.getMaintenanceOpAssigned() != null) ? cwo.getMaintenanceOpAssigned() : "Not Assigned";
            row[6] = cwo.getResolveDate();
            model.addRow(row); 
        }
    }
    
    public void populateShippingCompanies() {
        DefaultTableModel model = (DefaultTableModel)tblShippingCompanies.getModel();
        model.setRowCount(0);

        for (Organization org :  this.ecosystem.getShippingCompanies().getOrganizationList()) {
            Object row[] = new Object[tblCustomerServiceOrders.getColumnCount()];
            ShippingUnitOrganization shippingCompany = (ShippingUnitOrganization) org;
            row[0] = shippingCompany;
            model.addRow(row); 
        }
    }
    
    public void populateMaintenanceOperators() {
        DefaultTableModel model = (DefaultTableModel)tblMaintenanceOperators.getModel();
        model.setRowCount(0);

        for (Organization org :  this.ecosystem.getMaintenanceOperators().getOrganizationList()) {
            Object row[] = new Object[tblCustomerServiceOrders.getColumnCount()];
            MaintenanceOrganization maintenanceOp = (MaintenanceOrganization) org;
            row[0] = maintenanceOp;
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

        jLabel1 = new javax.swing.JLabel();
        jBtnSubmitCustServiceRequest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerServiceOrders = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCustServiceComments = new javax.swing.JTextArea();
        viewFullOrder = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblShippingCompanies = new javax.swing.JTable();
        jBtnAssignShipping = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBtnAssignMaintenance = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMaintenanceOperators = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Welcome  - Customer Service");
        add(jLabel1);
        jLabel1.setBounds(390, 90, 214, 17);

        jBtnSubmitCustServiceRequest.setText("Submit Response");
        jBtnSubmitCustServiceRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubmitCustServiceRequestActionPerformed(evt);
            }
        });
        add(jBtnSubmitCustServiceRequest);
        jBtnSubmitCustServiceRequest.setBounds(1100, 240, 134, 23);

        tblCustomerServiceOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ecommerce/Auction Product", "Request Date", "Status", "Customer comment", "Shipping Company", "Maintenance Op", "Resolved Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomerServiceOrders);

        add(jScrollPane1);
        jScrollPane1.setBounds(200, 140, 790, 180);

        jLabel4.setText("respond back to Customer with comments");
        add(jLabel4);
        jLabel4.setBounds(1050, 90, 210, 23);

        jTextAreaCustServiceComments.setColumns(20);
        jTextAreaCustServiceComments.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCustServiceComments);

        add(jScrollPane2);
        jScrollPane2.setBounds(1050, 140, 216, 78);

        viewFullOrder.setText("View History");
        viewFullOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFullOrderActionPerformed(evt);
            }
        });
        add(viewFullOrder);
        viewFullOrder.setBounds(730, 90, 262, 23);

        tblShippingCompanies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shipping Company"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblShippingCompanies);

        add(jScrollPane3);
        jScrollPane3.setBounds(280, 440, 242, 94);

        jBtnAssignShipping.setText("Assign Shipping");
        jBtnAssignShipping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAssignShippingActionPerformed(evt);
            }
        });
        add(jBtnAssignShipping);
        jBtnAssignShipping.setBounds(280, 570, 246, 23);

        jLabel2.setText("Choose a Shipping company to assign to an order");
        add(jLabel2);
        jLabel2.setBounds(280, 400, 237, 19);

        jBtnAssignMaintenance.setText("Assign Maintenance");
        jBtnAssignMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAssignMaintenanceActionPerformed(evt);
            }
        });
        add(jBtnAssignMaintenance);
        jBtnAssignMaintenance.setBounds(660, 570, 246, 23);

        tblMaintenanceOperators.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Maintenance Operator"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblMaintenanceOperators);

        add(jScrollPane4);
        jScrollPane4.setBounds(660, 440, 242, 94);

        jLabel3.setText("Choose a Maintenance to assign to an order");
        add(jLabel3);
        jLabel3.setBounds(660, 400, 230, 19);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Optimized-how-can-we-help-you customer service (1).jpg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(10, 10, 120, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Optimized-CustomerService Request.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5);
        jLabel5.setBounds(340, 280, 750, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSubmitCustServiceRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubmitCustServiceRequestActionPerformed
       int selectedOrder = tblCustomerServiceOrders.getSelectedRow();
       String customerServiceComments = jTextAreaCustServiceComments.getText().trim();
       
       if (selectedOrder >= 0 && !customerServiceComments.isEmpty()){
         
           
            CustomerWorkOrder selectedWorkOrder = (CustomerWorkOrder) tblCustomerServiceOrders.getValueAt(selectedOrder, 0);
            
            if (selectedWorkOrder.getCustomerServiceHistoryComments() == null || selectedWorkOrder.getCustomerServiceHistoryComments().isEmpty()) {
                selectedWorkOrder.setCustomerServiceHistoryComments(this.ecosystem.getCustomerServiceOrg().getName() + "-" + new Date() + ": " + customerServiceComments);
            } else {
                selectedWorkOrder.setCustomerServiceHistoryComments(selectedWorkOrder.getCustomerServiceHistoryComments() + "\n\n" + this.ecosystem.getCustomerServiceOrg().getName() + "-" + new Date() + ": " + customerServiceComments);
            }  
            selectedWorkOrder.setLatestCustomerComment("CustRep: " + customerServiceComments);
            
            if (!selectedWorkOrder.getStatus().equals((String) tblCustomerServiceOrders.getValueAt(selectedOrder, 2))) {
                String status = (String) tblCustomerServiceOrders.getValueAt(selectedOrder, 2);
                selectedWorkOrder.setStatus(status);
                
                if (status.equals("Complete")) {
                    selectedWorkOrder.setResolveDate(new Date());
                }
            }
                
                
                
            selectedWorkOrder.setRequireCustomerService(false); //Disable when answered
            
            JOptionPane.showMessageDialog(null, "Responded to the customer Request succesfully !!!");
            populateOrders();
       } else {
            JOptionPane.showMessageDialog(null,"Please select an Order, choose Request customer service flag, and enter yoour comments", "Warning", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_jBtnSubmitCustServiceRequestActionPerformed

    private void viewFullOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFullOrderActionPerformed
        int selectedOrder = tblCustomerServiceOrders.getSelectedRow();
        
         if (selectedOrder >= 0 ){
             CustomerWorkOrder selectedWorkOrder = (CustomerWorkOrder) tblCustomerServiceOrders.getValueAt(selectedOrder, 0);
             
            ViewCustomerServiceConvoJPanel vcscj = new ViewCustomerServiceConvoJPanel(userProcessContainer, selectedWorkOrder, this);
            userProcessContainer.add("ViewCustomerRepConvo", vcscj);
            CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
            layout.next(userProcessContainer);  
         }else {
            JOptionPane.showMessageDialog(null,"Please select an Order to view Customer Service conversation", "Warning", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_viewFullOrderActionPerformed

    private void jBtnAssignShippingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAssignShippingActionPerformed
        int selectedOrderRow = tblCustomerServiceOrders.getSelectedRow();
        int selectedShipperRow = tblShippingCompanies.getSelectedRow(); 
        
        if (selectedOrderRow >= 0 && selectedShipperRow >=0 ) {
            CustomerWorkOrder selectedOrder = (CustomerWorkOrder) tblCustomerServiceOrders.getValueAt(selectedOrderRow, 0);
            ShippingUnitOrganization selectedShipping = (ShippingUnitOrganization) tblShippingCompanies.getValueAt(selectedShipperRow, 0);
            
            //Delete the existing shipping company's order first
            if (selectedOrder.getShippingAssigned() != null)
                selectedOrder.getShippingAssigned().getWorkQueue().getWorkRequestList().remove(selectedOrder);
            
            //Assign Shipping to Order, Add order under Shipping, Update Work Order status - "To Be Shipped"
            selectedOrder.setShippingAssigned(selectedShipping);
            selectedShipping.getWorkQueue().addWorkRequest(selectedOrder);
            selectedOrder.setStatus("To Be Shipped");
            
            
            JOptionPane.showMessageDialog(null, "Added Shipping Company for the chosen order!!!");
            
            populateOrders();
        } else {
            JOptionPane.showMessageDialog(null,"Please select an Order and a Shipping company", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnAssignShippingActionPerformed

    private void jBtnAssignMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAssignMaintenanceActionPerformed
        int selectedOrderRow = tblCustomerServiceOrders.getSelectedRow();
        int selectedMaintenanceOpRow = tblMaintenanceOperators.getSelectedRow(); 
        
        if (selectedOrderRow >= 0 && selectedMaintenanceOpRow >=0 ) {
            CustomerWorkOrder selectedOrder = (CustomerWorkOrder) tblCustomerServiceOrders.getValueAt(selectedOrderRow, 0);
            MaintenanceOrganization selectedMaintenanceOp = (MaintenanceOrganization) tblMaintenanceOperators.getValueAt(selectedMaintenanceOpRow, 0);
            
             //Delete the existing Maintenance Op's order first
            if (selectedOrder.getMaintenanceOpAssigned() != null)
                selectedOrder.getMaintenanceOpAssigned().getWorkQueue().getWorkRequestList().remove(selectedOrder);
            
            //Assign Maintenance Op to Order, Add order under Maintenance Op, Update Work Order status - "Assigned Maintenance"
            selectedOrder.setMaintenanceOpAssigned(selectedMaintenanceOp);
            selectedMaintenanceOp.getWorkQueue().addWorkRequest(selectedOrder);
            selectedOrder.setStatus("Assigned Maintenance");
            
            JOptionPane.showMessageDialog(null, "Added Maintenance Operator for the chosen order!!!");
            
            populateOrders();
        } else {
            JOptionPane.showMessageDialog(null,"Please select an Order and a Maintenance Operator", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnAssignMaintenanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAssignMaintenance;
    private javax.swing.JButton jBtnAssignShipping;
    private javax.swing.JButton jBtnSubmitCustServiceRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaCustServiceComments;
    private javax.swing.JTable tblCustomerServiceOrders;
    private javax.swing.JTable tblMaintenanceOperators;
    private javax.swing.JTable tblShippingCompanies;
    private javax.swing.JButton viewFullOrder;
    // End of variables declaration//GEN-END:variables
}
