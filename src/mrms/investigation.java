package mrms;

import GUI.TestEntry;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class investigation {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public investigation() {
        conn=mrms.Sql_connection.connecrDb();
    }
    
    public boolean saveInvestigation(int Tno, int Cno, String Name, float price, String sample, int sub){
        return saveInvestigation(Tno, Cno, Name, price, "", "", "", "", "", "", sample, sub);
    }
    
    public boolean saveInvestigation(int Tno, int Cno, String Name, float price, String general, String male, String female, String child, String special, String Unit, String Sample, int sub){
        String sql, type = "";
        try{
            sql="Insert into investigations (TNo,CNo,Name,price,general,male,female,child,special,unit,sample,subjective) value(?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setInt(1,Tno);
            pst.setInt(2,Cno);
            pst.setString(3,Name);
            pst.setFloat(4,price);
            pst.setString(5,general);
            pst.setString(6,male);
            pst.setString(7,female);
            pst.setString(8,child);
            pst.setString(9,special);
            pst.setString(10,Unit);
            pst.setString(11,Sample);
            pst.setInt(12,sub);
            pst.execute(); 
            JOptionPane.showMessageDialog(null,"Information Saved!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"1. " + e);
        }
        try{
            if (sub == 1) type = " text";
            else type = " float";
            sql = "ALTER TABLE " + getCName(Cno) + " ADD " + Name.replaceAll(" ", "_") + type;
            //JOptionPane.showMessageDialog(null,sql);
            pst=conn.prepareStatement(sql);
            pst.execute(); 
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"3. " + e);
        }
        finally{
            try{
            rs.close();
            pst.close();
            return true;
            }
            catch(Exception e){}
        }   
        return false;
    }
    
    public boolean updateInvestigation(int Tno, int Cno, String OldName, String NewName, float price, String sample, int sub){
        return updateInvestigation(Tno, Cno, OldName, NewName, price, "", "", "", "", "", "", sample, sub);
    }
    
    public boolean updateInvestigation(int Tno, int Cno, String OldName, String NewName, float price, String general, String male, String female, String child, String special, String Unit, String Sample, int sub){
        String sql, type = "";
        int ind = 3;
        boolean [] rng = new boolean[6];
        for (int i=0; i<6; i++) rng[i] = false;
        try{
            sql = "UPDATE TABLE investigations SET Name=?, price=?, ";
            if(!general.isEmpty()) {
                sql = sql + "general=?,";
                rng[0] = true;
            }
            if(!male.isEmpty()) {
                sql = sql + "male=?,";
                rng[1] = true;
            }
            if(!female.isEmpty()) {
                sql = sql + "female=?,";
                rng[2] = true;
            }
            if(!child.isEmpty()) {
                sql = sql + "child=?,";
                rng[3] = true;
            }
            if(!special.isEmpty()) {
                sql = sql + "special="+ special +",";
                rng[4] = true;
            }
            if(!Unit.isEmpty()) {
                sql = sql + "unit=?,";
                rng[5] = true;
            }
            sql = sql + "sample=? WHERE TNo=? AND CNo=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,NewName);
            pst.setFloat(2,price);
            if(rng[0]) pst.setString(ind++,general);
            if(rng[1]) pst.setString(ind++,male);
            if(rng[2]) pst.setString(ind++,female);
            if(rng[3]) pst.setString(ind++,child);
            if(rng[5]) pst.setString(ind++,Unit);
            pst.setString(ind++,Sample);
            pst.setInt(ind++,Tno);
            pst.setInt(ind,Cno);
            pst.execute(); 
            JOptionPane.showMessageDialog(null,"Information Updated!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Update Inv 1:\n" + e);
        }
//        try{
//            if (sub == 1) type = " text";
//            else type = " float";
//            sql = "ALTER TABLE " + getCName(Cno) + " CHANGE " + OldName.replaceAll(" ", "_") + " " + NewName.replaceAll(" ", "_") + " " + type;
//            //JOptionPane.showMessageDialog(null,sql);
//            pst=conn.prepareStatement(sql);
//            pst.execute(); 
//        }
//        catch(Exception e) {
//            JOptionPane.showMessageDialog(null,"Update Inv 2:\n" + e);
//        }
        finally{
            try{
            rs.close();
            pst.close();
            return true;
            }
            catch(Exception e){}
        }   
        return false;
    }

    
    public String getCName(int Cno){
        String sql, cname;
        cname = "" + Cno;
        try{
            sql = "SELECT Name AS name FROM category WHERE CNo = (?)";
            pst=conn.prepareStatement(sql);
            pst.setInt(1,Cno);
            rs = pst.executeQuery();
            rs.next();
            cname = rs.getString("name");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"2. " + e);
        }
        return cname;
    }
    
    public int getCNo(String cname){
        try{
            String sql="SELECT Cno AS cn FROM category WHERE Name = ?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, cname);
            rs=pst.executeQuery();
            rs.next();
            return Integer.parseInt(rs.getString("cn"));
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
    
    public String getCountInv(String cname){
        int cno = getCNo(cname);
        try{
            String sql="SELECT COUNT(TNo)+1 AS count FROM investigations WHERE CNo = ?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1, cno);
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
    
    public String countCat(){
        try{
            String sql="SELECT COUNT(CNo)+1 AS count FROM category";
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

    public int countSample(){
        int l = 0;
        String sql;
        try{
            sql = "SELECT COUNT(Name) AS count FROM samplename";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            rs.next();
            l = Integer.parseInt(rs.getString("count"));
            //JOptionPane.showMessageDialog(null, l);
        }
        catch(Exception e){}
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){}
        }
        return l;   
    }

    /**
    public void setData(int l){
        String[] a = new String[0];
        SampleList s = new SampleList(0);
        int i = 0;
        String name, sql;
        
        try{
            sql="Select * from samplename";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            a = new String[l];
            while(rs.next()){
               name=rs.getString("name");
               a[i] = name;
               i++;
            }
            //JOptionPane.showMessageDialog(null,"Data = " + a[2]);
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){}
        }
        s.data = a;
    }
 */   
    
    public boolean fillSample(DefaultListModel model){
        int i = 0;
        try{
            String name, sql="Select * from samplename";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
               i++;
               name=rs.getString("name");
               model.addElement(name);
            }
            if(i == 0) return false;
            else return true;
        }
        catch(SQLException e){}
        finally{
            try{
            rs.close();
            pst.close();
            }
            catch(SQLException e){}
        }
        return false;
    }
    
    public boolean fillCat(){
        int f = 0;
        try{
            String name, sql="Select * from category";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                name=rs.getString("Name");
                //JOptionPane.showMessageDialog(null,name);
                TestEntry.TE_Cat.addItem(name);
                f = 1;                
            }
            TestEntry.TE_Cat.removeItemAt(0);
        }
        catch(SQLException e){}
        finally{
            try{
            rs.close();
            pst.close();
            }
            catch(SQLException e){}
        }
        return f == 1;
    }
    
    public void saveSample(DefaultListModel m, JFrame SA){
        try{
            String sql="DELETE FROM samplename";
            pst=conn.prepareStatement(sql);
            pst.execute();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
            try{
            rs.close();
            pst.close();
        }
            catch(Exception e){}
        }
        
        try{
            int l = m.getSize();
            String sql="Insert into samplename(name) value(?)";
            for (int i = 0; i<l; i++){
                pst=conn.prepareStatement(sql);
                pst.setString(1,m.getElementAt(i).toString());
                pst.execute();
            }
            JOptionPane.showMessageDialog(null,"Information Saved!");
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
            try{
            rs.close();
            pst.close();
        }
            catch(Exception e){}
        }
        SA.dispose();
    }
    
    public void saveCat(String Cno, String Name, JFrame ce){
        try{
            String sql="Insert into category (CNo,Name) value(?,?)";
            
            pst=conn.prepareStatement(sql);
            int CNO=Integer.parseInt(Cno);
            pst.setInt(1,CNO);
            pst.setString(2,Name);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Information Saved!");
            try{
                sql = "CREATE TABLE " + Name + " ( Rno int(5) not null, PCode int(5) not null, primary key(Rno,PCode),foreign key (Rno,PCode) references Report(Rno,PCode) on delete cascade)";
                pst=conn.prepareStatement(sql);
                pst.execute();
            }
            catch(Exception e){JOptionPane.showMessageDialog(null,e);}
            ce.dispose();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Category " + Name + " already exists!","Duplicate Category",JOptionPane.ERROR_MESSAGE);
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
