package Webpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Homepage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.grammarly.com/ddocs/1242747951");
		Thread.sleep(2000);
		driver.navigate().to("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("vishnu");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("vishnupriya");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL:"+currentUrl);
		String title = driver.getTitle();
		System.out.println("Title:"+title);
		
		
	}

}
