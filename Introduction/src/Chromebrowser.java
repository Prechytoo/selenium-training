import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {
	
	//static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("http://facebook.com"); //URL in the browser
		//driver.findElement(By.className("inputtext")).sendKeys(("helloworld");
		//element for finding the  email ID
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		//element for getting password 
		//driver.findElement(By.name("pass")).sendKeys("123456");
		//element links for forget password
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");  //code for sending 
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click(); //for forgotten account 
		
		
				
		
		
		

	}

}
