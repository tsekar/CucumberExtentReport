package com.cucumber.stepdefinitions;

import org.openqa.selenium.WebDriver;

public class Base {
	public static WebDriver driver;

	public static void closeBrowser() {
		driver.close();
	}
}
