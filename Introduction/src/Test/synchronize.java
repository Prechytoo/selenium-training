package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-USTPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("nyc"); // enter nyc then click tab key
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB); // for a tab key to work
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER); // after pressing tab key it must allow and enter key to take you to the next page
		driver.findElement(By.xpath("//*[@id=\"activity183589\"]/a")).click();
		
		
	}

}

