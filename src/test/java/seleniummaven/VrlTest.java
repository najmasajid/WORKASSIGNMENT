package seleniummaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VrlTest {
	WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
	driver = new ChromeDriver();
	
	driver.get("https://www.vrlbus.in");
	
	}
@Test
public void vrltest()
{
	Vrlpage ob=new Vrlpage(driver);
	ob.enterSource("Bangalore");
     ob.enterDestination("Mumbai");
   ob.clickSearchButton();
     ob.selectDepartureDate("2023-06-11");
	
	 
	

}	
	
	
}

	
	
	
	
	
	
	
	
	






