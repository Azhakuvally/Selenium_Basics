package module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTexts {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver () ;

		driver.get("https://www.google.com/");
		
	List<WebElement> list	=driver.findElements(By.tagName("a")) ;
	
	int count = list.size() ;
	
	
	for(int i = 0; i<=count ;i++)

	{
		WebElement e1 = list.get(i);
		
		String linktext = e1.getText() ;
		
		System.out.println(linktext);
		
		
	}
	
	}

}
