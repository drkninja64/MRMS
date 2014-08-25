
package GUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mrms.Appointment;
import mrms.Doctor;

public class ApntGUI extends javax.swing.JFrame {
    
    Doctor d = new Doctor();
    Appointment app = new Appointment();
    int dcode;
    public static Object[][] data = new Object[0][3];
    public static Object[][] Shifts = new Object[3][0];

    public ApntGUI() {
        //initialize();
    }
    
    public ApntGUI(String pid, String dname) {
        initialize();
        this.setTitle(dname+"'s Appointments");
        AE_PID.setText(pid);
        dcode = d.getDCode(dname);
        fillData();
        resetTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AE_PID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        AE_Days = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        AE_Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        AE_cancel = new javax.swing.JButton();
        AE_save = new javax.swing.JButton();
        AE_Add = new javax.swing.JButton();
        AE_shifttime = new javax.swing.JLabel();
        AE_time = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        AE_Date = new com.toedter.calendar.JDateChooser();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        AE_PID.setEditable(false);

        jLabel1.setText("Code :");

        AE_Days.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Days" }));
        AE_Days.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AE_DaysItemStateChanged(evt);
            }
        });

        AE_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AE_Table);

        jLabel2.setText("Date :");

        AE_cancel.setText("Cancel");
        AE_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AE_cancelActionPerformed(evt);
            }
        });

        AE_save.setText("Save");
        AE_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AE_saveActionPerformed(evt);
            }
        });

        AE_Add.setText("Add");

        AE_shifttime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AE_shifttime.setText("Shifts");

        AE_time.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        jLabel3.setText("Time :");

        jButton1.setText("Remove");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator1)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AE_PID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(AE_Days, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AE_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AE_time, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AE_shifttime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AE_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AE_cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AE_Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AE_Add, AE_save});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AE_cancel, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AE_PID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AE_Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(AE_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AE_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(AE_shifttime, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(AE_Add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AE_save)
                    .addComponent(AE_cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AE_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AE_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_AE_cancelActionPerformed

    private void AE_DaysItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AE_DaysItemStateChanged
        setLabel();
    }//GEN-LAST:event_AE_DaysItemStateChanged

    private void AE_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AE_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AE_saveActionPerformed

    /**
     * Initializes GUI
     * @return 
     */
    void initialize(){
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        if(!app.addData(dcode))
            JOptionPane.showMessageDialog(null,"No Appointments");
    }
    
//    String getDay(){
//        String date = AE_Date.getText();
//        Calendar c = Calendar.getInstance();
//        c.setTime(yourDate);
//        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
//    }
    
    /**
     * Resets table data
     * @return 
     */
    public static void resetTableData(){
        AE_Table.setModel(new DefaultTableModel(data,new String[]{"Date","Time","Status"}){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false; //all cells false
            }
        });
        AE_Table.setVisible(true); 
    }
    
    /**
     * Fills Data into table
     * @return 
     */
    void fillData(){
       //JOptionPane.showMessageDialog(null,dcode);
        if(!d.getDays(dcode)) {
            JOptionPane.showMessageDialog(null,"Could not aquire shift data!");
            return;
        }
        setDayBox();
        setLabel();
    }

    /**
     * Sets data into Day Combo box
     */
    void setDayBox(){
        Object[] temp = Shifts[0]; 
        int i;
        for(i=0; i<temp.length; i++){
            AE_Days.addItem(temp[i]);
        }
        AE_Days.removeItemAt(0);
    }
    
    /**
     * Sets shift time according to day
     */
    void setLabel(){
        String Day = AE_Days.getSelectedItem().toString();
        int i;
        String shiftlabel = "ERROR";
        for(i=0; i<Shifts[0].length; i++){
            if(Shifts[0][i].equals(Day)){
                shiftlabel = Shifts[1][i] +" to "+ Shifts[2][i];
            }
        }
        AE_shifttime.setText(shiftlabel);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AE_Add;
    private com.toedter.calendar.JDateChooser AE_Date;
    private javax.swing.JComboBox AE_Days;
    private javax.swing.JTextField AE_PID;
    private static javax.swing.JTable AE_Table;
    private javax.swing.JButton AE_cancel;
    private javax.swing.JButton AE_save;
    private javax.swing.JLabel AE_shifttime;
    private javax.swing.JFormattedTextField AE_time;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
