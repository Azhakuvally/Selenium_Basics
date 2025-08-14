package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.amazon.in/");
		
		WebElement hamburger = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")) ;
		
		hamburger.click() ;
		
	

	}

}
