package test;

import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebloginHomeLoan()
	{
		//selenium
		System.out.println("webloguinHome");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileloguinHome");
	}
	
	@Test
	public void APIHomeLoan()
	{
		//Rest Api Automation
		System.out.println("APIloguinHome");
	}


}
