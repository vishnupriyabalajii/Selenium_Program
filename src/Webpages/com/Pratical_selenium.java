package Webpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratical_selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("chennai (All Locations)");
		Thread.sleep(1000);
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Bangalore (All Locations)");
		Thread.sleep(1000);
		WebElement traveling_date = driver.findElement(
				By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[3]/div/input"));
		traveling_date.click();
		Thread.sleep(1000);
		WebElement next = driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[1]/td[3]/button"));
		next.click();
		Thread.sleep(1000);
		WebElement select_date = driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[4]/td[1]"));
		select_date.click();
		Thread.sleep(1000);
		WebElement search_buses = driver
				.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/button"));
		search_buses.click();
		Thread.sleep(2000);
		// navigate to greens technology
		driver.navigate().to("https://www.google.com/");
		WebElement text = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		text.sendKeys("GreensTechnology");
		// navigate to icici bank online
		driver.navigate().to("https://infinity.icicibank.com/corp/Login.jsp");
		Thread.sleep(1000);
		WebElement enter = driver.findElement(By.xpath("/html/body/form[1]/div[3]/div[3]/div/p[3]/span/img"));
		enter.click();
		WebElement uname = driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']"));
		uname.sendKeys("vishnu");
		WebElement pword = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
		pword.sendKeys("rathi");
		WebElement dashboard = driver
				.findElement(By.xpath("/html/body/form[1]/div[3]/div[4]/div/p[9]/span/span/span/div/div[1]"));
		dashboard.click();
		WebElement category = driver.findElement(
				By.xpath("/html/body/form[1]/div[3]/div[4]/div/p[9]/span/span/span/div/div[2]/ul/li[5]/a"));
		category.click();
		WebElement onclick = driver.findElement(By.xpath("//input[@onclick='RememberUserId();']"));
		onclick.click();
		WebElement login = driver.findElement(By.xpath("//input[contains(@type,'Submit')][1]"));
		login.click();
		WebElement security_check = driver.findElement(By.id("IMAGECAPTCHA"));
		String text2 = security_check.getText();
		System.out.println(text2);
		WebElement gettext = driver.findElement(By.xpath("/html/body/form[1]/div[3]/div[4]/div/p[13]/span/span[2]/input"));
		gettext.sendKeys("vishnu");
		
		
		
	}
}
