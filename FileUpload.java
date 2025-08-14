package module;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		
        
		
	
		
		FileUpload ob = new FileUpload();
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/registration/");
		
	WebElement e1 = 	driver.findElement(By.xpath("//input[@class='file']")) ;
	
	e1.sendKeys("C:\\Users\\chock\\Desktop\\AzhakuvallyMockTest.docx");
	
	Thread.sleep(3000) ;
	
	

	
	
        TakesScreenshot ts = driver ;
        
        File source = ts.getScreenshotAs(OutputType.FILE) ;
        
        File des = new File("C:\\Users\\chock\\eclipse-workspace\\Selenium_Code\\src\\module\\Screenshots\\"+ob.getClass()+Math.random()+".png") ;
        
        FileHandler.copy(source, des);
        
        
	}

}
