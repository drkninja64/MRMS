/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
public class DoctorList extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null, r2=null;
    PreparedStatement pst=null, ps2=null;
    static int len = 0;
    static Object[][] data = new Object[0][4];
    static Doctor doc = new Doctor();
    public DoctorList dlt;
    
    /**
     * Creates new form DoctorList
     */
    public DoctorList() {
        initComponents();
        setLocationRelativeTo(null);
        conn=Sql_connection.connecrDb();
        len = findLength() - 1;
        fillData();
        viewData();
        setTableData();
    }
    
    public void close(){
        WindowEvent winClosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
   
    
    public void viewData(){
        VD_Table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                JTable table =(JTable) me.getSource();
                Point p = me.getPoint();
                int row = table.rowAtPoint(p);

                if (me.getClickCount() == 2) {
                    String id=(VD_Table.getValueAt(row, 0)).toString(); 
                    Doctor doc1=new Doctor();
                    doc1.view_doc_info(id);
                }
            }
        });
    }

    public final JFrame getMainFrame(){
        return this;
    }
    
    public static void setTableData(){
        VD_Table.setModel(new DefaultTableModel(data,new String[]{"ID","Name","Qualification","Days"}){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //all cells false
            }
        });
        VD_Table.setVisible(true);
    }
    
    private static int findLength(){
        int a = Integer.valueOf(doc.countDoc());
        return a;
    }
    
    /**
     * Fills data into @data variable
     * Contains table contents
     */
    public void fillData(){
        data = new Object [len][4];
        String day="";
        try{
            String sql="Select * from doctor";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            rs.next();
            for(int i=0; i<len; i++){
                    rs.next();
                    data[i][0] = rs.getInt("DCode");
                    data[i][1] = rs.getString("DName");
                    data[i][2] = rs.getString("DQual");
                    if(rs.getInt("Shift")==1){
                        sql="Select Day From shifttable where Dcode=?";
                        ps2=conn.prepareStatement(sql);
                        ps2.setInt(1, rs.getInt("DCode"));
                        r2=ps2.executeQuery();
                        while(r2.next()){
                            day = day + r2.getString("Day") + ", ";
                        }                 
                       day = day.substring(0, day.length()-2);
                        data[i][3] = day;
                        day = "";
                    }
                    else data[i][3] = " - ";                    
            }
            setTableData();
        }      
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VD_SearchPNL = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        VD_DocID = new javax.swing.JTextField();
        VD_Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        VD_list = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VD_Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Doctor's List");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        VD_SearchPNL.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 12))); // NOI18N

        jLabel2.setText("Name:");

        VD_DocID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VD_DocIDKeyReleased(evt);
            }
        });

        VD_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VD_NameKeyReleased(evt);
            }
        });

        jLabel1.setText("ID:");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VD_SearchPNLLayout = new javax.swing.GroupLayout(VD_SearchPNL);
        VD_SearchPNL.setLayout(VD_SearchPNLLayout);
        VD_SearchPNLLayout.setHorizontalGroup(
            VD_SearchPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VD_SearchPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VD_SearchPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VD_SearchPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VD_SearchPNLLayout.createSequentialGroup()
                        .addComponent(VD_DocID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(VD_SearchPNLLayout.createSequentialGroup()
                        .addComponent(VD_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        VD_SearchPNLLayout.setVerticalGroup(
            VD_SearchPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VD_SearchPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VD_SearchPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(VD_DocID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VD_SearchPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(VD_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        VD_list.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 12))); // NOI18N

        VD_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Qualification", "Work", "Days"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VD_Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(VD_Table);
        if (VD_Table.getColumnModel().getColumnCount() > 0) {
            VD_Table.getColumnModel().getColumn(0).setResizable(false);
            VD_Table.getColumnModel().getColumn(2).setResizable(false);
            VD_Table.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout VD_listLayout = new javax.swing.GroupLayout(VD_list);
        VD_list.setLayout(VD_listLayout);
        VD_listLayout.setHorizontalGroup(
            VD_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VD_listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        VD_listLayout.setVerticalGroup(
            VD_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VD_listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VD_SearchPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(VD_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VD_SearchPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VD_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VD_DocIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VD_DocIDKeyReleased
        VD_Name.setText("");
        String docid=VD_DocID.getText();
        if(docid.equals("")){
            len = findLength() - 1;
            fillData();
        }else{
        Doctor d=new Doctor();
        table=VD_Table;
        d.search_id(docid,table);
        }
    }//GEN-LAST:event_VD_DocIDKeyReleased

    private void VD_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VD_NameKeyReleased
        VD_DocID.setText("");
        String docname=VD_Name.getText();
        if(docname.equals("")){
            len = findLength() - 1;
            fillData();
        }else{
            Doctor d=new Doctor();
            table=VD_Table;
            d.search_name(docname,table);
        }
    }//GEN-LAST:event_VD_NameKeyReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setTableData();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        setTableData();
    }//GEN-LAST:event_formWindowStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DoctorList d=new DoctorList();
        this.dispose();
        d.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void docViewGUI() {
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
            java.util.logging.Logger.getLogger(DoctorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DoctorList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VD_DocID;
    private javax.swing.JTextField VD_Name;
    private javax.swing.JPanel VD_SearchPNL;
    private static javax.swing.JTable VD_Table;
    private javax.swing.JPanel VD_list;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
public static String id;
public static String doc_name;
public static JTable table;
}
