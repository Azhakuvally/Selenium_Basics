package module;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidLinks {
	
	static int Countofvalidlinks = 0 ;
	

	public static void main(String[] args) throws IOException {
		
		ValidLinks ob = new ValidLinks() ;
	
		
		EdgeDriver driver = new EdgeDriver() ;
		driver.manage().window().minimize() ;
		driver.get("https://www.google.com/");
		
		
		 List<WebElement> links= driver.findElements(By.tagName("a"));
		 
	int count = 	 links.size() ;
	
	
	

	
	
	for(int i =  0 ;i< count ; i++ )
		
	{
		String pro = "https://www.google.com" ;
		
		WebElement e1 = links.get(i) ;
		
		String url = e1.getDomAttribute("href");
		
		if (url.matches("https(.*)"))
				
				{
			
			System.out.println(url);
			
			ob.validlink(url) ;
			
				}
		
		else
			
		{
			String url1 = pro+url ;
			System.out.println(url1);
			
			ob.validlink(url1) ; 
			
		}
		
		 
		 
		
	}
	
	
		
	System.out.println("Total number of valid links = "+Countofvalidlinks);

	 
	}
	
	
	
	
	 void validlink(String link) throws IOException
	
	{
		
		 
		
		
		URL u1 = new URL(link ) ;
		
		 HttpsURLConnection h1 = (HttpsURLConnection) u1.openConnection() ;
		 
		 if(h1.getResponseCode() ==200)
			 
		 {
			 System.out.println("Valid link"+"-->"+h1.getResponseCode()+"--> "+ h1.getResponseMessage());
			
			 Countofvalidlinks++ ;
			 
		 }
		 
		 else
			 
		 {
			 System.out.println("Not Valid link"+"-->"+h1.getResponseCode()+"--> "+ h1.getResponseMessage());
		 }
		 
		 
		 
		
		
	}

}
