
package mrms;

import GUI.ApntGUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Appointment {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    String sql;
    
    public Appointment(){
        conn=mrms.Sql_connection.connecrDb();
    }
    
    public boolean saveApp(String pid, int dcode){
        try{
            sql="DELETE FROM appointments WHERE DCode = ?";
            pst=conn.prepareStatement(sql);
            pst.executeQuery();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Deletion:\n" + e);
        }
        try{
            sql="Insert into appointments () value";
            pst=conn.prepareStatement(sql);
            pst.executeQuery();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Apnt addData:\n" + e);
        }
        finally{
            try{
            rs.close();
            pst.close();
            }
            catch(Exception e){}
        }
        return false;
    }
    
    /**
     * Adds appointment data to table
     * @param dcode Doctor's code
     * @return 
     */
    public boolean addData(int dcode){
        int i=0;
        int no = countApp(dcode);
        if(no == 0) return false;
        Object[][] temp = new Object[no][3];
        try{
            sql = "SELECT * FROM appointment WHERE DCode = (?)";
            pst=conn.prepareStatement(sql);
            pst.setInt(1,dcode);
            rs = pst.executeQuery();
            while(rs.next()){
                temp[i][0] = rs.getString("ADate");
                temp[i][1] = rs.getTime("Atime").toString();
                switch(rs.getInt("status")){
                    case 0 : temp[i][2] = "Pending"; break;
                    case 1 : temp[i][2] = "Finished"; break;
                    case 2 : temp[i][2] = "Missed"; break;
                    case 3 : temp[i][2] = "Canceled"; break;
                    default : temp[i][2] = "Invalid";
                }
                i++;
            }
            ApntGUI.data = temp;
            return true;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Apnt addData:\n" + e);
        }
        finally{
            try{
            rs.close();
            pst.close();
            }
            catch(Exception e){}
        }
        return false;
    }
    
    /**
     * Counts appointments
     * Put '0' to get new ID
     * @param dcode Doctor's code
     * @return 
     */
    int countApp(int dcode){
        if(dcode == 0) sql = "SELECT MAX(AID) as apps FROM appointment";
        else sql = "SELECT COUNT(AID) as apps FROM appointment WHERE DCode = (?)";
        try{
            pst=conn.prepareStatement(sql);
            pst.setInt(1,dcode);
            rs = pst.executeQuery();
            rs.next();
            return Integer.parseInt(rs.getString("apps"));  
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Count apnt:\n" + e);
        }
        finally{
            try{
            rs.close();
            pst.close();
            }
            catch(Exception e){}
        }
        return 0;
    }
}
