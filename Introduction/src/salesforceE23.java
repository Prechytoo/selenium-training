import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforceE23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chromedriver.exe
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				
				//CUSTOMIZE CSS AND XPATH
				WebDriver driver  = new ChromeDriver();
				driver.get("http://www.rediff.com"); //URL in the browser
				driver.findElement(By.cssSelector("a[title*=' Sign in']")).click(); //css regular express
				driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hellow"); //xpath regular express
				driver.findElement(By.cssSelector("input#password")).sendKeys("12345"); //css regular express
				driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click(); //xpath regular express
						
				
				
				
				
	}

}
