package Webpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_Class {

	public static WebDriver driver;

	public static void browser_Launch(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void navigate_To(String t) {
		driver.navigate().to(t);
	}

	public static void send_Keys(WebElement s2, String a1) {
		s2.sendKeys(a1);

	}

	public static void navigate_Back() {
		driver.navigate().back();
	}

	public static void navigate_Forward() {
		driver.navigate().forward();
	}

	public static void navigate_Refresh() {
		driver.navigate().refresh();
	}

	public static void get_Element(String url) {
		driver.get(url);

	}

	public static void get_Title() {

		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getcurrent_Url() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void get_Text(WebElement s) {
		s.getText();

	}

	public static void get_Attribute(WebElement s1, String a) {
		s1.getAttribute(a);

	}

}
