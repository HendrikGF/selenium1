import java.util.Iterator;   
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ejercicio_LinksNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//92
		
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1- numbers of links in a page *** all link have a tag <a>
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2- number of links only of the bellow panel  ***I have to create a new driver only with that area
		WebElement nuevodriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(nuevodriver.findElements(By.tagName("a")).size());
		
		//3- numbers of links in a columna
		WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		//4- click in each link in the column and check if the pages are open
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) 
		{
			String clickOnLinkTab = Keys.chord(Keys.COMMAND,Keys.RETURN);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}	
		//mostrar mensaje con el titulo de cada una de las paginas que se abrieron anteriormente
		Set<String> cadena = driver.getWindowHandles();
		Iterator<String> iter = cadena.iterator();
			
			while(iter.hasNext()) 
			{
			driver.switchTo().window(iter.next());
			System.out.println(driver.getTitle());
			}
		
	}

}
