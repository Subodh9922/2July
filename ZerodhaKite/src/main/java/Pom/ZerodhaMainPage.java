package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ZerodhaMainPage {
	
	@FindBy (xpath= "//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']") private WebElement search;
	@FindBy (xpath= "(//span[@class='tradingsymbol'])[3]") private WebElement tatasteel;
	@FindBy (xpath= "//button[@class='button-blue']") private WebElement buy;
	@FindBy (xpath= "(//label[@class='su-radio-label'])[6]")  private WebElement intraday;
	@FindBy (xpath= "(//label[@class='su-radio-label'])[7]") private WebElement longterm;
	@FindBy (xpath= "(//label[@class='su-radio-label'])[8]") private WebElement market;
	@FindBy (xpath= "(//label[@class='su-radio-label'])[9]") private WebElement limit;
	@FindBy (xpath= "(//label[@class='su-radio-label'])[10]") private WebElement sl;
	@FindBy (xpath= "(//label[@class='su-radio-label'])[11]") private WebElement slm;
	@FindBy (xpath= "//button[@class='submit']") private WebElement submit;
	@FindBy (xpath= "//label[@class='su-switch-control']") private WebElement togglekey;
	@FindBy (xpath= "(//span[text()='HDFCBANK'])[2]") private WebElement hdfcbank;
	@FindBy (xpath= "//button[@data-balloon='Sell']") private WebElement sell;
	@FindBy (xpath= "(//span[@class='icon icon-trending-up'])[1]") private WebElement chart; 
	@FindBy (xpath= "//span[@data-balloon='Delete (del)']") private WebElement delete;
	//@FindBy (xpath= "") private WebElement 
	//@FindBy (xpath= "") private WebElement 


	
	public ZerodhaMainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonSearch(String add) {
		search.click();
		search.sendKeys(add);
	}
	
	public void clickonSearch2() {
		search.click();
	}
	
	public void clickonBuy(WebDriver driver) throws InterruptedException {
		Actions act= new Actions(driver);
		act.moveToElement(tatasteel);
		act.perform();
		act.moveToElement(buy);
		act.perform();
		buy.click();
	}
	
	public void clickonIntraday() {
		intraday.click();
	}
	
	
	public void clickonLongterm() {
		longterm.click();
	}
	
	public void clickonMarket() {
		market.click();
	}
	public void clickonLimit() {
		limit.click();
	}
	public void clickonSl() {
		sl.click();
	}
	public void clickonSlm() {
		slm.click();
	}
	public void clickonSubmit() {
		submit.click();
	}
	public void clickonTogglekey() {
		togglekey.click();
	}
	
	public void clickonSell(WebDriver driver) {
		Actions act= new Actions(driver);
		act.moveToElement(hdfcbank);
		act.perform();
		act.moveToElement(sell);
		act.perform();
		sell.click();
	}
	
	public void clickonChart(WebDriver driver) {
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(5000));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(chart));
		
		Actions act = new Actions(driver);
		act.moveToElement(tatasteel);
		act.perform();
		act.moveToElement(chart).perform();
		chart.click();
	}
	
	public void clickonDeleteWatchlist(WebDriver driver) {
		Actions act= new Actions(driver);
		act.moveToElement(hdfcbank);
		act.perform();
		act.moveToElement(delete);
		act.perform();
		delete.click();
	}
}
