package module;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_123 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gad_campaignid=19863995494&gbraid=0AAAAADLp3cH7t2l-Z3doAByhj-2l471m1&gclid=Cj0KCQjwhO3DBhDkARIsANxrhTq5XRjJVzaNY2IwvvMnFiNW4JB_zrdI0K9kkVZFLcZQelBaiI4d2gIaAoM9EALw_wcB&gclsrc=aw.ds");
		
	WebElement google	= driver.findElement(By.className("google-text")) ;
	
	google.click() ;
	
	 Set<String> browzerids = driver.getWindowHandles() ;
	 
	  Iterator<String> i1 = browzerids.iterator() ;
	
	String parentid = i1.next() ;
	
	String Childid = i1.next() ;
	
	Thread.sleep(3000);
	
	driver.switchTo().window(Childid) ;
	
	String childtitle = driver.getTitle() ;
	
	System.out.println(childtitle);
	
	
		
		
	}

}
