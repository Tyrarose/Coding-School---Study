package testconnecttodatabase;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestConnectToDatabase {
        static final String dbURL =  "jdbc:derby://localhost:1527/hello";
        static final String dbDriver = "org.apache.derby.jdbc.ClientDriver";
        
        static final String user  = "hello";
        static final String pass = "hello";
        
        
        
        public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName(dbDriver);
            
            conn = DriverManager.getConnection(dbURL,user,pass);
             if(conn != null)
             {System.out.println("Connected to database");
             }
             
             System.out.println("Retrieving records...");
             stmt = conn.createStatement();
             
             String sql = "Select * from tbl_stud_info";
             
             ResultSet rs = stmt.executeQuery(sql);
             
             while(rs.next())
             {
             System.out.println(rs.getInt("stud_id")+"\tyow");
             }
             conn.close();
        }
        catch(Exception e){e.printStackTrace();}
    } 
}