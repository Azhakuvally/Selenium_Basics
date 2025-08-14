package module;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalnumberLinks2 {

	public static void main(String[] args) throws IOException
	{
		
		ChromeDriver driver = new ChromeDriver() ;
		driver.manage().window().minimize() ;
		driver.get("https://google.com/");
		List<WebElement> list = driver.findElements(By.tagName("a")) ;
			int Countoflinks = list.size() ;
			System.out.println(Countoflinks);
			for(int i = 0 ; i <Countoflinks;i++)
			{
				
				WebElement e1 = list.get(i);
				String u1 = e1.getDomAttribute("href") ;
				System.out.println(u1);
				verifythelink(u1);		
			}

	}
	static void verifythelink(String u1) throws IOException
	{
		try {
		URL url=new URL(u1);
		HttpURLConnection c1=		(HttpURLConnection) url.openConnection();
		
			if(c1.getResponseCode()==200)
			{
				System.out.println("It is a valid link " +c1.getResponseMessage() +" "+c1.getResponseCode());
			}
			else
			{
				System.out.println("It is NOT VALID " +c1.getResponseMessage() +" "+c1.getResponseCode());
			}
		
		}
		catch(MalformedURLException a1)
		{
			System.out.println("Hanlded the exception");
		}
		
	}

}
