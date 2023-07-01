package seleniummaven;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class BookingHomePage {
	  WebDriver driver;
	  By StarApartment=By.xpath("//*[@id=\"search_results_table\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[1]/div/h3/a/div[1]");
	  By Reseserve=By.xpath("//*[@id=\"hp_book_now_button\"]/span[1]");
	  By Iwillreserve=By.xpath("//*[@id=\"b_tt_holder_2\"]/span[2]");

	    public BookingHomePage(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    
	    public void apartbook()
	    {
	    	driver.findElement(StarApartment).click();
	    	driver.findElement(Reseserve).click();
	    	driver.findElement(Iwillreserve).click();
	    }
	}



