import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {
	
	WebDriver driver = new ChromeDriver();// dont do this

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		
		//Error handling
		//driver.findElement(By.className("button r4 wide primary")).click(); //error handling
		
	driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	System.out.println(driver.findElement(By.cssSelector("dv#error.loginError")).getText()); //for error display

	}

}
