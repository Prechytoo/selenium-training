import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//xpath - //tagname[@attribute='value']
		//css-  [class='value']
		
		//when using firepath in fire fox to find a unique element or to find element
		//WHEN THERE IS ID PUT # AND IF IS A CLASS PUT A DOT .
		//REMOVE A SPACE
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://login.saleforce.com/");
		
		driver.findElement(By.cssSelector("[class='username']")).sendKeys("HELLOW"); //CSS
		
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='Login']")).click(); //xpath
		driver.findElement(By.cssSelector("login"));
		
		
		
		

	}

}
