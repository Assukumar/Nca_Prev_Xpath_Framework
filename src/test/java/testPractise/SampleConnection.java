package testPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import genericUtility.IconstantUtility;

public class SampleConnection {
 public static void main(String[] args) throws Exception 
 {
	 Connection c=null;
	/*establish the connection*/
	try {
	c= DriverManager.getConnection(IconstantUtility.dbpath,IconstantUtility.dbUsername,
			IconstantUtility.dbPass);
	/*create Satement/*/
	Statement s=c.createStatement();
	/*Execute Query*/
   ResultSet rs=	s.executeQuery("select * from Students");
   while(rs.next()) {
	   System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+
   rs.getString(3)+" "+rs.getString(4));
   }
   }
	catch (Exception e) {
		
	}
	/*Closed the connection*/
   finally {
	c.close();
}
}
}
