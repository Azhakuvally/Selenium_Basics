package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RailwayHoverover {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.irctc.co.in/nget/");
		
		driver.manage().window().maximize() ;
		
		WebElement popupok = driver.findElement(By.xpath("//button[@class='btn btn-primary']")) ;
		
		popupok.click() ;
		
		WebElement train = driver.findElement(By.xpath("(//strong[text()='TRAINS'])[1]")) ;
		
		train.click() ;
		
		Thread.sleep(1000);
		
		WebElement pnrstatus = driver.findElement(By.xpath("(//span[text()='PNR Enquiry'])[1]")) ;
		
		pnrstatus.click() ;
		
		Thread.sleep(2000);
		
		WebElement pnrfield = driver.findElement(By.name("pnr")) ;
		pnrfield.sendKeys("2821454625");
		
		WebElement submit = driver.findElement(By.xpath("//button[@class='form-control btn btn-primary']")) ;
	
		submit.click() ;

	}

}
