
package GUI;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import mrms.Report;


public class ReportGUI extends javax.swing.JFrame {

    String[] RE_Test;
    public static int NoOfTest;
    public static String SelectedTest;
    public static String Comment;
    String RepNo;
    Report rep = new Report();

    public ReportGUI() {
        //NoOfTest = 5;
        //SelectedTest = "a::b::c::d::e";
        NoOfTest = 1;
        SelectedTest = "Blood Group";
        new ReportGUI("3","1");
    }
    
    public ReportGUI(String pcode,String rno){
        initComponents();
        RE_PCode.setText(pcode);
        RepNo = rno;
        this.setTitle("Report No. " + rno);
        setData();
        addnew();
        setVisible(true);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroller = new javax.swing.JScrollPane();
        ScrollPane = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        RE_Save = new javax.swing.JButton();
        RE_Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RE_PCode = new javax.swing.JTextField();
        RE_Valid = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        RE_Date = new com.toedter.calendar.JDateChooser();
        RE_Comment = new javax.swing.JButton();
        RE_selTest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Report");
        setResizable(false);

        ScrollPane.setPreferredSize(new java.awt.Dimension(410, 432));

        javax.swing.GroupLayout ScrollPaneLayout = new javax.swing.GroupLayout(ScrollPane);
        ScrollPane.setLayout(ScrollPaneLayout);
        ScrollPaneLayout.setHorizontalGroup(
            ScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        ScrollPaneLayout.setVerticalGroup(
            ScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        scroller.setViewportView(ScrollPane);

        RE_Save.setText("Save");

        RE_Cancel.setText("Cancel");
        RE_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_CancelActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient Code :");

        RE_PCode.setEditable(false);

        RE_Valid.setText("Valid");

        jLabel2.setText("Date :");

        RE_Comment.setText("Comment");

        RE_selTest.setText("Select Test");
        RE_selTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RE_selTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroller, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RE_PCode, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RE_Valid))
                            .addComponent(RE_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RE_Comment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RE_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RE_selTest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RE_Cancel)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RE_Cancel, RE_Comment, RE_Save, RE_selTest});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RE_Save)
                    .addComponent(jLabel1)
                    .addComponent(RE_PCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RE_Valid)
                    .addComponent(RE_Comment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RE_Cancel)
                        .addComponent(jLabel2)
                        .addComponent(RE_selTest))
                    .addComponent(RE_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroller, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RE_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_RE_CancelActionPerformed

    private void RE_selTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RE_selTestActionPerformed
        new TestSel(RE_PCode.getText(), SelectedTest, true, RepNo);
        this.dispose();
    }//GEN-LAST:event_RE_selTestActionPerformed

    private void addnew(){
        //Initialize Components
        int PanHeight, PanWidth = 410; 
        int Xpos = 7, Ypos = 5;
        int pat = rep.getPatientSex(RE_PCode.getText());
        
        JLabel[] TName = new JLabel[NoOfTest];
        JTextField[] TVal = new JTextField[NoOfTest];
        JTextField[] TRange = new JTextField[NoOfTest];
        JTextField[] TChild = new JTextField[NoOfTest];
        JScrollPane[] TScroll = new JScrollPane [NoOfTest];
        JTextArea[] TSpecial = new JTextArea[NoOfTest];
        JSeparator[] TSep = new JSeparator[NoOfTest];
        
        
        /* Add Labels */
            JLabel L1 = new JLabel("Name :");
            L1.setLocation(Xpos, Ypos);
            L1.setSize(100, 27);
            ScrollPane.add(L1);
            Xpos = Xpos + 105;

            JLabel L2 = new JLabel("Value :");
            L2.setLocation(Xpos, Ypos);
            L2.setSize(100, 27);
            ScrollPane.add(L2);
            Xpos = Xpos + 105;

            JLabel L3 = new JLabel("Range :");
            L3.setLocation(Xpos, Ypos);
            L3.setSize(100, 27);
            ScrollPane.add(L3);
            Ypos = Ypos + 25;
            Xpos = 7;

            JSeparator Sep = new JSeparator();
            Sep.setSize(PanWidth - 10, 5);
            Sep.setLocation(Xpos, Ypos);
            Sep.setVisible(true);
            ScrollPane.add(Sep);
            //Increase X & Y position
            Xpos = 7;
            Ypos = Ypos + 7;

        /* Add Components */
            for (int i = 0; i<NoOfTest; i++){
                String[] Data = rep.getTestData(RE_Test[i]);
                //Set Name
                TName[i] = new JLabel();
                TName[i].setText(RE_Test[i]);
                TName[i].setSize(100, 23);
                TName[i].setLocation(Xpos,Ypos);
                TName[i].setVisible(true);
                ScrollPane.add(TName[i]);
                //Increase X position
                Xpos = Xpos + 105;

                if(Data[0].equals("0")){
                    //Set Value Box
                    TVal[i] = new JTextField();
                    TVal[i].setText("");
                    TVal[i].setSize(100, 23);
                    TVal[i].setLocation(Xpos,Ypos);
                    TVal[i].setVisible(true);
                    ScrollPane.add(TVal[i]);
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
                    ScrollPane.add(TRange[i]);
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
                        ScrollPane.add(TChild[i]);
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
                        ScrollPane.add(TScroll[i]);
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
                    ScrollPane.add(TScroll[i]);
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
                    ScrollPane.add(TSep[i]);
                    //Increase X & Y position
                    Xpos = 7;
                    Ypos = Ypos + 7;
                }
            }
            
        /* Set Size of Pane */
        PanHeight = Ypos + 6;
        ScrollPane.setPreferredSize(new Dimension(PanWidth, PanHeight));
        ScrollPane.setMaximumSize(new Dimension(PanWidth, PanHeight));
        ScrollPane.setMinimumSize(new Dimension(PanWidth, PanHeight));
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RE_Cancel;
    private javax.swing.JButton RE_Comment;
    private com.toedter.calendar.JDateChooser RE_Date;
    private javax.swing.JTextField RE_PCode;
    private javax.swing.JButton RE_Save;
    private javax.swing.JCheckBox RE_Valid;
    private javax.swing.JButton RE_selTest;
    private javax.swing.JPanel ScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane scroller;
    // End of variables declaration//GEN-END:variables

    private void setData() {
        RE_Test = SelectedTest.split("::");
    }
}
