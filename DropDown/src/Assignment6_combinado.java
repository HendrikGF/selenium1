import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6_combinado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		driver.findElement(By.id("checkBoxOption2")).click();
		String variable = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(variable);
		
		driver.findElement(By.id("dropdown-class-example")).click();
		driver.findElement(By.id("dropdown-class-example")).sendKeys(variable);
		driver.findElement(By.id("dropdown-class-example")).click();
		
		driver.findElement(By.id("name")).sendKeys(variable);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String text = driver.switchTo().alert().getText();
		
		if(text.contains(variable))
		{
			System.out.println("El mensaje es correcto");
			
		}
		else
		{
			System.out.println("El mensaje es malo");

		}
		
	}

}
