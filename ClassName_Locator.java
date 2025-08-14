package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName_Locator {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.google.com/");
		WebElement e1 = driver.findElement(By.className("gLFyf")) ;
		e1.sendKeys("M K Stalin") ;

	}

}
