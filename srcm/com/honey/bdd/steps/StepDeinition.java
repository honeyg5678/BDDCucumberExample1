package com.honey.bdd.steps;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDeinition {
	public static WebDriver driver;

	@Given("user launach any browser")
	public void user_launach_any_browser() {
		System.setProperty("webdriver.chrome.driver", "./res/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Given("after launching enter url of application")
	public void after_launching_add_url_of_application() {
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("user shoukd land on page sucessfully")
	public void user_shoukd_land_on_page_sucessfully() {
		WebElement element = driver.findElement(By.xpath("//u[text() = 'Facebook']"));
		Assert.assertTrue(element.isDisplayed());
	}

	@When("user verify the title of application")
	public void user_verify_the_totle_of_application() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Facebook - Log In or Sign Up", pageTitle);

	}

	@When("user enter first name as (.*) in the first name text box")
	public void user_enter_first_name_the_first_name_text_box(String firstName) {
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys(firstName);
	}

	@Then("user enter last name as (.*) in the last name text box")
	public void user_enter_last_name_in_the_last_name_text_box(String lastName) {
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys(lastName);
	}
	
	@Then("user enter email as (.*) in the email text box")
	public void user_enter_email_as_a_email_in_the_email_text_box(String email) {
		driver.findElement(By.xpath("//input[@id=\"u_0_r\"]")).sendKeys(email);
	}

	@Then("user enter password as (.*) in the password text box")
	public void user_enter_password_as_a_in_the_password_text_box(String password) {
		driver.findElement(By.xpath("//input[@id=\"u_0_w\"]")).sendKeys(password);
	}

}