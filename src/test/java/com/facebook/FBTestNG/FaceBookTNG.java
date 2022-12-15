package com.facebook.FBTestNG;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fb.properties.ConfigHelper;
import com.fbbase.FBBase;
import com.fbpom.SingleTonDesignPatten;

public class FaceBookTNG extends FBBase {
	public static WebDriver driver;
	public SingleTonDesignPatten stdp;
	
	@BeforeClass
	private void luanch() throws Exception {
		
		driver=browserLaunch(ConfigHelper.getInstance().getBrowser());
		
		urlLaunch(ConfigHelper.getInstance().getUrl());
		stdp = new SingleTonDesignPatten(driver);
	
	}
	@Test(priority = 0)
	private void homePage() throws IOException, InterruptedException {
		
		implicitLoad();
		
		userInput(stdp.getLoginPage().getEmail(),ConfigHelper.getInstance().getUsername() );
		userInput(stdp.getLoginPage().getPassword(), ConfigHelper.getInstance().getPassword());
		clickElement(stdp.getLoginPage().getLoginButton());
		sleep();
	}
	@Test (priority = 1)
	private void createPage() throws IOException, InterruptedException {
		navBack();
		implicitLoad();
		stdp.getLoginPage().getCreateButton().click();
		userInput(stdp.getSignUpPage().getFirstName(), ConfigHelper.getInstance().getFirstName());
		userInput(stdp.getSignUpPage().getLastName(), ConfigHelper.getInstance().getLastName());
		userInput(stdp.getSignUpPage().getNewemail(), ConfigHelper.getInstance().getEmail());
		userInput(stdp.getSignUpPage().getConfrimMail(), ConfigHelper.getInstance().getEmail());
		userInput(stdp.getSignUpPage().getNewpassword(), ConfigHelper.getInstance().getNewPassword());
		dropDownSelect(stdp.getSignUpPage().getDay(), "text", ConfigHelper.getInstance().getDate());
		dropDownSelect(stdp.getSignUpPage().getMonth(), "value", ConfigHelper.getInstance().getMonth());
		dropDownSelect(stdp.getSignUpPage().getYear(), "Text", ConfigHelper.getInstance().getYear());
		clickElement(stdp.getSignUpPage().getSex());
		clickElement(stdp.getSignUpPage().getSignUp());
		sleep();
		screenShot("fb");
	}
	@AfterClass
	private void driveDown() {
		closeWindow();
	}
		
	
}
