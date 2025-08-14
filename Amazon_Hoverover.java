package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Hoverover {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver () ;

		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize() ;
		
		WebElement  lang = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']"));
		
		Actions a1 = new Actions(driver) ;
		a1.moveToElement(lang).perform() ;
		
		Thread.sleep(1000) ;
		
		WebElement malayalam = driver.findElement(By.xpath("//a[@lang='ml-IN']"));
		
		malayalam.click() ;
		
		Thread.sleep(1000);
		
		
		
		driver.manage().window().minimize() ;
		
		
	}

}
