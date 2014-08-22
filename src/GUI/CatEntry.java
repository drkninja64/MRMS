
package GUI;

import java.awt.event.KeyEvent;
import mrms.investigation;

public class CatEntry extends javax.swing.JFrame {
    
    investigation i = new investigation();
    
    public CatEntry(){
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setCode();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CE_panel = new javax.swing.JPanel();
        CE_Name = new javax.swing.JTextField();
        CE_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CE_Save = new javax.swing.JButton();
        CE_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Department");
        setResizable(false);

        CE_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("ID :");

        jLabel2.setText("Name :");

        javax.swing.GroupLayout CE_panelLayout = new javax.swing.GroupLayout(CE_panel);
        CE_panel.setLayout(CE_panelLayout);
        CE_panelLayout.setHorizontalGroup(
            CE_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CE_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CE_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CE_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CE_panelLayout.createSequentialGroup()
                        .addComponent(CE_id, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addComponent(CE_Name))
                .addContainerGap())
        );
        CE_panelLayout.setVerticalGroup(
            CE_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CE_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CE_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CE_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CE_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CE_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CE_Save.setText("Save");
        CE_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CE_SaveActionPerformed(evt);
            }
        });
        CE_Save.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CE_SaveKeyPressed(evt);
            }
        });

        CE_cancel.setText("Cancel");
        CE_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CE_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CE_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CE_Save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CE_cancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CE_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CE_Save)
                    .addComponent(CE_cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CE_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CE_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_CE_cancelActionPerformed

    private void CE_SaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CE_SaveKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) saveData();
    }//GEN-LAST:event_CE_SaveKeyPressed

    private void CE_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CE_SaveActionPerformed
        saveData();
    }//GEN-LAST:event_CE_SaveActionPerformed

    public void setCode(){
        CE_id.setText(i.countCat());
        CE_id.setEditable(false);
    }
    
    public void saveData(){
        String Cno = CE_id.getText();
        String Name = CE_Name.getText();
        i.saveCat(Cno,Name,this);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CE_Name;
    private javax.swing.JButton CE_Save;
    private javax.swing.JButton CE_cancel;
    private javax.swing.JTextField CE_id;
    private javax.swing.JPanel CE_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
