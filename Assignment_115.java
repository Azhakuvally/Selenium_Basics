package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_115 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("file:///C:/Users/chock/Downloads/grotechminds%20html%20code.html");
		
		WebElement username = driver.findElement(By.xpath("(html/body/input)[1]")) ;
		
		username.sendKeys("8301063992") ;
		
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]")) ;
		
		hint.sendKeys("hint") ;
		
		WebElement password = driver.findElement(By.xpath("(/html/body/input)[3]"));
		
		password.sendKeys("25sfklj");
		
		WebElement firstname = driver.findElement(By.xpath("(/html/body/form/input)[1]")) ;
		firstname.sendKeys("Azhakuvally") ;
		
		
		WebElement Lastname = driver.findElement(By.xpath("(/html/body/form/input)[2]")) ;
		
		
		if(Lastname.isDisplayed() && Lastname.isEnabled() == true )
			
		{
			Lastname.sendKeys("Ponnambalam") ;
			
		}

		
		else
			
		{
			System.out.println("Lastname field is disabled");
		}
		
		WebElement submit = driver.findElement(By.xpath("(/html/body/form/input)[3]")) ;
		
		
		WebElement boycheckbox = driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		
		boycheckbox.click() ;
		
		WebElement girlcheckbox = driver.findElement(By.xpath("(/html/body/form/input)[5]")) ;
		
		girlcheckbox.click() ;
		
		WebElement babycheckbox = driver.findElement(By.xpath("(/html/body/form/input)[6]")) ;
		
		babycheckbox.click() ;
		
		
		
		WebElement submit2 = driver.findElement(By.xpath("(/html/body/form/input)[7]")) ;
		
		 //submit2.click() ;
		
		WebElement Maleradiobutton = driver.findElement(By.xpath("(/html/body/input)[4]")) ;
		
		Maleradiobutton.click() ;

		
		WebElement Femaleradiobutton = driver.findElement(By.xpath("(/html/body/input)[5]")) ;
		
		Femaleradiobutton.click() ;
		
		WebElement relocatecheckbox = driver.findElement(By.xpath("(/html/body/input)[6]")) ;
		
		relocatecheckbox.click() ;
		
		WebElement Link = driver.findElement(By.xpath("/html/body/a"));
		
		
		
		WebElement relegion = driver.findElement(By.xpath("/html/body/select"));
		
		Select s1 = new Select (relegion) ;
		
		s1.selectByValue("4");
		
		Link.click() ;
		
		WebElement signup = driver.findElement(By.xpath("(/html/body/input)[7]"));
		
		
		
		//signup.click() ;

		
	}

}
