import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//seleccionar destinos
		
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//*[@id='dropdownGroup1']/div/ul[1]/li[1]/a
		
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();
		
		driver.findElement(By.xpath("//*[@id=\'dropdownGroup1\']/div/ul[1]/li[10]/a")).click();
			//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'dropdownGroup1\']/div/ul[1]/li[3]/a")).click();
		
//***si hay un dinamic dropdown se puede usar [2] para identificar a ese elemento del anterior 

	}

}
