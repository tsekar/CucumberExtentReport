package com.cucumber.stepdefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs extends Base {

	@Before
	public void beforeScenario(Scenario scenario) {
		if (scenario.getName().equals("My First Scenario")) {
			Reporter.assignAuthor("Vimalraj");
		}
	}

	@Given("I have (\\d+) cukes in my belly")
	public void I_have_cukes_in_my_belly(int cukes) throws IOException {
		Reporter.addStepLog("My test addStepLog message");
		Reporter.addScenarioLog("This is scenario log");
		// Reporter.addScreenCaptureFromPath(
		// "/Users/vimalrajselvam/Downloads/best-resume-template-2016-3.jpg",
		// "My title");
	}

	@Given("I have (\\d+) cukes in my bellies")
	public void I_have_cukes_in_my_bellies(int cukes) {
		System.out.format("Cukes: %n\n", cukes);
	}

	@Then("^I print$")
	public void iPrint() throws Throwable {
		// Assert.assertTrue(false);
	}

	@When("^I login with credentials$")
	public void iLoginWithCredentials(DataTable table) {
	}

	@Given("^navigate to facebook page$")
	public void navigate_to_facebook_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\PVH\\B2C\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
	}

	@And("^check for the page title$")
	public void check_for_the_page_title() throws Throwable {
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("facebook")) {
			System.out.println("Facebook Title Verifications");
		} else {
			System.out.println("Title Not verified");
		}
	}

	@And("^close browser$")
	public void close_browser() throws Throwable {
		closeBrowser();
	}

	@And("^Enter the username (.*)$")
	public void enter_the_username(String username) throws Throwable {
		driver.findElement(By.name("email")).sendKeys(username);
		Reporter.addScreenCaptureFromPath("D://PVH//username.png");
	}

	@And("^Enter the password value (.*)$")
	public void enter_the_password_valuetest(String password) throws Throwable {
		driver.findElement(By.name("pass")).sendKeys(password);
		Reporter.addScreenCaptureFromPath("D://PVH//pass.png");
	}

	@And("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000l);
	}

	@Given("^navigate to flipkart page$")
	public void navigate_to_flipkart_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\PVH\\B2C\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
	}

	@Given("^check for flipkart page title$")
	public void check_for_flipkart_page_title() throws Throwable {
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("flipkart")) {
			System.out.println("Flipkart Title Verifications");
		} else {
			System.out.println("Title Not verified");
		}
	}

	@Given("^click overlay$")
	public void click_overlay() throws Throwable {
		driver.findElement(By.xpath("(.//*[@class='_3Njdz7']//button)[1]")).click();
	}

	@Given("^press on login link$")
	public void press_on_login_link() throws Throwable {
		driver.findElement(By.linkText("Login & Signup")).click();
		System.out.println("Click on Login Link");
	}

	@Given("^user is in google homepage$")
	public void user_is_in_google_homepage() {
		System.setProperty("webdriver.chrome.driver", "D:\\PVH\\B2C\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@When("^user enter the search term \"([^\"]*)\"$")
	public void user_enter_the_search_term(String search) throws InterruptedException {
		System.out.println("Google search");
		driver.findElement(By.name("q")).sendKeys(search);
		driver.findElement(By.name("q")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
	}

	@When("^validate the search term$")
	public void validate_the_search_term() {
	}
}
