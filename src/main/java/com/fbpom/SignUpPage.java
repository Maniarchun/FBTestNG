package com.fbpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	public static WebDriver driver;
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	
	@FindBy(name = "lastname")
	private  WebElement lastName;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement newemail;
	
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	private WebElement confrimMail;
	
	@FindBy(xpath = "//input[@data-type='password']")
	private WebElement newpassword;
	
	@FindBy(id = "day")
	private WebElement day;
	
	@FindBy(id = "month")
	private WebElement month;
	
	@FindBy(id = "year")
	private WebElement year;
	
	@FindBy(xpath = "//label[text()='Male']")
	private WebElement sex;
	
	@FindBy(name = "websubmit")
	private WebElement signUp;
	



	
	
	public SignUpPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getNewemail() {
		return newemail;
	}

	public WebElement getConfrimMail() {
		return confrimMail;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getSex() {
		return sex;
	}
	public WebElement getSignUp() {
		return signUp;
	}

}
