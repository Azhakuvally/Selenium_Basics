package module;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggetion_Handle {

	public static void main(String[] args) throws InterruptedException {
		
		
		EdgeDriver driver = new EdgeDriver() ;
		
		driver.get("https://www.google.com/");
		
		WebElement Searchfield = driver.findElement(By.className("gLFyf"));
		
		Searchfield.sendKeys("Chennai");
		
		Thread.sleep(3000);
		
       List<WebElement>	list =	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
       
       int count = list.size();
       
       System.out.println(count);
       
		Thread.sleep(3000);
		
		WebElement e1 = list.get(2);
	       
	       e1.click() ;
		
		ArrayList <String> l1 = new ArrayList <String> () ;
		
		
		Thread.sleep(2000);
		
		for(int i =0;i< count ;i++)
			
		{
			
			WebElement e2 = list.get(i) ;
			
			String st = e2.getDomAttribute("data-entityname") ;
			
			l1.add(st) ;
			
			
		}

       System.out.println(l1);
       
		
		
		

	}

}
