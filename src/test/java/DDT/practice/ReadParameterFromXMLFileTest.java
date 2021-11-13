package DDT.practice;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadParameterFromXMLFileTest {
	@Test
	public void readParamFromXML1Test(XmlTest xml) {
		String URL = xml.getParameter("url");
		Reporter.log("URL of this webpage is " + URL, true);
//						OR
//		Reporter.log("URL of this webpage is "+xml.getParameter("url"), true);
	}

	@Parameters({"url", "username", "password" })
	@Test
	public void readParamFromXML2Test(String URL, String UN, String  PWD) {
		Reporter.log("url is ---"+URL, true);
		Reporter.log("username is --- " +UN, true);
		Reporter.log("password is --- "+ PWD, true);
	}
}