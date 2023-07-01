package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class GoogleSearchPage  {
	WebDriver driver;
	
	    By searchBox = By.xpath("//*[@id=\"APjFqb\"]");
	    By utestlink=By.xpath("//h3[normalize-space()='uTest - The Professional Network for Testers']");
	   
	    public GoogleSearchPage(WebDriver driver)
	    {
	    	this.driver = driver;
	   
	    	
		}
	    
		public void google_search(String key_text)
		{
			
			driver.findElement(searchBox).sendKeys(key_text,Keys.ENTER);
		}
	    public void clickutest()
		{
			driver.findElement(utestlink).click();
		}
}