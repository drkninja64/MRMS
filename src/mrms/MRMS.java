/*
 * The Main Function is in HERE!!
 */

package mrms;
import GUI.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MRMS {

    public static void main(String[] args) {
        /* Windows look and feel */
        try {
            UIManager.setLookAndFeel("com.jgoodies.looks.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MRMS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MRMS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MRMS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MRMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //new ApntGUI("1","Deepak Mahara");
        //new TestEntry("TCDC");
        new mainPage();
        //new PatientEntry("3");
        //new PatientSearch();
        //new TestSel("1","TCDC::LDL");
        //new ReportGUI();
        //new TestEntry();
    }
    
}
