import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//select the destinations
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@class='dropdownDiv']//a[@value='BHO']")).click();
			//Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='dropdownDiv']//a[@value='MAA']")).click();
		
		//radio button
		//driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
/*
		//como saber si la opcion de calendario esta enable o disable en dependencia del radio button
		driver.findElement(By.id("Div1")).getAttribute("style");
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("is enable");
		}
		else {
			System.out.println("is disable");
		}
*/		
		//calendar cogiendo fecha futura
		
		//primero se escoje el mes con un while
		//Luego se selecciona el dia, coger el atributo comun,ponerlo en lista y Iterar
		
		while(!driver.findElement(By.cssSelector("div[class='ui-datepicker-group ui-datepicker-group-first'] span[class='ui-datepicker-month']")).getText().contentEquals("September")) 
		{
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}	
			List<WebElement> list = driver.findElements(By.cssSelector(".ui-state-default"));
			int count = list.size();
			
			for(int i =0;i<count;i++)
			{
				if(list.get(i).getText().contentEquals("5")) 
				{
				  list.get(i).click();
				  break;
				}
			}
			/*
			driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
			while(!driver.findElement(By.cssSelector("div[class='ui-datepicker-group ui-datepicker-group-first'] span[class='ui-datepicker-month']")).getText().contentEquals("September")) 
			{
				driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
			}	
				List<WebElement> listq = driver.findElements(By.cssSelector(".ui-state-default"));
				int countq = list.size();
				
				for(int i =0;i<countq;i++)
				{
					if(listq.get(i).getText().contentEquals("12")) 
					{
					  listq.get(i).click();
					  break;
					}
				}
				*/
				
			
		
  	}

}
