package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Handle {

	public static void main(String[] args) throws InterruptedException {
		
	
		
		EdgeDriver driver = new EdgeDriver() ;
		
		
		driver.get("https://grotechminds.com/alert/");
		
		
		
		
		 WebElement e1 = driver.findElement(By.xpath("(//button[.='Alert1'])[1]")) ;
		
		e1.click() ;
		
		Thread.sleep(2000) ;
		driver.switchTo().alert().accept();
		
		
		WebElement e2 = driver.findElement(By.xpath("(//Button[.='Button1'])[1]")) ;
		
		e2.click() ;
		
		System.out.println("Hello World");
		
		
		

	}

}
