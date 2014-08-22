
package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import mrms.SetFormat;
import mrms.investigation;

public class SampleSel extends javax.swing.JFrame {

    investigation inv = new investigation();
    DefaultListModel model = new DefaultListModel();
    DefaultListModel model2 = new DefaultListModel();
    String name;
    
    public SampleSel(int a){}
    
    public SampleSel() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        fill();
        SS_list1.setModel(model);
        checkSelected();
        MLlist1();
        MLlist2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SS_OK = new javax.swing.JButton();
        SS_Cancel = new javax.swing.JButton();
        SS_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SS_list1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        SS_list2 = new javax.swing.JList();
        SS_inBN = new javax.swing.JButton();
        SS_outBN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Samples");
        setAlwaysOnTop(true);
        setResizable(false);

        SS_OK.setText("OK");
        SS_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SS_OKActionPerformed(evt);
            }
        });

        SS_Cancel.setText("Cancel");
        SS_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SS_CancelActionPerformed(evt);
            }
        });

        SS_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Sample List"));

        jScrollPane1.setViewportView(SS_list1);

        jScrollPane2.setViewportView(SS_list2);

        SS_inBN.setText(">>");
        SS_inBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SS_inBNActionPerformed(evt);
            }
        });

        SS_outBN.setText("<<");
        SS_outBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SS_outBNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SS_panelLayout = new javax.swing.GroupLayout(SS_panel);
        SS_panel.setLayout(SS_panelLayout);
        SS_panelLayout.setHorizontalGroup(
            SS_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SS_panelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SS_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SS_inBN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SS_outBN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SS_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        SS_panelLayout.setVerticalGroup(
            SS_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
            .addGroup(SS_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SS_inBN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SS_outBN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SS_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SS_OK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SS_Cancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SS_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SS_OK)
                    .addComponent(SS_Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SS_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SS_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_SS_CancelActionPerformed

    private void SS_inBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SS_inBNActionPerformed
        move(SS_list1);
    }//GEN-LAST:event_SS_inBNActionPerformed

    private void SS_outBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SS_outBNActionPerformed
        move(SS_list2);
    }//GEN-LAST:event_SS_outBNActionPerformed

    private void SS_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SS_OKActionPerformed
        sendData();
        this.dispose();
    }//GEN-LAST:event_SS_OKActionPerformed

    void checkSelected(){
        if(TestEntry.TE_sam.equals("")) return;
        String[] list = TestEntry.TE_sam.split("::");
        for(int i=0; i < Array.getLength(list) ; i++){
            model2.addElement(list[i]);
            model.removeElement(list[i]);
            //JOptionPane.showMessageDialog(rootPane, list[i]);
        }
        refreshLists();
    }
    
    void sendData(){
        int i = 0;
        if(model2.getSize() == 0) return;
        TestEntry.TE_sam = SetFormat.setStyle(model2);
    }
    
    void move(JList l){
        JList in = l;
        DefaultListModel mi ,mo;
        if(l.equals(SS_list1)){
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
    
    public void MLlist1(){
        SS_list1.addMouseListener(new MouseAdapter() { 
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    move(SS_list1);
                }
            }
       
        });
    }
    
    public void MLlist2(){
        SS_list2.addMouseListener(new MouseAdapter() { 
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    move(SS_list2);
                }
            }
       
        });
    }
    
    void refreshLists(){
        SS_list1.setModel(model);
        SS_list2.setModel(model2);
    }
    
    void fill(){
        if(!inv.fillSample(model)){
            dispose();
            JOptionPane.showMessageDialog(null, "No Samples in the system !", "Samples Missing", JOptionPane.ERROR_MESSAGE);
            if(JOptionPane.showConfirmDialog(null, "Add Samples?") == 0){
                new SampleAdd();
            }
        }
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SS_Cancel;
    private javax.swing.JButton SS_OK;
    private javax.swing.JButton SS_inBN;
    private javax.swing.JList SS_list1;
    private javax.swing.JList SS_list2;
    private javax.swing.JButton SS_outBN;
    private javax.swing.JPanel SS_panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
