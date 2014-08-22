/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mrms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author lovelyruchi
 */
public class Users {
    Connection conn=null;
     ResultSet rs=null;
     PreparedStatement pst=null;
     
     public Users(){
          conn =Sql_connection.connecrDb();
          
     }
     
     public void add_category(String cat_no1,String cat_name1){
       try{
             String sql="Insert into category(CNo,Name) value(?,?)";
          pst=conn.prepareStatement(sql);
          int cat_no2=Integer.parseInt(cat_no1);
          pst.setInt(1, cat_no2);
          pst.setString(2,cat_name1);
          pst.execute();
          
          JOptionPane.showMessageDialog(null,"Category added!");
          
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
       
         
     }
     
    
    
}
