/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mrms.Doctor;
import mrms.SetFormat;
import mrms.Sql_connection;

/**
 *
 * @author lovelyruchi
 */
public class DoctorEntry extends javax.swing.JFrame {
static int flag_edit;
static int temp_delete_count;
static int sh_add;
    //Variables
    static Object[][] data = new Object[0][3]; // Shift Table Contents
    static Object[][] temp_delete = new Object[0][3]; 
    Connection conn=null;
    ResultSet rs=null, r2=null;
    PreparedStatement pst=null;
   public static int var;
    public DoctorEntry() {
        initComponents();
        conn=Sql_connection.connecrDb();
        flag_edit=0;
        setVisible(true);
        DE_Edit.setVisible(false);
        setLocationRelativeTo(null);
        setCode();
        DE_Name.requestFocusInWindow();
        
       
    }
    
     public void fill(String iiid,String DName,String DQual,String DWork,String DContact,String DEmail,Object[][] data1){
        this.setTitle("Doctor's information");  
        DE_Code.setText(iiid);
        DE_Name.setText(DName);
        DE_qual.setText(DQual);
        DE_work.setText(DWork);
        DE_contact.setText(DContact);
        DE_email.setText(DEmail);
        DE_Code.setEditable(false);
        DE_Name.setEditable(false);
        DE_qual.setEditable(false);
        DE_work.setEditable(false);
        DE_contact.setEditable(false);
        DE_email.setEditable(false);
        DE_Edit.setVisible(true);
        DE_Save.setEnabled(false);
        DE_Cancel.setEnabled(false);
        DE_ShAdd.setEnabled(false);
        DE_ShRemove.setEnabled(false);
        DE_ShClear.setEnabled(false);
        temp_delete=data1;
        temp_delete_count=temp_delete.length;
        data=data1;
        setTableData();
        
    }
     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        DE_Code = new javax.swing.JTextField();
        DE_Save = new javax.swing.JButton();
        DE_Shifts = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DE_ShTable = new javax.swing.JTable();
        DE_ShAdd = new javax.swing.JButton();
        DE_ShRemove = new javax.swing.JButton();
        DE_ShClear = new javax.swing.JButton();
        DE_infopanel = new javax.swing.JPanel();
        DE_contact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DE_Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DE_work = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DE_qual = new javax.swing.JTextField();
        DE_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DE_Edit = new javax.swing.JButton();
        DE_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Doctor's Information Entry");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("ID:");

        DE_Code.setEditable(false);

