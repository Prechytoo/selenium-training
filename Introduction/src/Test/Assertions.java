package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
				//for false values
		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
		
		//first it must return false before selecting
		driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).click();
		
		 // then return true if is selected, to check if the check box is selected
		System.out.println(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
		
		//verify if is returning true
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
		
				//to check a number of check boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click(); // for adding 1
	

		/*int i=1;
		while(i<5)  //keep looping
		{
		
			driver.findElement(By.id("hrefDecAdt")).click();  //loop 4 times
			i++; 
		}*/
			
		//another way for repeating steps using for loop
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	for(int i=1;i<5;i++)  // loop 5 times then it stops
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();  
			 //when checking if that 5 is correct as it loops 5 times
			 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());  //to grab the text present on that edit box
		 }
	
			driver.findElement(By.id("btnclosepaxoption")).click();    //closing button
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());  //to grab the text present on that edit box
	}

}
