package Webpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/drop.html");
	Thread.sleep(2000);
	
	//press and release actions
	Actions a=new Actions(driver);
	WebElement drag = driver.findElement(By.id("draggable"));
	
	WebElement drop = driver.findElement(By.id("droppable"));
	a.dragAndDrop(drag, drop).build().perform();
	a.clickAndHold(drag).moveToElement(drop).release().build().perform();
	Thread.sleep(2000);
	
	driver.quit();
	
	
	
	}

}
