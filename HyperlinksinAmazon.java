package module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinksinAmazon {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver () ;
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().minimize() ;
		
		List<WebElement> list = driver.findElements(By.tagName("a")) ;
		
		int countoflinks = list.size() ;
		
		System.out.println("count of links = "+countoflinks);
		for(int i = 0 ; i <countoflinks;i++)
		{
			WebElement e1 = list.get(i) ;
			
			String url = e1.getDomAttribute("href") ;
			
			 if (url == null || url.isEmpty()) {
	                continue;
	            }
			
			
			String st = "https://www.amazon.in" ;
			
			if(url.matches("http(.*)"))
				
			{
				System.out.println(url);
			}
			
			else
				
			{
				
		String	url1 =	st.concat(url);
				
				System.out.println(url1);
			}
			
				
		}
		
		
		
		

	}

}
