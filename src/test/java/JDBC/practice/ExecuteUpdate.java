package JDBC.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate {
	@Test
	public void executeUpdate() throws SQLException {
		Connection con = null;
		try {

		// Register the Database
			Driver dref = new Driver();
			DriverManager.registerDriver(dref);

		// Connect the Database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");

		// Create the Statement
			Statement stmt = con.createStatement();

		// Execute my query and will get the data
			int res = stmt.executeUpdate(
					"insert into students_info (regno, firstname, middlename, lastname) values('6', 'eswar','prasad', 'f');");
		//  int res = stmt.executeUpdate("delete from students_info where lastname='v'");
			System.out.println(res);
			if (res == 1) {
				System.out.println("Data is inserted into Database");
			} else {
				System.out.println("Data is not inserted into Database");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
		// Close the Connection
			con.close();
		}
	}
}