
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
		
		//Create Driver Object for chrome browser
		
		//We will strictly implement methods of webdriver
		
		  //Class name= x;
		
		System.setProperty("webdriver.chrome.driver", "/Users/hendrikandwendy/ESTUDIAR/SELENIUM/driver/chromedriver");
			  
		   WebDriver driver = new ChromeDriver(); 
		  
		    driver.get("http://google.com");//hit the url in the browser
			System.out.println(driver.getTitle());//validate if your page title is correct
				   
			System.out.println(driver.getCurrentUrl());//validate if we are landed on the correct url
			
			driver.get("http://facebook.com");
			//driver.navigate().back();
			//driver.navigate().forward();
			//driver.close();//close the current browser
			//driver.quit();//close all the browsers opened by selenium script
			
			driver.findElement(By.id("email")).sendKeys("This is my first code");
			driver.findElement(By.name("pass")).sendKeys("passsss");
			driver.findElement(By.linkText("Forgot Password?")).click();
			
			
			
			
			
				   
		   
		
	}

}
