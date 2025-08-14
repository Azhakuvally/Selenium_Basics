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

public class Datadriventesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\chock\\eclipse-workspace\\Selenium_Code\\src\\module\\DataDrivenTesting\\DataSheet.xlsx") ;
		
	Workbook wb	 = WorkbookFactory.create(f1 ) ;
	
	
	    Sheet sh = wb.getSheet("LOGIN CREDENTIALS");
	    
	Row r1    =  sh.getRow(0) ;
	
	Cell c1 = r1.getCell(0) ;
	
	String un = c1.getStringCellValue() ;
	
	System.out.println(un);
	
	
	String password = wb.getSheet("LOGIN CREDENTIALS").getRow(0).getCell(1).getStringCellValue() ;
	
	System.out.println(password);
	
	
	
	String un1 = wb.getSheet("LOGIN CREDENTIALS").getRow(1).getCell(0).getStringCellValue() ;
	
	
	System.out.println(un1);
	
	
	  String PW1 = NumberToTextConverter.toText(wb.getSheet("LOGIN CREDENTIALS").getRow(1).getCell(1).getNumericCellValue()) ;
	
	
	
	System.out.println(PW1);
	
	
	
 	
	}

}
