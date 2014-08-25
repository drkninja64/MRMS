
package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import mrms.SetFormat;
import mrms.TestType;
import mrms.investigation;

public class TestEntry extends javax.swing.JFrame {

    investigation inv = new investigation();
    public static String TE_sam;
    boolean edit_window = false;
    boolean editing, subj = false;
    String OldName;
    
    public TestEntry(int a){}
    public TestEntry(String name){
            initialize();
            TestType.fillCat();
            TE_edit.setVisible(true);
            edit_window = true;
            fillData(name);
            modeEdit(false);
    }
    
    public TestEntry() {
        initialize();
        TE_sam = "";
        TE_edit.setVisible(false);
        TE_genCHK.doClick();
        checkRange();
        chkID();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenSexBG = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TE_id = new javax.swing.JTextField();
        TE_Name = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        TE_unit1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TE_spRange = new javax.swing.JTextArea();
        TE_unit2 = new javax.swing.JTextField();
        TE_unit3 = new javax.swing.JTextField();
        TE_unit4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TE_genCHK = new javax.swing.JCheckBox();
        TE_sexCHK = new javax.swing.JCheckBox();
        TE_chlCHK = new javax.swing.JCheckBox();
        TE_spCHK = new javax.swing.JCheckBox();
        TE_femLabel = new javax.swing.JLabel();
        TE_genL = new javax.swing.JFormattedTextField();
        TE_maleL = new javax.swing.JFormattedTextField();
        TE_femL = new javax.swing.JFormattedTextField();
        TE_chlL = new javax.swing.JFormattedTextField();
        TE_chlU = new javax.swing.JFormattedTextField();
        TE_femU = new javax.swing.JFormattedTextField();
        TE_genU = new javax.swing.JFormattedTextField();
        TE_maleU = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TE_SubCHK = new javax.swing.JCheckBox();
        TE_Cancel = new javax.swing.JButton();
        TE_save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TE_Cat = new javax.swing.JComboBox();
        TE_sample = new javax.swing.JButton();
        TE_price = new javax.swing.JFormattedTextField();
        TE_edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Investigation Entry");
        setResizable(false);

        jLabel1.setText("ID :");

        jLabel2.setText("Name :");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ranges"));

        TE_unit1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TE_unit1KeyReleased(evt);
            }
        });

        TE_spRange.setColumns(20);
        TE_spRange.setRows(5);
        jScrollPane1.setViewportView(TE_spRange);

        TE_unit2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TE_unit2KeyReleased(evt);
            }
        });

        TE_unit3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TE_unit3KeyReleased(evt);
            }
        });

        TE_unit4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TE_unit4KeyReleased(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Lower");

        GenSexBG.add(TE_genCHK);
        TE_genCHK.setText("General :");
        TE_genCHK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TE_genCHKMouseReleased(evt);
            }
        });

        GenSexBG.add(TE_sexCHK);
        TE_sexCHK.setText("Male :");
        TE_sexCHK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TE_sexCHKMouseReleased(evt);
            }
        });

        TE_chlCHK.setText("Children :");
        TE_chlCHK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TE_chlCHKMouseReleased(evt);
            }
        });

        TE_spCHK.setText("Special :");
        TE_spCHK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TE_spCHKMouseReleased(evt);
            }
        });

        TE_femLabel.setText("Female :");

        TE_genL.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.###"))));

        TE_maleL.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.###"))));

        TE_femL.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.###"))));

        TE_chlL.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.###"))));

        TE_chlU.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.###"))));

        TE_femU.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.###"))));

        TE_genU.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.###"))));

        TE_maleU.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.###"))));

        jLabel7.setText("-");

        jLabel12.setText("-");

        jLabel16.setText("-");

        jLabel17.setText("-");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Upper");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Unit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TE_genCHK)
                    .addComponent(TE_sexCHK)
                    .addComponent(TE_chlCHK)
                    .addComponent(TE_spCHK)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(TE_femLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TE_maleL, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TE_femL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TE_chlL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TE_genL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TE_genU))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TE_chlU))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TE_femU, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TE_maleU)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TE_unit4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(TE_unit3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(TE_unit2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(TE_unit1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))))
                        .addGap(0, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TE_chlL, TE_chlU, TE_femL, TE_femU, TE_genL, TE_genU, TE_maleL, TE_maleU});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TE_unit1, TE_unit2, TE_unit3, TE_unit4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TE_genCHK)
                            .addComponent(TE_genL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(TE_genU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TE_sexCHK)
                            .addComponent(TE_maleL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(TE_maleU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TE_femLabel)
                            .addComponent(TE_femL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(TE_femU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TE_chlCHK)
                            .addComponent(TE_chlL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(TE_chlU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TE_unit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TE_unit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TE_unit3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TE_unit4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TE_spCHK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TE_SubCHK.setText("Subjective");
        TE_SubCHK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TE_SubCHKMouseReleased(evt);
            }
        });

        TE_Cancel.setText("Cancel");
        TE_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE_CancelActionPerformed(evt);
            }
        });

        TE_save.setText("Save");
        TE_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE_saveActionPerformed(evt);
            }
        });

        jLabel3.setText("Price :");

        jLabel4.setText("Department :");

        TE_Cat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Department" }));
        TE_Cat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TE_CatItemStateChanged(evt);
            }
        });

        TE_sample.setText("Samples");
        TE_sample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE_sampleActionPerformed(evt);
            }
        });

        TE_price.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.###"))));

        TE_edit.setText("Edit");
        TE_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TE_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TE_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TE_Cancel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TE_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(TE_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TE_price))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TE_SubCHK))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TE_Cat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TE_sample, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(10, 10, 10))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TE_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TE_Cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TE_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TE_sample))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TE_SubCHK)
                    .addComponent(jLabel3)
                    .addComponent(TE_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TE_Cancel)
                    .addComponent(TE_save)
                    .addComponent(TE_edit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TE_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE_saveActionPerformed
        if(filled()) {
            saveData();
        }
    }//GEN-LAST:event_TE_saveActionPerformed

    private void TE_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_TE_CancelActionPerformed

    private void TE_unit2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TE_unit2KeyReleased
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) TE_chlCHK.requestFocusInWindow();
        else syncUnit(TE_unit2.getText());
    }//GEN-LAST:event_TE_unit2KeyReleased

    private void TE_unit3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TE_unit3KeyReleased
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) TE_chlCHK.requestFocusInWindow();
        else syncUnit(TE_unit3.getText());
    }//GEN-LAST:event_TE_unit3KeyReleased

    private void TE_genCHKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TE_genCHKMouseReleased
        checkRange();
    }//GEN-LAST:event_TE_genCHKMouseReleased

    private void TE_sexCHKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TE_sexCHKMouseReleased
        checkRange();
    }//GEN-LAST:event_TE_sexCHKMouseReleased

    private void TE_chlCHKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TE_chlCHKMouseReleased
        checkRange();
    }//GEN-LAST:event_TE_chlCHKMouseReleased

    private void TE_spCHKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TE_spCHKMouseReleased
        checkRange();
    }//GEN-LAST:event_TE_spCHKMouseReleased

    private void TE_SubCHKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TE_SubCHKMouseReleased
        boolean a;
        if(TE_SubCHK.isSelected()) a = false;
        else a = true;
        TE_genCHK.setEnabled(a);
        TE_chlCHK.setEnabled(a);
        TE_sexCHK.setEnabled(a);
        TE_spCHK.setEnabled(a);
        TE_femLabel.setEnabled(a);
        checkRange();
    }//GEN-LAST:event_TE_SubCHKMouseReleased

    private void TE_sampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE_sampleActionPerformed
        new SampleSel();    
    }//GEN-LAST:event_TE_sampleActionPerformed

    private void TE_CatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TE_CatItemStateChanged
        if(!edit_window) chkID();
    }//GEN-LAST:event_TE_CatItemStateChanged

    private void TE_unit1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TE_unit1KeyReleased
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) TE_chlCHK.requestFocusInWindow();
        else syncUnit(TE_unit1.getText());
    }//GEN-LAST:event_TE_unit1KeyReleased

    private void TE_unit4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TE_unit4KeyReleased
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) TE_spCHK.requestFocusInWindow();
        else syncUnit(TE_unit4.getText());
    }//GEN-LAST:event_TE_unit4KeyReleased

    private void TE_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE_editActionPerformed
        modeEdit(true);
    }//GEN-LAST:event_TE_editActionPerformed

    void initialize(){
        initComponents();
        TE_id.setEditable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        if(!inv.fillCat()) noCat();
    }
    
    void modeEdit(boolean state){
        boolean rstate = !subj && state;
        editing = state;
        TE_SubCHK.setEnabled(false);
        TE_genCHK.setEnabled(rstate);
        TE_chlCHK.setEnabled(rstate);
        TE_sexCHK.setEnabled(rstate);
        TE_spCHK.setEnabled(rstate);
        checkRange();
        TE_femLabel.setEnabled(rstate);
        TE_Name.setEnabled(state);
        TE_price.setEnabled(state);
        TE_id.setEnabled(state);
        TE_save.setEnabled(state);
        TE_sample.setEnabled(state);
        TE_edit.setEnabled(!state);
        TE_Cat.setEnabled(false);
    }
    
    void fillData(String name){
        String[] x;
        TestType t = new TestType(name);
        subj = (t.subj == 1);
        TE_id.setText(Integer.toString(t.Tno));
        TE_Cat.setSelectedItem(t.cname);
        OldName = t.tname;
        TE_Name.setText(t.tname);
        TE_sam = t.Sample;
        TE_SubCHK.setSelected(subj);
        TE_price.setText(Float.toString(t.price));
        if (!subj){
            syncUnit(t.Unit);
            if(!t.general.isEmpty()){
                x = SetFormat.getStyle(t.general);
                TE_genL.setText(x[0]); 
                TE_genU.setText(x[1]);
                TE_genCHK.setSelected(true);
            }
            if(!t.male.isEmpty()){
                x = SetFormat.getStyle(t.male);
                TE_maleL.setText(x[0]); 
                TE_maleU.setText(x[1]);
                TE_sexCHK.setSelected(true);
            }
            if(!t.female.isEmpty()){
                x = SetFormat.getStyle(t.female);
                TE_femL.setText(x[0]); 
                TE_femU.setText(x[1]);
            }
            if(!t.child.isEmpty()){
                x = SetFormat.getStyle(t.child);
                TE_chlL.setText(x[0]); 
                TE_chlU.setText(x[1]);
                TE_chlCHK.setSelected(true);
            }
            if(!t.special.isEmpty()){
                TE_spRange.setText(t.special);
                TE_spCHK.setSelected(true);
            }
        }
    }
    
    void saveData(){
        int Tno = Integer.parseInt(TE_id.getText());
        int Cno = inv.getCNo(TE_Cat.getSelectedItem().toString());
        float price = Float.parseFloat(TE_price.getText());
        int subj = 0;
        String Name, general="", male="", female="", child="", special="", Unit="", Sample;
        Name = TE_Name.getText();
        Sample = TE_sam;
        if(edit_window){
            if(TE_SubCHK.isSelected()){
                subj = 1;
                if(inv.updateInvestigation(Tno, Cno, OldName, Name, price, Sample, subj)){
                    this.dispose();
                    return;
                }
            }
            else{
                if(TE_genCHK.isSelected()){
                    general = SetFormat.setStyle(TE_genL.getText(),TE_genU.getText());
                }
                else if(TE_sexCHK.isSelected()){
                    male = SetFormat.setStyle(TE_maleL.getText(), TE_maleU.getText());
                    female = SetFormat.setStyle(TE_femL.getText(), TE_femU.getText());
                }
                if(TE_chlCHK.isSelected()) child = SetFormat.setStyle(TE_chlL.getText(),TE_chlU.getText());
                if(TE_spCHK.isSelected()) special = TE_spRange.getText();
                Unit = TE_unit1.getText();
                if(inv.updateInvestigation(Tno, Cno, OldName, Name, price, general, male, female, child, special, Unit, Sample, subj)){
                    this.dispose();
                    return;
                }
            }
        } 
        else {
            if(TE_SubCHK.isSelected()){
                subj = 1;
                if(inv.saveInvestigation(Tno, Cno, Name, price, Sample, subj)){
                    this.dispose();
                    return;
                }
            }
            else{
                if(TE_genCHK.isSelected()){
                    general = SetFormat.setStyle(TE_genL.getText(),TE_genU.getText());
                }
                else if(TE_sexCHK.isSelected()){
                    male = SetFormat.setStyle(TE_maleL.getText(), TE_maleU.getText());
                    female = SetFormat.setStyle(TE_femL.getText(), TE_femU.getText());
                }
                if(TE_chlCHK.isSelected()) child = SetFormat.setStyle(TE_chlL.getText(),TE_chlU.getText());
                if(TE_spCHK.isSelected()) special = TE_spRange.getText();
                Unit = TE_unit1.getText();
                if(inv.saveInvestigation(Tno, Cno, Name, price, general, male, female, child, special, Unit, Sample, subj)){
                    this.dispose();
                    return;
                }
            }
        }
    }
    
    boolean filled(){
        boolean res = false;
        int i = 0;
        String msg = "The following fields are required :";
        if(TE_Name.getText().equals("")){ 
            msg = msg + "\nName";
            i++;
        }
        if(TE_price.getText().equals("")){ 
            msg = msg + "\nPrice";
            i++;
        }
        if(TE_sam.equals("")) {
            msg = msg + "\nSamples";
            i++;
        }
        if(!TE_SubCHK.isSelected()){
            if(TE_genCHK.isSelected() && (TE_genL.getText().equals("") || TE_genU.getText().equals(""))){ 
                msg = msg + "\nGeneral Range";
                i++;
            }
            if(TE_sexCHK.isSelected() && (TE_maleL.getText().equals("") || TE_maleU.getText().equals("")
                    || TE_femU.getText().equals("") || TE_femL.getText().equals(""))){ 
                msg = msg + "\nMale / Female Range";
                i++;
            }
            if(TE_chlCHK.isSelected() && (TE_chlL.getText().equals("") || TE_chlU.getText().equals(""))){ 
                msg = msg + "\nChild Range";
                i++;
            }
            if(TE_spCHK.isSelected() && TE_spRange.getText().equals("")){ 
                msg = msg + "\nSpecial Range";
                i++;
            }
                if(TE_unit1.getText().equals("")){
                msg = msg + "\nUnit of range";
                i++;
            }
        }
        
        if(i>0){
            JOptionPane.showMessageDialog(rootPane,
                    msg,
                    "Empty Field",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else return true;
    }
    
    void chkID(){
        String idno = inv.getCountInv(TE_Cat.getSelectedItem().toString());
        TE_id.setText(idno); 
    }
    
    void noCat(){
            this.dispose();
            JOptionPane.showMessageDialog(null, "No Departments in the system !", "Departments Missing", JOptionPane.ERROR_MESSAGE);
            if(JOptionPane.showConfirmDialog(null, "Add Departments?") == 0){
                new CatEntry();
            }
    }
    
    private void syncUnit(String a){
        TE_unit1.setText(a);
        TE_unit2.setText(a);
        TE_unit3.setText(a);
        TE_unit4.setText(a);
    }
    
    private void checkRange(){
        if(TE_genCHK.isSelected() && TE_genCHK.isEnabled()){
            TE_genL.setEnabled(true);
            TE_genU.setEnabled(true);
            TE_unit1.setEnabled(true);
        }
        else{
            TE_genL.setEnabled(false);
            TE_genU.setEnabled(false);
            TE_unit1.setEnabled(false);
        }
        if(TE_sexCHK.isSelected() && TE_sexCHK.isEnabled()){
            TE_maleL.setEnabled(true);
            TE_maleU.setEnabled(true);
            TE_unit2.setEnabled(true);
            TE_femL.setEnabled(true);
            TE_femU.setEnabled(true);
            TE_unit3.setEnabled(true); 
            TE_femLabel.setEnabled(true);
        }
        else{
            TE_maleL.setEnabled(false);
            TE_maleU.setEnabled(false);
            TE_unit2.setEnabled(false);
            TE_femL.setEnabled(false);
            TE_femU.setEnabled(false);
            TE_unit3.setEnabled(false); 
            TE_femLabel.setEnabled(false);
        }
        if(TE_chlCHK.isSelected() && TE_chlCHK.isEnabled()){
            TE_chlL.setEnabled(true);
            TE_chlU.setEnabled(true);
            TE_unit4.setEnabled(true);
        } 
        else{
            TE_chlL.setEnabled(false);
            TE_chlU.setEnabled(false);
            TE_unit4.setEnabled(false);
        } 
        if(TE_spCHK.isSelected() && TE_spCHK.isEnabled()) TE_spRange.setEnabled(true);
        else TE_spRange.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GenSexBG;
    private javax.swing.JButton TE_Cancel;
    public static javax.swing.JComboBox TE_Cat;
    private javax.swing.JTextField TE_Name;
    private javax.swing.JCheckBox TE_SubCHK;
    private javax.swing.JCheckBox TE_chlCHK;
    private javax.swing.JFormattedTextField TE_chlL;
    private javax.swing.JFormattedTextField TE_chlU;
    private javax.swing.JButton TE_edit;
    private javax.swing.JFormattedTextField TE_femL;
    private javax.swing.JLabel TE_femLabel;
    private javax.swing.JFormattedTextField TE_femU;
    private javax.swing.JCheckBox TE_genCHK;
    private javax.swing.JFormattedTextField TE_genL;
    private javax.swing.JFormattedTextField TE_genU;
    private javax.swing.JTextField TE_id;
    private javax.swing.JFormattedTextField TE_maleL;
    private javax.swing.JFormattedTextField TE_maleU;
    private javax.swing.JFormattedTextField TE_price;
    private javax.swing.JButton TE_sample;
    private javax.swing.JButton TE_save;
    private javax.swing.JCheckBox TE_sexCHK;
    private javax.swing.JCheckBox TE_spCHK;
    private javax.swing.JTextArea TE_spRange;
    private javax.swing.JTextField TE_unit1;
    private javax.swing.JTextField TE_unit2;
    private javax.swing.JTextField TE_unit3;
    private javax.swing.JTextField TE_unit4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
