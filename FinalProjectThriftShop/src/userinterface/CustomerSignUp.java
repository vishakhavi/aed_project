/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.WorkQueue.CustomerAccountActivationRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vishakha
 */
public class CustomerSignUp extends javax.swing.JPanel {
    
 
    JPanel container;
    EcoSystem system;
    String location;
    double longitude;
    double latitude;
    
    /**
     * Creates new form CustomerSignUp
     */
    public CustomerSignUp(JPanel container, EcoSystem ecoSystem ) {
        initComponents();
        this.container = container;
        this.system = ecoSystem;
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldLocation = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameErrorLabel = new javax.swing.JLabel();
        userNameErrorLabel = new javax.swing.JLabel();
        passwordErrorLabel = new javax.swing.JLabel();
        emailErrorLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Sign Up Form");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 335, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));
        add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 171, 25));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("User name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));
        add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 171, 25));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 79, 30));
        add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 171, 25));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Email:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 79, 20));
        add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 171, 25));

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Location:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 66, -1));

        jTextFieldLocation.setEditable(false);
        jTextFieldLocation.setColumns(40);
        add(jTextFieldLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 171, 25));

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setText("Set Location");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/signup_opaque.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 620, 770));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/signup_icon.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 120));

        nameErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(nameErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 144, 140, 20));

        userNameErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(userNameErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 150, 20));

        passwordErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(passwordErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 224, 140, 20));

        emailErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(emailErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 140, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       // open_map();
       
        LoadMaps loadMaps = new LoadMaps(container,system);
        container.add("LoadMaps", loadMaps);
        CardLayout layout = (CardLayout)this.container.getLayout();
        layout.next(container);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        location = jTextFieldLocation.getText();
        String name = jTextFieldName.getText();
        String userName = jTextFieldUserName.getText();
        String password = jTextFieldPassword.getText();
        String email = jTextFieldEmail.getText();
        if(!"".equals(name) && !"".equals(userName) && !"".equals(password) &&
                !"".equals(email) && !location.equals("")){
            boolean check = validateEmail(email) && system.checkIfUserIsUnique(userName);
            if( check){
            CustomerAccountActivationRequest activationRequest = new CustomerAccountActivationRequest();
            activationRequest.setName(name);
            activationRequest.setUserName(userName);
            activationRequest.setUserPassword(password);
            activationRequest.setUserEmailId(email);
            activationRequest.setLatitude(latitude);
            activationRequest.setLongitude(longitude);
            activationRequest.setArea(location);
            system.getWorkQueue().getWorkRequestList().add(activationRequest);
            JOptionPane.showMessageDialog(null, "You have succesfully signed up. Wait for some time for account activation!");
            }else if ( !validateEmail(email)){
                  JOptionPane.showMessageDialog(null, "Please check email format");
            }else if(!system.checkIfUserIsUnique(userName)){
                  JOptionPane.showMessageDialog(null, "User already exists!!");
            }
        }else{
            
            nameErrorLabel.setText("");
            userNameErrorLabel.setText("");
            passwordErrorLabel.setText("");
            emailErrorLabel.setText("");

            boolean error = false;

            if (name.trim().isEmpty()) {
                nameErrorLabel.setText("Please enter your name");
                error = true;
            }
            if (userName.trim().isEmpty()) {
                userNameErrorLabel.setText("Please enter username");
                error = true;
            }if (password.trim().isEmpty()) {
                passwordErrorLabel.setText("Please enter password");
                error = true;
            }if (email.trim().isEmpty()) {
                emailErrorLabel.setText("Please enter emailId");
                error = true;
            }

           

            if (error) {
                return;
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    public void populateLocation(String location,double longitude, double latitude) {
        jTextFieldLocation.setForeground(Color.BLACK);
        this.location = location;
        this.longitude = longitude;
        this.latitude = latitude;
        jTextFieldLocation.setText("");
        jTextFieldLocation.setText(location);
        System.out.println("location in customer sign up"+location);
    }
    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailErrorLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLocation;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JLabel nameErrorLabel;
    private javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JLabel userNameErrorLabel;
    // End of variables declaration//GEN-END:variables
}
