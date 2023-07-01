package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Utestpage {
	WebDriver driver;
	 
	  By becomeUTesterButton = By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div/a");

		public Utestpage(WebDriver driver) 
		{
			this.driver = driver;
	        
		}


		public void clickBecomeUTesterButton() {
	        WebElement becomeUTesterButtonElement = driver.findElement(becomeUTesterButton);
	        becomeUTesterButtonElement.click();
	    }

	}



