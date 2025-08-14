package module;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestion_Flipkart {

	public static void main(String[] args) throws InterruptedException {
	
		EdgeDriver driver = new EdgeDriver () ;
		
		

		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		 WebElement e1 = driver.findElement(By.name("q")) ;
		 		  
		 e1.sendKeys("Watches") ;
		 
		 Thread.sleep(5000) ;
		 
		 
		 //autosuggestionclick
		 List <WebElement> list = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/child::li")) ;
		 
		 WebElement e2 = list.get(3) ;
		 
		 e2.click() ;
		 Thread.sleep(2000) ;
		 
		 //to get in to child window
		 
		 List <WebElement> list2 = 	 driver.findElements(By.xpath("//div[@class='_75nlfW LYgYA3']/div"));
		 
		 WebElement e3 = list2.get(39) ;
		 
		 e3.click() ;
		 
		 
		 
		 Thread.sleep(2000) ;
		 
		 
		 
		 List <WebElement> list3 = 	 driver.findElements(By.xpath("//div[@class='_75nlfW LYgYA3']/div/div/div/a[1]")) ;
		 
		 List <WebElement> list4 = 	 driver.findElements(By.xpath("//div[@class='_75nlfW LYgYA3']/div/div/div/a[2]/div[1]/div[1]")) ;
		 
		 HashMap<String,String> mp = new  HashMap <String,String> () ;
		 
		 for(int i = 0 ; i <list3.size() ;i++)
			 
		 {
			 
			 WebElement e4 = list3.get(i) ;
			 
			 String entityname = e4.getText() ;
			 
			 WebElement e5 = list4.get(i) ;
			 
			 String entityprize = e5.getText() ;
			 
			 
			 mp.put(entityname, entityprize) ;
			
			 
		 }
		 
		 
		  
		 System.out.print(mp);
		 Thread.sleep(2000) ;
		 
		 
	for(Entry<String, String> eset :  mp.entrySet() )
	
	
		
	{
		
		System.out.println(eset);
		
	}
	
	
	
		
		 
		
	}

}
