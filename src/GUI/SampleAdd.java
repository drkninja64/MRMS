
package GUI;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import mrms.investigation;


public class SampleAdd extends javax.swing.JFrame {
    
    investigation i = new investigation();
    DefaultListModel model = new DefaultListModel();
    String name;

    public SampleAdd() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(null);
        i.fillSample(model);
        fillList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SA_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SA_List = new javax.swing.JList();
        SA_Name = new javax.swing.JTextField();
        SA_Add = new javax.swing.JButton();
        SA_Remove = new javax.swing.JButton();
        SA_Cancel = new javax.swing.JButton();
        SA_OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Samples");
        setResizable(false);

        SA_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Sample List"));

        SA_List.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        SA_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(SA_List);

        javax.swing.GroupLayout SA_panelLayout = new javax.swing.GroupLayout(SA_panel);
        SA_panel.setLayout(SA_panelLayout);
        SA_panelLayout.setHorizontalGroup(
            SA_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SA_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SA_panelLayout.setVerticalGroup(
            SA_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SA_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        SA_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SA_NameKeyPressed(evt);
            }
        });

        SA_Add.setText("Add");
        SA_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SA_AddActionPerformed(evt);
            }
        });

        SA_Remove.setText("Remove");
        SA_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SA_RemoveActionPerformed(evt);
            }
        });

        SA_Cancel.setText("Cancel");
        SA_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SA_CancelActionPerformed(evt);
            }
        });

        SA_OK.setText("OK");
        SA_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SA_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SA_Name)
                    .addComponent(SA_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SA_Add)
                    .addComponent(SA_Remove)
                    .addComponent(SA_Cancel)
                    .addComponent(SA_OK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SA_Add, SA_Cancel, SA_OK, SA_Remove});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SA_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SA_Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SA_Remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SA_OK)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SA_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SA_Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SA_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SA_NameKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) addSample();
    }//GEN-LAST:event_SA_NameKeyPressed

    private void SA_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SA_AddActionPerformed
        addSample();
    }//GEN-LAST:event_SA_AddActionPerformed

    private void SA_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SA_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_SA_CancelActionPerformed

    private void SA_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SA_RemoveActionPerformed
        remSample();
    }//GEN-LAST:event_SA_RemoveActionPerformed

    private void SA_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SA_OKActionPerformed
        i.saveSample(model,this);
    }//GEN-LAST:event_SA_OKActionPerformed

    private void remSample(){
        model.removeElementAt(SA_List.getSelectedIndex());
    }
    
    private void fillList(){
        SA_List.setModel(model);
    }
    private void addSample(){
        name = SA_Name.getText();
        if (name.equals("")) return;
        model.addElement(name);
        SA_Name.setText("");
        fillList();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SA_Add;
    private javax.swing.JButton SA_Cancel;
    private javax.swing.JList SA_List;
    private javax.swing.JTextField SA_Name;
    private javax.swing.JButton SA_OK;
    private javax.swing.JButton SA_Remove;
    private javax.swing.JPanel SA_panel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
