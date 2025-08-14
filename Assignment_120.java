package module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_120 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().minimize();
		driver.get("https://google.com/");
		
		  WebElement searchfield =  driver.findElement(By.xpath("//textarea[@name='q']")) ;
		  
		  searchfield.sendKeys("India") ;
		  
		  Thread.sleep(3000);
		  
		  List<WebElement> autosuggestion=  driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/child::li")) ;
		  
		  int count = autosuggestion.size() ;
		  
		  System.out.println("Total number of auto suggestions "+count);
		  
		  List<WebElement> list2=  driver.findElements(By.xpath("//li/div/div[2]/div")) ;
		  
		  Thread.sleep(3000);
		  
		  for(int i = 0 ; i < list2.size() ; i++ )
			  
		  {
			  WebElement e1  = list2.get(i) ;
			  
			String A = e1.getDomAttribute("aria-label")  ;
			
			System.out.println(A);
			  
		  }

	}

}
