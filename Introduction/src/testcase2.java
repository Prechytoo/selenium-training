import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class testcase2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code-
	
			//create Driver object for Firefox browser
	
			//We will strictly implement methods of webdriver
	
	/* class name= ChromeDriver,
	   
	   			x driver=new x();*/
		//geckodriver.exe
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
	 
	    WebDriver  driver=new FirefoxDriver();
	    
	    driver.get("http://google.com");
	   System.out.println( driver.getTitle());
	}
}
