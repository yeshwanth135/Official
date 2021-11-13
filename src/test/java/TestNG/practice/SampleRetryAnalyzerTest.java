package TestNG.practice;

import org.testng.annotations.Test;

public class SampleRetryAnalyzerTest
{
	@Test(retryAnalyzer = com.vtiger.genericutil.RetryAnalyser.class)
	public void createOrg()
	{
		System.out.println(10/0);
	}
}