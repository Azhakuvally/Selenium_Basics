package module;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_114 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		EdgeDriver driver = new EdgeDriver () ;
				driver.get("https://grotechminds.com/registration/");
				
				driver.manage().window().maximize() ;
				
				
				Thread.sleep(1000) ;
				
		WebElement popup =		driver.findElement(By.id("chat-bot-message-close")) ;
		
		popup.click() ;
		
		
	WebElement skill = 	driver.findElement(By.id("Skills")) ;
	
	
Select s1 = new Select (skill) ;
	
	s1.selectByValue("select1") ;
	
		
		
		
	
	Thread.sleep(1000) ;
	
	
	
	
	WebElement Country = driver.findElement(By.name("Country")) ;
	
	
	
	Select s2 = new Select (Country) ;
	s2.selectByVisibleText("India" ) ;
	
	
	WebElement relegion = driver.findElement(By.name("Relegion")) ;
	
	
	
	Select s3 = new Select (relegion) ;
	
	s3.selectByIndex(9);
	
	

	}

}
