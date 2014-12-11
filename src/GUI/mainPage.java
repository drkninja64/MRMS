/*
 * Main GUI
 */

package GUI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import mrms.Backupdata;
import mrms.Import;
import mrms.MySqlToXls;

/*
 * @author Sajag
 */
public class mainPage extends JFrame {
    /* All the JFrames */
    public static PatientEntry PE;
    public static PatientSearch PS;
    public static DoctorList DL;
    public static DoctorEntry DE;
    public static ReportGUI RE;
    
    int flag;
    public static String filename;
    static File dir = null;
    //DoctorList dlist=new DoctorList();
    public static int for_shift;
    public mainPage() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        closecall();
    }

    private void closecall(){
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt) {
                onExit();
            }
        });
    }
    public void onExit() {
        int i = JOptionPane.showConfirmDialog(this, "Do you want to logout "+LoginGUI.CurrentUser+"?",
                "Exit",JOptionPane.YES_NO_OPTION);
        //JOptionPane.showMessageDialog(null, i);
        if(i==0){
            System.exit(0);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        Main_MenuBar = new javax.swing.JMenuBar();
        Main_file = new javax.swing.JMenu();
        Menu_pref = new javax.swing.JMenuItem();
        Menu_exit = new javax.swing.JMenuItem();
        Main_patient = new javax.swing.JMenu();
        Main_PEntry = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Main_doctor = new javax.swing.JMenu();
        Main_DocEntry = new javax.swing.JMenuItem();
        Main_DocList = new javax.swing.JMenuItem();
        Main_users = new javax.swing.JMenu();
        Main_AddUser = new javax.swing.JMenuItem();
        Main_investigation = new javax.swing.JMenu();
        cat_entry = new javax.swing.JMenuItem();
        cat_view = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        Main_data = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Main_excel = new javax.swing.JMenuItem();
        Main_sql = new javax.swing.JMenuItem();
        Main_import = new javax.swing.JMenuItem();
        Main_help = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        jMenuItem2.setText("View List");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Main_patient.add(jMenuItem2);

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
        Main_DocList.setText("View List");
        Main_DocList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_DocListActionPerformed(evt);
            }
        });
        Main_doctor.add(Main_DocList);

        Main_MenuBar.add(Main_doctor);

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

        jMenuItem1.setText("Edit Samples");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Main_investigation.add(jMenuItem1);

        Main_MenuBar.add(Main_investigation);

        Main_data.setText("Data");

        jMenu2.setText("Backup data");

        Main_excel.setText("Excel Files");
        Main_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_excelActionPerformed(evt);
            }
        });
        jMenu2.add(Main_excel);

        Main_sql.setText("Single File");
        Main_sql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_sqlActionPerformed(evt);
            }
        });
        jMenu2.add(Main_sql);

        Main_data.add(jMenu2);

        Main_import.setText("Import data");
        Main_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_importActionPerformed(evt);
            }
        });
        Main_data.add(Main_import);

        Main_MenuBar.add(Main_data);

        Main_help.setText("Help");
        Main_MenuBar.add(Main_help);

        setJMenuBar(Main_MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
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
        DE = new DoctorEntry();
        
    }//GEN-LAST:event_Main_DocEntryActionPerformed

    private void Main_AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_AddUserActionPerformed
        // TODO add your handling code here:
        Createuser cu=new Createuser();
        cu.setVisible(true);
    }//GEN-LAST:event_Main_AddUserActionPerformed

    private void Main_PEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_PEntryActionPerformed
        // TODO add your handling code here:
        PE = new PatientEntry();
    }//GEN-LAST:event_Main_PEntryActionPerformed

    private void Main_DocListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_DocListActionPerformed
        for_shift=1;
        
       DL = new DoctorList();

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

    private void Main_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_excelActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileSelectionMode(
        JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setCurrentDirectory(dir);
        int option = fileChooser.showSaveDialog(null);

        if (option == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();
    // if the user accidently click a file, then select the parent directory.
            if (!f.isDirectory()) {
                 f = f.getParentFile();
            }
            filename=f.getAbsolutePath();
            dir = f.getParentFile();
        //System.out.println("Selected directory for import " + f);
         MySqlToXls my=new MySqlToXls();
         my.mysqlmain();
    }
    }//GEN-LAST:event_Main_excelActionPerformed

    private void Main_sqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_sqlActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(
        JFileChooser.FILES_AND_DIRECTORIES);
        FileFilter filter = new FileNameExtensionFilter("SQL file", new String[] {"sql"});
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setFileFilter(filter);
        fileChooser.setCurrentDirectory(dir);
        int option = fileChooser.showSaveDialog(null);

        if (option == JFileChooser.APPROVE_OPTION) {
            
            File f = fileChooser.getSelectedFile();
        // if the user accidently click a file, then select the parent directory.
            String fn = f.getAbsolutePath();
            dir = f.getParentFile();
            addSQL(fn);
        //System.out.println("Selected directory for import " + f);
            Backupdata b=new Backupdata();
            try {
                b.back();
            } catch (IOException ex) {
                Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_Main_sqlActionPerformed

    private void Main_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_importActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Database will be overwritten.\nUnsaved data will be lost.\nContinue import?","Import Data",JOptionPane.OK_CANCEL_OPTION) == 0) {    
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setFileSelectionMode(
            JFileChooser.FILES_AND_DIRECTORIES);
            FileFilter filter = new FileNameExtensionFilter("SQL file", new String[] {"sql"});
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.addChoosableFileFilter(filter);
            fileChooser.setFileFilter(filter);
            fileChooser.setCurrentDirectory(dir);
            int option = fileChooser.showDialog(null,"Import");

            if (option == JFileChooser.APPROVE_OPTION) {
                File f = fileChooser.getSelectedFile();
            // if the user accidently click a file, then select the parent directory.
                filename=f.getAbsolutePath();
                dir = f.getParentFile();
            //System.out.println("Selected directory for import " + f);
                Import b=new Import();
                try {
                    b.importdata();
                } 
                catch (IOException ex) {
                    Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_Main_importActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        PS = new PatientSearch();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

   
    public void addSQL(String fn){
        if(fn.contains(".sql")) return;
        filename = fn + ".sql";
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Main_AddUser;
    private javax.swing.JMenuItem Main_DocEntry;
    private javax.swing.JMenuItem Main_DocList;
    private javax.swing.JMenuBar Main_MenuBar;
    private javax.swing.JMenuItem Main_PEntry;
    private javax.swing.JMenu Main_data;
    private javax.swing.JMenu Main_doctor;
    private javax.swing.JMenuItem Main_excel;
    private javax.swing.JMenu Main_file;
    private javax.swing.JMenu Main_help;
    private javax.swing.JMenuItem Main_import;
    private javax.swing.JMenu Main_investigation;
    private javax.swing.JMenu Main_patient;
    private javax.swing.JMenuItem Main_sql;
    private javax.swing.JMenu Main_users;
    private javax.swing.JMenuItem Menu_exit;
    private javax.swing.JMenuItem Menu_pref;
    private javax.swing.JMenuItem cat_entry;
    private javax.swing.JMenuItem cat_view;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
