package com.amplifylife.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amplifylife.base.testBase;

public class HomePage extends testBase {
	
	//Homepage Page Objects
	
	@FindBy(xpath="//img[@class='amp-logo']")
	WebElement amplifyLogo;

	@FindBy(xpath = "//img[@class='app-demo-gif']")
	WebElement AppDemo;
	
	@FindBy(xpath="//app-banner//a[1]//img[1]")
	WebElement iosLink;
	
	@FindBy(xpath= "//app-banner//a[2]//img[1]")
	WebElement AndroidLink;
	
	@FindBy(xpath="//a[contains(text(),'Join the team')]")
	WebElement JoinTheTeam;
	
	
	//Health and Fitness Apps should be displayed
	@FindBy(xpath="//app-simple-card[1]//div[1]//img[1]")
	WebElement Lifeline;
	
	@FindBy(xpath="//div[contains(text(),'Explore your lifeline for a centralised health and')]")
	WebElement lifelineText;
	
	@FindBy(xpath="//app-simple-card[2]//div[1]//img[1]")
	WebElement Events;
	
	@FindBy(xpath="//div[contains(text(),'Browse a comprehensive list of events spanning acr')]")
	WebElement eventsText;
	
	@FindBy(xpath="//app-simple-card[3]//div[1]//img[1]")
	WebElement Devices;
	
	@FindBy(xpath="//div[contains(text(),'Connect your favourite tracking devices, currently')]")
	WebElement devicesText;
	
	@FindBy(xpath="//app-simple-card[4]//div[1]//img[1]")
	WebElement Challenges;
	
	@FindBy(xpath="//div[contains(text(),'Sign up to a challenge')]")
	WebElement challengesText;
	
	@FindBy(xpath="//app-simple-card[5]//div[1]//img[1]")
	WebElement Coaching;
	
	@FindBy(xpath="//div[contains(text(),'Receive coaching advise and tips from our team of ')]")
	WebElement coachingText;
	
	@FindBy(xpath="//app-simple-card[6]//div[1]//img[1]")
	WebElement Insights;
	
	@FindBy(xpath="//div[contains(text(),'Recive useful insights into your health and fitne')]")
	WebElement insightsText;
	
	@FindBy(xpath="//video[@class='large-screen']")
	WebElement runningVideo;
	

	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean logo()
	{
		return amplifyLogo.isDisplayed();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean appDemostatus()
	{
		return AppDemo.isDisplayed();
		
	}
	
	public void iosDownload()
	{
		iosLink.click();
		
	}
	
	public void googlePlay()
	{
		AndroidLink.click();
	}
	
	public com.amplifylife.page.JoinTheTeam theTeam()
	{
		JoinTheTeam.click();
		driver.getTitle();
		return new JoinTheTeam();
	}
	
	public boolean Lifeline()
	{
		return Lifeline.isDisplayed();
	}
	
	public boolean LifelineText()
	{
		return lifelineText.isDisplayed();
	}

	public boolean eventTest()
	{
		return Events.isDisplayed();
	}
	
	public boolean eventTextDisplay()
	{
		return eventsText.isDisplayed();
	}
	
	public boolean devicesTest()
	{
		return Devices.isDisplayed();
	}
	
	public boolean devicestext()
	{
		return devicesText.isDisplayed();
	}
	
	public boolean Challenges()
	{
		return Challenges.isDisplayed();
	}
	
	public boolean challangesText()
	{
		return challengesText.isDisplayed();
	}
	
	public boolean Coaching()
	{
		return Coaching.isDisplayed();	
	}
	
	public boolean coachingText()
	{
		return coachingText.isDisplayed();
	}
	
	public boolean Insights()
	{
	    return Insights.isDisplayed();
	}
	
	public boolean insightsText()
	{
		return insightsText.isDisplayed();
	}
	
	public boolean homePageVideo()
	{
		return runningVideo.isDisplayed();
	}


}
