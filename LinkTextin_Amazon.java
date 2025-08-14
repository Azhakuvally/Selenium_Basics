package module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextin_Amazon {

	public static void main(String[] args) {
	
		
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://amazon.in");
		
		driver.manage().window().minimize(); 
		
		List<WebElement> list= driver.findElements(By.tagName("a"));
		
		int countoflinks = list.size() ;
		
		System.out.println("Count of links = "+countoflinks);
		
		for(int i = 0 ; i<countoflinks;i++)
			
		{
			WebElement e1 = list.get(i) ;
			
		String LinkText = 	e1.getText() ;
		
		System.out.println(LinkText);
			
		}

	}

} 
