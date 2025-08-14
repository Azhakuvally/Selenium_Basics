package module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TotalnumberLinks {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver() ;
		driver.manage().window().minimize() ;
		driver.get("https://google.com/");
		List<WebElement> list = driver.findElements(By.tagName("a")) ;
			int Countoflinks = list.size() ;
			System.out.println(Countoflinks);
			for(int i = 0 ; i <Countoflinks;i++)
			{
				
				WebElement e1 = list.get(i);
				String URL = e1.getDomAttribute("href") ;
				
				String pro = "https://google.com/" ;
				
			if(URL==null || URL.isEmpty()==true) 
				
			{
				continue ;
			}
			
			
			if(URL.matches("https(.*)"))
					
					{
				System.out.println(URL);
				
				
					}
				
			
			else
				
			{
				String URL1 = pro.concat(URL) ;
				
				System.out.println(URL1);
				
			}
				
				
				
			}

	}

}
