package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment111 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("file:///C:/Users/chock/Downloads/grotechminds%20html%20code.html");
		
		
		WebElement username = driver.findElement(By.id("1")) ;
		
		if(username.isEnabled()&&username.isDisplayed())
			
		{
			username.sendKeys("8301063992");
		}
		
		
		WebElement checkbox1 = driver.findElement(By.id("123")) ;
		
		if(checkbox1.isSelected() == true)
			
		{
			
			System.out.println("Check box 1 is already selected");
		}
		
		else
		{
			checkbox1.click() ;
		}

	}

}
