package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot {
	
	public static void takesScreenShot(WebDriver driver, String fail) throws IOException {
		String d= Screenshot.date();
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File ("C:\\Users\\Subodh\\Documents\\screenshot\\"+fail + d+".jpg");
		
		FileHandler.copy(source, destination);
		}
	
	public static String date() {
		DateTimeFormatter dtf = new DateTimeFormatter("yyyy-mm-dd hh-mm-ss");
		LocalDateTime current= LocalDateTime.now();
		String d = dtf.format(current);
		return d;
	}
}
