import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
/*		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("passsss");
		driver.findElement(By.xpath("//button[@name='login']")).click();*/
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("holss");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("qqqqq");;
		driver.findElement(By.cssSelector("button[name='login']")).click();

		
		

	}

}
