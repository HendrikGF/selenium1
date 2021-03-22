import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//98
		
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//esta clase es para ejecutar js objects
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		// window.scrollBy(0,500) funcion de js para hacer el window scroll hasta la posicion (0,500) //segundo parametro opcional
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		//Esto es para hacer el scroll a un componente nada mas
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//para obtener los elementos de una tabla
		List<WebElement> lis = driver.findElements(By.xpath("//table[@id='product']//td[4]"));
		int sum=0;
		
		for(int i = 0;i<lis.size();i++)
		{
			sum = sum + Integer.parseInt(lis.get(i).getText());
		
		}
		
		int numeros = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		if(numeros==sum) {
			System.out.println("El numero "+ sum + " es correcto");
			Assert.assertEquals(sum, numeros);
			
		}
	}

}
