import java.sql.*;
public class MySR {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(("Diver Loaded"));
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaCon","root","Satara@123");
            System.out.println("Connection Successful");
Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from Student");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)
                +" "+rs.getInt(5));
            }

           
         con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
