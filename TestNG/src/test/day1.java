package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void Demo()
	
	{
		System.out.println("hello");
	}
	@Test
	public void FirstTest()
	{
		System.out.println("bye");
	}
	@BeforeTest
	public void fisrstTest()
	{
		System.out.println("hola es el primero en test level");
	}
	@AfterTest
	public void lastTest()
	{
		System.out.println("hola es el ultimo en test level");
	}
	@BeforeSuite
	public void fisrstSuite()
	{
		System.out.println("hola es el primero en suite level");
	}
	@AfterSuite
	public void ultiomoSuite()
	{
		System.out.println("hola es el ultimo en suite level");
	}
	@BeforeMethod
	public void aftereveryMethod()
	{
		System.out.println("se ejecuta antes de cada metodo en la clase day1");
	}
}
