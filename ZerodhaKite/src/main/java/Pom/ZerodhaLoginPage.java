package Pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage {
	
	@FindBy (xpath= "//input[@id='userid']") private WebElement username;
	@FindBy (xpath=  "//input[@id='password']") private WebElement password;
	@FindBy (xpath= "//button[@type='submit']") private WebElement login;
	@FindBy (xpath= "//a[text()= 'Forgot user ID or password?']") private WebElement forgot;
	@FindBy (xpath= "//a[text()= \"Don't have an account? Signup now!\"]") private WebElement signup;
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement submit;
	
	@FindBy (xpath=  "//input[@icon='search']") private WebElement search;
	@FindBy (xpath= "(//span[text()='TATAMOTORS'])[2]") private WebElement tata;
	@FindBy (xpath= "//button[@class='button-blue buy']") private WebElement buy;
	@FindBy (xpath = "//input[@id='radio-153']") private WebElement intraday;
	@FindBy (xpath= "(//input[@dynamicwidthsize='8'])[2]") private WebElement quantity;
	@FindBy (xpath= "//span[text()='User ID should be minimum 6 characters.']") private WebElement error;
	
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String user) {
		username.sendKeys(user);
	}
	
	public String getErrorText() {
		error.click();
		return null;
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickonLogin() {
		login.click();
	}
	
	public void clickonForgot() {
		forgot.click();
	}
	
	public void clickonSignup() {
		signup.click();
	}
	
	
	public void enterPin(String pinNo, WebDriver driver) {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(10000));// explicit wait
	wait.until(ExpectedConditions.visibilityOf(pin));						// explicit wait
	pin.sendKeys(pinNo);													// explicit wait
	}
	
	//public void enterPin (String pinNo, WebDriver driver) {
	//	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver); //fluent wait
	//	wait.withTimeout(Duration.ofMillis(3000));
	//	wait.pollingEvery(Duration.ofMillis(100));
	//	wait.ignoring(Exception.class);
	//	wait.until(ExpectedConditions.visibilityOf(pin));
	//	pin.sendKeys(pinNo);
		
	//	}
	
	public void clickonSubmit() {
		submit.click();
	}
	
	public void clickonSearch(String a) {
		search.sendKeys(a);
	}
	
	
	public void clickonTataMotors() {
		tata.click();
		
	}
	public void moveOnTataMotors(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(tata);
		act.perform();
	}
	
	public void clickonBuy() {
		buy.click();
	}
	
	public void RadioButtonIntraday() {
		intraday.click();
	}
	
	public void selectDropDownShare(WebDriver driver) {
		Select a= new Select((WebElement) driver);
		a.selectByIndex(21);
		
		
		
		
	}

}
