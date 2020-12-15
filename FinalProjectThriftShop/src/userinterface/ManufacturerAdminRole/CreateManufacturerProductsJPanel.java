/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManufacturerAdminRole;

import Business.Organization.DealerOrganization;
import Business.EcoSystem;
import Business.Product.Product;
import Business.Product.ProductDirectory;
import Business.Organization.WholeSaleSupplierOrganization;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import userinterface.DealerRole.DealerWorkAreaJPanel;

/**
 *
 * @author Vishakha
 */
public class CreateManufacturerProductsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    WholeSaleSupplierOrganization supplier;
    DealerOrganization dealer;
    EcoSystem ecoSystem;
    ProductDirectory dealerPd;
    ProductDirectory globalPd;

    /**
     * Creates new form CreateResaurantJPanel
     */
    public CreateManufacturerProductsJPanel(JPanel upc, DealerOrganization dealer, EcoSystem ecoSystem) {
        this.userProcessContainer = upc;
        this.dealer = dealer;
        this.ecoSystem = ecoSystem;
        this.dealerPd = this.dealer.getProductDirectory();
        this.globalPd = this.ecoSystem.getProductDirectory();
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

        jLabel6 = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();
        nameErrorLabel = new javax.swing.JLabel();
        priceErrorLabel = new javax.swing.JLabel();
        categoryErrorLabel = new javax.swing.JLabel();
        quantityErrorLAbel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/manufacturer_icon.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Create Manufacturer - Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));
        add(jTxtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 143, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 109, 20));
        add(jTxtProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 190, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Price");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 120, 20));
        add(jTxtProductCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Category");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 109, 20));

        jBtnCreateProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnCreateProduct.setText("Create Product");
        jBtnCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCreateProductActionPerformed(evt);
            }
        });
        add(jBtnCreateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 268, 109, 20));
        add(jTxtProductQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 270, 150, 30));

        jBtnBrowse.setText("Browse");
        jBtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBrowseActionPerformed(evt);
            }
        });
        add(jBtnBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 143, -1));

        jLabelImagePath.setText("<<Product Image Path>>");
        add(jLabelImagePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 312, -1, 22));

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 162, 34));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/manufacturer_icon_bg_op.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 620, 500));

        nameErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(nameErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 140, 30));

        priceErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(priceErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 130, 30));
        add(categoryErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 130, 30));

        quantityErrorLAbel.setForeground(new java.awt.Color(255, 0, 0));
        add(quantityErrorLAbel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateProductActionPerformed
        if (jTxtProductName.getText().trim().isEmpty()
                && jTxtProductPrice.getText().trim().isEmpty()
                && jTxtProductCat.getText().trim().isEmpty()
                && jTxtProductQty.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please Enter data to proceed!", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        } // Name, Price, Category, Product Quantity are Empty
        else {
            nameErrorLabel.setText("");
            priceErrorLabel.setText("");
            categoryErrorLabel.setText("");
            quantityErrorLAbel.setText("");

            boolean error = false;

            if (jTxtProductName.getText().trim().isEmpty()) {
                nameErrorLabel.setText("Product Name cannot be empty");
                error = true;
            }

            try { //To validate if  Price is actually a number
                Double price = Double.parseDouble(jTxtProductPrice.getText().trim());
            } catch (NumberFormatException nfe) {
                if (jTxtProductPrice.getText().trim().isEmpty()) {
                    priceErrorLabel.setText("Product Price cannot be empty");
                } else {
                    priceErrorLabel.setText(" Product Price is not in Double format");
                }
                error = true;
            }

            if (jTxtProductCat.getText().trim().isEmpty()) {
                categoryErrorLabel.setText("Product Category cannot be empty");
                error = true;
            }

            try { //To validate if Quantity is actually a number
                Integer productQuantity = Integer.parseInt(jTxtProductQty.getText().trim());
            } catch (NumberFormatException nfe) {
                if (jTxtProductQty.getText().trim().isEmpty()) {
                    quantityErrorLAbel.setText("Product Quantity cannot be empty");
                } else {
                    quantityErrorLAbel.setText("Product Quantity is not a number");
                }

                error = true;
            }

            if (error) {
                return;
            }
        }

        // Validation code - End     
        Product dealerProduct = new Product();
        Product globalDirectoryProduct = new Product(); //Make sure to have another Copy.. this helps during separate update process

        dealerProduct.setDealer(this.dealer);
        dealerProduct.setName(jTxtProductName.getText().trim());
        dealerProduct.setPrice(Double.parseDouble(jTxtProductPrice.getText().trim())); //Dealers sell at 10% profit
        dealerProduct.setQty(Integer.parseInt(jTxtProductQty.getText().trim()));
        dealerProduct.setCategory(jTxtProductCat.getText().trim());
        dealerProduct.setProductImagePath(jLabelImagePath.getText());

        //Update Global Product directory with same params
        globalDirectoryProduct.setDealer(this.dealer);
        globalDirectoryProduct.setName(jTxtProductName.getText().trim());
        globalDirectoryProduct.setPrice(Double.parseDouble(jTxtProductPrice.getText().trim())); //Dealers sell at 10% profit
        globalDirectoryProduct.setQty(Integer.parseInt(jTxtProductQty.getText().trim()));
        globalDirectoryProduct.setCategory(jTxtProductCat.getText().trim());
        globalDirectoryProduct.setProductImagePath(jLabelImagePath.getText());
        addProductToDirectory(dealerProduct, dealerPd);
        addProductToDirectory(globalDirectoryProduct, globalPd);
        //Add the product to the Supplier's inventory
        //   this.dealer.getProductDirectory().getProducts().add(dealerProduct);
        //   this.ecoSystem.getProductDirectory().getProducts().add(globalDirectoryProduct);

        JOptionPane.showMessageDialog(null, "Created Product successfully");

        //Populate previous screen table and navigate back.
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();

        //        Restore prev screen's state
        Component[] comps = userProcessContainer.getComponents();

        for (Component comp : comps) {
            if (comp instanceof DealerWorkAreaJPanel) {
                DealerWorkAreaJPanel manageWS = (DealerWorkAreaJPanel) comp;
                manageWS.populateRequestTable();
            }
        }

        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_jBtnCreateProductActionPerformed
    private void addProductToDirectory(Product product, ProductDirectory productDirectory) {
        //Check if product already exists, if so add the qty alone and if not, create the product itself
        if (productDirectory.getProducts() != null) {
            Product foundProduct = productDirectory.findProductBasedOnDealer(product.getName(), product.getDealer().getName());

            if (foundProduct != null) {

                foundProduct.setQty(foundProduct.getQty() + product.getQty());
            } else {
                productDirectory.getProducts().add(product);
            }
        } else {
            productDirectory.addProductQuantity(product.getName(), dealer.getName(), product.getQty());
        }
    }
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
    private javax.swing.JLabel categoryErrorLabel;
    private javax.swing.JButton jBtnBrowse;
    private javax.swing.JButton jBtnCreateProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelImagePath;
    private javax.swing.JTextField jTxtProductCat;
    private javax.swing.JTextField jTxtProductName;
    private javax.swing.JTextField jTxtProductPrice;
    private javax.swing.JTextField jTxtProductQty;
    private javax.swing.JLabel nameErrorLabel;
    private javax.swing.JLabel priceErrorLabel;
    private javax.swing.JLabel quantityErrorLAbel;
    // End of variables declaration//GEN-END:variables
}
