import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.gecko.driver", "//Users//hendrikandwendy//ESTUDIAR//SELENIUM//driver//geckodriver");
		WebDriver driver = new FirefoxDriver(); 

		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//driver.findElement(By.id("draggable")).click();
		Actions act = new Actions(driver);

		WebElement departure = driver.findElement(By.id("draggable"));
		WebElement arrivals = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(departure, arrivals).build().perform();
		

	}

}
