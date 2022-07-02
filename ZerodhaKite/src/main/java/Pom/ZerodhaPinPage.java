package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPinPage {
	
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement submit;
	@FindBy(xpath = "//a[@class='text-light forgot-link']") private WebElement forgot;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	
	@FindBy (xpath= "//input[@id='user_mobile']") private WebElement mobile;

	
	public ZerodhaPinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterPin(String pinNo, WebDriver driver) {
		WebDriverWait Wait= new WebDriverWait(driver, Duration.ofMillis(3000));
		Wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pinNo);
	}
	
	public void clickonSubmit() {
		submit.click();
	}
	
	public void clickonForgot() {
		forgot.click();
	}
	
	public void clickonSignup() {
		signup.click();
	}
	
	public void enterMobileNo(String no) {
		mobile.sendKeys(no);
}
}