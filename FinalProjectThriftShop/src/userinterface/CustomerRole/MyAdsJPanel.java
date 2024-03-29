/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Ads;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BuyerBidPriceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vishakha
 */
public class MyAdsJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Customer customer;
    private Ads adsList;
    private DefaultTableModel viewTable;
    private EcoSystem ecosystem;
    private double price = 0;
    private String biderName;
    private BuyerBidPriceWorkRequest request;
    private List<WorkRequest> workRequestList;
    private static final Object[][] rowData = {};
    private static final Object[] columnNames = {"Product Name","User Name","Status","Proposed Price"};

    /**
     * Creates new form ViewAdsJPanel
     */
    public MyAdsJPanel(JPanel userProcessContainer,  UserAccount account,EcoSystem ecoSystem) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecoSystem;
        customer = (Customer) account;
        viewTable = (DefaultTableModel)jTableViewAds.getModel();
        populateTable();
        
       
    }
     private void initListners() {
        jTableViewAds.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = jTableViewAds.getSelectedRow();
                if (selectedRow >= 0) {
                    String status = jTableViewAds.getValueAt(selectedRow, 2).toString();
                    WorkRequest request = (WorkRequest) jTableViewAds.getValueAt(selectedRow, 0);
                    System.out.println("status"+status);
                        if (status != null && !(request.getSender().getUsername().equals(userAccount.getUsername()))) {
                            int response = JOptionPane.showConfirmDialog(null, "Accept or Reject Offer");
                            System.out.println("response==>"+response);
                        switch (response) {
                            case 0:
                                //orderWorkRequest.setStatus("Accepted");
                                jTableViewAds.setValueAt("Accepted", selectedRow, 2);
                                request.setStatus("Accepted");
                                //sendEmailMessage(customer.ge);
                                //sendTextMessage("v.vishakha22@gmail.com");
                                break;
                            case 1:
                                jTableViewAds.setValueAt("Rejected", selectedRow, 2);
                                request.setStatus("Rejected");
                                break;
                            default:
                                jTableViewAds.setValueAt("Waiting for Response", selectedRow, 2);
                                request.setStatus("Waiting for Response");
                                break;
                        }
                    }

                }
            }
        });
    }
    
    public void populateTable(){
        try{
        viewTable.setRowCount(0);
        //createAddToCartButton();
       /* for(Customer cust: ecosystem.getCustomerDirectory().getCustomerList()){
            if(cust.getUsername().equals(userAccount.getUsername())){
               adsList = cust.getAdsList();
            }
        }*/
        
        //List<Post> posts = adsList.getAdsList();
         System.out.println("workRequestList "+ecosystem.getWorkQueue().getWorkRequestList().size());
        workRequestList = ecosystem.getWorkQueue().getWorkRequestList();
            System.out.println("workRequestList size"+workRequestList.size());
        if(!workRequestList.isEmpty() ){
            
        for (WorkRequest request : workRequestList) {
            if((request instanceof BuyerBidPriceWorkRequest) && !request.getSender().getUsername().equals(userAccount.getUsername())){
            Object[] row = new Object[jTableViewAds.getColumnCount()];
            row[0] = request;
            row[1] = request.getSender().getUsername();
            String result = ((WorkRequest) request).getStatus();
            row[2] = result == null ? "Waiting for confirmation" : result;
            row[3] = request.getBidPrice();
            row[4] = request.getRequestDate();
           
            
            viewTable.addRow(row);
            }else if((request instanceof BuyerBidPriceWorkRequest) && request.getSender().getUsername().equals(userAccount.getUsername())){
            Object[] row = new Object[jTableViewAds.getColumnCount()];
            row[0] = request;
            row[1] = request.getSender().getUsername();
            String result = ((WorkRequest) request).getStatus();
            row[2] = result == null ? "Waiting for confirmation" : result;
            row[3] = request.getBidPrice();
            row[4] = request.getRequestDate();
           
            viewTable.addRow(row);
            }
        }
        }
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Error while retriving work request"+e.getMessage());
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableViewAds = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/my_ads_opaque.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 500, 520));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Ads ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 23, 111, -1));

        jTableViewAds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "User Name", "Status", "Price", "Proposed Date"
            }
        ));
        jScrollPane1.setViewportView(jTableViewAds);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 140, 487, 270));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/my_post.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 23, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableViewAds;
    // End of variables declaration//GEN-END:variables


}
