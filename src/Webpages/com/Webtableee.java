package Webpages.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableee {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		//maximize
		driver.manage().window().maximize();
		
		//to get all data's
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement elements : alldata) {
			String text = elements.getText();
			System.out.println(text);
			
		}
		System.out.println("********************************************************");
		//to get particular data's
		WebElement pardata = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]"));
		System.out.println(pardata.getText());
		
		System.out.println("********************************************************");
		//to get particular data's
		List<WebElement> findElements = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		for (int i = 0; i < 10; i++) {
			String text = findElements.get(i).getText();
			System.out.println(text);
			if (i==6) {
				
				break;
				
			}
						
		}
	}

}
