package testng_pract;

import org.testng.annotations.Test;

public class Testng_2 {

	@Test( groups = {"first","second"})
	public void test()
	{
		System.out.println("Class Testng_2");
	}
	
	
	@Test(dependsOnMethods="orange", groups="first")
	public void apple()
	{
		System.out.println("testng_1 : apple");
	}
	
	@Test(priority=2, groups="first")
	public void orange()
	{
		System.out.println("testng_1 : orange");
	}
	
	@Test(enabled=true, groups="second")  // keeping it false will not execute the function and keeping it true will execute 
	public void blue()
	{
		System.out.println("Hello World");	
	}
	
}
