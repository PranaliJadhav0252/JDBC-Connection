import java.sql.*;  
import java.util.*;
class student_database_delete
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
int delet;  
do{
System.out.println("Enter Student RollNo: ");
int roll=sc.nextInt();

delet=stmt.executeUpdate("delete from Student where Roll_no= "+roll);

if(delet==1)
System.out.println("Deleted succesfully");
else
System.out.println("unsuccesful operation");
}while(delet!=1);

con.close();  
}catch(Exception e){ System.out.println(e);} 
 
}  
}  