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
import org.openqa.selenium.support.ui.Select;

public class Weblocator_elements {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("vishnu");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("priya");
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("9876543210");
		WebElement newpassword = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		newpassword.sendKeys("vishnupriyabalaji");
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("19");
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(11);
		WebElement byear = driver.findElement(By.id("year"));
		Select s2=new Select(byear);
		s2.selectByVisibleText("1992");
		WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label"));
		gender.click();
		WebElement signup = driver.findElement(By.xpath(""));
		signup.click();
		Thread.sleep(2000);
		boolean sup = signup.isSelected();
		System.out.println(sup);
		
		TakesScreenshot shot=(TakesScreenshot) driver;
		File source=shot.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Screenshot/screenshot1.png");
		FileUtils.copyFile(source,desc);
		
		
		
	
	}

}
