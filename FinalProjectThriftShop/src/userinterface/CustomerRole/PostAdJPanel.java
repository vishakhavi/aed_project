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
import Business.Location.LocationPoint;
import Business.UserAccount.UserAccount;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.engine.RenderingMode;
import com.teamdev.jxbrowser.view.swing.BrowserView;

import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vishakha
 */
public class PostAdJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    
    private Ads adsList;
    private String filepathValue;
    private Customer customer;
    LocationPoint locationPoint;
    Browser browser;
    private ArrayList<Customer> customerDirectory;
    private ArrayList<UserAccount> userDirectory;
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
        userDirectory = ecosystem.getUserAccountDirectory().getUserAccountList();
     //   this.customer = (Customer)account;
       
        locationPoint = new LocationPoint();
        
      /*  EngineOptions options =
                EngineOptions.newBuilder(RenderingMode.OFF_SCREEN).licenseKey("6P83ACG409I01JKYU6UO3NWI53G7VD8PTT8UBCKWRB0F3Z7FDMS0HSOKNDD95S0LOO1I").build();
        
        Engine engine = Engine.newInstance(options);
        System.setProperty("teamdev.license.info", "6P83ACG409I01JKYU6UO3NWI53G7VD8PTT8UBCKWRB0F3Z7FDMS0HSOKNDD95S0LOO1I");
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
        browser.navigation().loadUrl("https://www.google.com/maps");
        
        mapCanvas.add(view);*/
        
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
        jLabel6 = new javax.swing.JLabel();
        adImage = new javax.swing.JLabel();
        jButtonUpload = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldItemLocation = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Post");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, -1, -1));

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

        jLabel6.setText("Pictures:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));
        jPanel1.add(adImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 170, 110));

        jButtonUpload.setText("Upload");
        jButtonUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        jLabel7.setText("Location:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 50, -1));

        jButton1.setText("Set Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));
        jPanel1.add(jTextFieldItemLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 140, -1));

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
        jTextFieldProductCategory.getText(),jTextAreaProductDescription.getText(),
        filepathValue);

        // ecosystem.getItemList().addItem(item);
       /* for(UserAccount ua: userDirectory){
            if(cust.getUsername().equals(userAccount.getUsername())){
               customer = cust;
            }
            }*/
        if(ecosystem.getAdsList() != null){
            adsList.addPost(post);
            
            ecosystem.setAdsList(adsList);
            customer.setAdsList(adsList);
            //customerDirectory.getCustomerList().add(customer);
            //ecosystem.setCustomerDirectory(customerDirectory);
        /*populateTable();
        itemName.setText("");
        itemPrice.setText("");*/
        } else{
             adsList = new Ads();
             adsList.addPost(post);
             ecosystem.setAdsList(adsList);
             customer = new Customer();
             customer.setAdsList(adsList);
             //customerDirectory = new CustomerDirectory();
             //customerDirectory.addCustomer(customer);
             //ecosystem.setCustomerDirectory(customerDirectory);
             
             
            
        }
        
        JOptionPane.showMessageDialog(null, "Ad posted Successfully!!");
        ViewAdsJPanel viewAdsJPanel = new ViewAdsJPanel(userProcessContainer, userAccount,ecosystem);
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

    private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadActionPerformed
        // TODO add your handling code here:
        try{
        JFileChooser selectFile = new JFileChooser();
        int approveValue = selectFile.showOpenDialog(this);
        if(approveValue == JFileChooser.APPROVE_OPTION){
            File filePath = selectFile.getSelectedFile();
            filepathValue = filePath.getPath();
            Image profilePic = ImageIO.read(new File(filepathValue));
            Image newImg = profilePic.getScaledInstance(138, 190, Image.SCALE_AREA_AVERAGING);
            adImage.setIcon(new ImageIcon(newImg));
            JOptionPane.showMessageDialog(null, "Image uploaded successfully");
        }
        }catch(Exception e){
            System.err.println("Exception while uploading or reading the image"+e);
    }//GEN-LAST:event_jButtonUploadActionPerformed
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (browser.url()!= null) {

                System.out.println(browser.url());
                String[] a = browser.url().split("!3d", 0);
                String[] b = a[1].split("!4d");
                System.out.println("Lat" + b[0] + "  " + "Lon" + b[1]);
                double lat = Double.parseDouble(b[0]);
                double lon = Double.parseDouble(b[1]);
                locationPoint.setLatitude(lat);
                locationPoint.setLongitude(lon);
            }
            System.out.println("Lat" + locationPoint.getLatitude() + locationPoint.getLongitude());
    }//GEN-LAST:event_jButton1ActionPerformed
    public void populateLongituteLatitude(LocationPoint locationPoint) {
        this.locationPoint = locationPoint;
        jTextFieldItemLocation.setText(locationPoint.getLatitude() + ", " + locationPoint.getLongitude());
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adImage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaProductDescription;
    private javax.swing.JTextField jTextFieldItemLocation;
    private javax.swing.JTextField jTextFieldProductCategory;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldProductPrice;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
