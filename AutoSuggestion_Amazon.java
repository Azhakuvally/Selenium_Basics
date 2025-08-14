package module;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.amazon.in/");
		
	WebElement searchfield = 	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	searchfield.sendKeys("Kurta") ;
	
	Thread.sleep(3000);
	
	  List<WebElement> list =  driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div")) ;
	  
	
	  
	 int countofsuggestion = list.size() ;
	 
	 System.out.println(countofsuggestion);
	 
		 
	 WebElement e1 = list.get(countofsuggestion-5);
	 
	 Thread.sleep(3000);
	 
	 e1.click() ;
	 
	 
		 Thread.sleep(3000); 
	
		 List<WebElement> list2 = driver.findElements(By.xpath("(//div[@role='gridcell']/div[1])")) ;
		 
		 
		 ArrayList<String> v1 = new   ArrayList<String>() ;
		 
		 for(int i = 0 ; i <list2.size() ;i++)
	 
			 
		 {
			 
	WebElement e2  = list2.get(i) ;
	
	String Autosuggestion = e2.getDomAttribute("aria-label") ;
	 
	v1.add(Autosuggestion) ;
	 
	 
	 
			 
	 }
	 
	 System.out.println(v1);
	 
	  

	}

}
