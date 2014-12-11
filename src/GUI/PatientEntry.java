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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mrms.Patient;


/**
 *
 * @author lovelyruchi
 */
public class PatientEntry extends javax.swing.JFrame {

    static void setTable() {
        
        PE_ReportTable.setModel(new DefaultTableModel(reports,new String[]{"Report No.","Date","Status"}){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false; //all cells false
            }
        });
        PE_ReportTable.setVisible(true);
    }
    
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    Patient p = new Patient();
    int gender = 1;
    public static boolean existing = false;
    public static Object[][] reports = new Object[0][3];
    /**
     * Creates new form PatientEntry
     */
    public PatientEntry() {
        existing = false;
        initialize();
        PE_MaleB.setSelected(true);
        setCode();
        PE_PFName.requestFocusInWindow();
    }
    
    public PatientEntry(String pcode) {
        existing = true;
        initialize();
        PE_PFName.requestFocusInWindow();
        fillData(pcode);
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
        PE_Reports = new javax.swing.JPanel();
        PE_RepAdd = new javax.swing.JButton();
        PE_RepDel = new javax.swing.JButton();
        PE_RepSearchBox = new javax.swing.JTextField();
        PE_RepSearchBN = new javax.swing.JButton();
        PE_RTScroll = new javax.swing.JScrollPane();
        PE_ReportTable = new javax.swing.JTable();
        PE_Print = new javax.swing.JButton();
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
        jLabel2 = new javax.swing.JLabel();
        PE_DateAdded = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Entry");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PE_infoPanelLayout.createSequentialGroup()
                        .addGroup(PE_infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(FNlabel)
                            .addComponent(LNlabel)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
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
                        .addComponent(PE_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        PE_Reports.setBorder(javax.swing.BorderFactory.createTitledBorder("Report List"));

        PE_RepAdd.setText("Add");
        PE_RepAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PE_RepAddActionPerformed(evt);
            }
        });

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
                "S.No.", "Date", "Status"
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

        PE_Print.setText("Print");
        PE_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PE_PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PE_ReportsLayout = new javax.swing.GroupLayout(PE_Reports);
        PE_Reports.setLayout(PE_ReportsLayout);
        PE_ReportsLayout.setHorizontalGroup(
            PE_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_ReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PE_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PE_RTScroll)
                    .addGroup(PE_ReportsLayout.createSequentialGroup()
                        .addComponent(PE_RepAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PE_RepDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PE_Print)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PE_RepSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PE_RepSearchBN)))
                .addContainerGap())
        );

        PE_ReportsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {PE_Print, PE_RepAdd, PE_RepDel});

        PE_ReportsLayout.setVerticalGroup(
            PE_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_ReportsLayout.createSequentialGroup()
                .addGroup(PE_ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PE_RepAdd)
                    .addComponent(PE_RepDel)
                    .addComponent(PE_RepSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PE_RepSearchBN)
                    .addComponent(PE_Print))
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

        PE_DoctorBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Doctor Info"));

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

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Collected / not collected");

        PE_SamplesBN.setText("Samples Required");

        javax.swing.GroupLayout PE_SamplePNLLayout = new javax.swing.GroupLayout(PE_SamplePNL);
        PE_SamplePNL.setLayout(PE_SamplePNLLayout);
        PE_SamplePNLLayout.setHorizontalGroup(
            PE_SamplePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_SamplePNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PE_SamplePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PE_SamplesBN, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PE_SamplePNLLayout.setVerticalGroup(
            PE_SamplePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PE_SamplePNLLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PE_SamplesBN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PE_NewBN.setText("New");
        PE_NewBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PE_NewBNActionPerformed(evt);
            }
        });

        PE_ExistBN.setText("Existing");
        PE_ExistBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PE_ExistBNActionPerformed(evt);
            }
        });

        jLabel2.setText("Date Added :");

        PE_DateAdded.setEditable(false);
        PE_DateAdded.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PE_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PE_DateAdded, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PE_NewBN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PE_ExistBN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PE_sepa)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PE_Reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PE_infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PE_DoctorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PE_SamplePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PE_Cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PE_Save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
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
                    .addComponent(PE_ExistBN)
                    .addComponent(jLabel2)
                    .addComponent(PE_DateAdded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PE_sepa, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PE_DoctorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(PE_Save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PE_Cancel)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PE_SamplePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(PE_infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(PE_Reports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
        this.dispose();
    }//GEN-LAST:event_PE_CancelActionPerformed

    private void PE_RepAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PE_RepAddActionPerformed
        addNewReport();
    }//GEN-LAST:event_PE_RepAddActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        existing = false;
    }//GEN-LAST:event_formWindowClosed

    private void PE_ExistBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PE_ExistBNActionPerformed
        mainPage.PS = new PatientSearch();
        mainPage.PE.dispose();
    }//GEN-LAST:event_PE_ExistBNActionPerformed

    private void PE_NewBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PE_NewBNActionPerformed
        mainPage.PE.dispose();
        mainPage.PE = new PatientEntry();
    }//GEN-LAST:event_PE_NewBNActionPerformed

    private void PE_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PE_PrintActionPerformed
        int x = PE_ReportTable.getSelectedRow();
        if(x!=-1)
        new PrintGUI(PE_Code.getText(),reports[x][0].toString()) ;
    }//GEN-LAST:event_PE_PrintActionPerformed

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
        String date = PE_DateAdded.getText();
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
            if(p.patient_entry(code,fname,mname,lname,gender,age,contact,email,date,doct))
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
        
    //Sets Code
    private void setCode(){
        PE_Code.setText(p.newCode());
    }
    
    //Fills Combo Box with doc names
    private void fillDoc(){
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

    public void doubleClickReport(){
        PE_ReportTable.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                JTable table =(JTable) me.getSource();
                Point p = me.getPoint();
                int row = table.rowAtPoint(p);

                if (me.getClickCount() == 2) {
                    String id=(PE_ReportTable.getValueAt(row, 0)).toString(); 
                    mainPage.RE = new ReportGUI(PE_Code.getText(), id);
                }
            }
        });
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
    private javax.swing.JFormattedTextField PE_DateAdded;
    private javax.swing.JPanel PE_DoctorBox;
    private javax.swing.JButton PE_ExistBN;
    private javax.swing.JRadioButton PE_FemaleB;
    private javax.swing.JRadioButton PE_MaleB;
    private javax.swing.JButton PE_NewBN;
    private javax.swing.JTextField PE_PEmail;
    private javax.swing.JTextField PE_PFName;
    private javax.swing.JTextField PE_PLName;
    private javax.swing.JTextField PE_PMName;
    private javax.swing.JButton PE_Print;
    private javax.swing.JScrollPane PE_RTScroll;
    private javax.swing.JButton PE_RepAdd;
    private javax.swing.JButton PE_RepDel;
    private javax.swing.JButton PE_RepSearchBN;
    private javax.swing.JTextField PE_RepSearchBox;
    public static javax.swing.JTable PE_ReportTable;
    private javax.swing.JPanel PE_Reports;
    private javax.swing.JPanel PE_SamplePNL;
    private javax.swing.JButton PE_SamplesBN;
    private javax.swing.JButton PE_Save;
    private javax.swing.ButtonGroup PE_SexSet;
    private javax.swing.JLabel PE_docShift;
    private javax.swing.JPanel PE_infoPanel;
    private javax.swing.JSeparator PE_sepa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void initialize() {
        initComponents();
        PE_RepAdd.setEnabled(existing);
        PE_Print.setEnabled(existing);
        doubleClickReport();
        PE_RepDel.setVisible(false);
        resetReport();
        PE_DateAdded.setText(new SimpleDateFormat("MMM d, yyyy").format(new Date()));
        setVisible(true);
        setLocationRelativeTo(null);
        conn=mrms.Sql_connection.connecrDb();
        fillDoc();
    }

    private void fillData(String pcode) {
        Patient pt = new Patient();
        pt.getData(pcode);
        PE_Code.setText(pcode);
        PE_PFName.setText(pt.FName);
        PE_PMName.setText(pt.MName);
        PE_PLName.setText(pt.LName);
        PE_Age.setText(pt.age+"");
        if(pt.sex == 1) PE_MaleB.setSelected(true);
        else PE_FemaleB.setSelected(true);
        PE_ContactNo.setText(pt.contact);
        PE_PEmail.setText(pt.email);
        PE_DateAdded.setText(pt.dateAdded);
        PE_DList.setSelectedItem(pt.dname);
        pt.setReports();
        setTable();
    }

    private void addNewReport() {
        int RepNo = p.maxReportNo(Integer.parseInt(PE_Code.getText()));
        RepNo = RepNo + 1;
        ReportGUI.NoOfTest = 0;
        mainPage.RE = new ReportGUI(PE_Code.getText(), Integer.toString(RepNo));
    }

    void resetReport(){
        reports = new Object[0][3];
        setTable();
    }
    
}
