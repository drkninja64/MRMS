/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mrms.Patient;
import mrms.Sql_connection;

/**
 *
 * @author lovelyruchi
 */
public class PatientSearch extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rs=null, r2=null;
    PreparedStatement pst=null, ps2=null;
    static int len = 0;
    static Object[][] data = new Object[0][5];
    static Patient pa=new Patient();
    /**
     * Creates new form PatientSearch
     */
    public PatientSearch() {
        initComponents();
        doubleClick();
        setVisible(true);
        setLocationRelativeTo(null);
        conn=Sql_connection.connecrDb();
        len = findLength();
        fillData();
    }
    
    public static void setTableData(){
        patient_table.setModel(new DefaultTableModel(data,new String[]{"Code","Name","Age","Gender","Date Added"}){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //all cells false
            }
        });
        patient_table.setVisible(true);
    }
    
    private static int findLength(){
        int a = Integer.valueOf(pa.countpatient());
        return a;
    }
    
    /**
     * Fills data into @data variable
     * Contains table contents
     */
    public void fillData(){
        data = new Object [len][5];
       
        try{
            String sql="Select * from patient";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            for(int i=0; i<len; i++){
                    rs.next();
                    data[i][0] = rs.getInt("PCode");
                    data[i][1] = rs.getString("FName")+" "+rs.getString("MName")+" "+rs.getString("LName");
                    data[i][2] = Integer.toString(rs.getInt("Age"));
                    if(rs.getInt("Sex")==1){
                        data[i][3]="Male";
                    }
                    else{
                        data[i][3]="Female";
                    }
                    data[i][4]=rs.getString("Date");
            }
            setTableData();
        }      
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }

    void doubleClick(){
        patient_table.addMouseListener(new MouseAdapter() { 
            public void mousePressed(MouseEvent me) {
                JTable table =(JTable) me.getSource();
                Point p = me.getPoint();
                int row = table.rowAtPoint(p);

                if (me.getClickCount() == 2) {
                    String id=(patient_table.getValueAt(row, 0)).toString();
                    mainPage.PE = new PatientEntry(id);
                    mainPage.PS.dispose();
                }
            }
       
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patient_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        S_Code = new javax.swing.JTextField();
        S_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Search");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("List Area"));

        patient_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(patient_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Area"));

        jLabel2.setText("Name:");

        S_Code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                S_CodeKeyReleased(evt);
            }
        });

        S_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                S_nameKeyReleased(evt);
            }
        });

        jLabel1.setText("Code:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(S_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_name, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(S_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(S_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setTableData();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void S_CodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_S_CodeKeyReleased
         S_name.setText("");
        String patientid=S_Code.getText();
        if(patientid.equals("")){
            len = findLength();
            fillData();
        }else{
        Patient p=new Patient();
        table=patient_table;
        p.search_id(patientid,table);
        }
    }//GEN-LAST:event_S_CodeKeyReleased

    private void S_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_S_nameKeyReleased
         S_Code.setText("");
        String patientname=S_name.getText();
        if(patientname.equals("")){
            len = findLength();
            fillData();
        }else{
            Patient d=new Patient();
            table=patient_table;
            d.search_name(patientname,table);
        }
    }//GEN-LAST:event_S_nameKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField S_Code;
    private javax.swing.JTextField S_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable patient_table;
    // End of variables declaration//GEN-END:variables
public static JTable table;
}
