package Screenshots;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.amplifylife.base.testBase;


@Listeners(customListeners.class)

public class TakeScreenShot extends testBase {
	

	@BeforeMethod
	public void setUp()
	{
		Initialisation();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
//	@Test
//	public void takeScreenShottest()
//	{
//		Assert.assertEquals(false, true);
//	}

}
  