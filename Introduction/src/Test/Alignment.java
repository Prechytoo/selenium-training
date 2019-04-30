package Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alignment {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com"); // URL in the browser
		driver.findElement(By.xpath("id('email')")).sendKeys("tshabalala.cindyprecious@gmail.com");
		//driver.findElement(By.xpath("input[name='pass']")).sendKeys("cindy"); 
		//driver.findElement(By.xpath("[value='Log In']")).click();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		int a=5;
		getScreenShot(driver);
		
	}
	public static void getScreenShot(WebDriver driver)
	{
		driver.get("http://google.com");
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyfile(src,new File("C:\\Users\\nokuthula tenene\\Pictures\\Adobe Acrobat Document.jpg"));

		// when formatting the code crl+shif+f lesson 64
	}

}
