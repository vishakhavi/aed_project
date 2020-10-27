/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Customer;
import Business.Flight;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author srijonibiswas
 */
public class CustomerPagePanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPagePanel
     */
    private JPanel userProcessContainer;
    private Flight flight;
    private Customer customer;
    private Border ob1;
    private int[][] seat_assignment = new int[6][25];
    private int[][] seat_assignment1 = new int[6][25];
    private String[] seatsBoookedTemp = new String [150];
    private int num = 0;
    private int row;
    private int column;
    private int tktCount = 0;
    private String[][] seatNumber = {    {"1A", "2A", "3A", "4A", "5A", "6A", "7A", "8A", "9A", "10A", "11A", "12A", "13A", "14A", "15A", "16A", "17A", "18A", "19A", "20A", "21A", "22A", "23A", "24A", "25A"},
                                     {"1B", "2B", "3B", "4B", "5B", "6B", "7B", "8B", "9B", "10B", "11B", "12B", "13B", "14B", "15B", "16B", "17B", "18B", "19B", "20B", "21B", "22B", "23B", "24B", "25B"},
                                     {"1C", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "11C", "12C", "13C", "14C", "15C", "16C", "17C", "18C", "19C", "20C", "21C", "22C", "23C", "24C", "25C"},
                                     {"1D", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "11D", "12D", "13D", "14D", "15D", "16D", "17D", "18D", "19D", "20D", "21D", "22D", "23D", "24D", "25D"},
                                     {"1E", "2E", "3E", "4E", "5E", "6E", "7E", "8E", "9E", "10E", "11E", "12F", "13E", "14E", "15E", "16E", "17E", "18E", "19E", "20E", "21E", "22E", "23E", "24E", "25E"},
                                     {"1F", "2F", "3F", "4F", "5F", "6F", "7F", "8F", "9F", "10F", "11F", "12E", "13F", "14F", "15F", "16F", "17F", "18F", "19F", "20F", "21F", "22F", "23F", "24F", "25F"}
                                     };
    
    public CustomerPagePanel() {
        
    }

    CustomerPagePanel(JPanel userProcessContainer, Flight flight) {
        initComponents();
        this.flight = flight;
        this.userProcessContainer = userProcessContainer;
        this.ob1 = txtAirlineName.getBorder();
        populateFlightDetails();
    }
    
