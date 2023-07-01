package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Vrlpage {
	
	
	WebDriver driver;
	 public Vrlpage(WebDriver driver) {
	
	

	        this.driver = driver;
	 }
	    

	
	 public void enterSource(String source) {
	        WebElement sourceInput = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	        		
	        sourceInput.sendKeys(source);
	    }
	 public void enterDestination(String destination) {
	        WebElement destinationInput = driver.findElement(By.id("/html/body/form/div[3]/div[2]/section[2]/div/div/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/input"));
	        destinationInput.sendKeys(destination);
	 }
	 public void clickSearchButton() {
	        WebElement searchButton = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]"));
	 
	        searchButton.click();
	 }
	 public void selectDepartureDate(String date) {
	        WebElement departureDate = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]"));
	        departureDate.sendKeys(date);
	    }
}