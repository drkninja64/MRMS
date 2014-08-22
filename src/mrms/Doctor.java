/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mrms;
import GUI.DoctorEntry;
import GUI.DoctorList;
import GUI.mainPage;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author lovelyruchi
 */
public class Doctor {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    ResultSet rss=null;
                        PreparedStatement pst1=null;
    
 
    Object[][] data = new Object[0][3];
    

    
    public Doctor(){
        conn=mrms.Sql_connection.connecrDb();
       // data=null;
    }
     
    public int saveaction(JFrame de,String dcode1,String dname1,String dqual1,String dwork1,String dcontact1,String demail1,String dshift){
        //Null Value Check
        if(dname1.equals("") || dqual1.equals("") || dwork1.equals("")){
            String msg = "Must enter values in following fields :";
            if(dname1.equals(""))   msg = msg + "\nName";
            if(dqual1.equals(""))   msg = msg + "\nQualifications";
            if(dwork1.equals(""))   msg = msg + "\nWorking Hospital";
            JOptionPane.showMessageDialog(null,msg,"Invalid Entry",JOptionPane.ERROR_MESSAGE);
            return 1; //Could not save
        }
        
        //Saving Values
        try{
            String sql="Insert into doctor (DCode,DName,DQual,DWork,DContact,DEmail,Shift) value(?,?,?,?,?,?,?)";
            
            pst=conn.prepareStatement(sql);
            int dcode=Integer.parseInt(dcode1);
            pst.setInt(1,dcode);
            pst.setString(2,dname1);
            pst.setString(3,dqual1);
            pst.setString(4,dwork1);
            pst.setString(5,dcontact1);
            pst.setString(6,demail1);
            pst.setString(7,dshift);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Information Saved!");
            de.dispose();
              
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Insert some value! Null value is not accepted!");
            
        }finally{
            try{
            rs.close();
            pst.close();
        }
            catch(Exception e){}
        }
        return 0;
    }
     
    
    //Shift Entry
    public void shiftEntry(String dcode,String day,String start,String end){
        try{
            String sql="Insert into shifttable(DCode,Day,Shift_start,Shift_end) value(?,?,?,?)";
            pst=conn.prepareStatement(sql);
            int dcode1=Integer.parseInt(dcode);
            pst.setInt(1,dcode1);
            pst.setString(2,day);
            pst.setString(3,start);
            pst.setString(4,end);
            
            pst.execute();
        }
     
        catch(Exception e){JOptionPane.showMessageDialog(null,e);}
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){}
        }
    }

    /**
     * Gives the no of doctors(+1) in table as String
     * @return
     */
        public String countDoc(){
        try{
            String sql="SELECT COUNT(DCode) AS count FROM doctor";
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
        public String countshift(String id){
        try{
            String sql1="SELECT COUNT(DCode) AS count FROM shifttable where DCode=?";
          
            pst1=conn.prepareStatement(sql1);
            pst1.setInt(1,Integer.parseInt(id));
            rss=pst1.executeQuery();
            rss.next();
            //JOptionPane.showMessageDialog(null,"rs:\n"+rss.getString("count"));  //Debugging
            return rss.getString("count");
        }
        catch(Exception e){}
        finally{
            try{
                rss.close();
                pst1.close();
            }
            catch(Exception e){}
        }
       return "";  
     } 
        
     
        
     public void view_doc_info(String id){
       
           try{
            Object[][] temp1 = new Object[0][3];
            int i=0;     
           
            String sql="Select * from doctor where DCode=?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt(id));
            rs=pst.executeQuery();
             rs.next();//while(rs.next()){
                    if(rs.getInt("Shift")==1){
                        int len=Integer.parseInt(countshift(id));
                        String sql1="Select * from shifttable where DCode=?";
                        pst1=conn.prepareStatement(sql1);
                        pst1.setInt(1,Integer.parseInt(id));
                        rss=pst1.executeQuery();
                        i=0; 
                        temp1=new Object[len][3];
                        while(rss.next()){
                                temp1[i][0]=rss.getString("Day");
                                String s=(rss.getTime("Shift_start").toString());
                                DateFormat f1 = new SimpleDateFormat("hh:mm:ss");
                                DateFormat f2 = new SimpleDateFormat("hh:mm aa");
                            try{
                                   java.util.Date d = f1.parse(s);
                                    
                               temp1[i][1]= f2.format(d).toUpperCase();
                            }catch(ParseException e){}
                            s=(rss.getTime("Shift_end").toString());
                            try{
                                   java.util.Date d = f1.parse(s);
                                    
                               temp1[i][2]= f2.format(d).toUpperCase();
                            }catch(ParseException e){}
                                i++;
                        }
                        data=temp1;
                    }
                        
                    DoctorEntry doc= new DoctorEntry();
                    doc.fill(id,rs.getString("DName"),rs.getString("DQual"),rs.getString("DWork"),rs.getString("DContact"),rs.getString("DEmail"),data);
              //      break;
            
            //}
           }
         catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            }
          finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){}
        }
     }
     
   public int save_edited(JFrame de,String dcode1,String dname1,String dqual1,String dwork1,String dcontact1,String demail1){
       int shif = 0;
      if(dname1.equals("") || dqual1.equals("") || dwork1.equals("")){
            String msg = "Must enter values in following fields :";
            if(dname1.equals(""))   msg = msg + "\nName";
            if(dqual1.equals(""))   msg = msg + "\nQualifications";
            if(dwork1.equals(""))   msg = msg + "\nWorking Hospital";
            JOptionPane.showMessageDialog(null,msg,"Invalid Entry",JOptionPane.ERROR_MESSAGE);
            return 1; //Could not save
        }
      try{
          String sql="Select * from doctor where DCode=?";
          pst=conn.prepareStatement(sql);
          pst.setInt(1, Integer.parseInt(dcode1));
          rs=pst.executeQuery();
          if(rs.next()){
              if(DoctorEntry.var!=0){
                  shif=1;
              }else{shif=0;}
              String sqll="Update doctor set DName='"+dname1+"',DQual='"+dqual1+"',DWork='"+dwork1+"',DContact='"+dcontact1+"',DEmail='"+demail1+"',Shift='"+shif+"' where DCode='"+Integer.parseInt(dcode1)+"'";
              pst1=conn.prepareStatement(sqll);
              pst1.execute();
              JOptionPane.showMessageDialog(null, "Information Updatated");
              de.dispose();
             //mainPage.for_shift=1;
        //DoctorList dlist=new DoctorList();
       // dlist.setVisible(true);
          }
      }
      catch(NumberFormatException | SQLException e){
            
            JOptionPane.showMessageDialog(null,e);
            
        }finally{
            try{
            rs.close();
            pst.close();
        }
            catch(Exception e){}
        }
        return 0 ;
    }
   
   
 
    
    public void insert_update(String dcode1,String day1,String start1,String end1){
        PreparedStatement pst2=null;
        int upflag=0;
        try{
            String sql="Select * from shifttable where DCode=?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(dcode1));
            rs=pst.executeQuery();
           while(rs.next()){
                if((rs.getString("Day").equals(day1))){
                    upflag=1;
                }
           }
           
           if(upflag==1){
                   String sqll="Update shifttable set Shift_start='"+start1+"',Shift_end='"+end1+"' where DCode="+Integer.parseInt(dcode1)+" and Day='"+day1+"'";
                     pst1=conn.prepareStatement(sqll);
                     pst1.execute();
                    System.out.println("hmm1");
                }else{
                    System.out.println("hmm2");
                    String sql1="Insert into shifttable (DCode,Day,Shift_start,Shift_end) value (?,?,?,?)";
                    pst2=conn.prepareStatement(sql1);
                    pst2.setInt(1,Integer.parseInt(dcode1));
                    pst2.setString(2,day1);
                    pst2.setString(3,start1);
                    pst2.setString(4,end1);
                    pst2.execute();
                }
                  
                  
                
                   
                    
                
            
        }
        catch( SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }finally{try{rs.close(); pst.close();}catch(SQLException e){}}
    }

}
    

