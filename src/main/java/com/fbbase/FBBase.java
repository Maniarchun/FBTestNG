package com.fbbase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBBase {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\FBTestNG\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("There is no available browser ");
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void urlLaunch(String value) throws InterruptedException {
		driver.get(value);
		sleep();
		driver.manage().deleteAllCookies();

	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void navBack() {
		driver.navigate().back();
	}

	public static void implicitLoad() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void userInput(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void closeWindow() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
		
		

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void screenShot(String value) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("C:\\Users\\ELCOT\\eclipse-workspace\\FBTestNG\\target\\" + value + ".png");
		FileUtils.copyFile(ss, ff);
	}

	public static void dropDownSelect(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}

}
