package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox")) ;
		
		Select s1 = new Select (dropdown ); 
		//s1.selectByIndex(2) ;
		//s1.selectByVisibleText("Electronics") ;
		s1.selectByValue("search-alias=toys") ;
		
		
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		
		searchbutton.click() ;
		

	}

}
