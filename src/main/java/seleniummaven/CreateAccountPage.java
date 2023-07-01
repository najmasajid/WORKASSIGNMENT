package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
 WebDriver driver;
	
	By firstname=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input");
	By rediffid=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]");
	By password=By.xpath("//*[@id=\"newpasswd\"]");
	By Retype=By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[11]/td[3]/input[1]");
	By alternate=By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[14]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]");
	By mobile=By.xpath("//*[@id=\"mobno\"]");
	By dobDate=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]");
	By dobdatepick=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]");
	By dobmonth=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]");
	By dobmonthpick=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]");
	By dobyear=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]");
	By dobyearpick=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]");
	By country=By.xpath("//select[@id='country']");
	By  city=By.xpath("//*[@id=\"div_city\"]/table");
	By male=By.xpath("//span[@id='lbl_txt']");
	By female=By.xpath("//td[normalize-space()='Male   Female']");
	By createbutton=By.xpath("//*[@id=\"Register\"]");

	
	
	
	public CreateAccountPage(WebDriver driver)
	{
		driver=this.driver;
	}
	    
			

      public void first(String name1,String name2)
      {
    	  driver.findElement(firstname).sendKeys(name1);
    	  driver.findElement(rediffid).sendKeys(name2);
      }
      
      public void pass(String name3,String name4,String name5) {
    	  driver.findElement(password).sendKeys(name3);
    	  driver.findElement(Retype).sendKeys(name4);
    	  driver.findElement(alternate).sendKeys(name5);
      }
      public void numbers(String no6)
      {
    	  driver.findElement(mobile).sendKeys(no6);
      }
      
      public void dateofbirth(String Day,String month,String year )
      {
    	  driver.findElement(dobDate).sendKeys(Day);
    	  driver.findElement(dobmonth).sendKeys(month);
    	  
    	  driver.findElement(dobyear).sendKeys(year);
    	  
      }
      public void picker()
      {
    	  driver.findElement(dobdatepick).click();
    	  driver.findElement(dobmonthpick).click();
    	  driver.findElement(dobyearpick).click();
      }
      public void place()
      {
    	  driver.findElement(country).click();
    	  driver.findElement(city).click();
      }

       public void gender(String boy)
       {
    	   boolean radiobutton=driver.findElement(By.xpath("//td[normalize-space()='Male   Female']")).isSelected();
    	   if(radiobutton)
   		{
   			System.out.println("selected");
   			
   		}
   		else
   		{
   			System.out.println("notselected");
   		}
       }
       public void button(String button)
       {
    	   driver.findElement(createbutton).click();
       }
}



	







     
	
	
