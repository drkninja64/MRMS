/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mrms;

/**
 *
 * @author lovelyruchi
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
 
public class PrintUIWindow implements Printable, ActionListener {
 
    JPanel panelToPrint;
 
    public int print(Graphics g, PageFormat pf, int page) throws
                                                        PrinterException {
 
        if (page > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }
 
        /* User (0,0) is typically outside the imageable area, so we must
         * translate by the X and Y values in the PageFormat to avoid clipping
         */
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
 
        /* Now print the window and its visible contents */
        panelToPrint.printAll(g);
 
        /* tell the caller that this page is part of the printed document */
        return PAGE_EXISTS;
    }
 
    public boolean printjob() {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
                  return true;
             } catch (PrinterException ex) {
              /* The job did not successfully complete */
             }
         }
         return false;
    }
 
    public PrintUIWindow(JPanel fram) {
        panelToPrint = fram;
    }
 
//    public static void main(String arg[]) {
//        UIManager.put("swing.boldMetal", Boolean.FALSE);
//       /* JFrame f = new JFrame("Print UI Example");
//        f.addWindowListener(new WindowAdapter() {
//           public void windowClosing(WindowEvent e) {System.exit(0);}
//        });
//        JTextArea text = new JTextArea(50, 20);
//        for (int i=1;i<=50;i++) {
//            text.append("Line " + i + "\n");
//        }
//        JScrollPane pane = new JScrollPane(text);
//        pane.setPreferredSize(new Dimension(250,200));
//        f.add("Center", pane);
//        JButton printButton = new JButton("Print This Window");*/
//    //  new PrintUIWindow(fram);
//       // f.add("South", printButton);
//       // f.pack();
//        //f.setVisible(true);
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
