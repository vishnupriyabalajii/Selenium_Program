package Webpages.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpathhh {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com/java-tutorial");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//absolute xpath
		WebElement header1 = driver.findElement(By.xpath("/html/body/div/div/div[6]/div/div/table/tbody/tr/td/h1"));
		String text = header1.getText();
		System.out.println(text);
		System.out.println("*********************************************");
		List<WebElement> header2 = driver.findElements(By.xpath("/html/body/div/div/div[6]/div/div/table/tbody/tr/td/h2"));
		for (WebElement webElement : header2) {
			String text2 = webElement.getText();
			System.out.println(text2);
			
		}
		
//		Iterator<WebElement> iterator = header2.iterator();
//		while (iterator.hasNext()) {
//			WebElement next= (WebElement) iterator.next();
//			System.out.println(next);
//			
//		}
		
		
	}

}
