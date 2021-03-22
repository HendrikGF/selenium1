import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 85
		
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid]
		Iterator<String> iter = windows.iterator();  //usando el metodo iterator()
		
	String parentId = iter.next();  //toma el primero del arreglo iter que seria parentid
	String childrenId = iter.next();  //itera de nuevo y toma el segundo elemento childid
		
		driver.switchTo().window(childrenId); //esto cambia el driver a la pagina hija para usarlo alli
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText()); //captura el mensaje de la pag hija
		
		driver.findElement(By.cssSelector(".im-para.red")).getText(); //get the message
		
	String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);//cambiar de nuevo a padre
		driver.findElement(By.id("username")).sendKeys(emailId);
		
	}

}
