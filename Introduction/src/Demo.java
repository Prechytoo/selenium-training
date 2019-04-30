import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		//create Driver object for chrome browser
		
		//We will strictly implement methods of webdriver
		
		/* class name= ChromeDriver,
		   
		   x driver=new x();*/
		 
	//chromedriver.exe
		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		    WebDriver  driver=new ChromeDriver();
		    //direct to google or URL
		    driver.get("http://google.com");
		    //lending to a correct web page
		   System.out.println( driver.getTitle());
		   
		 //  validate if you are landed on correct URL
		   System.out.println(driver.getCurrentUrl());
		   
		   //when validating source page
		   //System.out.print(driver.getPageSource());
		  
		   //
		   driver.get("http://yahoo.com");
		   //when you want to go back to the first browser
		   driver.navigate().back();
		   //when you want to move forward
		   driver.navigate().forward();	
		   //when closing the browser current browser
		   driver.close();
		   //when closing all browsers open by selenium script
		   //driver.quit();
		   
		   
		   
				
		
	
			
	}

}
