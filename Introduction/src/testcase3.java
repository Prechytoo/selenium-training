import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class testcase3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code-
	
			//create Driver object for InternetExplorerDriver browser
	
			//We will strictly implement methods of webdriver
	
				/* class name= ChromeDriver,
	   
	   			x driver=new x();*/
		
	//geckodriver.exe
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Microsoft Web Driver.exe");
	    WebDriver  driver=new InternetExplorerDriver();
	    
	    driver.get("http://google.com");
	   System.out.println( driver.getTitle());
	}
}
