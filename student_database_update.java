import java.sql.*;  
import java.util.*;
class student_database_update
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
System.out.println("Enter Student Name: ");
String nm=sc.next();
sc.nextLine();
System.out.println("Enter the Marks for Subject 1 : ");
int sub1=sc.nextInt();
System.out.println("Enter the Marks for Subject 2 : ");
int sub2=sc.nextInt();
System.out.println("Enter the Marks for Subject 3 : ");
int sub3=sc.nextInt();

int insrt=stmt.executeUpdate("insert into Student values("+roll+",'"+nm+"',"+sub1+","+sub2+","+sub3+")");

if(insrt>0)
System.out.println("Record Inserted Successfully....... ");
else
System.out.println("Insert Proper Data");

con.close();  
}
catch(Exception e){ 
System.out.println("This Roll Number Already Exist");
} 
 
}  
}  