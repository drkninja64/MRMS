
package mrms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Appointment {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
     public Appointment(){
        conn=mrms.Sql_connection.connecrDb();
    }
}
