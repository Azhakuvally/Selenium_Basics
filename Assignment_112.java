package module;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_112 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.apollopharmacy.in/search-medicines");
		
		WebElement searchfield = driver.findElement(By.id("searchProduct")) ;
		
		searchfield.sendKeys("thyronorm 125 mcg"+Keys.ENTER) ;
		
		

	}

}
