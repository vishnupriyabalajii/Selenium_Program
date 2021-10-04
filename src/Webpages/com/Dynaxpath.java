package Webpages.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynaxpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/women?f=Categories%3AKurta%20Sets%2CKurtas&rf=Discount%20Range%3A10.0_100.0_10.0%20TO%20100.0");
		//max
		driver.manage().window().maximize();
		
		List<WebElement> all_price = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		List<Integer> a=new ArrayList<>();
	for (int i = 0; i < all_price.size(); i++) {
		
		String substring = all_price.get(i).getText().substring(3);
		int parseInt = Integer.parseInt(substring);
		a.add(parseInt);
		
	
//		String text = all_price.get(i).getText().replace("Rs. ", "");
//		int parseInt = Integer.parseInt(text);
//		a.add(parseInt);
		
		}
	System.out.println(a);
	int size=a.size();
	System.out.println("size : "+size);
	System.out.println("Minimum price:"+Collections.min(a));
	
	
	}

}
