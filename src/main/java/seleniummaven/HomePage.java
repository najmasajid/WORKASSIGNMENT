package seleniummaven;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;




	public class HomePage {
	   
	WebDriver driver;

	   By searchbox=By.xpath(("//*[@id=\"APjFqb\"]"));
	   By Redifflink=By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3");

			   

	
	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    } 
	    
	    
	    
		public void google_search(String key_text)
		{
			
			driver.findElement(searchbox).sendKeys(key_text,Keys.ENTER);
			driver.findElement(Redifflink).click();
			
		}



		



		
} 

	
	
	 
