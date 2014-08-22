/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.swing.JOptionPane;
import mrms.*;

/**
 *
 * @author lovelyruchi
 */
public class Createuser extends javax.swing.JFrame {
    
    Connection conn=null;
     ResultSet rs=null;
     PreparedStatement pst=null;

    /**
     * Creates new form Createuser
     */
    public Createuser() {
        initComponents();
         conn =Sql_connection.connecrDb();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        UC_CreateBN = new javax.swing.JButton();
        UC_PermissionsBN = new javax.swing.JButton();
        UC_Info = new javax.swing.JPanel();
        UC_CatBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UC_UserVal = new javax.swing.JTextField();
        UC_PassVal = new javax.swing.JPasswordField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        UC_CreateBN.setText("Create");
        UC_CreateBN.setToolTipText("Create new user");
        UC_CreateBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UC_CreateBNActionPerformed(evt);
            }
        });

        UC_PermissionsBN.setText("Permissions");
        UC_PermissionsBN.setToolTipText("Set permissions for this user");

        UC_Info.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        UC_CatBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Technician", "Specialist", "Doctor", "Receptionist", "Phlebotomist" }));

        jLabel5.setText("Category :");

        jLabel4.setText("Password :");

        jLabel3.setText("Username :");

        UC_UserVal.setToolTipText("- Maximum 10 Characters");

        javax.swing.GroupLayout UC_InfoLayout = new javax.swing.GroupLayout(UC_Info);
        UC_Info.setLayout(UC_InfoLayout);
        UC_InfoLayout.setHorizontalGroup(
            UC_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UC_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UC_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UC_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UC_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UC_UserVal)
                        .addComponent(UC_PassVal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UC_CatBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UC_InfoLayout.setVerticalGroup(
            UC_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UC_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UC_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(UC_UserVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UC_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UC_PassVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UC_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UC_CatBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UC_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UC_CreateBN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(UC_PermissionsBN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {UC_CreateBN, UC_PermissionsBN});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UC_Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UC_PermissionsBN)
                    .addComponent(UC_CreateBN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UC_CreateBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UC_CreateBNActionPerformed
        
        try{
 
		    DESedeKeySpec keySpec = new DESedeKeySpec(encodedKey);
                    SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(algorithm);
                    SecretKey key = keyFactory.generateSecret(keySpec);

                    Cipher cipher = Cipher.getInstance(algorithm);
                                      
                     cipher.init(Cipher.ENCRYPT_MODE, key);
                     
                      String pass=UC_PassVal.getText();
                       byte[] text = pass.getBytes();
                      byte[] textEncrypted = cipher.doFinal(text);
                      String kk=Base64.encode(textEncrypted);
                      
                       String sql="Insert into users (Username,Password,Category,Permissions,Status) value(?,?,?,?,?)";
            
            pst=conn.prepareStatement(sql);
            
           
            pst.setString(1,UC_UserVal.getText());
            pst.setString(2,kk);
            String combo_value=UC_CatBox.getSelectedItem().toString();
            pst.setString(3,combo_value);
            pst.setString(4,"a");
            pst.setInt(5, 1);
            
        
          
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"User Registered!");
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_UC_CreateBNActionPerformed

    public static void userCreate() {
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
            java.util.logging.Logger.getLogger(Createuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Createuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Createuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Createuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Createuser().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox UC_CatBox;
    private javax.swing.JButton UC_CreateBN;
    private javax.swing.JPanel UC_Info;
    private javax.swing.JPasswordField UC_PassVal;
    private javax.swing.JButton UC_PermissionsBN;
    private javax.swing.JTextField UC_UserVal;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

   private String status;
private static String algorithm = "DESede";
private static byte[] encodedKey = new BigInteger("4405520484130165276382990563461622355059220529429770692711", 16).toByteArray();
}
