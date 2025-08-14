package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLocator {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize() ;
		
WebElement Email = driver.findElement(By.name("email")) ;
		
		Email.sendKeys("8301063992") ;
		
		
		WebElement Password = driver.findElement(By.name("pass")) ;
		
		Password.sendKeys("12345");
		
	WebElement login = 	driver.findElement(By.tagName("button")) ;
	login.click();

	}

}
