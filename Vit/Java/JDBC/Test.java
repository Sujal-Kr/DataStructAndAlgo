package Vit.Java.JDBC;
import java.sql.*;

public class Test {
 
    public static void main(String[] args) {
        try{
            String url="jdbc:postgresql://localhost:5432/Sujal";
            String user="postgres";
            String pass="noob@coder";
            Class.forName("org.postgresql.Driver");
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
                System.out.println(rs.getInt(1) +" "+rs.getString("job"));
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