//    public class StatusColumnCellRenderer extends DefaultCellEditor {
//        StatusColumnCellRenderer()
//        {
//            super( new JTextField() );
//        }
//        public Component getTableCellEditorComponent(
//            JTable table, Object value, boolean isSelected, int row, int column)
//        {
//            Component c = super.getTableCellEditorComponent(
//                table, value, isSelected, row, column);
//            ((JComponent)c).setBorder(new LineBorder(Color.black));
//
//            return c;
//        }
//    }

    
    private void populateFlightDetails(){
        txtFlightNumber.setEnabled(false);
        txtAirlineName.setEnabled(false);
        txtFrom.setEnabled(false);
        txtTo.setEnabled(false);
        txtDOF.setEnabled(false);
        txtTotalPrice.setEnabled(false);
        
        
    //Assigning values to populate
        txtFlightNumber.setText(String.valueOf(flight.getFlightNumber()));
        txtAirlineName.setText(String.valueOf(flight.getAirline()));
        txtFrom.setText(String.valueOf(flight.getFromLocation()));
        txtTo.setText(String.valueOf(flight.getToLocation()));
        txtDOF.setText(String.valueOf(flight.getDateOfFlight()));
        
        settablecolor();
                  
    }

    private void settablecolor(){
               
        seat_assignment1 = flight.getSeat_assignment();
        for (int i = 0; i <6; i++){
            for(int j = 0; j<25; j++){
            if (seat_assignment1 [i][j] == 1){
                tblSeats.setValueAt("Booked", i, j);
               
            } 
            }
        }
        System.out.println("Selected row is" + tblSeats.getSelectedRow());
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        txtAirlineName = new javax.swing.JTextField();
        txtFrom = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        txtDOF = new javax.swing.JTextField();
        confirmBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtEmailCust = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNameCust = new javax.swing.JTextField();
        txtPhoneCust = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        BackBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSeats = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FLIGHT DETAILS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Flight Number:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Airline:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("From");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("To");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Date of Flight:");

        confirmBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Email ID:");

        txtEmailCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCustActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Name :");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("DOB::");

        txtNameCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameCustActionPerformed(evt);
            }
        });

        txtPhoneCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneCustActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Phone No:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Price Total:");

        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });

        BackBtn1.setText("< BACK");
        BackBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtn1ActionPerformed(evt);
            }
        });

        tblSeats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblSeats.setForeground(new java.awt.Color(0, 0, 255));
        tblSeats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10", "R12", "R13", "R14", "R15", "R16", "R17", "R18", "R19", "R20", "R21", "R22", "R23", "R24", "R25"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSeats.setCellSelectionEnabled(true);
        tblSeats.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblSeats);
        if (tblSeats.getColumnModel().getColumnCount() > 0) {
            tblSeats.getColumnModel().getColumn(0).setResizable(false);
            tblSeats.getColumnModel().getColumn(1).setResizable(false);
            tblSeats.getColumnModel().getColumn(2).setResizable(false);
            tblSeats.getColumnModel().getColumn(3).setResizable(false);
            tblSeats.getColumnModel().getColumn(4).setResizable(false);
            tblSeats.getColumnModel().getColumn(5).setResizable(false);
            tblSeats.getColumnModel().getColumn(6).setResizable(false);
            tblSeats.getColumnModel().getColumn(7).setResizable(false);
            tblSeats.getColumnModel().getColumn(8).setResizable(false);
            tblSeats.getColumnModel().getColumn(9).setResizable(false);
            tblSeats.getColumnModel().getColumn(10).setResizable(false);
            tblSeats.getColumnModel().getColumn(11).setResizable(false);
            tblSeats.getColumnModel().getColumn(12).setResizable(false);
            tblSeats.getColumnModel().getColumn(13).setResizable(false);
            tblSeats.getColumnModel().getColumn(14).setResizable(false);
            tblSeats.getColumnModel().getColumn(15).setResizable(false);
            tblSeats.getColumnModel().getColumn(16).setResizable(false);
            tblSeats.getColumnModel().getColumn(17).setResizable(false);
            tblSeats.getColumnModel().getColumn(18).setResizable(false);
            tblSeats.getColumnModel().getColumn(19).setResizable(false);
            tblSeats.getColumnModel().getColumn(20).setResizable(false);
            tblSeats.getColumnModel().getColumn(21).setResizable(false);
            tblSeats.getColumnModel().getColumn(22).setResizable(false);
            tblSeats.getColumnModel().getColumn(23).setResizable(false);
        }

        btnViewDetails.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnViewDetails.setText("View Booked Flight");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTo))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFrom))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAirlineName))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(147, 147, 147)
                                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNameCust))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailCust)
                                    .addComponent(txtPhoneCust)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtTotalPrice)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDOF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackBtn1)
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(933, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAirlineName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNameCust, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailCust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneCust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(520, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtn1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        Component[] comps = userProcessContainer.getComponents();
        for (Component comp : comps){
            if (comp instanceof BookFlightPanel){
            System.out.println(comp);
            BookFlightPanel manageP = (BookFlightPanel) comp;
            manageP.populateTable();
            
            }
        }
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtn1ActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void txtPhoneCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneCustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneCustActionPerformed

    private void txtNameCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameCustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameCustActionPerformed

    private void txtEmailCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCustActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        
        String name = txtNameCust.getText();
        if (name.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the Name");
            throw new RuntimeException("Please enter the Name");
        }

        String email = txtEmailCust.getText();
        if(email==null||email.equals("")){
            txtEmailCust.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtEmailCust.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Email id cannot be empty!");
            return;
        }
        else if(!usernamePatternCorrect()){
            JOptionPane.showMessageDialog(null, "Email should be in the form of xxx_xxx@xxx.xxx");
            txtEmailCust.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtEmailCust.setForeground(Color.RED);
            return;
        }
        else
        {
            txtEmailCust.setBorder(ob1);
            txtEmailCust.setForeground(Color.BLACK);
        }

        String phoneNumber = txtPhoneCust.getText();
        if (phoneNumber.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the Phone number");
            throw new RuntimeException("Please enter the Phone number");
        }

        String date = jDateChooser1.getDate().toString();
        if (date.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the Date");
            throw new RuntimeException("Please enter the Date");
        }
        this.customer = new Customer();
        customer.setUsername(txtNameCust.getText());
        customer.setDob(jDateChooser1.getDate());
        customer.setEmail_id(txtEmailCust.getText());
        customer.setPnumber(Integer.parseInt(txtPhoneCust.getText()));
        customer.setAirlineName(String.valueOf(flight.getAirline()));
        customer.setFlightNumber(String.valueOf(flight.getFlightNumber()));
        customer.setFromLocation(String.valueOf(flight.getFromLocation()));
        customer.setToLocation(String.valueOf(flight.getToLocation()));
        customer.setDateOfFlight(flight.getDateOfFlight());
        
        seatAssignment();
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        customer.setSeatsBoooked(seatsBoookedTemp);
        BoardingPass amPanel = new BoardingPass(userProcessContainer,customer);
        userProcessContainer.add("BoardingPass", amPanel);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    
    private void seatAssignment(){

                this.row = tblSeats.getSelectedRow();
                this.column = tblSeats.getSelectedColumn();
                if(tblSeats.getModel().getValueAt(row, column)== null ){
                      
                    tblSeats.setValueAt("Booked", row, column);
                    seat_assignment[row][column] = 1;
                    int seats = flight.getAvailSeats();
                    seats =  seats - 1;
                    System.out.println(seats);
                    flight.setAvailSeats(seats);
                    flight.setSeat_assignment(row,column);
                    String seat = seatNumber[row][column];
                    seatsBoookedTemp[num] = seat;
                    num++;
                            
                    JOptionPane.showMessageDialog(null,"Flight ticket booked!", "Information", JOptionPane.INFORMATION_MESSAGE);
                    tktCount++;
                    int price = (int)((flight.getPrice())* tktCount);
                    txtTotalPrice.setText(String.valueOf(price));
                    
                    customer.setAmount(price);

                }
                else{
                    
                    JOptionPane.showMessageDialog(null,"Sorry this seat is booked!", "Information", JOptionPane.WARNING_MESSAGE);
                }
    }
    
    
    private boolean usernamePatternCorrect() {
            Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
            Matcher m = p.matcher(txtEmailCust.getText());
            boolean b = m.matches();
            return b;
        } 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn1;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JButton confirmBtn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSeats;
    private javax.swing.JTextField txtAirlineName;
    private javax.swing.JTextField txtDOF;
    private javax.swing.JTextField txtEmailCust;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtNameCust;
    private javax.swing.JTextField txtPhoneCust;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
