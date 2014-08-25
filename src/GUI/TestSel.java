
package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import mrms.SetFormat;
import mrms.investigation;

public class TestSel extends javax.swing.JFrame {

    investigation inv = new investigation();
    DefaultListModel model = new DefaultListModel();
    DefaultListModel model2 = new DefaultListModel();
    boolean rep ;
    String RepNo;
    
    public TestSel() {
        initialize();
        inv.fillCat2();
    }
    
    public TestSel(String pcode, String SelTest, boolean report, String rn){
        initialize();
        rep = report;
        RepNo = rn;
        TS_code.setText(pcode);
        if(ReportGUI.NoOfTest != 0) {
            addModel(SelTest.split("::"));
        }
        inv.fillCat2();
    }
    
    public TestSel(String pcode){
        new TestSel(pcode,"",false,"1");
    }
    
    public TestSel(String pcode, String SelTest){
        new TestSel(pcode,SelTest,false,"1");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TS_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TS_listChoose = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        TS_listSel = new javax.swing.JList();
        TS_inBN = new javax.swing.JButton();
        TS_outBN = new javax.swing.JButton();
        TS_Cancel = new javax.swing.JButton();
        TS_OK = new javax.swing.JButton();
        TS_Cat = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        TS_code = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select Investigations");
        setResizable(false);

        TS_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Investigations"));

        jScrollPane1.setViewportView(TS_listChoose);

        jScrollPane2.setViewportView(TS_listSel);

        TS_inBN.setText(">>");
        TS_inBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TS_inBNActionPerformed(evt);
            }
        });

        TS_outBN.setText("<<");
        TS_outBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TS_outBNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TS_panelLayout = new javax.swing.GroupLayout(TS_panel);
        TS_panel.setLayout(TS_panelLayout);
        TS_panelLayout.setHorizontalGroup(
            TS_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TS_panelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TS_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TS_inBN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TS_outBN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TS_panelLayout.setVerticalGroup(
            TS_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
            .addGroup(TS_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TS_inBN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TS_outBN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TS_Cancel.setText("Cancel");
        TS_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TS_CancelActionPerformed(evt);
            }
        });

        TS_OK.setText("OK");
        TS_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TS_OKActionPerformed(evt);
            }
        });

        TS_Cat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dep" }));
        TS_Cat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TS_CatItemStateChanged(evt);
            }
        });

        jLabel2.setText("Code :");

        TS_code.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TS_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TS_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TS_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TS_code, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TS_Cat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TS_Cancel, TS_OK});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TS_Cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TS_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(TS_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TS_OK)
                    .addComponent(TS_Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TS_inBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TS_inBNActionPerformed
        move(TS_listChoose);
    }//GEN-LAST:event_TS_inBNActionPerformed

    private void TS_outBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TS_outBNActionPerformed
        remove();
    }//GEN-LAST:event_TS_outBNActionPerformed

    private void TS_CatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TS_CatItemStateChanged
        fill();
    }//GEN-LAST:event_TS_CatItemStateChanged

    private void TS_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TS_OKActionPerformed
//        if(model2.isEmpty()){
//            this.dispose();
//        } 
//        else {
            saveData();
            this.dispose();
            if(rep) new ReportGUI(TS_code.getText(), RepNo);
//        }
    }//GEN-LAST:event_TS_OKActionPerformed

    private void TS_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TS_CancelActionPerformed
        this.dispose();       
        if(rep) new ReportGUI(TS_code.getText(), RepNo);
    }//GEN-LAST:event_TS_CancelActionPerformed

    void saveData(){
        String selected;
        // Get to report
        ReportGUI.NoOfTest = model2.size();
        if(ReportGUI.NoOfTest != 0){
            selected = SetFormat.setStyle(model2);
        }
        else selected = "";
        ReportGUI.SelectedTest = selected;
        //JOptionPane.showMessageDialog(rootPane,selected);
    }
    
    void remove(){
        int i = TS_listSel.getSelectedIndex();
        if(i >= 0){
            model2.removeElementAt(i);
            refreshLists();
            fill();
        }
    }
    
    void move(JList l){
        JList in = l;
        DefaultListModel mi ,mo;
        if(l.equals(TS_listChoose)){
            mi = model;
            mo = model2;
        }
        else{
            mi = model2;
            mo = model;
        }
        int i = in.getSelectedIndex();
        if(i >= 0){
            //JOptionPane.showMessageDialog(rootPane, SS_list1.getSelectedIndex());
            mo.addElement(mi.getElementAt(i));
            mi.removeElementAt(i);
            refreshLists();
        }
    }
    
    void refreshLists(){
        TS_listChoose.setModel(model);
        TS_listSel.setModel(model2);
    }
    
    void doubleClick(){
        MLlist1();
        MLlist2();
    }
    
    public void MLlist1(){
        TS_listChoose.addMouseListener(new MouseAdapter() { 
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    move(TS_listChoose);
                }
            }
       
        });
    }
    
    public void MLlist2(){
        TS_listSel.addMouseListener(new MouseAdapter() { 
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    remove();
                }
            }
       
        });
    }
    
    /**
     * Checks if tests are already selected
     */
    void checkSame(){
        boolean search = true;
        for(int i = 0; i < model.size();i++){
            for(int j = 0; (j < model2.size()) && search; j++){
                if(model.getElementAt(i).toString().equals(model2.getElementAt(j).toString())){
                    model.removeElementAt(i);
                    i--;
                    search = false;
                }
            }
            search = true;
        }
    }
    
    /**
     * Fills the tests according to selected cat
     */
    void fill(){
        if(!inv.fillTest(model,TS_Cat.getSelectedItem().toString())){
            dispose();
            JOptionPane.showMessageDialog(null, "No Investigations in the system !", "Tests Missing", JOptionPane.ERROR_MESSAGE);
            if(JOptionPane.showConfirmDialog(null, "Add Investigations?") == 0){
                new TestEntry();
                this.dispose();
            }
        }
        checkSame();
        refreshLists();
    }
    
    /*
    void makeBoxes(){
        test = new JCheckBox[NoOfTests];
        for(int i = 0; i < NoOfTests; i++){
            test[i] = new JCheckBox();
            test[i].setText(testname[i]);
            test[i].setSize(120, 23);
            test[i].setMargin(new java.awt.Insets(2, 2, 2, 2));
            if(i == 0) test[i].setLocation(5 + 125*i, 10);
            else test[i].setLocation(125*i, 10);
            test[i].setVisible(true);
            testPanel.add(test[i]);
        }
        testPanel.setPreferredSize(testPanel.getPreferredSize());
        testPanel.repaint();
        testPanel.validate();
    }
  //*/  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TS_Cancel;
    public static javax.swing.JComboBox TS_Cat;
    private javax.swing.JButton TS_OK;
    private javax.swing.JTextField TS_code;
    private javax.swing.JButton TS_inBN;
    private javax.swing.JList TS_listChoose;
    private javax.swing.JList TS_listSel;
    private javax.swing.JButton TS_outBN;
    private javax.swing.JPanel TS_panel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void initialize() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        doubleClick();
    }

    private void addModel(String[] split) {
        model2.removeAllElements();
        for(int i =0; i<split.length; i++){
            model2.addElement(split[i]);
        }
    }
}
