package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		 System.out.println( driver.getTitle());
		 
		 driver.findElement(By.cssSelector("input[name='email']")).sendKeys("tshabalala.cindyprecious@gmail.com");
		 Thread.sleep(4000);
			driver.findElement(By.id("pass")).sendKeys("tshabalalapreciou");
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//input[@id='u_0_2']")).click(); //log in 
			 //Thread.sleep(1000);
			 driver.navigate().back();
			driver.findElement(By.linkText("Forgotten account?")).click();
			//driver.findElement(By.xpath("[value='Log In']")).click();
			Thread.sleep(4000);
			 driver.navigate().back();
			 
	
		driver.findElement(By.name("firstname")).sendKeys("Cindy");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='u_0_l']")).sendKeys("Tshabalala");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys("0818602756");
		Thread.sleep(4000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Prechy4u2");
		Thread.sleep(4000);
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("6");
		Thread.sleep(2000);
		//day.click();
		//driver.findElement(By.id("day")).getText();
		
		Select month = new Select(driver.findElement(By.id("month")));
		//month.selectByVisibleText("march");
		month.selectByIndex(2);
		Thread.sleep(2000);
		
		Select year = new Select(driver.findElement(By.id("year")));
		//year.selectByVisibleText("1990");
		year.selectByIndex(7);
		Thread.sleep(2000);
		//driver.findElement(By.id("birthday-help")).click();
		//Alert alert =driver.switchTo().alert();
		//String print = alert.getText();
		//System.out.println(driver.switchTo().alert().getText());
		//System.out.println(print);
		//Thread.sleep(1000);
		//alert.accept();
				
		
		  //Identifying Male radio button using its ID as an locator
		WebElement male = driver.findElement(By.id("u_0_a"));
		
        //Checking if the Male Radio button is displayed on the Webpage and printing the status
		boolean maleDisplayed = male.isDisplayed();
		System.out.println("Is Male radio button displayed;" +maleDisplayed);
		
		  //Checking if the Male Radio button is enabled on the webpage and printing the status
		boolean maleEnabled = male.isEnabled();
		System.out.println( "Is male radio button;" +maleEnabled);
		
		//Checking the default radio button selection status
		boolean maleSelected = male.isSelected();
		System.out.println("Default male radio button selection status;" + maleSelected);
		
		//Selecting male radio button
		male.click();
		Thread.sleep(3000);
	
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		
		 //when closing all browsers open by selenium script
		   driver.quit();
		
		
	
	
		
		
		
	}

}