package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {

	public static void main(String[] args) {

		
		
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		 WebElement e1= driver.findElement(By.xpath("//div[@id='container-1']")) ;
		 
		 WebElement e2 = driver.findElement(By.xpath("(//div[@class='w3-container '])[2]"));
		 
		 Actions a1 = new Actions(driver);
		 
		 a1.dragAndDrop(e1, e2).perform() ;
		 
		
	}

}
