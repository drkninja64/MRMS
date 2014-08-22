/*
 * Main GUI
 */

package GUI;

import javax.swing.*;
import java.awt.*;

/*
 * @author Sajag
 */
public class mainPage extends JFrame {
int flag;
DoctorList dlist=new DoctorList();
public static int for_shift;
    public mainPage() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_MenuBar = new javax.swing.JMenuBar();
        Main_file = new javax.swing.JMenu();
        Menu_pref = new javax.swing.JMenuItem();
        Menu_exit = new javax.swing.JMenuItem();
        Main_patient = new javax.swing.JMenu();
        Main_PEntry = new javax.swing.JMenuItem();
        Main_doctor = new javax.swing.JMenu();
        Main_DocEntry = new javax.swing.JMenuItem();
        Main_DocList = new javax.swing.JMenuItem();
        Main_report = new javax.swing.JMenu();
        Main_AddTest = new javax.swing.JMenuItem();
        Main_users = new javax.swing.JMenu();
        Main_AddUser = new javax.swing.JMenuItem();
        Main_data = new javax.swing.JMenu();
        Main_help = new javax.swing.JMenu();
        Main_investigation = new javax.swing.JMenu();
        cat_entry = new javax.swing.JMenuItem();
        cat_view = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        viewInv = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MRMS");
        setResizable(false);

        Main_file.setText("File");

        Menu_pref.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        Menu_pref.setText("Preferences");
        Menu_pref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_prefActionPerformed(evt);
            }
        });
        Main_file.add(Menu_pref);

        Menu_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        Menu_exit.setText("Exit");
        Menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_exitActionPerformed(evt);
            }
        });
        Main_file.add(Menu_exit);

        Main_MenuBar.add(Main_file);

        Main_patient.setText("Patient");

        Main_PEntry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        Main_PEntry.setText("Information Entry");
        Main_PEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_PEntryActionPerformed(evt);
            }
        });
        Main_patient.add(Main_PEntry);

        Main_MenuBar.add(Main_patient);

        Main_doctor.setText("Doctor");

        Main_DocEntry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        Main_DocEntry.setText("Information Entry");
        Main_DocEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_DocEntryActionPerformed(evt);
            }
        });
        Main_doctor.add(Main_DocEntry);

        Main_DocList.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        Main_DocList.setText("List");
        Main_DocList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_DocListActionPerformed(evt);
            }
        });
        Main_doctor.add(Main_DocList);

        Main_MenuBar.add(Main_doctor);

        Main_report.setText("Report");

        Main_AddTest.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        Main_AddTest.setText("Add/Modify Tests");
        Main_AddTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_AddTestActionPerformed(evt);
            }
        });
        Main_report.add(Main_AddTest);

        Main_MenuBar.add(Main_report);

        Main_users.setText("Users");

        Main_AddUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        Main_AddUser.setText("Add Users");
        Main_AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_AddUserActionPerformed(evt);
            }
        });
        Main_users.add(Main_AddUser);

        Main_MenuBar.add(Main_users);

        Main_data.setText("Data");
        Main_MenuBar.add(Main_data);

        Main_help.setText("Help");
        Main_MenuBar.add(Main_help);

        Main_investigation.setText("Investigations");

        cat_entry.setText("Add new Department");
        cat_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat_entryActionPerformed(evt);
            }
        });
        Main_investigation.add(cat_entry);

        cat_view.setText("Add new Investigation");
        cat_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat_viewActionPerformed(evt);
            }
        });
        Main_investigation.add(cat_view);
        Main_investigation.add(jSeparator1);

        viewInv.setText("View Investigations");
        viewInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvActionPerformed(evt);
            }
        });
        Main_investigation.add(viewInv);

        jMenuItem1.setText("Edit Samples");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Main_investigation.add(jMenuItem1);

        Main_MenuBar.add(Main_investigation);

        setJMenuBar(Main_MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_prefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_prefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_prefActionPerformed

    private void Menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Menu_exitActionPerformed

    private void Main_DocEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_DocEntryActionPerformed
        flag=1;
        DoctorEntry docentry=new DoctorEntry();
        
    }//GEN-LAST:event_Main_DocEntryActionPerformed

    private void Main_AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_AddUserActionPerformed
        // TODO add your handling code here:
        Createuser cu=new Createuser();
        cu.setVisible(true);
    }//GEN-LAST:event_Main_AddUserActionPerformed

    private void Main_AddTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_AddTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Main_AddTestActionPerformed

    private void Main_PEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_PEntryActionPerformed
        // TODO add your handling code here:
        new PatientEntry();
    }//GEN-LAST:event_Main_PEntryActionPerformed

    private void Main_DocListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_DocListActionPerformed
        for_shift=1;
        dlist.setVisible(true);
    }//GEN-LAST:event_Main_DocListActionPerformed

    private void cat_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat_entryActionPerformed
        new CatEntry();
    }//GEN-LAST:event_cat_entryActionPerformed

    private void cat_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat_viewActionPerformed
        new TestEntry();
    }//GEN-LAST:event_cat_viewActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new SampleAdd();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void viewInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewInvActionPerformed

   
    public static void mainGUI() {
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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private Dimension screenSize;
            @Override
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Main_AddTest;
    private javax.swing.JMenuItem Main_AddUser;
    private javax.swing.JMenuItem Main_DocEntry;
    private javax.swing.JMenuItem Main_DocList;
    private javax.swing.JMenuBar Main_MenuBar;
    private javax.swing.JMenuItem Main_PEntry;
    private javax.swing.JMenu Main_data;
    private javax.swing.JMenu Main_doctor;
    private javax.swing.JMenu Main_file;
    private javax.swing.JMenu Main_help;
    private javax.swing.JMenu Main_investigation;
    private javax.swing.JMenu Main_patient;
    private javax.swing.JMenu Main_report;
    private javax.swing.JMenu Main_users;
    private javax.swing.JMenuItem Menu_exit;
    private javax.swing.JMenuItem Menu_pref;
    private javax.swing.JMenuItem cat_entry;
    private javax.swing.JMenuItem cat_view;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem viewInv;
    // End of variables declaration//GEN-END:variables
}
