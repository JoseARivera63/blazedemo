package com.noorteck.qa.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.qa.pages.blazedemo;
import com.noorteck.qa.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class blazedemosteps {
	
	blazedemo blaze;
	
	@Given("User navigates to Register Page {string}")
	public void user_navigates_to_register_page(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000); 
		
		blaze = new blazedemo();
	}

	@When("User enters Full Name {string}")
	public void user_enters_full_name(String name) {
	blaze.enterFirstLast(name);    
	}

	@When("User enters Address {string}")
	public void user_enters_address(String address) {
		blaze.enterLastName(address);
	    
	}

	@When("User enters City {string}")
	public void user_enters_city(String city) {
		blaze.enterCity(city);
	    
	}

	@When("User enters State {string}")
	public void user_enters_state(String state) {
		blaze.enterState(state);
	    
	}

	@When("User selects Zip Code {string}")
	public void user_selects_zip_code(String zipCode) {
		blaze.enterzipCode(zipCode);
	    
	}

	@When("User selects cardType {string}")
	public void user_selects_card_type(String cardType) {
		blaze.enterCardType(cardType);
	    
	}

	@When("User selects Credit Card Number {string}")
	public void user_selects_credit_card_number(String CreditCardNumber) {
		blaze.creditcardnumber(CreditCardNumber);
	    
	}

	@When("Selects month and year {string} {string}")
	public void selects_month_and_year(String month, String year) {
		blaze.monthandyear(month, year);
	  
	}

	@When("User enters name on Carde {string}")
	public void user_enters_name_on_carde(String ccName) {
		blaze.nameoncarde(ccName);
		
	}

	@When("User clicks Remember me button")
	public void user_clicks_remember_me_button() {
		blaze.rememberme();
	    
	}

	@When("User clicks Purchase Flight button")
	public void user_clicks_purchase_flight_button() {
		blaze.purchaseflight();
	    
	}

	@Then("User verifies success message {string}")
	public void user_verifies_success_message(String message) {
		blaze.verifyingmessage(message);
	    
		
		Constants.driver.quit();

	}
	
	

}
