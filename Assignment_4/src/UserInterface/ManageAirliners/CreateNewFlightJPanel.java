/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.Flight;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Arthishravan
 */
public class CreateNewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewFlightJPanel
     */
    private JPanel userProcessContainer;
    private Airliner airline;
    
    public CreateNewFlightJPanel(JPanel upc, Airliner airL) {
        initComponents();
        
        this.userProcessContainer = upc;
        this.airline = airL;
        
        jTxtAirlineName.setText(airL.getAirlinerName());
        jTxtTotalSeats.setText("150");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtAirlineName = new javax.swing.JTextField();
        jTxtPrice = new javax.swing.JTextField();
        jTxtFlightNumber = new javax.swing.JTextField();
        jTxtTotalSeats = new javax.swing.JTextField();
        jBtnCreateFlight = new javax.swing.JButton();
        jBtnBackNewFlight = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTxtAirlineName.setEditable(false);
        jTxtAirlineName.setEnabled(false);

        jTxtFlightNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFlightNumberActionPerformed(evt);
            }
        });

        jTxtTotalSeats.setEditable(false);
        jTxtTotalSeats.setEnabled(false);

        jBtnCreateFlight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBtnCreateFlight.setText("Add Flight");
        jBtnCreateFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreateFlightActionPerformed(evt);
            }
        });

        jBtnBackNewFlight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBtnBackNewFlight.setText("< BACK");
        jBtnBackNewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackNewFlightActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("New Flight Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Airline Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Flight Number:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Price:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Total Seats:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jBtnBackNewFlight)
                                .addGap(263, 263, 263))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(96, 96, 96)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtAirlineName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtTotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jBtnCreateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBackNewFlight)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtAirlineName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtTotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(79, 79, 79)
                .addComponent(jBtnCreateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFlightNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFlightNumberActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTxtFlightNumberActionPerformed

    private void jBtnCreateFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateFlightActionPerformed
        // TODO add your handling code here:
        
        //Validation code missing
        
        Flight f = new Flight();
        f.setAirline(jTxtAirlineName.getText().trim());
        f.setFlightNumber(jTxtFlightNumber.getText().trim());
        f.setPrice(Double.parseDouble(jTxtPrice.getText().trim()));
        f.setTotalSeats(Integer.parseInt(jTxtTotalSeats.getText().trim()));
        
        this.airline.getFlightCatalog().add(f);
        
        JOptionPane.showMessageDialog(null, "Created Flight successfully");
    }//GEN-LAST:event_jBtnCreateFlightActionPerformed

    private void jBtnBackNewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackNewFlightActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
      
        
        //        Restore prev screen's state
        Component[] comps = userProcessContainer.getComponents();

        for (Component comp : comps){
            if (comp instanceof  ManageAirlinersJPanel){
                ManageAirlinersJPanel manageP = (ManageAirlinersJPanel) comp;
                manageP.displayFlightsTable(airline);
            }
        }
        
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jBtnBackNewFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBackNewFlight;
    private javax.swing.JButton jBtnCreateFlight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTxtAirlineName;
    private javax.swing.JTextField jTxtFlightNumber;
    private javax.swing.JTextField jTxtPrice;
    private javax.swing.JTextField jTxtTotalSeats;
    // End of variables declaration//GEN-END:variables
}