        DE_Save.setText("Save");
        DE_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DE_SaveActionPerformed(evt);
            }
        });
        DE_Save.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DE_SaveKeyPressed(evt);
            }
        });

        DE_Shifts.setBorder(javax.swing.BorderFactory.createTitledBorder("Shifts"));

        DE_ShTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Start time", "End time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DE_ShTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(DE_ShTable);
        if (DE_ShTable.getColumnModel().getColumnCount() > 0) {
            DE_ShTable.getColumnModel().getColumn(0).setResizable(false);
            DE_ShTable.getColumnModel().getColumn(1).setResizable(false);
            DE_ShTable.getColumnModel().getColumn(2).setResizable(false);
        }

        DE_ShAdd.setText("Add");
        DE_ShAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DE_ShAddActionPerformed(evt);
            }
        });
        DE_ShAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DE_ShAddKeyPressed(evt);
            }
        });

        DE_ShRemove.setText("Remove");
        DE_ShRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DE_ShRemoveActionPerformed(evt);
            }
        });
        DE_ShRemove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DE_ShRemoveKeyPressed(evt);
            }
        });

        DE_ShClear.setText("Clear");
        DE_ShClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DE_ShClearActionPerformed(evt);
            }
        });
        DE_ShClear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DE_ShClearKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout DE_ShiftsLayout = new javax.swing.GroupLayout(DE_Shifts);
        DE_Shifts.setLayout(DE_ShiftsLayout);
        DE_ShiftsLayout.setHorizontalGroup(
            DE_ShiftsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DE_ShiftsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DE_ShiftsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DE_ShiftsLayout.createSequentialGroup()
                        .addComponent(DE_ShAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DE_ShRemove)
                        .addGap(14, 14, 14)
                        .addComponent(DE_ShClear)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        DE_ShiftsLayout.setVerticalGroup(
            DE_ShiftsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DE_ShiftsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DE_ShiftsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DE_ShAdd)
                    .addComponent(DE_ShRemove)
                    .addComponent(DE_ShClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        DE_infopanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));

        DE_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DE_contactKeyPressed(evt);
            }
        });

        jLabel3.setText("Working Hospital :");

        DE_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DE_NameKeyPressed(evt);
            }
        });

        jLabel2.setText("Name:");

        DE_work.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DE_workKeyPressed(evt);
            }
        });

        jLabel6.setText("Email :");

        DE_qual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DE_qualKeyPressed(evt);
            }
        });

        DE_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DE_emailKeyPressed(evt);
            }
        });

        jLabel5.setText("Contact No.:");

        jLabel4.setText("Qualification:");

        javax.swing.GroupLayout DE_infopanelLayout = new javax.swing.GroupLayout(DE_infopanel);
        DE_infopanel.setLayout(DE_infopanelLayout);
        DE_infopanelLayout.setHorizontalGroup(
            DE_infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DE_infopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DE_infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DE_infopanelLayout.createSequentialGroup()
                        .addGroup(DE_infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DE_infopanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addGroup(DE_infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DE_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(DE_qual, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(DE_work, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(DE_email, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(DE_contact))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DE_infopanelLayout.setVerticalGroup(
            DE_infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DE_infopanelLayout.createSequentialGroup()
                .addGroup(DE_infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DE_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DE_infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DE_qual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(DE_infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DE_work, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(DE_infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DE_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DE_infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DE_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)))
        );

        DE_Edit.setText("Edit");
        DE_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DE_EditMouseClicked(evt);
            }
        });
        DE_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DE_EditActionPerformed(evt);
            }
        });
        DE_Edit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DE_EditKeyPressed(evt);
            }
        });

        DE_Cancel.setText("Cancel");
        DE_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DE_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(DE_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(DE_Save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DE_Edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DE_Cancel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1)
                            .addComponent(DE_Shifts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DE_infopanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DE_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DE_infopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DE_Save)
                    .addComponent(DE_Edit)
                    .addComponent(DE_Cancel))
                .addGap(13, 13, 13)
                .addComponent(DE_Shifts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DE_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DE_NameKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) DE_qual.requestFocusInWindow();
    }//GEN-LAST:event_DE_NameKeyPressed

    private void DE_qualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DE_qualKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) DE_work.requestFocusInWindow();
    }//GEN-LAST:event_DE_qualKeyPressed

    private void DE_workKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DE_workKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) DE_contact.requestFocusInWindow();
    }//GEN-LAST:event_DE_workKeyPressed

    private void DE_contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DE_contactKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) DE_email.requestFocusInWindow();
    }//GEN-LAST:event_DE_contactKeyPressed

    private void DE_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DE_emailKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) DE_Save.requestFocusInWindow();
    }//GEN-LAST:event_DE_emailKeyPressed

    private void DE_SaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DE_SaveKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) saveData();
        else DE_ShAdd.requestFocusInWindow();
    }//GEN-LAST:event_DE_SaveKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        resData();
    }//GEN-LAST:event_formWindowClosing

    private void DE_ShAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DE_ShAddKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            passid=DE_Code.getText();
            Shift sh=new Shift(passid,this);
        }
        else if (evt.getKeyCode()==KeyEvent.VK_RIGHT) DE_ShRemove.requestFocusInWindow();
     
    }//GEN-LAST:event_DE_ShAddKeyPressed

    private void DE_ShClearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DE_ShClearKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            resData();
            setTableData();
        }
    }//GEN-LAST:event_DE_ShClearKeyPressed

    private void DE_ShRemoveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DE_ShRemoveKeyPressed
        remSel(); setTableData();
    }//GEN-LAST:event_DE_ShRemoveKeyPressed

    private void DE_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DE_EditMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DE_EditMouseClicked

    private void DE_EditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DE_EditKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DE_EditKeyPressed

    private void DE_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DE_SaveActionPerformed
        saveData();
    }//GEN-LAST:event_DE_SaveActionPerformed

    private void DE_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DE_CancelActionPerformed
        if(flag_edit == 1)
        {
            DE_Name.setEditable(false);
            DE_qual.setEditable(false);
            DE_work.setEditable(false);
            DE_contact.setEditable(false);
            DE_email.setEditable(false);
            DE_Cancel.setEnabled(false);
            DE_ShAdd.setEnabled(false);
            DE_ShRemove.setEnabled(false);
            DE_ShClear.setEnabled(false);
            DE_Save.setEnabled(false);
            DE_Edit.setEnabled(true);
            flag_edit=0;
            
        }
        else this.dispose();
    }//GEN-LAST:event_DE_CancelActionPerformed

    private void DE_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DE_EditActionPerformed
        // TODO add your handling code here:
        DE_Name.setEditable(true);
        DE_qual.setEditable(true);
        DE_work.setEditable(true);
        DE_contact.setEditable(true);
        DE_email.setEditable(true);
        DE_Cancel.setEnabled(true);
        DE_ShAdd.setEnabled(true);
        DE_ShRemove.setEnabled(true);
        DE_ShClear.setEnabled(true);
        DE_Save.setEnabled(true);
        DE_Edit.setEnabled(false);
        flag_edit=1;
        
    }//GEN-LAST:event_DE_EditActionPerformed

    private void DE_ShAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DE_ShAddActionPerformed
        // TODO add your handling code here:
        passid=DE_Code.getText();
        Shift sh=new Shift(passid,this);
        sh_add=1;
        //this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_DE_ShAddActionPerformed

    private void DE_ShClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DE_ShClearActionPerformed
       resData(); setTableData();
    }//GEN-LAST:event_DE_ShClearActionPerformed

    private void DE_ShRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DE_ShRemoveActionPerformed
        if(DE_ShTable.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null,"Row not selected");
        }else{
        remSel(); setTableData();
        }
    }//GEN-LAST:event_DE_ShRemoveActionPerformed

    //Resets table data
    public void resData(){
        data = new Object[0][3];
    }

    //Removes selected shift   
    public static void remSel(){
        int rem=DE_ShTable.getSelectedRow();
        int len=data.length;
        Object[][] temp = new Object[len-1][3];
        for(int i=0, a=0;i<len;i++){
            if(i == rem) continue;
            for(int j=0;j<3;j++){
                temp[a][j]=data[i][j];      //Russell's idea was to move all data to overlap the index and deallocate
            }                               // the last one
            a++;
        }
        data=temp;
    }
    
    public void setCode(){
        Doctor d = new Doctor();
        DE_Code.setText(d.countDoc());
    }

    /**
     * Resets table view
     * @return 
     */
    public static void setTableData(){
        DE_ShTable.setModel(new DefaultTableModel(data,new String[]{"Day","Start time","End Time"}){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false; //all cells false
            }
        });
        DE_ShTable.setVisible(true); 
    }
    
    public void saveData(){
        int ok = 0;
        // Required Parameters
        String dcode1=DE_Code.getText();
        String dname1=DE_Name.getText();
        String dqual1=DE_qual.getText();
        String dwork1=DE_work.getText();
        String dcontact1=DE_contact.getText();
        String demail1=DE_email.getText();
        String dshift="0";
        //Checks if shifts exist
       
       
        //JOptionPane.showMessageDialog(null,setTimeFormat(data[0][1].toString())); /*
        //Enters Value into DB
        Doctor doc =new Doctor();
       if(flag_edit==1){
           
              Doctor dc=new Doctor();
          var=DE_ShTable.getRowCount();
          
              remove();
           ok=doc.save_edited(this,dcode1,dname1,dqual1,dwork1,dcontact1,demail1);
          System.out.println(""+var);
          for(int i=0;i<var;i++){
              
              String day1=(data[i][0]).toString();
              String start1=SetFormat.setTimeStyle(data[i][1].toString());
             
              String end1=SetFormat.setTimeStyle(data[i][2].toString());
              
             dc.insert_update(dcode1,day1,start1,end1);
              }
        }else{
            if(data.length==0) dshift="0";
        else dshift="1";
            ok=doc.saveaction(this,dcode1, dname1,dqual1, dwork1, dcontact1, demail1, dshift);    
        }
       if(flag_edit!=1){
        if(dshift.equals("1") && ok==0) {
            for(int i=0;i<DE_ShTable.getRowCount();i++){
                //JOptionPane.showMessageDialog(null,"Yes");
                doc.shiftEntry(dcode1,data[i][0].toString(),SetFormat.setTimeStyle(data[i][1].toString()),SetFormat.setTimeStyle(data[i][2].toString()));
                DoctorList.setTableData();
            }
        }
       }
    }
    
    public void remove(){
      //  int del_flag=0;
       // int diff = 0,for_del=0;
      /* if(temp_delete_count>var){
           diff=temp_delete_count-var;
       }*/
        for(int i=0;i<temp_delete_count;i++){
            for(int j=0;j<var;j++){
              if(temp_delete[i][0]!=data[j][0]){
           // if(del_flag!=1){
         try{
                      System.out.println("h");
                  String sql="Delete from shifttable where DCode=? and Day=?";
                  pst=conn.prepareStatement(sql);
                  pst.setInt(1,Integer.parseInt(DE_Code.getText()));
                  pst.setString(2,(temp_delete[i][0]).toString() );
                  pst.execute();
                  break;
                  }
                  catch(SQLException e){JOptionPane.showMessageDialog(null,e);}
                  finally{try{pst.close();}catch(SQLException e){JOptionPane.showMessageDialog(null,e);}}}
            
            }
            if(var==0){
                try{
                      System.out.println("h");
                  String sql="Delete from shifttable where DCode=? and Day=?";
                  pst=conn.prepareStatement(sql);
                  pst.setInt(1,Integer.parseInt(DE_Code.getText()));
                  pst.setString(2,(temp_delete[i][0]).toString() );
                  pst.execute();
                //  break;
                  }
                  catch(SQLException e){JOptionPane.showMessageDialog(null,e);}
                  finally{try{pst.close();}catch(SQLException e){JOptionPane.showMessageDialog(null,e);}}
            
        //}
            }
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DE_Cancel;
    private javax.swing.JTextField DE_Code;
    private javax.swing.JButton DE_Edit;
    private javax.swing.JTextField DE_Name;
    private javax.swing.JButton DE_Save;
    private javax.swing.JButton DE_ShAdd;
    private javax.swing.JButton DE_ShClear;
    private javax.swing.JButton DE_ShRemove;
    private static javax.swing.JTable DE_ShTable;
    private javax.swing.JPanel DE_Shifts;
    private javax.swing.JTextField DE_contact;
    private javax.swing.JTextField DE_email;
    private javax.swing.JPanel DE_infopanel;
    private javax.swing.JTextField DE_qual;
    private javax.swing.JTextField DE_work;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */
    public static String passid;
    

}
