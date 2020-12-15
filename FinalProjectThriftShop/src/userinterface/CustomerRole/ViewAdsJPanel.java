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
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BuyerBidPriceWorkRequest;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.List;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vishakha
 */
public class ViewAdsJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Customer customer;
    private CustomerDirectory customerDirectory;
    private Ads adsList;
    private DefaultTableModel viewTable;
    private EcoSystem ecosystem;
    private Organization organization;
    private double price = 0;
    private static final Object[][] rowData = {};
    private static DecimalFormat df = new DecimalFormat("0.00");
    private String location;

    private static final Object[] columnNames = {"Product Name","Price","Category","Description","Image","Distance"};

    /**
     * Creates new form ViewAdsJPanel
     */
    public ViewAdsJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem) {
        initComponents();
        initListerners();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecoSystem;
        adsList = ecosystem.getAdsList();
        customer = (Customer) account;
        
       
       // viewTable = new DefaultTableModel(rowData, columnNames);
        viewTable =  new DefaultTableModel(null,columnNames){
            @Override
            public Class<?> getColumnClass(int column) {
                if (column==4) return Icon.class;
                return Object.class;
            }
        };
       // viewTable.addRow(rowData);
        //viewTable.addColumn(columnNames);
        
        populateTable();
        
       
    }
    public void populateTable(){
        List<Post> posts;
        try{
        viewTable.setRowCount(0);
        if(ecosystem.getAdsList() != null){
            List<Post> totalPosts = ecosystem.getAdsList().getAdsList();
            System.out.println("total ads-->"+totalPosts.size());
            List<Post> viewAds = new ArrayList<>(totalPosts);
        if(customer.getAdsList() != null){
        posts = customer.getAdsList().getAdsList();
        System.out.println("customer ads-->"+customer.getName()+posts.size());
         viewAds.removeAll(posts);
        }
        
        
        
      
       
        if(!viewAds.isEmpty() ){
                
        for (Post post : viewAds) {
            Object[] row = new Object[viewTable.getColumnCount()];
            
            row[0] = post;
            row[1] = post.getPrice();
            row[2] = post.getCategory(); 
            row[3] = post.getDescription();
            Image product = ImageIO.read(new File(post.getPicture()));
            Image newImg = product.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newImg);
            row[4] = icon;
            if(post.getLocation() != null && customer.getAddress() != null){
            row[5] = df.format(getDistanceForPickUp(post,customer))+" km";
            
            }
            viewTable.addRow(row);   
            System.out.println("post id"+post.getId());
            
        }
        jTableViewAds.setRowHeight(150);
        jTableViewAds.setModel(viewTable);
        
        
        }else{
            JOptionPane.showMessageDialog(null, "No Posts available");
        }
        }else{
            JOptionPane.showMessageDialog(null, "No ads for view");
        }
}
        catch(Exception e){
            
            System.err.println("Error while setting the image"+e.getMessage());
        }
        
    }
    public double getDistanceForPickUp(Post postLocation, Customer customerLocation) {
        double postLatitude = postLocation.getLatitude();
        double postLongitude = postLocation.getLongitude();
        double customerLatitude = customerLocation.getLatitude();
        double customerLongitude = customerLocation.getLongitude();
        
        double theta = postLongitude - customerLongitude;
			double dist = Math.sin(Math.toRadians(postLatitude)) * Math.sin(Math.toRadians(customerLatitude)) + Math.cos(Math.toRadians(postLatitude)) * Math.cos(Math.toRadians(customerLatitude)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
        
        
        return dist;
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
        jTableViewAds = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBidAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("View Ads ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 26, 111, -1));

        jTableViewAds.setAutoCreateRowSorter(true);
        jTableViewAds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Price", "Category", "Description", "Image", "Distance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableViewAds);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 130, 487, 270));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Proposed price :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 431, -1, -1));
        add(jTextFieldBidAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 432, 137, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Product Name: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 116, -1));

        jTextFieldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductNameActionPerformed(evt);
            }
        });
        add(jTextFieldProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 482, 137, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Submit Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view_ad_icon.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 26, 119, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ads_backgrd_op.jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 600, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTableViewAds.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        BuyerBidPriceWorkRequest request = new BuyerBidPriceWorkRequest() ;
        WorkQueue workQueue = new WorkQueue();
        request.setProductName(jTableViewAds.getValueAt(selectedRow, 0).toString());
        request.setStatus("Proposed");
        request.setMessage("Amount Proposed");
        request.setBidPrice(Double.parseDouble(jTextFieldBidAmount.getText()));
        request.setSender(userAccount);
      
        
        
        request.setRequestDate(new Date());
        workQueue.addWorkRequest(request);
        ecosystem.getWorkQueue().addWorkRequest(request);
        ecosystem.getUserAccountDirectory().getUserAccountList().add(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
       // System.out.println("work queue"+ecosystem.getWorkQueue().getWorkRequestList().size());
        MyAdsJPanel myAdsJPanel = new MyAdsJPanel(userProcessContainer,userAccount,ecosystem);
        userProcessContainer.add("MyAdsJPanel", myAdsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableViewAds;
    private javax.swing.JTextField jTextFieldBidAmount;
    private javax.swing.JTextField jTextFieldProductName;
    // End of variables declaration//GEN-END:variables

    private void initListerners() {
        jTableViewAds.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = jTableViewAds.getSelectedRow();
                if (selectedRow >= 0) {
                    double post = (Double)jTableViewAds.getValueAt(selectedRow, 1);
                    if (post != 0) {
                        String response = JOptionPane.showInputDialog("Please propose a price");
                        try {
                            price = Integer.parseInt(response);
                        } catch (NumberFormatException e) {

                        }
                        if (price != 0) {
                            jTextFieldBidAmount.setText(response);
                            jTextFieldProductName.setText(jTableViewAds.getValueAt(selectedRow, 0).toString());
                        }

                    }
                }
            }
        });
    }
}
