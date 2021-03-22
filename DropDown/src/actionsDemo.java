import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/ "); 
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("nav-link-accountList")); 
		WebElement escribir = driver.findElement(By.id("twotabsearchtextbox")); 

		//escribir en mayuscula
		a.moveToElement(escribir).click().keyDown(Keys.SHIFT).sendKeys("hola").build().perform();
		
		//moves to specific element
		a.moveToElement(move).build().perform();
		
		//doble click
		a.moveToElement(escribir).doubleClick().build().perform();

	}

}
