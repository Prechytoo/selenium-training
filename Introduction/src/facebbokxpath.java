import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebbokxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				
		WebDriver driver  = new ChromeDriver();
		driver.get("http://facebook.com"); //URL in the browser
		
		//syntax for xpth //tagname  [@attribute = �value] or //*tagname[@attribute = �value�]
/*	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown xpath");//handling fighting element
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@value='Log In']")).click(); */
		
		
		//syntax for CSS tagName[attribute=�value�] NO SLASH
		driver.findElement(By.cssSelector("input[name='mail']")).sendKeys("myowncss");
		driver.findElement(By.xpath("input[name='pass']")).sendKeys("123456"); 
		driver.findElement(By.xpath("[value='Log In']")).click();
		
		
		
	
	}

}
