/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import mrms.Patient;


/**
 *
 * @author lovelyruchi
 */
public class PatientEntry extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    Patient p = new Patient();
    int gender = 1;
    /**
     * Creates new form PatientEntry
     */
    public PatientEntry() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setCode();
        conn=mrms.Sql_connection.connecrDb();
        fillDoc();
        PE_MaleB.setSelected(true);
        PE_PFName.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PE_SexSet = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        PE_Code = new javax.swing.JTextField();
        PE_sepa = new javax.swing.JSeparator();
        PE_infoPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        LNlabel = new javax.swing.JLabel();
        FNlabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Agelabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PE_MaleB = new javax.swing.JRadioButton();
        PE_FemaleB = new javax.swing.JRadioButton();
        PE_PFName = new javax.swing.JTextField();
        PE_PMName = new javax.swing.JTextField();
        PE_PLName = new javax.swing.JTextField();
        PE_PEmail = new javax.swing.JTextField();
        PE_Age = new javax.swing.JTextField();
        PE_ContactNo = new javax.swing.JTextField();
        PE_SelectTests = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        PE_Reports = new javax.swing.JPanel();
        PE_RepAdd = new javax.swing.JButton();
        PE_RepEdit = new javax.swing.JButton();
        PE_RepDel = new javax.swing.JButton();
        PE_RepSearchBox = new javax.swing.JTextField();
        PE_RepSearchBN = new javax.swing.JButton();
        PE_RTScroll = new javax.swing.JScrollPane();
        PE_ReportTable = new javax.swing.JTable();
        PE_Save = new javax.swing.JButton();
        PE_Cancel = new javax.swing.JButton();
        PE_DoctorBox = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PE_DList = new javax.swing.JComboBox();
        PE_DQual = new javax.swing.JTextField();
        PE_AppointBN = new javax.swing.JButton();
        PE_docShift = new javax.swing.JLabel();
        PE_SamplePNL = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        PE_SamplesBN = new javax.swing.JButton();
        PE_NewBN = new javax.swing.JButton();
        PE_ExistBN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Entry");
        setResizable(false);

        jLabel1.setText("Code :");

        PE_Code.setEditable(false);
        PE_Code.setToolTipText("Paient Code");

        PE_infoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));

        jLabel3.setText("Middle  Name :");

        LNlabel.setText("Last  Name :");

        FNlabel.setText("First Name :");

        jLabel8.setText("Email :");

        jLabel5.setText("Sex :");

        Agelabel.setText("Age :");

        jLabel7.setText("Contact no :");

        PE_SexSet.add(PE_MaleB);
        PE_MaleB.setText("M");
        PE_MaleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PE_MaleBActionPerformed(evt);
            }
        });

        PE_SexSet.add(PE_FemaleB);
        PE_FemaleB.setText("F");
        PE_FemaleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PE_FemaleBActionPerformed(evt);
            }
        });

        PE_Age.setToolTipText("Patient's Age");

        PE_ContactNo.setToolTipText("Patient's Age");

        javax.swing.GroupLayout PE_infoPanelLayout = new javax.swing.GroupLayout(PE_infoPanel);
        PE_infoPanel.setLayout(PE_infoPanelLayout);
        PE_infoPanelLayout.setHorizontalGroup(
            PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_infoPanelLayout.createSequentialGroup()
                .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PE_infoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PE_infoPanelLayout.createSequentialGroup()
                                .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(FNlabel)
                                    .addComponent(LNlabel)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PE_ContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PE_PLName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PE_PMName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PE_PFName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PE_PEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PE_infoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(PE_MaleB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PE_FemaleB)
                                .addGap(18, 18, 18)
                                .addComponent(Agelabel)
                                .addGap(18, 18, 18)
                                .addComponent(PE_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PE_infoPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PE_infoPanelLayout.setVerticalGroup(
            PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PE_PFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FNlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PE_PMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PE_PLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PE_MaleB)
                    .addComponent(PE_FemaleB)
                    .addComponent(PE_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agelabel)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PE_ContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(PE_PEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PE_infoPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {PE_PFName, PE_PLName, PE_PMName});

        PE_SelectTests.setBorder(javax.swing.BorderFactory.createTitledBorder("Test Reports"));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Biochemistry", "Haematology" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout PE_SelectTestsLayout = new javax.swing.GroupLayout(PE_SelectTests);
        PE_SelectTests.setLayout(PE_SelectTestsLayout);
        PE_SelectTestsLayout.setHorizontalGroup(
            PE_SelectTestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_SelectTestsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        PE_SelectTestsLayout.setVerticalGroup(
            PE_SelectTestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_SelectTestsLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        PE_Reports.setBorder(javax.swing.BorderFactory.createTitledBorder("Report List"));

        PE_RepAdd.setText("Add");

        PE_RepEdit.setText("Edit");

        PE_RepDel.setText("Delete");

        PE_RepSearchBox.setText("Days");

        PE_RepSearchBN.setText("Search");

        PE_ReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "S.No.", "Date", "Selected Investigations"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PE_RTScroll.setViewportView(PE_ReportTable);
        if (PE_ReportTable.getColumnModel().getColumnCount() > 0) {
            PE_ReportTable.getColumnModel().getColumn(0).setResizable(false);
            PE_ReportTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout PE_ReportsLayout = new javax.swing.GroupLayout(PE_Reports);
        PE_Reports.setLayout(PE_ReportsLayout);
        PE_ReportsLayout.setHorizontalGroup(
            PE_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_ReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PE_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PE_RTScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                    .addGroup(PE_ReportsLayout.createSequentialGroup()
                        .addComponent(PE_RepAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PE_RepEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PE_RepDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PE_RepSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PE_RepSearchBN)))
                .addContainerGap())
        );
        PE_ReportsLayout.setVerticalGroup(
            PE_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_ReportsLayout.createSequentialGroup()
                .addGroup(PE_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PE_RepAdd)
                    .addComponent(PE_RepEdit)
                    .addComponent(PE_RepDel)
                    .addComponent(PE_RepSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PE_RepSearchBN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PE_RTScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PE_Save.setText("Save");
        PE_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PE_SaveActionPerformed(evt);
            }
        });

        PE_Cancel.setText("Cancel");
        PE_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PE_CancelActionPerformed(evt);
            }
        });

        PE_DoctorBox.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setText("Qualifications :");

        jLabel9.setText("Treating Doctor :");

        PE_DList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PE_DListItemStateChanged(evt);
            }
        });

        PE_DQual.setEditable(false);

        PE_AppointBN.setText("Appointments");
        PE_AppointBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PE_AppointBNActionPerformed(evt);
            }
        });

        PE_docShift.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PE_docShift.setText("Shift data");

        javax.swing.GroupLayout PE_DoctorBoxLayout = new javax.swing.GroupLayout(PE_DoctorBox);
        PE_DoctorBox.setLayout(PE_DoctorBoxLayout);
        PE_DoctorBoxLayout.setHorizontalGroup(
            PE_DoctorBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_DoctorBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PE_DoctorBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PE_DoctorBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PE_DQual, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PE_DList, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PE_DoctorBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PE_AppointBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PE_docShift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PE_DoctorBoxLayout.setVerticalGroup(
            PE_DoctorBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_DoctorBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PE_DoctorBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PE_DList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(PE_docShift))
                .addGap(14, 14, 14)
                .addGroup(PE_DoctorBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PE_DQual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(PE_AppointBN))
                .addContainerGap())
        );

        PE_SamplePNL.setBorder(javax.swing.BorderFactory.createTitledBorder("Sample"));

        jLabel11.setText("Collected / not collected");

        PE_SamplesBN.setText("Samples Required");

        javax.swing.GroupLayout PE_SamplePNLLayout = new javax.swing.GroupLayout(PE_SamplePNL);
        PE_SamplePNL.setLayout(PE_SamplePNLLayout);
        PE_SamplePNLLayout.setHorizontalGroup(
            PE_SamplePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_SamplePNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PE_SamplePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(PE_SamplesBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PE_SamplePNLLayout.setVerticalGroup(
            PE_SamplePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_SamplePNLLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(PE_SamplesBN)
                .addContainerGap())
        );

        PE_NewBN.setText("New");

        PE_ExistBN.setText("Existing");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PE_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PE_NewBN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(PE_ExistBN)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(PE_infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PE_SelectTests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(PE_sepa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PE_Reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PE_DoctorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PE_SamplePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PE_Save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PE_Cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PE_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PE_NewBN)
                    .addComponent(PE_ExistBN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PE_sepa, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PE_infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PE_SelectTests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PE_SamplePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PE_DoctorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PE_Save)
                        .addGap(18, 18, 18)
                        .addComponent(PE_Cancel)
                        .addGap(10, 10, 10)))
                .addGap(26, 26, 26)
                .addComponent(PE_Reports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {PE_SelectTests, PE_infoPanel});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PE_DListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PE_DListItemStateChanged
        setDoc();
    }//GEN-LAST:event_PE_DListItemStateChanged

    private void PE_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PE_SaveActionPerformed
        saveData();
    }//GEN-LAST:event_PE_SaveActionPerformed

    private void PE_MaleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PE_MaleBActionPerformed
        gender=1;
    }//GEN-LAST:event_PE_MaleBActionPerformed

    private void PE_FemaleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PE_FemaleBActionPerformed
        gender=0;
    }//GEN-LAST:event_PE_FemaleBActionPerformed

    private void PE_AppointBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PE_AppointBNActionPerformed
        new ApntGUI(PE_Code.getText(), PE_DList.getSelectedItem().toString());
    }//GEN-LAST:event_PE_AppointBNActionPerformed

    private void PE_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PE_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PE_CancelActionPerformed

    /**
     * Save Data
     */
    public void saveData(){
        String code=PE_Code.getText();
        String fname=PE_PFName.getText();
        String mname=PE_PMName.getText();
        String lname=PE_PLName.getText();
        String age=PE_Age.getText();
        String contact=PE_ContactNo.getText();
        String email=PE_PEmail.getText();
        String doct=(PE_DList.getSelectedItem()).toString();
        String msg = "The following fields are required :\n";
        boolean error = false;
        if(fname.isEmpty()){
            msg = msg + "First Name\n";
            FNlabel.setForeground(new java.awt.Color(255, 51, 51));
            error = true;
        }
        if(lname.isEmpty()){
            msg = msg + "Last Name\n";
            LNlabel.setForeground(new java.awt.Color(255, 51, 51));
            error = true;
        }
        if(age.isEmpty()){
            msg = msg + "Age\n";
            Agelabel.setForeground(new java.awt.Color(255, 51, 51));
            error = true;
        }
        if(error) {
            JOptionPane.showMessageDialog(null,msg,"Invalid Entry",JOptionPane.ERROR_MESSAGE);
            
            Agelabel.setForeground(new java.awt.Color(0, 0, 0));
            FNlabel.setForeground(new java.awt.Color(0, 0, 0));
            LNlabel.setForeground(new java.awt.Color(0, 0, 0));
        }
        else {
            if(p.patient_entry(code,fname,mname,lname,gender,age,contact,email,doct))
                this.dispose();
        }
    }
    
    public void setDoc(){
        String set = PE_DList.getSelectedItem().toString();
        Patient p= new Patient();
        int shFlag = p.setQual(PE_DQual,set);
        if(shFlag == 1){
            PE_docShift.setText("Has Shifts");
            PE_AppointBN.setEnabled(true);
        }
        else{
            PE_docShift.setText("No Shifts");
            PE_AppointBN.setEnabled(false);
        }
    }
    
    public static void patientEGUI(){
        
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
            @Override
            public void run() {
                new PatientEntry().setVisible(true);
            }
        });
    }
    
    //Sets Code
    public void setCode(){
        PE_Code.setText(p.newCode());
    }
    
    //Fills Combo Box with doc names
    public void fillDoc(){
        try{
            String sql="Select * from doctor";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
            String name=rs.getString("DName");
               PE_DList.addItem(name);
            }
        }
        catch(SQLException e){}
        finally{
            try{
            rs.close();
            pst.close();
            }
            catch(SQLException e){}
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agelabel;
    private javax.swing.JLabel FNlabel;
    private javax.swing.JLabel LNlabel;
    private javax.swing.JTextField PE_Age;
    private javax.swing.JButton PE_AppointBN;
    private javax.swing.JButton PE_Cancel;
    private javax.swing.JTextField PE_Code;
    private javax.swing.JTextField PE_ContactNo;
    private javax.swing.JComboBox PE_DList;
    private javax.swing.JTextField PE_DQual;
    private javax.swing.JPanel PE_DoctorBox;
    private javax.swing.JButton PE_ExistBN;
    private javax.swing.JRadioButton PE_FemaleB;
    private javax.swing.JRadioButton PE_MaleB;
    private javax.swing.JButton PE_NewBN;
    private javax.swing.JTextField PE_PEmail;
    private javax.swing.JTextField PE_PFName;
    private javax.swing.JTextField PE_PLName;
    private javax.swing.JTextField PE_PMName;
    private javax.swing.JScrollPane PE_RTScroll;
    private javax.swing.JButton PE_RepAdd;
    private javax.swing.JButton PE_RepDel;
    private javax.swing.JButton PE_RepEdit;
    private javax.swing.JButton PE_RepSearchBN;
    private javax.swing.JTextField PE_RepSearchBox;
    private javax.swing.JTable PE_ReportTable;
    private javax.swing.JPanel PE_Reports;
    private javax.swing.JPanel PE_SamplePNL;
    private javax.swing.JButton PE_SamplesBN;
    private javax.swing.JButton PE_Save;
    private javax.swing.JPanel PE_SelectTests;
    private javax.swing.ButtonGroup PE_SexSet;
    private javax.swing.JLabel PE_docShift;
    private javax.swing.JPanel PE_infoPanel;
    private javax.swing.JSeparator PE_sepa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
