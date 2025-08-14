package module;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_116 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.get("https://grotechminds.com/registration/");
		
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='First Name']")) ;
		
		e1.sendKeys("Nithila") ;
		
		Actions a1 = new Actions(driver);
		
		a1.doubleClick(e1).perform() ;
		
		Thread.sleep(6000) ;
		e1.sendKeys(Keys.CONTROL+"c") ;
		
		
		WebElement e2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']")) ;
		
		e2.sendKeys(Keys.CONTROL+"v") ;
		
		
		

	}

}
