package seleniummaven;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class UTestAutomationTest {
	WebDriver driver;
	
	
@BeforeClass

	public void setup()
	{
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
	
	}

	
	 
	@Test
	
	public void  GoogleSearchPage()
	{
		GoogleSearchPage ob1=new GoogleSearchPage(driver);
		ob1.google_search("utest");
		ob1.clickutest();
	}
	@Test
	public void uTest_Home()
	{
			Utestpage ob2=new Utestpage (driver);
			ob2.clickBecomeUTesterButton(); 
			
	}
	@Test
	public void signup()   {
	
		 UTestSignUpPage ob3= new UTestSignUpPage(driver);
		ob3. name("najma","Sajid");
		ob3.email("najmasaji.988@gmaill.com");
		ob3.DateOfBirth();
		ob3.language("Arabic");
		ob3.clickNextFirst();
		
		
}
	@Test
	public void uTestSecond()  {
		
		uTestSecondPage ob4=new uTestSecondPage(driver);
		ob4.textcity();
		ob4.textzip();
		ob4.textcountry();
    	
	}
}     
    
    


    
        
