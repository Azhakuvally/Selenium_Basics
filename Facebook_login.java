package module;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook_login {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		EdgeDriver driver = new EdgeDriver () ;
		
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize() ;
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\chock\\eclipse-workspace\\Selenium_Code\\src\\module\\DataDrivenTesting\\DataSheet.xlsx") ;
		
		Workbook wb = WorkbookFactory.create(f1) ;
		
	Sheet sh = 	wb.getSheet("LOGIN") ;
	
	   Row r1 = sh.getRow(3);
	   
	 Cell c1 =  r1.getCell(0) ;
	 
	String un1 =  c1.getStringCellValue() ;
	Thread.sleep(2000);
	
	String pw = NumberToTextConverter.toText(wb.getSheet("LOGIN").getRow(3).getCell(1).getNumericCellValue());
		
	//System.out.println(pw);
		 WebElement username = driver.findElement(By.xpath("//input[@name='email']")) ;
		 
		 username.sendKeys(un1) ;
		 
		 Thread.sleep(2000);
		 
		 WebElement password = driver.findElement(By.xpath("//input[@name='pass']")) ;
		 
		 password.sendKeys(pw);
		 
		 Thread.sleep(2000);
		 
		 WebElement eye = driver.findElement(By.xpath("//div[@class='_9ls7']/a/div"));
		 
		 eye.click() ;

	}

}
