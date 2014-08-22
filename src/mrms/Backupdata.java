/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mrms;

import GUI.mainPage;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author lovelyruchi
 */
public class Backupdata {
     private static String userName="root";
    private static String password="";
    private static String destinationPath=mainPage.filename;
    private static String dbName="mrmsdb";

public Backupdata(){
    //conn=Insertion.connecrDb();
}
    /**
     * @param args the command line arguments
     */
    public void back() throws IOException {
        createDumpOfMysqDb();
//        
    }
    
     public static void createDumpOfMysqDb()
        {
            String fullPath="A:\\xampp\\mysql\\bin\\";
            
             String dumpCommand=fullPath+"mysqldump --user="+userName+" --password="+password+" --databases "+
              dbName+" > \""+destinationPath+"\"";
             Process p=null;
            try
            {
            System.out.println("The Command is:"+dumpCommand);
            Runtime runtime=Runtime.getRuntime();
            p=runtime.exec(new String []{"cmd.exe","/c",dumpCommand});
            int processComplete=p.waitFor();
            
            
            
            // For Desktop Applicaiton
            if(processComplete==0)
            {
                JOptionPane.showMessageDialog(null,"Backup created successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Backup not Created");
            }
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
            
         
        }
}
