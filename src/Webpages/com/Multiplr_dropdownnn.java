package Webpages.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiplr_dropdownnn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		//maximize
		driver.manage().window().maximize();
		
		//isMultiple
		WebElement all_option= driver.findElement(By.name("States"));
		Select s=new Select(all_option);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		//get all options
		List<WebElement> options = s.getOptions();
		for (WebElement web : options) {
			String text = web.getText();
			System.out.println(text);
			
		}
		System.out.println("***size of option***");
		int size = options.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			if (i==1 || i==3 || i==5) {
				s.selectByIndex(i);
				
			}
			
		}
		System.out.println("***select all options***");
		
		//get all selected options
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement webElement : allSelectedOptions) {
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
		//get the 1st selected option
		
		System.out.println("*** first selected option***");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text); 
		Thread.sleep(2000);
		s.deselectByValue("Florida");
		s.deselectByVisibleText("New York");
		s.deselectAll();
		Thread.sleep(2000);
		
		driver.quit();
			
		
	}
		

}
