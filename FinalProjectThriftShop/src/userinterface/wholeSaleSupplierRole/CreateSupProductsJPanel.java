/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.wholeSaleSupplierRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Product.Product;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Organization.WholeSaleSupplierOrganization;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Arthishravan
 */
public class CreateSupProductsJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    WholeSaleSupplierOrganization supplier;
    /**
     * Creates new form CreateResaurantJPanel
     */
    public CreateSupProductsJPanel(JPanel upc, WholeSaleSupplierOrganization sup) {
        this.userProcessContainer = upc;
        this.supplier = sup;
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
        jTxtProductName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtProductPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtProductCat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBtnCreateProduct = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTxtProductQty = new javax.swing.JTextField();
        jBtnBrowse = new javax.swing.JButton();
        jLabelImagePath = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jErrorName = new javax.swing.JLabel();
        jErrorPrice = new javax.swing.JLabel();
        jErrorCategory = new javax.swing.JLabel();
        jErrorQuantity = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Create Supplier - Product");
        add(jLabel1);
        jLabel1.setBounds(311, 82, 228, 22);
        add(jTxtProductName);
        jTxtProductName.setBounds(508, 146, 251, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2);
        jLabel2.setBounds(261, 144, 109, 20);
        add(jTxtProductPrice);
        jTxtProductPrice.setBounds(508, 214, 251, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Price");
        add(jLabel3);
        jLabel3.setBounds(261, 212, 120, 20);
        add(jTxtProductCat);
        jTxtProductCat.setBounds(508, 282, 251, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Category");
        add(jLabel4);
        jLabel4.setBounds(261, 280, 109, 20);

        jBtnCreateProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnCreateProduct.setText("Create Product");
        jBtnCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreateProductActionPerformed(evt);
            }
        });
        add(jBtnCreateProduct);
        jBtnCreateProduct.setBounds(604, 487, 137, 34);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");
        add(jLabel5);
        jLabel5.setBounds(261, 350, 109, 20);
        add(jTxtProductQty);
        jTxtProductQty.setBounds(508, 352, 251, 30);

        jBtnBrowse.setText("Browse");
        jBtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBrowseActionPerformed(evt);
            }
        });
        add(jBtnBrowse);
        jBtnBrowse.setBounds(261, 412, 143, 23);

        jLabelImagePath.setText("<<Product Image>>");
        add(jLabelImagePath);
        jLabelImagePath.setBounds(508, 412, 251, 30);

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel);
        btnCancel.setBounds(323, 487, 162, 34);

        jErrorName.setForeground(new java.awt.Color(255, 0, 0));
        add(jErrorName);
        jErrorName.setBounds(508, 180, 251, 20);

        jErrorPrice.setForeground(new java.awt.Color(255, 0, 0));
        add(jErrorPrice);
        jErrorPrice.setBounds(508, 248, 251, 20);

        jErrorCategory.setForeground(new java.awt.Color(255, 0, 0));
        add(jErrorCategory);
        jErrorCategory.setBounds(508, 316, 251, 20);

        jErrorQuantity.setForeground(new java.awt.Color(255, 0, 0));
        add(jErrorQuantity);
        jErrorQuantity.setBounds(510, 390, 251, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Supplier1.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(240, 140, 640, 540);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Optimized-Capture3.PNG"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(10, 0, 120, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateProductActionPerformed
           //Validation code starts
        
         if(jTxtProductName.getText().trim().isEmpty() && 
            jTxtProductPrice.getText().trim().isEmpty() &&
            jTxtProductCat.getText().trim().isEmpty() &&
            jTxtProductQty.getText().trim().isEmpty())
        {
            
           JOptionPane.showMessageDialog(null, "Please Enter data to proceed!", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        } // Name, Price, Category, Product Quantity are Empty
         
         else {
             jErrorName.setText("");
             jErrorPrice.setText("");
             jErrorCategory.setText("");
             jErrorQuantity.setText("");
             
            boolean error = false;
            
            if (jTxtProductName.getText().trim().isEmpty()) {
                jErrorName.setText("Product Name cannot be empty");
                error = true;
            }
            
             try { //To validate if  Price is actually a number
                Double price  = Double.parseDouble(jTxtProductPrice.getText().trim());
            } catch (NumberFormatException nfe) {
                if (jTxtProductPrice.getText().trim().isEmpty()) {
                   jErrorPrice.setText("Product Price cannot be empty");
                } else {
                    jErrorPrice.setText(" Product Price is not in Double format");
                }
                error = true;
            }
             
             if (jTxtProductCat.getText().trim().isEmpty()) {
                jErrorCategory.setText("Product Category cannot be empty");
                error = true;
            }
             
             try { //To validate if Quantity is actually a number
                Integer productQuantity = Integer.parseInt(jTxtProductQty.getText().trim());
            } catch (NumberFormatException nfe) {
                if (jTxtProductQty.getText().trim().isEmpty()) {
                    jErrorQuantity.setText("Product Quantity cannot be empty");
                }else {
                     jErrorQuantity.setText("Product Quantity is not a number");
                }
               
                error = true;
            }
                
            if (error) {
                return;
            }
        }
        
        
         // Validation code - End     
         
        Product product = new Product();
        
        product.setName(jTxtProductName.getText().trim());
        product.setPrice(Double.parseDouble(jTxtProductPrice.getText().trim()));
        product.setCategory(jTxtProductCat.getText().trim());
        product.setQty(Integer.parseInt(jTxtProductQty.getText().trim()));
        product.setSupplier(this.supplier);
        product.setProductImagePath(jLabelImagePath.getText());
        
        //Add the product to the Supplier's inventory
        this.supplier.getProductDirectory().getProducts().add(product);
        
        JOptionPane.showMessageDialog(null, "Created Product successfully");
        
        //Populate previous screen table and navigate back.
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        
         //        Restore prev screen's state
        Component[] comps = userProcessContainer.getComponents();

          for (Component comp : comps){
            if (comp instanceof WholeSaleSupplierWorkAreaJPanel){
                WholeSaleSupplierWorkAreaJPanel manageWS = (WholeSaleSupplierWorkAreaJPanel) comp;
                manageWS.populateProductsTable();
            }
        }
          
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_jBtnCreateProductActionPerformed

    private void jBtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBrowseActionPerformed
         // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "gif", "png", "jpg");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
//            product.setProductImagePath(path);
            jLabelImagePath.setText(path);
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("Did not select a file");
        }
    }//GEN-LAST:event_jBtnBrowseActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton jBtnBrowse;
    private javax.swing.JButton jBtnCreateProduct;
    private javax.swing.JLabel jErrorCategory;
    private javax.swing.JLabel jErrorName;
    private javax.swing.JLabel jErrorPrice;
    private javax.swing.JLabel jErrorQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelImagePath;
    private javax.swing.JTextField jTxtProductCat;
    private javax.swing.JTextField jTxtProductName;
    private javax.swing.JTextField jTxtProductPrice;
    private javax.swing.JTextField jTxtProductQty;
    // End of variables declaration//GEN-END:variables
}
