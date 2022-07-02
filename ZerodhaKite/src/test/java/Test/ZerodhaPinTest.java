package Test;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pojo.Browser;
import Utility.Parametrization;
import Pom.ZerodhaLoginPage;
import Pom.ZerodhaPinPage;

public class ZerodhaPinTest {
	WebDriver driver; 
	
	@BeforeMethod
	public void browser() {
		driver = Browser.openBrowser(null);
	}
	
	@Test
	public void loginWithValidCredential() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage= new ZerodhaLoginPage(driver);
		String username = Parametrization.getdata("credent", 2, 2);
		String password = Parametrization.getdata("credent", 3, 2);
		zerodhaLoginPage.enterUsername(username);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickonLogin();
		
		
		Thread.sleep(4000);
		ZerodhaPinPage zerodhaPinPage= new ZerodhaPinPage(driver);
		String pinNo = Parametrization.getdata("credent", 4,2);
		System.out.println(pinNo);
		zerodhaPinPage.enterPin(pinNo, driver);
		//zerodhaPinPage.clickonSubmit();
		
		zerodhaPinPage.clickonSignup();
		
		Set<String> address=driver.getWindowHandles();
		System.out.println(address);
		Iterator<String> shu= address.iterator();
		
		while(shu.hasNext())
		{
			String add = shu.next();
			driver.switchTo().window(add);
			String title = driver.getTitle();
			if(title.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha"))
			{
				Thread.sleep(5000);
				String pins = Parametrization.getdata("credent", 5, 2);
				zerodhaPinPage.enterMobileNo(pins);
			}
		}
		}
	
	
	
	

}
