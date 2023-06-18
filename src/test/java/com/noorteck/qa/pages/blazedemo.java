package com.noorteck.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.Constants;

public class blazedemo {
	
	//WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='First Last']")
	WebElement firstNameField;
	
	@FindBy(xpath = "//*[@id=\"address\"]")
	WebElement addressField;
	
	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElement City;
	
	@FindBy(xpath = "//*[@id=\"state\"]")
	WebElement State;
	
	@FindBy(xpath = "//*[@id=\"zipCode\"]")
	WebElement ZipCode;
	
	@FindBy(xpath = "//select[@id='cardType']")
	WebElement CardType;
	
	@FindBy(xpath = "//*[@id=\"creditCardNumber\"]")
	WebElement creditcardnumber;
	
	@FindBy(xpath = "//*[@id=\"creditCardMonth\"]")
	WebElement creditcardmonth;
	
	@FindBy(xpath = "//*[@id=\"creditCardYear\"]")
	WebElement creditcardyear;
	
	@FindBy(xpath = "//*[@id=\"nameOnCard\"]")
	WebElement nameOnCard;
	
	@FindBy(id = "rememberMe")
	WebElement checkbox;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement purchaseFlightButton;
	
	@FindBy(xpath = "/html/body/div[2]/div/h1")
	WebElement message;
	
	
	//Class Constructor
	public blazedemo() {
		PageFactory.initElements(Constants.driver, this);
	}
	
	//methods
		public void enterFirstLast(String firstName) {
			firstNameField.sendKeys(firstName);
		}
		
		public void enterLastName(String address) {
			addressField.sendKeys(address);
		}
		
		public void enterCity(String City) {
			addressField.sendKeys(City);
		}
		
		public void enterState(String State) {
			addressField.sendKeys(State);
		}
	
		public void enterzipCode(String zipCode) {
			addressField.sendKeys(zipCode);
		}
		
		public void enterCardType(String cardType) {
			
			Select select = new Select (CardType);
			select.selectByVisibleText(cardType);
		}
		
		public void creditcardnumber(String creditcardnumber1) {
			
			creditcardnumber.sendKeys(creditcardnumber1);
					
		}
		
		public void monthandyear(String month1, String year1) {
			
			creditcardmonth.sendKeys(month1);
			creditcardyear.sendKeys(year1);
		}
		
		public void nameoncarde(String cardname) {
			
			nameOnCard.sendKeys(cardname);
		}
		
		public void rememberme() {
			
			checkbox.click();
			
			
		}
		
		public void purchaseflight() {
			purchaseFlightButton.click();
			
		}
		
		public void verifyingmessage(String verifymesssage) {
			
			if (message.equals(verifymesssage) )
				System.out.println("Thank you for your purchase!");
			else
				System.out.println("Purchase failed");
			
			
		}
	
	

}
