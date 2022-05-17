package test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ProSec {

	@Test
	public void Test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      // browser type and chromedrover.exe path as parameters
	      String url = "https://www.marriott.com/default.mi";
	      driver.get(url);
	      Actions a=new Actions(driver);
	      //a.moveToElement(driver.findElement(By.className("ham-header__r-menu"))).click().build().perform();
	      //click on my trip
//	      driver.findElement(By.xpath("//a[@aria-label='My Trips']")).click();
//	      Thread.sleep(2000);
//	      //enter number in trip window
//	      driver.findElement(By.xpath("//input[@id='confirmationNumber']")).click();
//	      WebElement cin=driver.findElement(By.id("cInDate"));
//	      cin.click();
//	      List<WebElement>cinDates=cin.findElements(By.xpath("//div[@role='gridcell']"));
//	      for(WebElement dee: cinDates) {
//	    	  if(dee.getText().equals("23")) {
//	    		  dee.click();
//	    		  break;
//	    	  }
//	      }
//	      
//	      
//	      driver.findElement(By.id("firstName")).sendKeys("John");
//	      driver.findElement(By.id("lastName")).sendKeys("Michael");
//	      driver.findElement(By.id("find-reservaton")).click();
//	      
//	      
//	      driver.findElement(By.id("fName")).sendKeys("John");
//	      driver.findElement(By.id("lName")).sendKeys("Michael");
//	      driver.findElement(By.id("cfNumber")).sendKeys("234234");
//	      Thread.sleep(2000);
//	      WebElement cin2=driver.findElement(By.xpath("//input[@id='cInDates']"));
//	      cin2.click();
//          Thread.sleep(2000);
//          cin2.click();
//	      List<WebElement>cinDates2=cin2.findElements(By.xpath("//div[@role='gridcell']"));
//	      for(WebElement dee: cinDates2) {
//	    	  if(dee.getText().equals("18")) {
//	    		  dee.click();
//	    		  break;
//	    	  }
//	      }
//	      driver.findElement(By.id("lookup-submit-btn")).click();
	      
//	      driver.findElement(By.id("field-user-id")).sendKeys("Michael@email.com");
//	      driver.findElement(By.id("field-password")).sendKeys("DDD$#$234234");     
	      
	}

}
