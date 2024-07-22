import java.sql.*;  
class DBcon
{  
public static void main(String args[])
{  
try{  
Class.forName("com.mysql.cj.jdbc.Driver"); 
//System.out.println("Driver loaded");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Satara@123"); 
//System.out.println("Connection created");   
Statement stmt=con.createStatement();
  
ResultSet rs=stmt.executeQuery("select * from dept");
  
while(rs.next()) 
{ 

System.out.println(rs.getString(1)+"  "+rs.getString(2));  
}
con.close();  
}catch(Exception e){ System.out.println(e);} 
 
}  
}  
