/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mrms;

import GUI.*;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lovelyruchi
 */
public class Encryption {
    
     Connection conn=null;
     ResultSet rs=null;
     PreparedStatement pst=null;
     int flag=0;
     
     public Encryption(){
         conn =Sql_connection.connecrDb();
     }
     
     public void encryptdecrypt(JFrame log,String username,String passcode){
         
        try{
            
            DESedeKeySpec keySpec = new DESedeKeySpec(encodedKey);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(algorithm);
            SecretKey key = keyFactory.generateSecret(keySpec);
            
            Cipher decipher = Cipher.getInstance(algorithm);
            decipher.init(Cipher.DECRYPT_MODE, key);

            String qry="SELECT * from users";        
            pst=conn.prepareStatement(qry);
            rs=pst.executeQuery();
            
            while(rs.next()){
                    
                String pass=rs.getString("Password");
                byte[] messageToDecrypt = Base64.decode(pass);
                byte[] decryptedBytes = decipher.doFinal(messageToDecrypt);
                String decryptedMessage = new String(decryptedBytes);
                //byte[] textDecrypted = desCipher.doFinal(pass);
                if(username.equals(rs.getString("Username")) && decryptedMessage.equals(passcode)){
                    flag = 1;
                    break;
                }
                else{
                    flag=0;
                }
            }
            
            if(flag==1){
                log.dispose();
                mainPage hm = new mainPage();
                hm.setVisible(true);          
            }
            else{
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Login Failed",JOptionPane.ERROR_MESSAGE);
                }
        }          
              
                
         
         catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         }
     }
     private static String algorithm = "DESede";
private static byte[] encodedKey = new BigInteger("4405520484130165276382990563461622355059220529429770692711", 16).toByteArray();
    
}
