
package GUI;

import static GUI.ReportGUI.NoOfTest;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import mrms.Patient;
import mrms.PrintUIWindow;
import mrms.Report;

public class PrintGUI extends javax.swing.JFrame {

    String PCode,RNo;
    Patient pt;
    int PanHeight = 832, PanWidth = 595; 
    int Xpos = 7, Ypos = 5;
    private JLabel[] TName;
    private JScrollPane[] TScroll;
    private JTextArea[] TSpecial;
    private JTextField[] TChild;
    private JTextField[] TRange;
    private JSeparator[] TSep;
    private boolean[] Tsub;
    private String[] RE_Test;
    private JFormattedTextField[] TVal;
    
    public PrintGUI() {
        initComponents();
        setVisible(true);
    }

    public PrintGUI(String pcode,String rno) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        PCode = pcode;
        RNo = rno;
        setTitle("Print Report no. "+RNo);
        PR_code.setText(PCode);
        setData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        printPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        PR_code = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Print Report");

        printPanel.setBackground(new java.awt.Color(255, 255, 255));
        printPanel.setMaximumSize(new java.awt.Dimension(595, 842));
        printPanel.setMinimumSize(new java.awt.Dimension(595, 842));
        printPanel.setPreferredSize(new java.awt.Dimension(595, 842));

