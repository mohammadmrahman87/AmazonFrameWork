package com.Amazon.FrameWork.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {
	WebDriver driver;

	@Given("I am on the amazon homepage")
	public void i_am_on_the_amazon_homepage() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// WebElement searchBox;
		// searchBox = driver.findElement(By.name("field-keywords"));

		// searchBox.sendKeys();
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		WebElement searchBox;
		searchBox = driver.findElement(By.name("field-keywords"));

		searchBox.sendKeys(string);

	}

	@When("I click on amazon search button")
	public void i_click_on_amazon_search_button() {
		WebElement searchBtn;
		searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();

	}

	@Then("I received related search result")
	public void i_received_related_search_result() {
		
		WebElement resultStats;
		resultStats = driver.findElement(By.className("sg-col-inner"));
		String results = resultStats.getText();
		
		System.out.println("===================");
		System.out.println(results);
		System.out.println("====================");
	
		driver.close();
		
		//WebElement results=driver.findElement(By className(""));
		
	}
}
