package module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_122 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize() ;
		
		 WebElement searchfield = driver.findElement(By.id("APjFqb")) ;
		 
		 searchfield.sendKeys("SELENIUM") ;
		 
		 Thread.sleep(3000) ;
		 
		List <WebElement> Autosuggestion =  driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li")) ;
		 
		 WebElement e1 = Autosuggestion.get(4) ;
		 
		 e1.click() ;

	}

}
