package testng_pract;

import org.testng.annotations.Test;

public class Testng_1 {

	@Test(description="this is class name", priority = 0)
	public void test()
	{
		System.out.println("Hello World");	
	}
	
	@Test(priority=1)
	public void apple()
	{
		System.out.println("testng_1 : apple");
	}
	
	@Test(priority=2)
	public void orange()
	{
		System.out.println("testng_1 : orange");
	}
}


// it runs according to class name's alphabetical order
// if the class name starts with capital letter and other starts with small then it executes first whatever the order is
// it executes according to the priority(smaller the no, higher the priority)
// high priority executes first
// description is the title of the test case