
package mrms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Report {
    
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    String sql;   
    
    public Report(){
        conn = mrms.Sql_connection.connecrDb();
    }
    
    /**
     * Gets test ranges
     * @param tname 
     */
    public String[] getTestData(String tname){
        String[] result = new String[7];
        try{
            sql = "SELECT * FROM investigations WHERE Name = ?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,tname);
            rs = pst.executeQuery();
            rs.next();
            result[0] = Integer.toString(rs.getInt("subjective"));
            //JOptionPane.showMessageDialog(null,rs.getInt("subjective"));
            result[1] = rs.getString("general");
            result[2] = rs.getString("male");
            result[3] = rs.getString("female");
            result[4] = rs.getString("child");
            result[5] = rs.getString("special");
            result[6] = rs.getString("Unit");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"getTestData:\n" + e);
        }
        finally{
            try{
            rs.close();
            pst.close();
        }
            catch(Exception e){}
        }
        return result;
    }

    public int getPatientSex(String pcode) {
        int result = 0;
        try{
            sql = "SELECT * FROM patient WHERE PCode = ?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt(pcode));
            rs = pst.executeQuery();
            rs.next();
            result = rs.getInt("Sex");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"getPatientGender:\n" + e);
        }
        finally{
            try{
            rs.close();
            pst.close();
        }
            catch(Exception e){}
        }
        return result;
    }
    
}
