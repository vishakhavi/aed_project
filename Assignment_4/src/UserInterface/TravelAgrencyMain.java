/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.CustomerDirectory;
import Business.Flight;
import Business.MasterSchedule;
import UserInterface.ManageAirliners.BookFlightPanel;
import java.awt.CardLayout;

/**
 *
 * @author Vishakha
 */
public class TravelAgrencyMain extends javax.swing.JFrame {

    /**
     * Creates new form TravelAgrencyMain
     */
    private MasterSchedule flightSchList;
    private Flight flightDirectory;
    private AirlinerDirectory airlineDirectory;
    private CustomerDirectory custDirectory;
    private Airliner airline;
    
    public TravelAgrencyMain() {
        initComponents();
        flightSchList = new MasterSchedule();
        flightDirectory = new Flight();
        airlineDirectory =  new AirlinerDirectory();
        custDirectory =  new CustomerDirectory();
        airline = new Airliner();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        LeftPanel = new javax.swing.JPanel();
        AdminBtn = new javax.swing.JButton();
        UserBtn = new javax.swing.JButton();
        UserProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(135);

        AdminBtn.setText("Admin");
        AdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBtnActionPerformed(evt);
            }
        });

        UserBtn.setText("User");
        UserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(UserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(AdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(UserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(LeftPanel);

        UserProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(UserProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBtnActionPerformed
        LoginScreen ls = new LoginScreen("Admin",UserProcessContainer,airline,flightSchList,flightDirectory,airlineDirectory,custDirectory.getCustomerList());
        UserProcessContainer.add("LoginScreen", ls);
        CardLayout layout = (CardLayout)this.UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
    }//GEN-LAST:event_AdminBtnActionPerformed

    private void UserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserBtnActionPerformed
        LoginScreen ls = new LoginScreen("User",UserProcessContainer,airline,flightSchList,flightDirectory,airlineDirectory,custDirectory.getCustomerList());
        UserProcessContainer.add("LoginScreen", ls);
        CardLayout layout = (CardLayout)this.UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
    }//GEN-LAST:event_UserBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgrencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgrencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgrencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgrencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgrencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBtn;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton UserBtn;
    private javax.swing.JPanel UserProcessContainer;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}