
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
		
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
			  
		   WebDriver driver = new ChromeDriver(); 
		  
		//driver.get("https://login.salesforce.com/");   
		//driver.findElement(By.id("username")).sendKeys("playa");
		//driver.findElement(By.name("pw")).sendKeys("passs");
		//driver.findElement(By.id("Login")).click();
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		   
		  driver.get("https://login.salesforce.com/");
		  driver.findElement(By.cssSelector("#username")).sendKeys("iugiguig");	
		  driver.findElement(By.cssSelector("#password")).sendKeys("PASWORD");
		  driver.findElement(By.cssSelector("#Login")).click();
		  System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		  
		  
			
			
			
			
				   
		   
		
	}

}
