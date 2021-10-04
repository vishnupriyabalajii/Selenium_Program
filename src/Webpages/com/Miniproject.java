package Webpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Miniproject {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		// max
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// using move to element
		Actions a = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		a.moveToElement(women).build().perform();

		// using explicit
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(women));
		Thread.sleep(2000);

		// using click
		WebElement casual_dresses = driver.findElement(By.xpath("//a[@title='Casual Dresses'][1]"));
		casual_dresses.click();
		Thread.sleep(1000);

		// using click
		WebElement image = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
		image.click();
		Thread.sleep(1000);

		WebElement addtocart = driver.findElement(By.xpath("//button[@name='Submit']"));
		addtocart.click();
		Thread.sleep(2000);
	
		
		


	
		
	}

}
