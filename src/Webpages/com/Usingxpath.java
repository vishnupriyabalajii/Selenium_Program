package Webpages.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingxpath {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("bala");
		WebElement surename = driver.findElement(By.name("lastname"));
		surename.sendKeys("vishnu");
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("9876543210");
		WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
		password.sendKeys("vishnupriyabalaji");
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
		WebElement signup= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Screenshot\\error.png");
		FileUtils.copyFile(source, destination);
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
