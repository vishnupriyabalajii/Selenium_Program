package Webpages.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtableee {

	public static void main(String[] args) throws InterruptedException {
		int country_Index, New_Deaths_Index,total_Cases_Index=0,New_Recovered_Index;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		// maximize
		driver.manage().window().maximize();

		List<WebElement> all_headers = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr"));
		for (int i = 0; i < all_headers.size(); i++) {
			List<WebElement> headers = all_headers.get(i).findElements(By.tagName("th"));
			for (int j = 0; j < headers.size(); j++) {
				String header = headers.get(j).getText().replaceAll("\n", " ");
				header = header.replaceAll("\n", " ");
				System.out.println(header);

				if (header.contains("Country")) {
					country_Index = j;
					System.out.println("Country index : " + country_Index);

				} else if (header.equalsIgnoreCase("New Deaths")) {
					New_Deaths_Index = j;
					System.out.println(" New Deaths: " + New_Deaths_Index);

				}
				else if (header.equals("New Recovered")) {
					New_Recovered_Index=j;
					System.out.println("New Recovered :"+New_Recovered_Index);
					
				}
			}
		}
		System.out.println("**********************************************");
		List<WebElement> all_rows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
		for (int i = 0; i <all_rows.size() ; i++) {
			List<WebElement> all_Datas = all_rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < all_Datas.size(); j++) {
				if (all_Datas.get(j).getText().equalsIgnoreCase("India")) {
					String text = all_Datas.get(total_Cases_Index).getText();
					System.out.println("Total cases : " +text);
					int total_death_index = 0;
					String text2 = all_Datas.get(total_death_index).getText();
					System.out.println("Total Death :"+ text2);
					Thread.sleep(2000);
					break;
				}
				
			
				
			}
			
		}

		}

	}


