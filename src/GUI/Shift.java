/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import GUI.DoctorEntry;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mrms.Doctor;
import mrms.Sql_connection;


/**
 *
 * @author lovelyruchi
 */
public class Shift extends javax.swing.JFrame {
    //Default Constructor
     Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    JFrame fr;
    public Shift() {
        initComponents();
        conn=Sql_connection.connecrDb();
    }
    
    //Doctor call constructor
    public Shift(String a,JFrame f) {
        
        initComponents();
        
       
        conn=Sql_connection.connecrDb();
        setVisible(true);
        this.setLocationRelativeTo(null);
        setLocation((int)getLocation().getX(), (int)(getLocation().getY()-50));
        Shift_day.requestFocusInWindow();
        DID.setText(a);
        fr=f;
        f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        closecall();
        
    }
    public void closecall(){
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt) {
                onExit();
            }
        });
    }
    public void onExit() {
       // int i=JOptionPane.showConfirmDialog(this, "Do you want to Exit?");
       // if(i==0){
        this.dispose();
        fr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       // }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Shift_ok = new javax.swing.JButton();
        DID = new javax.swing.JTextField();
        Shift_day = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        Shift_Cancel = new javax.swing.JButton();
        Shift_start = new javax.swing.JFormattedTextField();
        Shift_end = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Shift");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setText("ID:");

        jLabel2.setText("Day:");

        jLabel3.setText("Shift Start:");

        jLabel4.setText("Shift End:");

        Shift_ok.setText("OK");
        Shift_ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shift_okMouseClicked(evt);
            }
        });
        Shift_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Shift_okActionPerformed(evt);
            }
        });
        Shift_ok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Shift_okKeyPressed(evt);
            }
        });

        DID.setEditable(false);

        Shift_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        Shift_day.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Shift_dayKeyPressed(evt);
            }
        });

        Shift_Cancel.setText("Cancel");
        Shift_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Shift_CancelActionPerformed(evt);
            }
        });

        Shift_start.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        Shift_start.setToolTipText("h:mm AM/PM");
        Shift_start.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Shift_startKeyPressed(evt);
            }
        });

        Shift_end.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        Shift_end.setToolTipText("h:mm AM/PM");
        Shift_end.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Shift_endKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DID, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Shift_day, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Shift_start, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Shift_end, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Shift_ok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Shift_Cancel))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Shift_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Shift_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Shift_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Shift_ok)
                    .addComponent(Shift_Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Shift_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Shift_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_Shift_CancelActionPerformed

    private void Shift_endKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Shift_endKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) Shift_ok.requestFocusInWindow();
    }//GEN-LAST:event_Shift_endKeyPressed

    private void Shift_okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shift_okMouseClicked
        
    }//GEN-LAST:event_Shift_okMouseClicked

    private void Shift_okKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Shift_okKeyPressed
        addShTable();
    }//GEN-LAST:event_Shift_okKeyPressed

    private void Shift_startKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Shift_startKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) Shift_end.requestFocusInWindow();
    }//GEN-LAST:event_Shift_startKeyPressed

    private void Shift_dayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Shift_dayKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) Shift_start.requestFocusInWindow();
    }//GEN-LAST:event_Shift_dayKeyPressed

    private void Shift_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Shift_okActionPerformed
       
            addShTable();
        
        
    }//GEN-LAST:event_Shift_okActionPerformed

    public static void shiftDoc() {
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
            java.util.logging.Logger.getLogger(Shift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shift.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shift().setVisible(true);
            }
        });
    }
    
    //Puts values in Table in Doctor entry
    public void addShTable(){
        String dcode =  DID.getText();
        String day   =  Shift_day.getSelectedItem().toString();
        String start =  Shift_start.getText();
        String end   =  Shift_end.getText();
        
        if(start.equals("") || end.equals("")){
            JOptionPane.showMessageDialog(null,"Shift times cannot be empty","Null Entry",JOptionPane.ERROR_MESSAGE);
            return;
        }            
        //Previous data preservation
        Object[][] temp = new Object[DoctorEntry.data.length+1][3];
        for(int i=0;i<DoctorEntry.data.length;i++){
            for(int j=0;j<3;j++){
                //JOptionPane.showMessageDialog(null,DoctorEntry.data[i][j]);
                if(DoctorEntry.data[i][0].equals(day)) {
                    JOptionPane.showMessageDialog(null,"Shift days cannot be repeated","Invalid Entry",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                temp[i][j]=DoctorEntry.data[i][j];
            }
        }
        temp[DoctorEntry.data.length][0] = day;
        temp[DoctorEntry.data.length][1] = start;
        temp[DoctorEntry.data.length][2] = end;
        DoctorEntry.data=temp;
        DoctorEntry.setTableData();
        this.dispose();
        
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DID;
    private javax.swing.JButton Shift_Cancel;
    private javax.swing.JComboBox Shift_day;
    private javax.swing.JFormattedTextField Shift_end;
    private javax.swing.JButton Shift_ok;
    private javax.swing.JFormattedTextField Shift_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
