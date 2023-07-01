package seleniummaven;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;

	public class Home {
	     WebDriver driver;
	    By searchInput = By.name("q");
	    By Bookinglink=By.xpath("//span[contains(text(),'Quick and Secure Booking - Booking.com’s Official ')]");
	    public Home(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void open(String url) {
	        driver.get(url);
	    }

	   

		public void search(String searchText) {
			 driver.findElement(searchInput).sendKeys(searchText);
		     driver.findElement(Bookinglink).sendKeys(searchText,Keys.ENTER);   
		        
			
		}

		public void Booklink() {
			
		        driver.findElement(Bookinglink).click();
			
		}
	}



