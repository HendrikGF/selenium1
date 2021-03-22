import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_tablas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int rows = driver.findElements(By.xpath("//div[@class='left-align']//td[3]")).size();
		
		System.out.println(rows);
		
		int columns = driver.findElements(By.xpath("//div[@class='left-align']//th")).size();
		
		System.out.println(columns);
		
		//int var = Integer.parseInt(driver.findElement(By.xpath("//div[@class='left-align']//tr[3]")).getText().split(" ")[12]);
		String[] palabras = driver.findElement(By.xpath("//div[@class='left-align']//tr[3]")).getText().split(" ");
		
		System.out.println(palabras[0]+ " "+ palabras[1]);
		
		
		
		
		System.out.println(palabras[11]);
		

	}

	
}
