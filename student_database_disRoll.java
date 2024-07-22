import java.sql.*;  
import java.util.*;
class student_database_disRoll
{  
public static void main(String args[])
{  
try{  
Class.forName("com.mysql.cj.jdbc.Driver"); 
System.out.println("Driver loaded");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaCon","root","Satara@123"); 
System.out.println("Connection created");   
Statement stmt=con.createStatement();

Scanner sc=new Scanner(System.in);

System.out.println("Enter Student RollNo: ");
int roll=sc.nextInt();

ResultSet rs=stmt.executeQuery("select * from Student where Roll_no= "+roll);

while(rs.next()) 
{ 
System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5));  
}


con.close();  
}catch(Exception e){ 

System.out.println(e);


} 
 
}  
}  