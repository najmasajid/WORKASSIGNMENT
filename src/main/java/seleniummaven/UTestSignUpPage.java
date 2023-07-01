package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class UTestSignUpPage {
	
	
	
	WebDriver driver;
	By fname=By.xpath("//*[@id=\"firstName\"]");
	By lastname=By.id("lastname");
	By email=By.id("email");
	By month=By.xpath("//select[@id='birthMonth']");
	By monthpick=By.xpath("//*[@id=\"birthMonth\"]/option[6]");
	By day=By.xpath("//select[@id='birthDay']");
	By daypick=By.xpath("//*[@id=\"birthDay\"]/option[10]");
	By year=By.xpath("//select[@id='birthYear']");
	By yearpick=By.xpath("//*[@id=\"birthYear\"]/option[11]");
	By language=By.xpath("//*[@id=\"languages\"]/div[1]/input");
	By nextlocation=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");
	
	
   
    public UTestSignUpPage(WebDriver driver)
    {
    	this.driver = driver;
    	 
	}
		
	
	public void name(String name1,String name2)  {
		
    	driver.findElement(fname).sendKeys(name1);
		driver.findElement(lastname).sendKeys(name2);
    }
	
    
    public void email(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
    
    public void DateOfBirth() {
		driver.findElement(day).click();
		driver.findElement(monthpick).click();

		driver.findElement(day).click();
		driver.findElement(daypick).click();

		driver.findElement(year).click();
		driver.findElement(yearpick).click();
	}
    public void language(String text4)  {
	
		
		driver.findElement(language).sendKeys(text4,Keys.TAB);
    }
		
	
	
    public void clickNextFirst() {
		driver.findElement(nextlocation).click();
	}

}
