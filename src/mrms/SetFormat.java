
package mrms;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SetFormat {
        
    /**
     * Puts all samples in one string separated by ::
     * @param model list model with samples
     * @return
     */
    public static String setStyle(DefaultListModel model){
        String send = "";
        int length = model.getSize();
        int i;
        for(i = 0; i < (length - 1); i++){
            send = send + model.getElementAt(i).toString() + "::";
        }
        send = send + model.getElementAt(i).toString();
        return send;
    }
    
    /**
     * Sets the upper and lower limit as 'Low - Up' in a string
     * @param low lower limit of range
     * @param up upper limit of range
     * @return
     */
    public static String setStyle(String low, String up){
        String send;
        send = low.replaceAll("-", "") + " - " + up.replaceAll("-", "");
        return send;
    }

    /**
     * Gets the upper and lower limit in an array
     * @return
     */
    public static String[] getStyle(String range){
        return range.split(" - ");
    }
    
    /**
     * Converts time to 'hh:mm:ss' format
     * @param time in 'hh:mm a' format
     * @return 
     */
    public static String setTimeStyle(String time){
        String str;
        String[] s1 = time.split(" ") , s2 = s1[0].split(":");
        int b = Integer.parseInt(s2[0]);
        if(s1[1].equals("AM") && b==12){
            b = 0;
        }
        else if (s1[1].equals("PM") && b != 12) {
            b += 12;
        }
        str = Integer.toString(b)+":"+ s2[1] +":00";
        return str;
    }
    
    /**
     * Converts time to 'hh:mm a' format
     * @param time in 'hh:mm:ss' format
     * @return 
     */
    public static String getTimeStyle(String time){
        String ntime = "", a = " AM";
        String[] t = time.split(":");
        int hr = Integer.parseInt(t[0]);
        if (hr > 12){
            hr = hr - 12;
            a = " PM";
        }
        ntime = hr + ":" + t[1] + a; 
        //JOptionPane.showMessageDialog(null,ntime);
        return ntime;
    }

}
