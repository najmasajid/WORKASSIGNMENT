package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class uTestSecondPage {
	WebDriver driver;

	By map=By.xpath("//button[@type='button']");
	By city=By.xpath("//*[@id=\"city\"]");
	By zip=By.id("zip");
	
	By country=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]");
	By country1=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input");
	By nxtpage=By.xpath("//*[contains(text(),'Next: Devices')]");
	
	public uTestSecondPage(WebDriver driver) {
		this.driver=driver;
        

	}
	
	public void textcity()
	{
		
		driver.findElement(city).clear();
	
		driver.findElement(city).sendKeys("thissurKerala", "India");
	
		driver.findElement(city).sendKeys(Keys.ARROW_DOWN);
	
		driver.findElement(city).sendKeys(Keys.ENTER);
		
		driver.findElement(city).sendKeys(Keys.TAB);
	}
	public void textzip()  {
	
		driver.findElement(zip).clear();
		driver.findElement(zip).sendKeys("682037");

		driver.findElement(zip).sendKeys(Keys.TAB);
	}
	public void textcountry()  {
		driver.findElement(country).click();
}
}

