package com.fbpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	

	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement createButton;
	

	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCreateButton() {
		return createButton;
	}
}
