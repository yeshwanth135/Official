package TestNG.practice;

import org.testng.annotations.*;

import com.vtiger.genericutil.BaseClass;

@Listeners(com.vtiger.genericutil.ListenersImp.class)
public class SampleListenersTest extends BaseClass
{
	@Test
	public void createOrg()
	{
		System.out.println(10/0);
	}
	public void modifyOrg()
	{
		System.out.println("Modify the Organization");
	}
}