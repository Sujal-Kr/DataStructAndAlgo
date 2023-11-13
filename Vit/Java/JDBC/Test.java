package Vit.Java.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.*;

public class Test {
 
    public static void main(String[] args) {
        try{
            String url="jdbc:postgresql://localhost:5432/Sujal";
            String user="postgres";
            String pass="noob@coder";
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println(con);
            if(con!=null){
                System.out.println("I am onn...");
            }
            String query="select * from emp";
            // or use the prepare statement 
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt("sal") +" "+rs.getString(2));
                System.out.println();
            }
            // Good Practice...
            rs.close();
            stmt.close();
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
