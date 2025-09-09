package jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class update_example {
    public static void main(String[] args) throws Exception {
        // Get database connection (from your DBConn class)
        Connection con = DBConn.getConn();
        Statement stmt = con.createStatement();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter empid:");
        String eid = sc.nextLine();

        System.out.println("Enter empname:");
        String ename = sc.nextLine();

        System.out.println("Enter department:");
        String dept = sc.nextLine();

        System.out.println("Enter salary:");
        double sal = sc.nextDouble();

        // Build the SQL UPDATE query
        String query = "UPDATE emp SET sal = " + sal + " WHERE eid = '" + eid + "'";
        // Execute update
        int rowsAffected = stmt.executeUpdate(query);
  
        if (rowsAffected > 0) {
            System.out.println("Salary updated successfully for Employee ID: " + eid);
        } else {
            System.out.println("No record found with Employee ID: " + eid);
        }

        // Close resources
        stmt.close();
        con.close();
        sc.close();
    }
}
