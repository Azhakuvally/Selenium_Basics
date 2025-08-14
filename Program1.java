package module;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.amazon.in/");
		
	String url = 	driver.getCurrentUrl() ;
	
	System.out.println(url);
	
	String browserid = driver.getWindowHandle() ;
	
	System.out.println(browserid);
	
	     Set<String> set =  driver.getWindowHandles() ;
	     
	     System.out.println(set);
	     
	   String title =   driver.getTitle() ;
	     System.out.println(title);
	     
	     
	      WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox")) ;
	      
	      searchfield.sendKeys("Toys") ;
	      
	  WebElement searchicon =    driver.findElement(By.id("nav-search-submit-button")) ;
	      
	  searchicon.click() ;
	      
	   //   searchfield.sendKeys(Keys.ENTER)   ;  

	}

}
