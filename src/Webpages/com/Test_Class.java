package Webpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test_Class extends Base_Class {

	public static void main(String[] args) throws InterruptedException {

		browser_Launch("https://www.amazon.in/");

		Thread.sleep(2000);

		navigate_To("https://www.facebook.com/");

		Thread.sleep(1000);

		WebElement findElement2 = driver.findElement(By.name("email"));
		
		send_Keys(findElement2, "vishnu");
		
		Thread.sleep(1000);
		
		navigate_Back();

		Thread.sleep(1000);

		navigate_Forward();

		Thread.sleep(1000);

		navigate_Refresh();

		Thread.sleep(1000);

		get_Element("https://www.amazon.in/");

		get_Title();

		getcurrent_Url();

		WebElement findElement = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div[3]/div"));
//		get_Text(findElement);
		String text = findElement.getText();
		System.out.println(text);

	}

}
