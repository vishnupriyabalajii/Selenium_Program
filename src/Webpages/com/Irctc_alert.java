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

public class Irctc_alert {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement simple = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button"));
		simple.click();
		
		Thread.sleep(2000);

		TakesScreenshot shot=(TakesScreenshot)driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Screenshot\\image.png");
		FileUtils.copyFile(source,destination);
		
	}

}
