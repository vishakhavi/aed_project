/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.wholeSaleSupplierRole;


import Business.EcoSystem;
import Business.Product.Product;

import Business.UserAccount.UserAccount;
import Business.WholeSaleSupplier.WholeSaleSupplier;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthi
 */
public class WholeSaleSupplierWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private UserAccount userAccount;
    EcoSystem ecosystem;
    WholeSaleSupplier supplier;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public WholeSaleSupplierWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, WholeSaleSupplier s) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
      
        this.userAccount = account;
        this.ecosystem = system;
        this.supplier = s;
        
        valueLabel.setText(this.supplier.getName());
        
        setListenerForTableSelection();
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel)productsJTable.getModel();
        model.setRowCount(0);
        //int count = 1;
        //Supplier supplier = (Supplier)suppComboBox1.getSelectedItem();
        ArrayList<WorkRequest> wrTable = new ArrayList<WorkRequest>();
        
        for (Product p : this.supplier.getProductDirectory().getProducts()) {
                Object row[] = new Object[4];
                row[0] = p.getId();
                row[1] = p;
                row[2] = p.getPrice();
                row[3] = p.getCategory();
                model.addRow(row); 
        }
    }
    
    private void setListenerForTableSelection() {
      productsJTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
          public void valueChanged(ListSelectionEvent event) {
              if (productsJTable.getSelectedRow() != -1) {
                  Product prod = (Product) productsJTable.getValueAt(productsJTable.getSelectedRow(), 1);
                  jLabelSupProdPicture.setIcon(finalImage(prod.getProductImagePath()));
              }
          }
      });
    }
    
     public ImageIcon finalImage(String imagePath) {
        ImageIcon image  = new ImageIcon(imagePath);
        Image img = image.getImage();
        Image modifiedImg = img.getScaledInstance(jLabelSupProdPicture.getWidth(), jLabelSupProdPicture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalImage = new ImageIcon(modifiedImg);
        return finalImage;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productsJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabelSupProdPicture = new javax.swing.JLabel();

        productsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Price", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productsJTable);

        requestTestJButton.setText("Add a new Product");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Supplier");

        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(refreshTestJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(requestTestJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSupProdPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshTestJButton))
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSupProdPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(requestTestJButton)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        jLabelSupProdPicture.setBounds(10, 10, 650, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        CreateSupProductsJPanel cspj = new CreateSupProductsJPanel(userProcessContainer, this.supplier);
        userProcessContainer.add("createSupProducts", cspj);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);   
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        jLabelSupProdPicture.setIcon(null);
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabelSupProdPicture;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productsJTable;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}