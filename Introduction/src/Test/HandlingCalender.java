package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		//  //input[@value='Chennai (MAA)'] - xpath for chennai
		// //a[@value='BLR']	
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		//parent-child relationship locator to identify the object, it will help to identify uniquely
		////div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']*/
		
			//identify the current date by taking the class name and remove space between names and put a .dot, start you css with a .dot
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	}

}
