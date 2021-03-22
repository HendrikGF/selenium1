package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebloginCarLoan()
	{
		//selenium
		System.out.println("webloguinCar");
	}
	
	@Test
	public void MobileLogInCarLoan()
	{
		//Appium
		System.out.println("Mobile loguinCar");
	}
	
	@Test
	public void MobileSignInCarLoan()
	{
		//Appium
		System.out.println("Mobile Signout");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileSignOutCarLoan()
	{
		//Appium
		System.out.println("Mobile Signout");
	}
	
	
	@Test
	public void APICarLoan()
	{
		//Rest Api Automation
		System.out.println("APIloguinCar");
	}
	@AfterMethod
	public void aftereveryMethod()
	{
		System.out.println("se ejecuta despues de cada metodo en la clase day3");
	}

}
