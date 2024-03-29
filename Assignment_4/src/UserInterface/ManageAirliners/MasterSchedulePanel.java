/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Flight;
import Business.MasterSchedule;
import java.awt.CardLayout;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthishravan
 */
public class MasterSchedulePanel extends javax.swing.JPanel {

    /**
     * Creates new form MasterSchedulePanel
     */
    private JPanel userProcessContainer;
    private MasterSchedule masterScheduleList;
    
    //private ArrayList<Flight> tempFlightDirectory;
    //private Flight flightDirectory;
    private AirlinerDirectory airlineDirectory;
   
    public MasterSchedulePanel(JPanel UserProcessContainer, MasterSchedule flightSchList, AirlinerDirectory airlineDirectory) {
        initComponents();
        this.userProcessContainer = UserProcessContainer;
        this.masterScheduleList = flightSchList;
        //this.flightDirectory = flightDirectory;
        this.airlineDirectory = airlineDirectory;
         
        populateTableFlightDir();
        populateTableMasterSchedule();
    }

    public void populateTableFlightDir(){
        DefaultTableModel dtm = (DefaultTableModel)tblNotSchedule.getModel();
        dtm.setRowCount(0);
        for(Flight flight: airlineDirectory.getFlightDirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= flight;
            row[1]= flight.getAirline();
            row[2]= flight.getPrice();
            row[3]= flight.getTotalSeats();
            dtm.addRow(row);
        }
    }
    
    public void populateTableMasterSchedule()
    {
        DefaultTableModel dtm = (DefaultTableModel)tblMasterSchedule.getModel();
        dtm.setRowCount(0);
        for(Flight flight: masterScheduleList.getFlightDirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            //row[0]= flight;
            row[0]= flight;
            row[1]= flight.getAirline();
            row[2]= flight.getFromLocation();
            row[3]= flight.getToLocation();
            row[4]= flight.getDateOfFlight();
            row[5]= flight.getTimeOfFlight();
            row[6]= flight.getArrivalTime();
            dtm.addRow(row);
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
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMasterSchedule = new javax.swing.JTable();
        btnScheduleFlight = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNotSchedule = new javax.swing.JTable();
        btnRemoveSchedule = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Flight Directory");

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblMasterSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Airline", "Source", "Destination", "Date of Flight", "Time of Flight", "Arrival Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            tblMasterSchedule.getColumnModel().getColumn(6).setResizable(false);
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
                "Flight Number", "Airline Name", "Price", "Total Seats"
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
                        .addComponent(btnBack)
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnScheduleFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(btnRemoveSchedule))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
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
                    .addComponent(btnBack))
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
        int selectedRow = tblNotSchedule.getSelectedRow();
        //int selectedRow1 = tblAirliners.getSelectedRow();

        if (selectedRow >= 0){
            Flight flight = (Flight) tblNotSchedule.getValueAt(selectedRow, 0);
            //irliner airline = (Airliner) tblAirliners.getValueAt(selectedRow1, 0);
            
            FlightScheduleJPanel fs = new FlightScheduleJPanel(userProcessContainer,flight,masterScheduleList,airlineDirectory);
            userProcessContainer.add("FlightSchedulePanel", fs);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please selecte a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnScheduleFlightActionPerformed

    private void btnRemoveScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveScheduleActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMasterSchedule.getSelectedRow();
        //int selectedRow1 = tblAirliners.getSelectedRow();

        if (selectedRow >= 0){
            Flight flight = (Flight) tblMasterSchedule.getValueAt(selectedRow, 0);
            masterScheduleList.deleteFlight(flight);
            JOptionPane.showMessageDialog(null, "Flight removed from Master Schedule successfully");
            populateTableMasterSchedule();
        }
        else{
            JOptionPane.showMessageDialog(null,"Please selecte a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveScheduleActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveSchedule;
    private javax.swing.JButton btnScheduleFlight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMasterSchedule;
    private javax.swing.JTable tblNotSchedule;
    // End of variables declaration//GEN-END:variables
}
