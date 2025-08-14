package module;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {

	
	 static ChromeDriver driver = new ChromeDriver() ;
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.get("https://grotechminds.com/login/");
		
		driver.manage().window().maximize() ;
		
		WebElement automateme = driver.findElement(By.xpath("//a[.='Automate me']"));
		
		automateme.click() ;
		
		
		Thread.sleep(5000);
		
		WebElement flipflop = driver.findElement(By.xpath("(//h3[@class='elementor-flip-box__layer__title'])[25]"));
		
        Actions a1 = new Actions(driver) ;
        
        
		
		a1.moveToElement(flipflop).perform() ; //hoverover
		
		Thread.sleep(5000);
		
		WebElement readmore = driver.findElement(By.xpath("(//a[@class='elementor-flip-box__button elementor-button elementor-size-sm'])[13]"));

		
		readmore.click() ;
		
		dragdrop() ;
		
	}
		
		static void dragdrop() throws InterruptedException 
		{
		
		Thread.sleep(1000);
		
		Actions a2 = new Actions(driver) ;
		
		WebElement d1 = driver.findElement(By.xpath("//div[@id='container-1']")) ;
		
		WebElement d2 = driver.findElement(By.xpath("(//div[@class='w3-container '])[2]")) ;
		
		
		
		
		a2.dragAndDrop(d1, d2).perform() ; //drag and drop
		
		
		}
		
		
		
	

}
