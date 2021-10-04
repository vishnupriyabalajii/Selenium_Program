package Webpages.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Wait_concept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		//max
		driver.manage().window().maximize();
		
		//scroll the page upto certain given value
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scroll(0,1000)", "");
		Thread.sleep(2000);
		
		//scroll to the bottom of the page
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);
		
		//scroll to the top page
		j.executeScript("window.scroll(0,0)", "");
		Thread.sleep(2000);
						
		//find the specific element
		WebElement seemore = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div[17]/div/div[3]/a"));
		j.executeScript("arguments[0].scrollIntoView(true);",seemore);
	
		Thread.sleep(2000);
		
		//using fluent
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(40,TimeUnit.SECONDS)
//				.pollingEvery(10,TimeUnit.SECONDS)
//				.ignoring(Exception.class);


		
		
		
		
		
		
	}

}
