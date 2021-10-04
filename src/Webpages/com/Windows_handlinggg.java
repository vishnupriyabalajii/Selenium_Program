package Webpages.com;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handlinggg {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72155527817002&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_4jqua56skg_e");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement mobile = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
	Actions a=new Actions(driver);
	a.contextClick(mobile).build().perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
	WebElement bestseller = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
	a.contextClick(bestseller).build().perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);

	WebElement fashion = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
	a.contextClick(fashion).build().perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
	Set<String> windowHandles = driver.getWindowHandles();
	for (String s : windowHandles) {
		String title = driver.switchTo().window(s).getTitle();
		System.out.println(title);
		
	}
	String s="Amazon.in Bestsellers: The most popular items on Amazon";
	for (String str : windowHandles) {
		if (driver.switchTo().window(str).getTitle().equals(s)) {
			break;
		}
	}
	
	
	
	
			
	
	
	
	}

}
