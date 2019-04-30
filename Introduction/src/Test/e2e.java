package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		
								//steps for booking
			//FOR one way radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
			//select the depart city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//select calendar to pick a date
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
				// checking another calendar is disabled
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			//when you want the test to fail deliberately
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);	
		}
					// for passenger
		//first it must return false before selecting
		System.out.println(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).click();
		 // then return true if is selected, to check if the check box is selected
		System.out.println(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
		
		 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		driver.findElement(By.id("divpaxinfo")).click(); // for adding 1
		 Thread.sleep(2000L); //PREVENTING THE DROPDWN FOR TAKING LONG TO OPEN
		 
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 for(int i=1;i<5;i++)  // loop 5 times then it stops
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();  
		 }
			driver.findElement(By.id("btnclosepaxoption")).click();    //closing button
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());  //to grab the text present on that edit box
		 
		
		 				//for searching ===locator to find search button
		
		driver.findElement(By.cssSelector("ctl00_mainContent_btn_FindFlights")).click();
		 		//another way  to customize css
		 //driver.findElement(By.cssSelector("input[value='Search']")).click();
		 
		 		//customize xpath
		// driver.findElement(By.id("//input[@value='search']")).click();
		 
		 		//find element by name
		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		 
		 
		
		
		 
	}
			
}
