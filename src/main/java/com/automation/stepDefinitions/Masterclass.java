package com.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.automation.pages.LetsTalkTea_Checkout;
import com.automation.pages.LetsTalkTea_HomePage;
public class Masterclass {
public WebDriver driver;

public LetsTalkTea_HomePage letsTalkTea_HomePage= null;
public LetsTalkTea_Checkout letsTalkTea_Checkout =null;

public void getLetsTalkTea_HomePage() {
letsTalkTea_HomePage = new LetsTalkTea_HomePage(driver);
}

public void getLetsTalkTea_CheckoutPage() {
letsTalkTea_Checkout = new LetsTalkTea_Checkout(driver);
}


}