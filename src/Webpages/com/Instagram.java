package Webpages.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	//maximize
	driver.manage().window().maximize();
	
	WebElement like = driver.findElement(By.xpath("/html/body/div[1]/section/main/section/div[1]/div[2]/div/article[4]/div/div[3]/div/section[1]/span[1]/button"));
	like.click();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
}
