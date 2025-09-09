package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConn {
 
     static Connection con;
     static Connection getConn() {
      try {
       Class.forName("com.mysql.cj.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
      }catch(Exception e) {
       e.printStackTrace();
     }
     return con;
     }
}