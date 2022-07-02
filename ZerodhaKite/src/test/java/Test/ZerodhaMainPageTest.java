package Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom.ZerodhaLoginPage;
import Pom.ZerodhaMainPage;
import Utility.Parametrization;
import Pojo.Browser;
public class ZerodhaMainPageTest {
	WebDriver driver;
	@BeforeMethod
	public void PlzBrowserOpen() {
		 driver = Browser.openBrowser(null);
		}
	
	@Test
	public void LoginZerodhaWithValidData() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String userID = Parametrization.getdata("credent", 2, 2);
		String passWord = Parametrization.getdata("credent", 3, 2);	
		zerodhaLoginPage.enterUsername(userID);
		zerodhaLoginPage.enterPassword(passWord);
		zerodhaLoginPage.clickonLogin();
		String Pin = Parametrization.getdata("credent", 4, 2);
		zerodhaLoginPage.enterPin(Pin, driver);
		zerodhaLoginPage.clickonSubmit();
		
		ZerodhaMainPage zerodhaMainPage= new ZerodhaMainPage(driver);
		String shareName = Parametrization.getdata("credent", 7, 2);
		Thread.sleep(4000);
		zerodhaMainPage.clickonSearch(shareName);
		
		Thread.sleep(4000);
		zerodhaMainPage.clickonBuy(driver);
		
		zerodhaMainPage.clickonIntraday();
		
		Thread.sleep(3000);
		zerodhaMainPage.clickonLongterm();
		
		zerodhaMainPage.clickonMarket();
		Thread.sleep(3000);
		zerodhaMainPage.clickonLimit();
		Thread.sleep(3000);
		zerodhaMainPage.clickonSl();
		Thread.sleep(3000);
		zerodhaMainPage.clickonSlm();
		
		zerodhaMainPage.clickonSubmit();
		
		Thread.sleep(3000);
		zerodhaMainPage.clickonTogglekey();
		
		//////////////////////sell ki bari
		String ShareName2= Parametrization.getdata("credent", 6, 2);
		zerodhaMainPage.clickonSearch(ShareName2);
		Thread.sleep(3000);
		zerodhaMainPage.clickonSell(driver);
		
		zerodhaMainPage.clickonIntraday();
		zerodhaMainPage.clickonMarket();
		zerodhaMainPage.clickonSl();
		zerodhaMainPage.clickonLimit();
		zerodhaMainPage.clickonSlm();
		zerodhaMainPage.clickonSubmit();
		
		zerodhaMainPage.clickonSearch(shareName);
		
		Thread.sleep(2000);
		zerodhaMainPage.clickonChart(driver);
		
		zerodhaMainPage.clickonSearch2();
		Thread.sleep(2000);
		zerodhaMainPage.clickonDeleteWatchlist(driver);
		
		System.out.println("this is India")	;	
		}
	
	
	
	

}
