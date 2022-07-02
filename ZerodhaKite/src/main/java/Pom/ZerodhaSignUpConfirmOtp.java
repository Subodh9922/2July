package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpConfirmOtp {
	
	@FindBy (xpath= "//input[@autocapitalize='none']") private WebElement otp;
	@FindBy (xpath= "//button[@type='submit']") private WebElement confirm;
	@FindBy (xpath= "(//a[@href='https://zerodha.com/about/'])[1]") private WebElement aboutus;
	@FindBy (xpath= "(//a[@href='https://zerodha.com/products/'])[1]")private WebElement products;
	@FindBy (xpath= "(//a[@href='https://zerodha.com/pricing/'])[1]")private WebElement pricing;
	@FindBy (xpath= "(//a[@href='https://support.zerodha.com'])[1]")private WebElement support;
	@FindBy (xpath= "//li[@id='navbar_menu']")private WebElement radio;
	
	public ZerodhaSignUpConfirmOtp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterOtp(String number) {
		otp.sendKeys(number);
	}
	
	public void clickOnConfirm() {
		confirm.click();
	}
	
	public void clickOnAboutUs() {
		aboutus.click();
	}
	
	public void clickOnProducts() {
		products.click();
	}
	
	public void clickonPricing() {
		pricing.click();
	}
	
	public void clickOnSupport() {
		support.click();
	}
	
	public void clickOnRadio() {
		radio.click();
	}
	
	
	
	
	

}
