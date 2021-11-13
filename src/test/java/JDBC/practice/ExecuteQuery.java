package JDBC.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery
{
	@Test
	public void executeQueryTest() throws SQLException
	{
	// Register the Database
		Driver dref = new Driver();
		DriverManager.registerDriver(dref);		
		
	// Connect the Database								
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		
	// Create the Statement
		Statement stmt = con.createStatement();
		
	// Execute my query and will get the data
		ResultSet res = stmt.executeQuery("select * from students_info;");
		
	// Printing
		while(res.next())
		{
			System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4));
		}
		
	// Close the Connection
		con.close();
	}
}
