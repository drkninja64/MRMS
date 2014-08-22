/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mrms;

import GUI.mainPage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author lovelyruchi
 */
public class MySqlToXls {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    private static String destination;
    /**
     * @param args the command line arguments
     */
     public MySqlToXls() {
        conn=Sql_connection.connecrDb();
         
        
     }
     
     
     public void generateXls(String tablename, String filename)
    throws SQLException, FileNotFoundException, IOException {
    // Create new Excel workbook and sheet
    HSSFWorkbook xlsWorkbook = new HSSFWorkbook();
    HSSFSheet xlsSheet = xlsWorkbook.createSheet();
    short rowIndex = 0;
 
    // Execute SQL query
    PreparedStatement stmt =
    conn.prepareStatement("select * from " + tablename);
    ResultSet rs = stmt.executeQuery();
 
    // Get the list of column names and store them as the first
    // row of the spreadsheet.
    ResultSetMetaData colInfo = rs.getMetaData();
    List<String> colNames = new ArrayList<String>();
    HSSFRow titleRow = xlsSheet.createRow(rowIndex++);
 
    for (int i = 1; i <= colInfo.getColumnCount(); i++) {
      colNames.add(colInfo.getColumnName(i));
      titleRow.createCell((short) (i-1)).setCellValue(
        new HSSFRichTextString(colInfo.getColumnName(i)));
      xlsSheet.setColumnWidth((short) (i-1), (short) 4000);
    }
 
    // Save all the data from the database table rows
    while (rs.next()) {
      HSSFRow dataRow = xlsSheet.createRow(rowIndex++);
      short colIndex = 0;
      for (String colName : colNames) {
        dataRow.createCell(colIndex++).setCellValue(
          new HSSFRichTextString(rs.getString(colName)));
      }
    }
 
    // Write to disk
    xlsWorkbook.write(new FileOutputStream(filename));
  }
 
  // Close database connection
  public void close() throws SQLException {
    conn.close();
  }
  
  public void backup_category(MySqlToXls mysqlToXls){
      try{
            String sql="Select Name from category";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            while(rs.next()){
                mysqlToXls.generateXls(rs.getString("Name"), "B:\\clinic backup\\"+rs.getString("Name")+".xls");
            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
                }
  }
  
  
    public void mysqlmain() {
        try {
     MySqlToXls mysqlToXls = new MySqlToXls();
     destination=mainPage.filename;
      mysqlToXls.generateXls("doctor", destination+"\\doctor.xls");
      mysqlToXls.generateXls("shifttable", destination+"\\shifttable.xls");
      mysqlToXls.generateXls("category", destination+"\\category.xls");
      mysqlToXls.generateXls("investigations", destination+"\\investigations.xls");
      mysqlToXls.generateXls("patient", destination+"\\patient.xls");
      mysqlToXls.generateXls("report", destination+"\\report.xls");
      mysqlToXls.generateXls("samplename", destination+"\\samplename.xls");
      mysqlToXls.generateXls("users", destination+"\\users.xls");
      backup_category(mysqlToXls);
      JOptionPane.showMessageDialog(null,"Backup successfully created!");
      mysqlToXls.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    }
    
}
