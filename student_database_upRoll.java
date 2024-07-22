import java.sql.*;  
import java.util.*;
class student_database_upRoll
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

System.out.println("Enter the Updated Marks for Subject 1 : ");
int sub1=sc.nextInt();
System.out.println("Enter the Updated Marks for Subject 2 : ");
int sub2=sc.nextInt();
System.out.println("Enter the Updated Marks for Subject 3 : ");
int sub3=sc.nextInt();
String query="Update Student "+" SET subject1="+sub1+", subject2="+sub2+" ,subject3="+sub3+" where Roll_no="+roll;

                           
int upd=stmt.executeUpdate(query);
if(upd==1)
System.out.println("update successful");
else
System.out.println("entered roll no is invalid");
con.close();  
}catch(Exception e){ 

  System.out.println(e);


} 
 
}  
}  