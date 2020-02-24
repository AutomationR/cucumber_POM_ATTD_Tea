package com.automation.pages;
//For one driver instance
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static WebDriver driver;
	
	public void OpenBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://www.practiceselenium.com/");
		driver.manage().window().maximize();
	}
	
}
