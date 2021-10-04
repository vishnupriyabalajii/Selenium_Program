package Webpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");	
		//max
		driver.manage().window().maximize();
		//simple alert
		WebElement select1 = driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		select1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//confirm alert
		WebElement confirm_alert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		confirm_alert.click();
		WebElement select2 = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		select2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		//prompt alert
		WebElement prompt_alert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		prompt_alert.click();
		WebElement select3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button"));
		select3.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("priya");
		driver.switchTo().alert().accept();
		
		
		
	}

}
