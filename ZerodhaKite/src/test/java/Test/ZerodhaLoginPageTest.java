package Test;

import Utility.Parametrization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pojo.Browser;
import Pom.ZerodhaLoginPage;
@Listeners(TestListeners.class)
public class ZerodhaLoginPageTest extends BaseTest{
	WebDriver driver;
	
	
	@BeforeMethod
	public void BrowserOpen() {
		driver = Browser.openBrowser(null);
		}
	
	@Test
	public void LoginWithValidCredentials() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage= new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickonLogin();
		String text = zerodhaLoginPage.getErrorText();
		String expectedText = "User ID should be minimum 6 characters.";
		
		Assert.assertEquals(text, expectedText );   //hard assert
		
		String username = Parametrization.getdata("credent", 2, 2);
		String password = Parametrization.getdata("credent", 3, 2);
		zerodhaLoginPage.enterUsername(username);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickonLogin();
		
		String pin = Parametrization.getdata("credent", 4, 2);
		zerodhaLoginPage.enterPin(pin, driver);
		zerodhaLoginPage.clickonSubmit();
	}
	
	
	
	@Test
	public void forgotPasswordLinkTest() {
		ZerodhaLoginPage zerodhaLoginPage= new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickonForgot();
	}
	
	@Test
	public void signupLinkTest() {
		ZerodhaLoginPage zerodhaLoginPage= new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickonSignup();
	}
}
