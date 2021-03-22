import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// entrar primeras letras y seleccionar pais  /// solucion de rahul
		
		//System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		//WebDriver driver = new ChromeDriver();
		/*driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("cu");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for (WebElement option :options) {
			
			if(option.getText().equalsIgnoreCase("Cuba"))
			{
				option.click();
				break;
				
			}
			*/
		/*driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ja");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for (WebElement option :options) {
			
			if(option.getText().equalsIgnoreCase("Japon"))
			{
				option.click();
				break;
				*/
	

	//sin usar listas

	

	System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");

	WebDriver driver= new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	// driver.findElement(By.id("autosuggest")).click();

	driver.findElement(By.id("autosuggest")).sendKeys("ind");

	Thread.sleep(2000);  // because it takes time to open up the list.

	int count= driver.findElements(By.className("ui-corner-all")).size();

	for(int i=0; i<count; i++)

	{

	String choice= driver.findElements(By.className("ui-corner-all")).get(i).getText();

	if(choice.equalsIgnoreCase("india"))

	{

	driver.findElements(By.className("ui-corner-all")).get(i).click();

	break;

	}

	}
	
	}
}


		
		
		
		

	


