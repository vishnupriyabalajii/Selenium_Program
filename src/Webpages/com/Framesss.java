package Webpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");

		// max
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// single frame
		WebElement single_frame = driver
				.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[1]/iframe"));
		driver.switchTo().frame(single_frame);

		// send a text
		WebElement text = driver.findElement(By.xpath("//input[@type='text'][1]"));
		text.sendKeys("priya");
		Thread.sleep(2000);
		
		//back to webpage
		driver.switchTo().defaultContent();
		Thread.sleep(1000);

		// multiple frame
		WebElement multi_frames = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		multi_frames.click();
		WebElement frame1 = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
		driver.switchTo().frame(frame1);
		WebElement frame2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(frame2);
		WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
		text1.sendKeys("welcome");
		Thread.sleep(2000);
		// back to webpage
		driver.switchTo().defaultContent();

	}

}
