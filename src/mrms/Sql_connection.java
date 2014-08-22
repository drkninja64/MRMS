/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mrms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

/**
 *
 * @author lovelyruchi
 */
public class Sql_connection {
    
    //MYSQL connection:
    public static Connection connecrDb(){
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrmsdb","root","");
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
        return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"SQLConn :\n" + e);
            return null;
        }
    }
     
}
