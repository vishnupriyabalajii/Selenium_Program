package Webpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://mamaearth.in/?utm_source=Convertup&utm_medium=affise_affiliate&utm_campaign=feb&utm_term=cps_99_208_");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL:"+currentUrl);
		String title = driver.getTitle();
		System.out.println("Title:"+title);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		Dimension size=new Dimension(300, 400);
		driver.manage().window().setSize(size);
		Thread.sleep(2000);
		Point position=new Point(300, 300);
		driver.manage().window().setPosition(position);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("priya");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("vishnupriya");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("selvi");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("priya");
		Thread.sleep(2000);
		
		
		
	}

}
