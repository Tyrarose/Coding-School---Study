package connectdatabase;

import java.sql.*;

public class Connectdatabase {

    static final String jdbc_driver = "org.apache.derby.jdbc.EmbeddedDriver";
    //static final String dbUrl = "jdbc:derby:anadawanawan; create =true";
    static final String dbUrl = "jdbc:derby:C:/Users/Tyra/AppData/Roaming/NetBeans/12.0/derby/isapaa";
         
     static final String user = "root";
     static final String password = "root";
         
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        
        try{
            Class.forName(jdbc_driver);
            
            conn = DriverManager.getConnection(dbUrl,user,password);
            
            if(conn != null){
                System.out.println("Connected to the database!");
            }else{
                System.out.println("uwu");
            }
            
            System.out.println("Retrieving records...");
            stmt = conn.createStatement();
            
            String sql = "SELECT * FROM app.tbl_user";
            
            //System.out.println(sql);
            
            ResultSet rs = stmt.executeQuery(sql);
            
            System.out.println("laman is ");
            while(rs.next()){
                System.out.println(rs.getString(""));
            }
            
            conn.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}