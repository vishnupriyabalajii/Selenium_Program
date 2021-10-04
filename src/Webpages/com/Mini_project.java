package Webpages.com;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mini_project {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		//max
		//driver.manage().window().maximize();
		//using actions 
		Actions a= new Actions(driver);
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
		
		//using click option
		WebElement image = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		a.moveToElement(image).build().perform();
		Thread.sleep(1000);
		
    	//using click
		WebElement addtocart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
    	addtocart.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//using click
		WebElement proceed1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed1.click();
		Thread.sleep(1000);
		
		//scroll down
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scroll(0,1000)", "");
		Thread.sleep(1000);
		
		//using click
		WebElement proceed2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
		proceed2.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("priyabalaji@gmail.com");
		Thread.sleep(1000);
		
		//
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("vishnupriyabalaji");
		Thread.sleep(1000);
		
		//
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		Thread.sleep(2000);
		
		//scroll down
		j.executeScript("window.scroll(0,1000)", "");
		Thread.sleep(1000);
		
		//using click
		WebElement proceed3 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
		proceed3.click();
		Thread.sleep(2000);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		j.executeScript("window.scroll(0,800)", "");
		Thread.sleep(1000);
		
		WebElement check = driver.findElement(By.id("cgv"));
		a.click(check).build().perform();
		Thread.sleep(2000);
		
		WebElement proceed4 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button"));
		proceed4.click();
		Thread.sleep(2000);
		
		WebElement payment = driver.findElement(By.xpath("//a[@class='cheque']"));
		payment.click();
		Thread.sleep(2000);
		
		j.executeScript("window.scroll(0,800)", "");
		Thread.sleep(1000);
		
		WebElement finall = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
		finall.click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
