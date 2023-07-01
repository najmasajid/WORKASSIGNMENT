package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchResultPage {
WebDriver driver;
	
By CreateAccount=By.xpath("//*[@id=\\\"signin_info\\\"]/a[2]");





public SearchResultPage(WebDriver driver) 
{
	this.driver = driver;
    
}
public void creativeacc()
{
	
		boolean logo=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/span")).isDisplayed();
	if(logo) {
		System.out.println("Rediff logo is displayed");
	}
	else {
		System.out.println("Rediff logo is not displayed");
	}
	driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]")).click();
}

	 
}


