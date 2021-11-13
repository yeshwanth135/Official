package DDT.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateUserTest {
	@Test
	public void createUserTest() {
		Reporter.log("Execute Script", true);
		String URL = System.getProperty("url");
		String UN = System.getProperty("username");
		String PWD = System.getProperty("password");
		
		Reporter.log("====>" + URL, true);
		Reporter.log("====>" + UN, true);
		Reporter.log("====>" + PWD, true);
	}
}