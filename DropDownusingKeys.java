package module;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownusingKeys {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox")) ;
		dropdown.click() ;
		
		
		
		dropdown.sendKeys(Keys.ARROW_DOWN) ;
		
		Thread.sleep(1000) ;
		
		dropdown.sendKeys(Keys.ARROW_DOWN) ;
		Thread.sleep(1000) ;

		dropdown.sendKeys(Keys.ARROW_DOWN) ;
		Thread.sleep(1000) ;
		dropdown.sendKeys(Keys.ARROW_DOWN) ;
		Thread.sleep(1000) ;
		dropdown.sendKeys(Keys.ARROW_DOWN) ;
		
		
	WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		
		searchbutton.click() ;

	}

}
