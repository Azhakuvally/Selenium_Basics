package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHoverover {

	public static void main(String[] args) throws InterruptedException {
		
          ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.flipkart.com/electronics-july-goat-sale-store?fm=neo%2Fmerchandising&iid=M_1138171f-40a1-4aa7-82b5-0ba0f2a4cc98_2_PD9DX88ISLD6_MC.9VH7OCREFLKE&otracker=hp_rich_navigation_4_2.navigationCard.RICH_NAVIGATION_Electronics_9VH7OCREFLKE&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L0_view-all&cid=9VH7OCREFLKE");
		
		driver.manage().window().maximize() ;
		
		
		
		
		
   /*
      
		WebElement beauty = driver.findElement(By.xpath("//div[@class='_1wE2Px']")) ;
		
		Actions a1 = new Actions(driver) ;
		a1.moveToElement(beauty).perform() ;
		
		*/
		
		
		WebElement homeApp = driver.findElement(By.xpath("//span[.='Home & Furniture']")) ;
		
		Actions a1 = new Actions(driver) ;
		
		a1.moveToElement(homeApp).perform() ;
		
		Thread.sleep(1000);
		
		WebElement homedecor = driver.findElement(By.xpath("//a[@title='Home Decor']")) ;
		
		homedecor.click() ;
		
		
	}

}


