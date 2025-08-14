package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_113 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.google.com/");
		
	WebElement gmailhyperlink = 	driver.findElement(By.linkText("Gmail"));
	
	gmailhyperlink.click() ;
	
	//driver.close() ;
	
	driver.get("https://www.google.com/");
	
	WebElement imageshyperlink = driver.findElement(By.partialLinkText("Ima")) ;
	
	imageshyperlink.click() ;

	}

}
