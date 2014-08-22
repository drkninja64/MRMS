/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mrms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lovelyruchi
 */
public class Patient {
     Connection conn=null;
     ResultSet rs=null;
     PreparedStatement pst=null;
     
     public Patient(){
         conn=mrms.Sql_connection.connecrDb();
     }
     
    public int setQual(JTextField txtbox, String set){
        //Sets Qualification for doctor
        String qual;
        int shFlag=0;
        try{
            String sql="Select * from doctor where DName=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, set);
            rs=pst.executeQuery();
            rs.next();
            qual=rs.getString("DQual");
            txtbox.setText(qual);
            shFlag = rs.getInt("Shift");
        }
        catch(Exception e){}  
        finally{
            try{
            rs.close();
            pst.close();
            }
            catch(Exception e){}
        }
        return shFlag;
    }
    
    // Generates new code
    public String newCode(){
        try{
            String sql="SELECT COUNT(PCode)+1 AS count FROM patient";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            rs.next();
            return rs.getString("count");
        }
        catch(Exception e){}
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){}
        }
       return "";  
    } 
    
    public boolean patient_entry(String Pcode1,String fname,String mname,String lname,int gender,String age,String contact,String email,String doct){
        try{
            PreparedStatement pst1=null;
            String sql="Insert into patient (PCode,FName,MName,LName,Age,Sex,PContact,PEmail,DCode) value (?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            
            pst.setInt(1,Integer.parseInt(Pcode1));
            pst.setString(2,fname);
            pst.setString(3,mname);
            pst.setString(4,lname);
            pst.setInt(5, Integer.parseInt(age));
            pst.setInt(6, gender);
            pst.setString(7, contact);
            pst.setString(8, email);
            String sqll="Select DCode from doctor where DName=?";
            pst1=conn.prepareStatement(sqll);
            pst1.setString(1,doct);
            rs=pst1.executeQuery();
            rs.next();
            pst.setInt(9, rs.getInt("DCode"));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Information Saved!");
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Patient Entry\n"+e);
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
    
   
}
