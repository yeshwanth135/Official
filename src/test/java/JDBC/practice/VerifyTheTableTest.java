package JDBC.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class VerifyTheTableTest {
	@Test
	public void verifyTheTable() throws Throwable {
		Connection con = null;
		try {
			String expectedData = "ramu";

		// Register the Database
			Driver dref = new Driver();
			DriverManager.registerDriver(dref);

		// Connect the Database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");

		// Create the Statement
			Statement stmt = con.createStatement();

		// Execute my query and will get the data
			ResultSet res = stmt.executeQuery("select * from students_info;");
			boolean flag = false;

			while (res.next()) {
				String actualdata = res.getString(2);
				if (actualdata.equals(expectedData)) {
					System.out.println(expectedData + " is present");
					flag = true;
					break;
				}
			}
			Assert.assertEquals(flag, true);
			System.out.println("it is passed");
		} catch (Exception e) {

		} finally {
		// Close the Connection
			con.close();
		}
	}
}
