package com.fb.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties p;
	public ConfigReader() throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\FBTestNG\\src\\main\\java\\com\\fb\\properties\\fbtng.properties");
		FileInputStream fi = new FileInputStream(f);
		p = new Properties();
		p.load(fi);
	}
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getFirstName() {
		String firstName = p.getProperty("firstName");
		return firstName;
	}
	public String getLastName() {
		String lastName = p.getProperty("lastName");
		return lastName;
	}
	public String getEmail() {
		String email = p.getProperty("email");
		return email;
	}
	public String getNewPassword() {
		String newPass = p.getProperty("newPassword");
		return newPass;
	} 
	public String getDate() {
		String date = p.getProperty("date");
		return date;
	}

	public String getMonth() {
		String month = p.getProperty("month");
		return month;
	}
	public String getYear() {
		String year = p.getProperty("year");
		return year;
	}
}
