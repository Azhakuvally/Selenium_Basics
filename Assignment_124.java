package module;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_124 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		Assignment_124 ob = new Assignment_124() ;
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/registration/");
		
		 WebElement e1 = driver.findElement(By.xpath("//input[@name='file']")) ;
		 
		 e1.sendKeys("C:\\Users\\chock\\Desktop\\Resume_Anuu.docx");
		 
		 Thread.sleep(2000);
		 
		 WebElement e2 = driver.findElement(By.xpath("//html[@lang='en-US']")) ;
		 
		 e2.sendKeys(Keys.ARROW_DOWN) ;
		 e2.sendKeys(Keys.ARROW_DOWN) ;		 
		 e2.sendKeys(Keys.ARROW_DOWN) ;
		 e2.sendKeys(Keys.ARROW_DOWN) ;
		 e2.sendKeys(Keys.ARROW_DOWN) ;		 
		 e2.sendKeys(Keys.ARROW_DOWN) ;
		
		 Thread.sleep(2000);
		 
		 
		
		 
		 
		 
		 
		 TakesScreenshot ts = driver ;
		 
		 File source= ts.getScreenshotAs(OutputType.FILE) ;
		 
		 
		 File dest = new File("C:\\Users\\chock\\eclipse-workspace\\Selenium_Code\\src\\module\\Screenshots\\"+ob.getClass()+Math.random()+".png") ;
		 
		 FileHandler.copy(source, dest); 
		 
		 

		
		
		
		
		
		
		
		 
		 
		 
	}

}
