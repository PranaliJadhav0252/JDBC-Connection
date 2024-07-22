import java.util.*;
import java.sql.*;
public class MySW {
    public static void main(String[] args) {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println(("Driver Loaded"));
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaCon","root","Satara@123");
        System.out.println("Connertction SuccessFul");
        Statement stmt=con.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll No : ");
        int roll=sc.nextInt();
        System.out.println("Enter Name : ");
        String name=sc.next();
        sc.nextLine();
        System.out.println("Mark1 : ");
        int m1=sc.nextInt();
        System.out.println("Mark2 : ");
        int m2=sc.nextInt();
        System.out.println("Mark3: ");
        int m3=sc.nextInt();

        int result=stmt.executeUpdate("insert into Student Values ("+roll+",'"+name+"',"+m1+","+m2+","+m3+")");
         if (result>0) {
            System.out.println("SuccessFully Added ");
         }
         else{
            System.out.println("Proper data Insert");
         }
         con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
