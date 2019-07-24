package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shop {
	static WebDriver driver;

	@Given("i want go to reed url and homepage")
	public void i_want_go_to_reed_url_and_homepage() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\\\\\Selenium\\\\\\\\Company\\\\\\\\driver\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.reed.co.uk/");
		System.out.println("Given-1");

	}

	@When("i want to search courses and and select the course")
	public void i_want_to_search_courses_and_and_select_the_course() {
		driver.findElement(By.xpath("(//a[@class='gtmHeaderNav header-block-link'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Free courses'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Everyday English Level 1']")).click();

	}

	@Then("i want ro enquire the course")
	public void i_want_ro_enquire_the_course() {
		driver.findElement(By.xpath("(//a[@class='gtmEnquireNow btn btn-block btn-primary'])[3]")).click();

	}

}
