package TestNG.practice;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider
	public Object[][] sendData() {
		Object[][] ob = new Object[5][2];

		ob[0][0] = "ACC_1";
		ob[0][1] = 7568;

		ob[1][0] = "ACC_2";
		ob[1][1] = 4573;

		ob[2][0] = "ACC_3";
		ob[2][1] = 8624;
		
		ob[3][0] = "ACC_3";
		ob[3][1] = 8624;
		
		ob[4][0] = "ACC_3";
		ob[4][1] = 8624;
		
		return ob;
	}

	@Test(dataProvider = "sendData")
	public void getData(String name, double bal) {
//		System.out.println("Name of Account Holder :" + name + " Balance :" + bal);
		Reporter.log("Name of Account Holder :" + name + " Balance :" + bal,true);
	}
}