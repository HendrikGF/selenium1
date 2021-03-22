import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//explicit wait
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		
		WebDriverWait w = new WebDriverWait(driver,5);
		
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		
		//con cualquiera de estos dos elementos funciona, visibilityOfElementLocated o elementToBeClickable
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#results")));
		System.out.println(driver.findElement(By.cssSelector("#results")).getText());
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/a/img"));
		driver.getTitle();
	}

}
