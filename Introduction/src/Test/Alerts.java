package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("html[1]/body[1]/table[3]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[4]/form[1]/input[1]")).click();
		System.out.println(driver.switchTo().alert().getText()); // when you want a pop up message to be displayed
		//driver.switchTo().alert().sendKeys("fesfe");
		driver.switchTo().alert().accept();   //Accept ok, done, yes pop up box
		
	
			//when working on cancel button, which is negative scenario
		//driver.switchTo().alert().dismiss();
		
		
	}

}
