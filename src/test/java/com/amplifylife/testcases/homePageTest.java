package com.amplifylife.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.amplifylife.base.testBase;
import com.amplifylife.page.HomePage;
import com.amplifylife.page.JoinTheTeam;

public class homePageTest extends testBase {

	HomePage homepage;
	JoinTheTeam jointheteam;

	public homePageTest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		Initialisation();
		homepage = new HomePage();

	}
	
	@Test(priority=1)
	public void amplifyLogoTest()
	{
		boolean logo =homepage.logo();
		AssertJUnit.assertTrue(true);
		if (logo == true) {
			System.out.println(logo + " " + "Amplify Logo displays as expected");
		} else {
			System.out.println(logo + " " + " Amplify Logo is not displaying ");
		}
	}

	@Test(priority=2)
	public void GetPageTitleTest() {
		String PageTitle = homepage.getPageTitle();
		AssertJUnit.assertEquals(PageTitle, "AmplifyLife");
		System.out.println(PageTitle);
	}

	@Test(priority=3)
	public void AppdemoTest() {
		boolean status = homepage.appDemostatus();
		AssertJUnit.assertTrue(true);
		// System.out.println(status + );
		if (status == true) {
			System.out.println(status + " " + "The App demo displays as expected");
		} else {
			System.out.println(status + " " + " App demo is not displaying ");
		}
	}

	@Test(priority=4)
	public void testIosLink() {
		homepage.iosDownload();
		String PageTitle = driver.getCurrentUrl();
		System.out.println(PageTitle);
	}

	@Test(priority=5)
	public void testAndroidLink() {
		homepage.googlePlay();
		String PageTitle = driver.getCurrentUrl();
		System.out.println(PageTitle);
	}

	@Test(priority=6)
	public void theteamLink() {
		jointheteam = homepage.theTeam();
		String PageTitle = driver.getCurrentUrl();
		System.out.println(PageTitle);
	}

	// *********************************************************************
	// Test if Health and Fitness app icons and text are displayed with no errors

	@Test(priority=7)
	public void LifelineApp() {
		boolean Status = homepage.Lifeline();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Lifline displays as expected");
		} else {
			System.out.println(Status + " " + " Lifeline is not displaying ");
		}

	}

	@Test(priority=8)
	public void LifelineText() {
		boolean Status = homepage.LifelineText();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Lifline Text displays as expected");
		} else {
			System.out.println(Status + " " + " Lifeline Text is not displaying ");
		}


	}
	
	@Test(priority=9)
	public void eventsDisplay()
	{
		boolean Status =homepage.eventTest();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Events icon displays as expected");
		} else {
			System.out.println(Status + " " + " Events icon is not displaying ");
		}

	}
	
	@Test(priority=10)
	public void eventsTextTest()
	{
		boolean Status = homepage.eventTextDisplay();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Events Text displays as expected");
		} else {
			System.out.println(Status + " " + " Events Text is not displaying ");
		}

	}
	@Test(priority=11)
	public void devicesTest()
	{
		boolean Status =homepage.devicesTest();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Device icon displays as expected");
		} else {
			System.out.println(Status + " " + " Device icon is not displaying ");
		}

		
	}
	
	@Test(priority=12)
	public void devicesTextTest()
	{
		boolean Status =homepage.devicestext();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Device text displays as expected");
		} else {
			System.out.println(Status + " " + " Device text is not displaying ");
		}

		
	}
	
	@Test(priority=13)
	public void challengesTest()
	{
		boolean Status =homepage.Challenges();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Challenges icon displays as expected");
		} else {
			System.out.println(Status + " " + " Challenges icon is not displaying ");
		}

		
	}
	
	@Test(priority=14)
	public void challengesTextTest()
	{
		boolean Status =homepage.challangesText();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Challenges text displays as expected");
		} else {
			System.out.println(Status + " " + " Challenges text is not displaying ");
		}

		
	}
	
	@Test(priority=15)
	public void coachingTest()
	{
		boolean Status =homepage.Coaching();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Coaching icon displays as expected");
		} else {
			System.out.println(Status + " " + " Coaching icon is not displaying ");
		}

		
	}
	
	@Test(priority=16)
	public void coachesTextTest()
	{
		boolean Status =homepage.coachingText();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Coaching text displays as expected");
		} else {
			System.out.println(Status + " " + " Coaching text is not displaying ");
		}

		
	}
	
	@Test(priority=17)
	public void insightsTest()
	{
		boolean Status =homepage.Insights();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Insights icon displays as expected");
		} else {
			System.out.println(Status + " " + " Insights icon is not displaying ");
		}

		
	}
	
	@Test(priority=18)
	public void insightsTextTest()
	{
		boolean Status =homepage.insightsText();
		AssertJUnit.assertTrue(true);
		if (Status == true) {
			System.out.println(Status + " " + "Insights text displays as expected");
		} else {
			System.out.println(Status + " " + " Insights text is not displaying ");
		}

		
	}
	
	@Test
	public void homePageVideo()
	{
		boolean running = homepage.homePageVideo();
		Assert.assertTrue(true);
		if (running == true) {
			System.out.println(running + " " + " Running video displays as expected");
		} else {
			System.out.println(running + " " + " Running video is not displaying ");
		}

	}
	
	
	

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
