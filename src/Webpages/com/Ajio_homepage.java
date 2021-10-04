package Webpages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio_homepage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/?gclid=EAIaIQobChMI5u-_yu3d8gIVDxsrCh0r-wdCEAAYASAAEgLu6PD_BwE");
		String title = driver.getTitle();
		System.out.println("Title:"+title);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://meesho.com/");
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL:"+currentUrl);
		driver.navigate().back();
		driver.navigate().forward();
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.navigate().to("https://www.netflix.com/in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
