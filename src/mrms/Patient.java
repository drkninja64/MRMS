/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mrms;

import static GUI.PatientEntry.reports;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static mrms.Doctor.data_search;

/**
 *
 * @author lovelyruchi
 */
public class Patient {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public int PCode;
    public String FName;
    public String LName;
    public String MName;
    public int age;
    public int sex;
    public String contact;
    public String email;
    public String dname;
    public String dateAdded;
     
    public Patient(){
        conn=mrms.Sql_connection.connecrDb();
    }
     
    public boolean getData(String pcode){
        PCode = Integer.parseInt(pcode);
        try{
            Doctor d = new Doctor();
            String sql="Select * from patient where PCode=?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1, PCode);
            rs=pst.executeQuery();
            rs.next();
            age = rs.getInt("Age");
            sex = rs.getInt("Sex");
            FName = rs.getString("FName");
            MName = rs.getString("MName");
            LName = rs.getString("LName");
            contact = rs.getString("PContact");
            email = rs.getString("PEmail");
            dateAdded = rs.getString("Date");
            dname = d.getDName(rs.getInt("DCode"));
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "patient getdata\n" + e);
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
    
    public boolean patient_entry(String Pcode1,String fname,String mname,String lname,int gender,String age,String contact,String email,String date,String doct){
        try{
            PreparedStatement pst1=null;
            String sql="Insert into patient (PCode,FName,MName,LName,Age,Sex,PContact,PEmail,Date,DCode) value (?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            
            pst.setInt(1,Integer.parseInt(Pcode1));
            pst.setString(2,fname);
            pst.setString(3,mname);
            pst.setString(4,lname);
            pst.setInt(5, Integer.parseInt(age));
            pst.setInt(6, gender);
            pst.setString(7, contact);
            pst.setString(8, email);
            pst.setString(9, date);
            String sqll="Select DCode from doctor where DName=?";
            pst1=conn.prepareStatement(sqll);
            pst1.setString(1,doct);
            rs=pst1.executeQuery();
            rs.next();
            pst.setInt(10, rs.getInt("DCode"));
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

    public String countpatient(){
        try{
            String sql="SELECT COUNT(PCode) AS count FROM patient";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            rs.next();
            //JOptionPane.showMessageDialog(null,"rs:\n"+rs.getString("count"));  //Debugging
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
    
     public String countpatient1(String patientid){
        try{
            String sql1="Select COUNT(PCode) AS count FROM patient where PCode like '"+Integer.parseInt(patientid)+"%'";
            pst=conn.prepareStatement(sql1);
            rs=pst.executeQuery();
            rs.next();
            //System.out.println(Integer.parseInt(rs.getString("count")));
            return rs.getString("count");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{try{rs.close(); pst.close();}catch(Exception e){}}
        return "";
    }
    
     public String countpatient2(String patientname){
        try{
            String sql1="Select COUNT(FName) AS count FROM patient where FName like '"+patientname+"%'";
            pst=conn.prepareStatement(sql1);
            rs=pst.executeQuery();
            rs.next();
            //System.out.println(Integer.parseInt(rs.getString("count")));
            return rs.getString("count");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{try{rs.close(); pst.close();}catch(Exception e){}}
        return "";
    }
    
        
    public void search_name(String patientname,JTable table){
       try{
            int length=Integer.valueOf(countpatient2(patientname));
            data_search = new Object [length][5];
          
            String sql="Select * from patient where FName like '"+patientname+"%'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            //rs.next();
            for(int i=0; i<length; i++){
                    rs.next();
                    data_search[i][0] = rs.getInt("PCode");
                    data_search[i][1] = rs.getString("FName")+" "+rs.getString("MName")+" "+rs.getString("LName");
                    data_search[i][2] = rs.getString("Age");
                    if(rs.getInt("Sex")==1)
                        data_search[i][3]="Male";
                    else 
                        data_search[i][3]="Female";
                    data_search[i][4]=rs.getString("Date");
            }
            setTableData(table);
        }catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }finally{try{pst.close(); rs.close(); }catch(SQLException e){}} 
    }
    
    
    public void search_id(String patientid,JTable table){
        try{
            int length=Integer.valueOf(countpatient1(patientid));
            //System.out.println(""+length);
             data_search = new Object [length][5];
             
            String sql="Select * from patient where PCode like '"+Integer.parseInt(patientid)+"%'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            //rs.next();
            for(int i=0; i<length; i++){
                    rs.next();
                    data_search[i][0] = rs.getInt("PCode");
                    data_search[i][1] = rs.getString("FName")+" "+rs.getString("MName")+" "+rs.getString("LName");
                    if(rs.getInt("Sex")==1)
                        data_search[i][3]="Male";
                    else 
                        data_search[i][3]="Female";
                    data_search[i][4]=rs.getString("Date");
            }
            setTableData(table);
        }catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }finally{try{pst.close(); rs.close(); }catch(SQLException e){}}
        
    }
    
     public static void setTableData(JTable table){
        table.setModel(new DefaultTableModel(data_search,new String[]{"Code","Name","Age","Gender","Date Added"}){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //all cells false
            }
        });
        table.setVisible(true);
    }
    
    
    public int maxReportNo(int pc) {
        try{
            String sql="SELECT MAX(RNo) AS rno FROM report WHERE PCode = ?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1, pc);
            rs=pst.executeQuery();
            if(rs.next()) return rs.getInt("rno");
            else return 0;
        }
        catch(Exception e){}
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){}
        }
        return 0;
    }

    public int countReports(){
        try{
            String sql1="Select COUNT(RNo) AS count FROM report where PCode = ?";
            pst=conn.prepareStatement(sql1);
            pst.setInt(1, PCode);
            rs=pst.executeQuery();
            rs.next();
            return Integer.parseInt(rs.getString("count"));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{try{rs.close(); pst.close();}catch(Exception e){}}
        return 0;
    }
    
    public void setReports() {
        try{
            int i = 0;
            int n = countReports();
            if(n == 0) return;
            String state;
            String sql="SELECT * FROM report WHERE PCode = ?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1, PCode);
            rs=pst.executeQuery();
            reports = new Object[n][3];
            while(rs.next()){
                reports[i][0] = rs.getInt("RNo");
                reports[i][1] = rs.getString("RDate");
                switch(rs.getInt("Status")){
                    case 1: state = "Unverified"; break;
                    case 2: state = "Verified"; break;
                    case 3: state = "Printed"; break; 
                    default : state = "Unknown"; break;    
                }
                reports[i][2] = state;
                i++;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "set report data"+e);
        }
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){}
        }
    }
    
   
}
