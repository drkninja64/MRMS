
package mrms;

import javax.swing.DefaultListModel;

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
}
