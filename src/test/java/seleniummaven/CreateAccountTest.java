package seleniummaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAccountTest{

	WebDriver driver;
	
	
	@BeforeClass

          public void setup()
          {
        	  driver=new ChromeDriver();
        	  
      		driver.get("https://www.google.com");
      		
      	
      	}
	@Test
	
          
	



	      public void search() {
	        
	        HomePage ob = new HomePage(driver);
	        ob.google_search("Rediffmail");
	        
}
	@Test
	
public void create()
{
	SearchResultPage ob1=new SearchResultPage(driver);
	ob1.creativeacc();
	
			
}


public void account()
{
CreateAccountPage ob3=new CreateAccountPage(driver);
		ob3.first("Najma","najumasajid");
        ob3.pass("naju","naju","najumajabbar");
        ob3.numbers("89345678");
        ob3. dateofbirth("12","MAR","1990");
        ob3.picker();
        ob3.place();
        ob3.gender ("female");


}
}




    
	   