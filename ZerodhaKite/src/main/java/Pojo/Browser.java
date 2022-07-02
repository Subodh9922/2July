package Pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Subodh\\Downloads\\selenium chrome\\chromedriver_win32\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  // implicit wait
		return driver;
	}

}