        javax.swing.GroupLayout printPanelLayout = new javax.swing.GroupLayout(printPanel);
        printPanel.setLayout(printPanelLayout);
        printPanelLayout.setHorizontalGroup(
            printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        printPanelLayout.setVerticalGroup(
            printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 842, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(printPanel);

        jLabel1.setText("Code :");

        PR_code.setEditable(false);

        jButton1.setText("Cancel");

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PR_code, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PR_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PrintUIWindow printUI =new PrintUIWindow(printPanel);
        if(printUI.printjob()){
            JOptionPane.showMessageDialog(null, "Print Requested!");
            this.dispose();
        };
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PR_code;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel printPanel;
    // End of variables declaration//GEN-END:variables

    private void setData() {
        pt = new Patient();
        pt.getData(PCode);
        addnew();
    }
    
    private void nextLine(){
        Xpos =7;
        Ypos = Ypos + 25;
    }
            
    private void addnew(){
        //Initialize Components
            Xpos = 7; Ypos = 5;
        /* Add Labels */
            JLabel L1 = new JLabel("Name :");
            L1.setLocation(Xpos, Ypos);
            L1.setSize(50, 27);
            printPanel.add(L1);
            
            Xpos = Xpos + 55;
            JLabel L2 = new JLabel();
            L2.setText(pt.fullName());
            L2.setLocation(Xpos, Ypos);
            L2.setSize(100, 27);
            printPanel.add(L2);
            
            Xpos = PanWidth - 150;
            JLabel L3 = new JLabel("Date :");
            L3.setLocation(Xpos, Ypos);
            L3.setSize(50, 27);
            printPanel.add(L3);
            Xpos = Xpos + 55;
            

            JLabel L4 = new JLabel();
            L4.setText(new SimpleDateFormat("MMM d, yyyy").format(new Date()));
            L4.setLocation(Xpos, Ypos);
            L4.setSize(100, 27);
            printPanel.add(L4);
            
            nextLine();
            L1 = new JLabel("Age :");
            L1.setLocation(Xpos, Ypos);
            L1.setSize(50, 27);
            printPanel.add(L1);
            
            Xpos = Xpos + 55;
            L2 = new JLabel();
            L2.setText(pt.age + "");
            L2.setLocation(Xpos, Ypos);
            L2.setSize(100, 27);
            printPanel.add(L2); 
            
            Xpos = Xpos + 65;
            L1 = new JLabel("Gender :");
            L1.setLocation(Xpos, Ypos);
            L1.setSize(50, 27);
            printPanel.add(L1);
            
            Xpos = Xpos + 55;
            L2 = new JLabel();
            L2.setText(pt.gender());
            L2.setLocation(Xpos, Ypos);
            L2.setSize(100, 27);
            printPanel.add(L2);
            
            nextLine();
            JSeparator Sep = new JSeparator();
            Sep.setSize(PanWidth - 10, 5);
            Sep.setLocation(Xpos, Ypos);
            Sep.setVisible(true);
            printPanel.add(Sep);
            nextLine();
        /* Copied stuff */
            Report rep = new Report();
            rep.setData(PCode, RNo);
            RE_Test = ReportGUI.SelectedTest.split("::");
            intialize();
            for (int i = 0; i<NoOfTest; i++){
                String[] Data = rep.getTestData(RE_Test[i]);
                int pat = rep.getPatientSex(PCode);
                //Set Name
                TName[i] = new JLabel();
                TName[i].setText(RE_Test[i]);
                TName[i].setSize(100, 23);
                TName[i].setLocation(Xpos,Ypos);
                TName[i].setVisible(true);
                printPanel.add(TName[i]);
                //Increase X position
                Xpos = Xpos + 105;
                Tsub[i] = Data[0].equals("0");
                if(Tsub[i]){
                    //Set Value Box
                    TVal[i] = new JFormattedTextField();
                    TVal[i].setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.###"))));
                    TVal[i].setText("");
                    TVal[i].setSize(100, 23);
                    TVal[i].setLocation(Xpos,Ypos);
                    TVal[i].setVisible(true);
                    printPanel.add(TVal[i]);
                    //Increase X position
                    Xpos = Xpos + 105;
                    
                    /* Set Range Boxes */
                    String unit = " " + Data[6];
                    //Set Range
                    String srange;
                    TRange[i] = new JTextField();
                    if(Data[1].isEmpty()){
                        if(pat == 1){
                            srange = Data[2];
                            TRange[i].setToolTipText("Male Range");
                        }
                        else{
                            srange = Data[3];
                            TRange[i].setToolTipText("Female Range");
                        }
                    }
                    else {
                        srange = Data[1];
                        TRange[i].setToolTipText("General Range");
                    }
                    TRange[i].setText(srange + unit);
                    TRange[i].setSize(150, 23);
                    TRange[i].setLocation(Xpos,Ypos);
                    TRange[i].setVisible(true);
                    printPanel.add(TRange[i]);
                    //Increase Y position
                    Ypos = Ypos + 28;

                    //Set Child Range
                    if(!Data[4].isEmpty()){
                        TChild[i] = new JTextField();
                        TChild[i].setText(Data[4] + unit);
                        TChild[i].setSize(150, 23);
                        TChild[i].setLocation(Xpos,Ypos);
                        TChild[i].setVisible(true);
                        TChild[i].setToolTipText("Child Range");
                        printPanel.add(TChild[i]);
                        //Increase Y position
                        Ypos = Ypos + 28;
                    }

                    //Set Special Range
                    if(!Data[5].isEmpty()){
                        TScroll[i] = new JScrollPane();
                        TSpecial[i] = new JTextArea();
                        TSpecial[i].setText(Data[5]);
                        TSpecial[i].setSize(180, 95);
                        TSpecial[i].setVisible(true);
                        TScroll[i].setViewportView(TSpecial[i]);
                        TScroll[i].setSize(185,100);
                        TScroll[i].setLocation(Xpos,Ypos);
                        TSpecial[i].setToolTipText("Special Range");
                        printPanel.add(TScroll[i]);
                        //Increase X & Y position
                        Ypos = Ypos + 105;
                    }
                }
                else{
                    //Set Subjective Value
                    TScroll[i] = new JScrollPane();
                    TSpecial[i] = new JTextArea();
                    TSpecial[i].setText("");
                    TSpecial[i].setSize(285, 115);
                    TSpecial[i].setVisible(true);
                    TScroll[i].setViewportView(TSpecial[i]);
                    TScroll[i].setSize(290,120);
                    TScroll[i].setLocation(Xpos,Ypos);
                   // TScroll[i].setToolTipText("Subjective");
                    printPanel.add(TScroll[i]);
                    //Increase X & Y position
                    Ypos = Ypos + 125;
                }

                //Put Separator
                if((i+1)!=NoOfTest){
                    Xpos = 5;
                    TSep[i] = new JSeparator();
                    TSep[i].setSize(PanWidth - 10, 5);
                    TSep[i].setLocation(Xpos, Ypos);
                    TSep[i].setVisible(true);
                    printPanel.add(TSep[i]);
                    //Increase X & Y position
                    Xpos = 7;
                    Ypos = Ypos + 7;
                }
            }
            for (int i = 0; i<NoOfTest; i++){
            if(Tsub[i]) TVal[i].setText(rep.getValue(TName[i].getText(),PCode,RNo,Tsub[i]));
            else TSpecial[i].setText(rep.getValue(TName[i].getText(),PCode,RNo,Tsub[i]));
        }
            
        /* end */    
        printPanel.setPreferredSize(new Dimension(PanWidth, PanHeight));
        printPanel.setMaximumSize(new Dimension(PanWidth, PanHeight));
        printPanel.setMinimumSize(new Dimension(PanWidth, PanHeight));
        printPanel.repaint();
    }
    
    private void intialize() {
        TName = new JLabel[NoOfTest];
        TVal = new JFormattedTextField[NoOfTest];
        TRange = new JTextField[NoOfTest];
        TChild = new JTextField[NoOfTest];
        TScroll = new JScrollPane [NoOfTest];
        TSpecial = new JTextArea[NoOfTest];
        TSep = new JSeparator[NoOfTest];
        Tsub = new boolean[NoOfTest];
    }
}
