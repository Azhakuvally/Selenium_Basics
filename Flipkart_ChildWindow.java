package module;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart_ChildWindow {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		Flipkart_ChildWindow ob = new Flipkart_ChildWindow() ;
		EdgeDriver driver = new EdgeDriver () ;
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		 WebElement e1 = driver.findElement(By.name("q")) ;
		 		  
		 e1.sendKeys("Watch"+Keys.ENTER) ;
		 
		 Thread.sleep(5000) ;
		 
		
		
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='cPHDOP col-12-12']/div[@class='_75nlfW LYgYA3']/div") );
		
		
		int count = list2.size() ;
		
		System.out.println(count);
		
		
		WebElement e3 = list2.get(count-5);
		
		e3.click() ;
		
		Thread.sleep(3000) ;
		
		Set<String> s1 = driver.getWindowHandles() ;
		  
		Iterator<String> i1 =   s1.iterator() ;
		
		String ParentID =	i1.next() ;
		
		String childwindowhandle = i1.next() ;
		
		Thread.sleep(3000) ;
		
		driver.switchTo().window(childwindowhandle) ;
		
		
		
		Date dt = new Date () ;
		
		Date datetime = new Date (dt.getTime() ) ;
	
		
		String timenow = datetime.toString() ;
		
		System.out.println(timenow);
		
		
		String DD = timenow.substring(8, 10);
		
		String MMM= timenow.substring(4, 7);
		
		String YYYY = timenow.substring(timenow.length()-4) ;
		
		String HH = timenow.substring(11, 13);
		
		String MM = timenow.substring(14,16);
		
		String SS = timenow.substring(17, 20) ;
		
		String timenow1 = DD+MMM+YYYY+HH+MM+SS ;
		
		System.out.println(timenow1);
		
		
		
		Thread.sleep(3000) ;
		
		TakesScreenshot ts = driver ;
		
		 File sourcescreenshot= ts.getScreenshotAs(OutputType.FILE) ;
		 
		 File Dest = new File ("C:\\Users\\chock\\eclipse-workspace\\Selenium_Code\\src\\module\\Screenshots\\"+ob.getClass()+"_"+timenow1+".png") ;
		
		FileHandler.copy(sourcescreenshot, Dest);
		
		
		  
		  
		  

	}

}
