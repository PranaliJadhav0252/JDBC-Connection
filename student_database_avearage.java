import java.sql.*;  
class student_database_avearage
{  
public static void main(String args[])
{  
try{  
Class.forName("com.mysql.cj.jdbc.Driver"); 
System.out.println("Driver loaded");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaCon","root","Satara@123"); 
System.out.println("Connection created");   
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select avg(Subject1) as avgSub1 ,avg(Subject2) as avgSub2,avg(Subject3)as avgSub3 from Student");

//System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)); 
while(rs.next()) 
{ 

System.out.println("AvgS1 : "+rs.getInt(1)+" AvgS2: "+rs.getInt(2)+" Avg3: "+rs.getInt(3));  
}
con.close();  
}catch(Exception e){ System.out.println(e);} 
 
}  
}  