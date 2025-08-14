package module;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_110 {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver() ;
		
		driver.get("https://www.facebook.com/login/");
		
	WebElement emailfield  =	driver.findElement(By.id("email")) ;
	
	emailfield.sendKeys("8301063992");
	
	
	WebElement passwordfield = driver.findElement(By.id("pass")) ;
	
	passwordfield.sendKeys("*******") ;
	
	passwordfield.sendKeys(Keys.ENTER) ;
	
	
	
	

	}

}
