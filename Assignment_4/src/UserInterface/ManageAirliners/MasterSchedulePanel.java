/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

/**
 *
 * @author Arthishravan
 */
public class MasterSchedulePanel extends javax.swing.JPanel {

    /**
     * Creates new form MasterSchedulePanel
     */
    public MasterSchedulePanel() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMasterSchedule = new javax.swing.JTable();
        btnScheduleFlight = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNotSchedule = new javax.swing.JTable();
        btnRemoveSchedule = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Flight Directory");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("<Back");

        tblMasterSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Source", "Destination", "Date of Flight", "Time of Flight", "Arrival Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMasterSchedule);
        if (tblMasterSchedule.getColumnModel().getColumnCount() > 0) {
            tblMasterSchedule.getColumnModel().getColumn(0).setResizable(false);
            tblMasterSchedule.getColumnModel().getColumn(1).setResizable(false);
            tblMasterSchedule.getColumnModel().getColumn(2).setResizable(false);
            tblMasterSchedule.getColumnModel().getColumn(3).setResizable(false);
            tblMasterSchedule.getColumnModel().getColumn(4).setResizable(false);
            tblMasterSchedule.getColumnModel().getColumn(5).setResizable(false);
        }

        btnScheduleFlight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnScheduleFlight.setText("Schedule Flight");
        btnScheduleFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleFlightActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Master Schedule");

        tblNotSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airline Name", "Flight Number", "Price", "Total Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblNotSchedule);
        if (tblNotSchedule.getColumnModel().getColumnCount() > 0) {
            tblNotSchedule.getColumnModel().getColumn(0).setResizable(false);
            tblNotSchedule.getColumnModel().getColumn(1).setResizable(false);
            tblNotSchedule.getColumnModel().getColumn(2).setResizable(false);
            tblNotSchedule.getColumnModel().getColumn(3).setResizable(false);
        }

        btnRemoveSchedule.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRemoveSchedule.setText("Remove from Schedule");
        btnRemoveSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveScheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnScheduleFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(btnRemoveSchedule)))
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(219, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(189, 189, 189)
                .addComponent(btnScheduleFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnRemoveSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(390, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnScheduleFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleFlightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnScheduleFlightActionPerformed

    private void btnRemoveScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveScheduleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemoveSchedule;
    private javax.swing.JButton btnScheduleFlight;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMasterSchedule;
    private javax.swing.JTable tblNotSchedule;
    // End of variables declaration//GEN-END:variables
}
