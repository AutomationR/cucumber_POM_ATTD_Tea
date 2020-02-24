package com.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.automation.pages.BasePage;
import com.automation.pages.LetsTalkTea_HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Steps {
	
	public WebDriver driver;
	
	@Given("^Launch  chrome browser and enter the URL$")
	public void launch_chrome_browser_and_enter_the_URL() throws Throwable {
	  
		BasePage basepageObj = new BasePage();
		basepageObj.OpenBrowser();
	    
	}

	@When("^Click on the our passion link$")
	public void click_on_the_our_passion_link() throws Throwable {
		
		LetsTalkTea_HomePage homepageObj= new LetsTalkTea_HomePage(driver);
		homepageObj.clickOnPassionLink();
	    
	}


}
