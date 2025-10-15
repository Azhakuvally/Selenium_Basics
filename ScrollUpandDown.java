package module;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class ScrollUpandDown 

{
@Test

	public void scroll() throws InterruptedException, IOException
	
	{
	
	ChromeDriver driver = new ChromeDriver() ;
	
	FluentWait<ChromeDriver> wait = new FluentWait<ChromeDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(NullPointerException.class) ;
	
	driver.get("https://www.amazon.in/");
	
	driver.navigate().refresh() ;
	
	 WebElement e1 = driver.findElement(By.xpath("//a[.='About Amazon']")) ;
	
	
	Point ps = e1.getLocation() ;
	
	int x = ps.getX() ;
	int y = ps.getY() ;
	
	JavascriptExecutor js = driver ;
	
	Thread.sleep(2000) ;
	
	js.executeScript("window.scrollBy(0,arguments[0])", y) ;
	
	
	 WebElement e2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")) ;
	 
	 Point ps1 = e2.getLocation() ;
	 
	 int Y = ps1.getY() ;
	 Thread.sleep(2000) ;
	 
	 js.executeScript("window.scrollBy(0,arguments[0])", -Y) ;
	 
	 Thread.sleep(2000) ;
	// WebElement e3 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")) ;

	 js.executeScript("arguments[0].value='watch';", e2) ;
	 
	 
	 TakesScreenshot ts = driver ;
	 
	 File src = ts.getScreenshotAs(OutputType.FILE) ;
	 
	 File dest  = new File("C:\\Users\\chock\\eclipse-workspace\\TestNGCodes\\src\\Packone\\Screenshots\\"+Math.random()+".png") ;
	 

	FileHandler.copy(src, dest) ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
