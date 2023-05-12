package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {

	

	@Test
	public void A()
	{
		System.out.println("documnet");
	}
	
	@Test(enabled=false)
	public void B()
	{
		System.out.println("i am window");
	}
	

	@Test(dataProvider="data")
	public void C(String username, String Password)
	{
		System.out.println("best car");
		System.out.println(username);
		System.out.println(Password);

	}
	
	@Test (dependsOnMethods= {"C"})
	public void D()
	{
		System.out.println("dream car");
	}
	
	@DataProvider
	public Object[][] data()
	{
		//1st combination Username , password
		//2nd user, password - no cradit history
		//3rd froude history
		
		Object[][]data = new Object[3][2];
		//1st
		data[0][0]="Firstname";
		data[0][1]="password";
		
		//2nd
		data[1][0]="SecondName";
		data[1][1]="password";
		
		//3rd
		
		data[2][0]="thirdName";
		data[2][1]="password";
		return data;
				
		
		
				
	}
}
