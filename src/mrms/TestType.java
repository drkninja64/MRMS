package mrms;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TestType {
    public String tname, cname, general="", male="", female="", child="", special="", Unit="", Sample;
    public int Tno,Cno,subj;
    public static int CatCount;
    public float price;
    String sql;
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    static investigation inv = new investigation();
    
    static Object[][] cat = new Object[2][0];

    public TestType(){
        conn=mrms.Sql_connection.connecrDb();
    }

    public TestType(String name){
        conn=mrms.Sql_connection.connecrDb();
        fillData(name);
    }

    public static void fillCat(){
        Connection conn1=mrms.Sql_connection.connecrDb();
        String sql1;
        ResultSet rs1=null;
        PreparedStatement pst1=null;
        try{
            sql1 = "Select * from category";
            pst1 = conn1.prepareStatement(sql1);
            rs1 = pst1.executeQuery();
            int i=0; 
            CatCount = Integer.parseInt(inv.countCat());
            cat = new Object[2][CatCount];
            while (rs1.next()){
                cat[0][i] = rs1.getInt("CNo");
                cat[1][i] = rs1.getString("Name");
                //JOptionPane.showMessageDialog(null, cat[0][i] + " : " + cat[1][i]);
                i++;
            }
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,"Cat : " + e); 
        }
        finally{
            try{
                rs1.close();
                pst1.close();
            }
            catch(Exception e){}
        }
    }
    
    String getCname(int cn){
        for (int i = 0; ; i++){
            if (cn == (int)cat[0][i]){
                return cat[1][i].toString();
            }
        }
    }
    
    void fillData(String name){
        try{
            sql = "Select * from investigations where Name = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            rs = pst.executeQuery();
            rs.next();
            Tno = rs.getInt("TNo");
            Cno = rs.getInt("CNo");            
            subj = rs.getInt("subjective");
            tname = rs.getString("Name");
            cname = getCname(Cno);
            price = rs.getFloat("price");
            general = rs.getString("general");
            male = rs.getString("male");
            female = rs.getString("female");
            child = rs.getString("child");
            special = rs.getString("special");
            Unit = rs.getString("unit");
            Sample = rs.getString("sample"); //*/
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,"TT : " + e); 
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
