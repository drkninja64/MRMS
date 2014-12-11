
package mrms;

import GUI.ReportGUI;
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

    public String getCName(String name) {
        try{
            investigation inv = new investigation();
            sql = "SELECT CNo FROM investigations WHERE Name = ?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,(name));
            rs = pst.executeQuery();
            rs.next();
            return inv.getCName(rs.getInt("CNo"));
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"getCname From Tname:\n" + e);
        }
        finally{
            try{
            rs.close();
            pst.close();
        }
            catch(Exception e){}
        }
        return "";
    }
    
    public boolean saveTests(String RepNo, String PCode, String cname) {
        try{
            sql = "INSERT INTO "+ cname.replaceAll(" ", "_").toLowerCase()
                    +" (RNo,PCode) VALUE (?,?)";
            pst=conn.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt(RepNo));
            pst.setInt(2,Integer.parseInt(PCode));
            pst.execute();
            return true;
        }
        catch(Exception e) {
            //JOptionPane.showMessageDialog(null,"Adding start value to ATC:\n" + e);
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

    public boolean saveTestValue(String RepNo, String PCode, String tname, String cname, String value, boolean b) {
        try{
            sql = "UPDATE "+ cname.replaceAll(" ", "_").toLowerCase()
                    +" SET "+ tname.replaceAll(" ", "_")
                    +"=? WHERE RNo = ? AND PCode = ?";
            pst=conn.prepareStatement(sql);
            pst.setInt(2,Integer.parseInt(RepNo));
            pst.setInt(3,Integer.parseInt(PCode));
            if(b) {
                if(value.isEmpty()) value = "0";
                pst.setFloat(1,Float.parseFloat(value));
            }
            else {
                if(value.isEmpty()) value = "-";
                pst.setString(1,(value));
            }
            pst.execute();
            return true;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Adding values to ATC:\n" + e);
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

    public boolean saveReport(String RepNo, String PCode, String date, String SelectedTest, String Comment, int i) {
        try{
            sql = "INSERT INTO report (RNo,PCode,RDate,Sel_test,Comment,Status) VALUE (?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt(RepNo));
            pst.setInt(2,Integer.parseInt(PCode));
            pst.setString(3,(date));
            pst.setString(4,(SelectedTest));
            pst.setString(5,(Comment));
            pst.setInt(6,(i));
            pst.execute();
            return true;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Adding values to Report:\n" + e);
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

    public boolean setData(String PCode, String rno) {
     try{
            investigation inv = new investigation();
            sql = "SELECT * FROM report WHERE RNo = ? AND PCode = ?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt(rno));
            pst.setInt(2,Integer.parseInt(PCode));
            rs = pst.executeQuery();
            if(rs.next()){
                ReportGUI.Comment = rs.getString("Comment");
                ReportGUI.SelectedTest = rs.getString("Sel_test");
                ReportGUI.NoOfTest = ReportGUI.SelectedTest.split("::").length;
                return true;
            }
            else return false;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Set report data in report gui:\n" + e);
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

    public String getValue(String tname,String PCode, String RepNo, boolean b) {
        try{
            String cname = getCName(tname);
            sql = "SELECT "+ tname.replaceAll(" ", "_") + " AS val FROM " 
                    + cname.replaceAll(" ", "_").toLowerCase()
                    + " WHERE RNo = ? AND PCode = ?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt(RepNo));
            pst.setInt(2,Integer.parseInt(PCode));
            rs = pst.executeQuery();
            if(rs.next()){
                if(b) return Float.toString(rs.getFloat("val"));
                else return rs.getString("val");
            }
            else return "";
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Set report data in report gui:\n" + e);
        }
        finally{
            try{
            rs.close();
            pst.close();
        }
            catch(Exception e){}
        }     
        return "";
    }

    public String getSelTest(String PCode, String RNo) {
        return "";
    }
    
    
}
