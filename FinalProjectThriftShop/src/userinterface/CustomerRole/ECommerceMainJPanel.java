/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author madhurimachatterjee
 */
public class ECommerceMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ECommerceMainJPanel
     */
    JPanel rightSystemAdminPanel;
    UserAccount userAccount;
    EcoSystem ecosystem;
    Customer customer;
    Organization organization;
    private DefaultTableModel viewTable;
    private static final Object[] columnNames = {"Product Name","Category", "Price","Photo"};
    public ECommerceMainJPanel(JPanel rightSystemAdminPanel, UserAccount userAccount, EcoSystem ecosystem, Organization organization){
        initComponents();
        this.rightSystemAdminPanel = rightSystemAdminPanel;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        this.organization = organization;
        this.customer = (Customer) this.userAccount;       
        //checkoutCart(); //navigate to cart if items present
//        jComboCategory.addItem("All");
//        jComboCategory.addItem("Mobiles");
//        jComboCategory.addItem("Furniture");
        tblProducts.setAutoCreateRowSorter(true);
        viewTable =  new DefaultTableModel(null,columnNames){
            @Override
            public Class<?> getColumnClass(int column) {
                if (column==3) return Icon.class;
                return Object.class;
            }
        };
        populateProductCategories();
        populateTable();
    }
    
    public void populateTable()
    {
        viewTable.setRowCount(0);
        if(ecosystem.getProductDirectory().getProducts() != null)
        {
            for(Product p : ecosystem.getProductDirectory().getProducts())
            {   
                Object[] row = new Object[viewTable.getColumnCount()];
                row[0] = p;
                row[1] = p.getCategory();
                row[2] = p.getPrice();
                String temp = p.getProductImagePath();
                if(temp != null)
                {
                    ImageIcon ii = new ImageIcon(temp);
                    Image resizedImage = ii.getImage();
                    ii = new ImageIcon(resizedImage.getScaledInstance(170, 170, Image.SCALE_SMOOTH));
                    row[3] = ii;
                }
                else
                {
                    row[3] = "Should have been an image";
                }
                viewTable.addRow(row); 
            }
            tblProducts.setRowHeight(150);
            tblProducts.setModel(viewTable);
        }
    }
    
    /*public void checkoutCart()
    {
        if (customer.getCart().getTotalPrice() > 0.0) 
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Your cart has some items, would you like to proceed to checkout?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                rightSystemAdminPanel.remove(this);
                ECommerceCustomerCart eccc = new ECommerceCustomerCart(rightSystemAdminPanel, customer, ecosystem);
                rightSystemAdminPanel.add("eCommerceCustomerPanel", eccc);
                CardLayout layout = (CardLayout)this.rightSystemAdminPanel.getLayout();
                layout.next(rightSystemAdminPanel);
            }
//            else
//            {
//                remove(dialogButton);
//            }
        }
    }*/
    
    private void populateProductCategories() {
        ArrayList<String> catList = new ArrayList <String>();
        
        for(Product p : ecosystem.getProductDirectory().getProducts()) {
            if (!catList.contains(p.getCategory())) {
                catList.add(p.getCategory());
            }
        }
        
        jComboCategory.addItem("All");
        
        for(String cat : catList) 
            jComboCategory.addItem(cat);
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
        tblProducts = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboCategory = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCustomerCart = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("e-Commerce Products");

        tblProducts.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Category", "Price", "Photo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tblProducts.setSelectionForeground(new java.awt.Color(0, 204, 204));
        tblProducts.setShowHorizontalLines(false);
        tblProducts.setShowVerticalLines(false);
        tblProducts.getTableHeader().setReorderingAllowed(false);
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        txtSearch.setText("Enter any part of item");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel2.setText("Search Product:");

        jLabel3.setText("Search by category: ");

        jComboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCategoryActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Click column head to sort");

        btnCustomerCart.setBackground(new java.awt.Color(153, 204, 255));
        btnCustomerCart.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCustomerCart.setText("Cart");
        btnCustomerCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCustomerCart))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCustomerCart, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnSearch)
                    .addComponent(jLabel3)
                    .addComponent(jComboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        // TODO add your handling code here:
        if (tblProducts.getSelectedRow() != -1)
        {
            Product prod = (Product) tblProducts.getValueAt(tblProducts.getSelectedRow(), 0);
            ECommerceProductPanel cspj = new ECommerceProductPanel(rightSystemAdminPanel, prod, customer, ecosystem);
            rightSystemAdminPanel.add("eCommerceProductPanel", cspj);
            CardLayout layout = (CardLayout)this.rightSystemAdminPanel.getLayout();
            layout.next(rightSystemAdminPanel);
        }
    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here
        viewTable.setRowCount(0);
        int count = 0;
        if(ecosystem.getProductDirectory().getProducts() != null)
        {
            for(Product p : ecosystem.getProductDirectory().getProducts())
            {
                if (p.getName().toLowerCase().contains(txtSearch.getText().toLowerCase()))
                {
                    Object[] row = new Object[viewTable.getColumnCount()];
                    row[0] = p;
                    row[1] = p.getCategory();
                    row[2] = p.getPrice();
                    String temp = p.getProductImagePath();
                    if(temp != null)
                    {
                        ImageIcon ii = new ImageIcon(temp);
                        Image resizedImage = ii.getImage();
                        ii = new ImageIcon(resizedImage.getScaledInstance(170, 170, Image.SCALE_SMOOTH));
                        row[3] = ii;
                    }
                    else
                    {
                        row[3] = "Should have been an image";
                    }
                    viewTable.addRow(row);
                    count++;
                }
            }
            tblProducts.setRowHeight(150);
            tblProducts.setModel(viewTable);
        }
        if(count == 0)
        {
            JOptionPane.showMessageDialog(null, "Nothing found related to " + txtSearch.getText() + ", try with other keywords!");
            return;
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jComboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCategoryActionPerformed
        // TODO add your handling code here:
        //populateTable(jComboCategory.getSelectedItem().toString());
        //populateTable("Mobiles");
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) tblProducts.getModel()));
        if(!jComboCategory.getSelectedItem().toString().equals("All"))
        {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" +jComboCategory.getSelectedItem().toString()));
            tblProducts.setRowSorter(sorter);
        }
        else
        {
            tblProducts.setRowSorter(null);
        }
    }//GEN-LAST:event_jComboCategoryActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMouseClicked

    private void btnCustomerCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerCartActionPerformed
        // TODO add your handling code here:
        if(customer.getCart().getProdDir().getProducts().size() > 0)
        {
            ECommerceCustomerCart eccc = new ECommerceCustomerCart(rightSystemAdminPanel, customer, ecosystem);
            rightSystemAdminPanel.add("eCommerceProductPanel", eccc);
            CardLayout layout = (CardLayout)this.rightSystemAdminPanel.getLayout();
            layout.next(rightSystemAdminPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nothing in cart yet, please add products");
            return;
        }
    }//GEN-LAST:event_btnCustomerCartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerCart;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> jComboCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
