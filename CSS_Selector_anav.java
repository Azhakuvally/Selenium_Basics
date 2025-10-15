package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_anav {
	
	{
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.get("https://google.com");
		
		WebElement e1 = driver.findElement(By.cssSelector("textarea[jsname='yZiJbe']")) ; //Tagname[AN='AV']
		
		e1.sendKeys("Modi") ;
		
	}

}
