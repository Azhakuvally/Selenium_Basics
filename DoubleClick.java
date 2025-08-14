package module;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://grotechminds.com/contact-us/");
		
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='Your Name']")) ;
		
		e1.sendKeys("Azhakuvally");
		
		Actions a1 = new Actions(driver) ;
		
		a1.doubleClick(e1).perform() ;
		
		e1.sendKeys(Keys.CONTROL+"c");
		
		WebElement e2 = driver.findElement(By.xpath("//textarea[@placeholder='Message']"));
		
		e2.sendKeys(Keys.CONTROL+"v") ;
		
		

	}

}
