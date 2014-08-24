
package mrms;

import GUI.mainPage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author lovelyruchi
 */
public class Import {
    private static Connection conn=null;
    private static PreparedStatement pst=null;
    
    private static String userName = "root";
    private static String password = "";
    private static String sourcePath = mainPage.filename;
    private static String dbName = "mrmsdb";
    
    public void importdata() throws IOException {
        conn=connecrDb();
        createMySqlDb();       
    }
    
    public static Connection connecrDb(){
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
        return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"SQLConn :\n" + e);
            return null;
        }
    }
    
     public static void createMySqlDb(){
        createDb();
        String fullPath="A:\\xampp\\mysql\\bin\\";

        String executeCmd = fullPath + "mysql --user=" + userName
                + " --password=" + password
                + " " + dbName + " < \"" + sourcePath + "\"";
        Process p=null;
        try
            {
            System.out.println("The Command is:"+executeCmd);
            Runtime runtime=Runtime.getRuntime();
            p=runtime.exec(new String []{"cmd.exe","/c",executeCmd});
           
            int processComplete=p.waitFor();
            
            
            
            // For Desktop Applicaiton
            if(processComplete==0)
            {
                JOptionPane.showMessageDialog(null,"Database restored successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Database not restored");
            }
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     
    public static void createDb(){
        try{
            String sql="CREATE DATABASE " + dbName;
            //JOptionPane.showMessageDialog(null, sql);
            pst=conn.prepareStatement(sql);
            pst.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
