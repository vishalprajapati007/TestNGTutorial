package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void D2()
	{
		System.out.println("Hello Demo");
		
	}
	@BeforeTest
	public void doct()
	{
		System.out.println("Hello I am Doc");
	}
	
	@AfterTest
	public void after()
	{
		System.out.println("Hello I am Last");
	}
	
	@BeforeSuite
	public void beforsute()
	{
		System.out.println("I am number 1");
	}
	
	@AfterSuite
	public void last()
	{
		System.out.println("I am Last");
	}
	
	@BeforeMethod
	public void method()
	{
		System.out.println("Print i am first");
	}
	
	@AfterMethod
	public void delted()
	{
		System.out.println("ignor this please");
	}
	
	@Test
	public void Apple()
	{
		System.out.println("new iphone");
		Assert.assertTrue(false);
	}

	@Test
	public void network()
	{
		System.out.println("remote acess");
	}
}
