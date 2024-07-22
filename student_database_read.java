import java.sql.*;  
class student_database_read
{  
public static void main(String args[])
{  
try{  
Class.forName("com.mysql.cj.jdbc.Driver"); 
System.out.println("Driver loaded");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaCon","root","Satara@123"); 
System.out.println("Connection created");   
Statement stmt=con.createStatement();
  
ResultSet rs=stmt.executeQuery("select * from Student");
  
while(rs.next()) 
{ 

System.out.println("roll number : "+rs.getInt(1)+"\nName: "+rs.getString(2)+"\nmarks:sunject1- "+rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5));  
}
con.close();  
}catch(Exception e){ System.out.println(e);} 
 
}  
}  