
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Ecomerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//lectura 68
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
		
		Thread.sleep(3000);
		
	/*utilizando el metodo auxiliar addItem() puedo llamar al metodo asi si la clase addItems es static 
	sino hay que crear un objeto de la clase Ecomerce para poder llamar a un metodo de otra clase*/
	// addItems(driver,itemsNeeded);
		Ecomerce b= new Ecomerce();
		b.addItems(driver, itemsNeeded);

		carcheck(driver);
		
	}	
	public void addItems(WebDriver driver,String[] itemsNeeded) {
		
		List<WebElement> productos = driver.findElements(By.xpath("//div[@class='product']"));

		int j=0;
		
		for(int i=0;i<productos.size();i++)
		{
			//* split() se usa para duvidir un string y te devuelver un arreglo con las dos divisiones
			String[] name = productos.get(i).getText().split("-");
			//* trim() elimina los espacios en blanco
 			String formatedName = name[0].trim();
 			
 			List itemsNeddedList = Arrays.asList(itemsNeeded);
			
			if(itemsNeddedList.contains(formatedName)) {   
				j++;
				driver.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();
				//$x("//*[@id="root"]/div/div[1]/div/div[3]/div[3]/button")
				////div[@class ='product-action']/button
				if(j==itemsNeeded.length) {
				break;
				}
			}
		}

	}
	public static void carcheck(WebDriver driver) {
		//implicit wait  
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver,5);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		//w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button.promoBtn")));
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		 
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
	}

}
