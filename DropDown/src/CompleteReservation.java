import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CompleteReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//radio button
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//destinations
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[14]/a")).click();
		driver.findElement(By.xpath("//div[@class='dropdownDiv']//a[@value='MAA']")).click();
		//*[@id="dropdownGroup1"]/div/ul[1]/li[14]/a
		
		//calendar
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[1]/a")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5"))
		{
			System.out.println("is disable");

		}
		else{
			System.out.println("is enable");

		}
		
		//numbers of passengers
		driver.findElement(By.id("divpaxinfo")).click();
		//driver.findElement(By.name("ctl00$mainContent$ddl_Adult")).click();
		WebElement dropdow = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select opciones= new Select(dropdow);
		opciones.selectByIndex(4);
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).getAttribute("value").contains("3");
		//*[@id="ctl00_mainContent_ddl_Adult"]/option[5]
		
		//checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//tipo de moneda
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']/option[5]")).click();

		//search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		
	}

}
