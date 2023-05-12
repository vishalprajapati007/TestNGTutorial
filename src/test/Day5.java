package test;

import org.testng.annotations.Test;

public class Day5 {

	
	

	@Test
	public void mahendra()
	{
		System.out.println("tata king");
	}
	
	@Test(groups={"Menu"})
	public void IPL()
	{
		System.out.println("indian pream");
	}
	

	@Test
	public void Honda()
	{
		System.out.println("the machine");
	}
	
	@Test(groups={"Menu"})
	public void Odi()
	{
		System.out.println("the best car");
	}
	

	@Test(dependsOnMethods= {"Honda","Mac"})
	public void computer()
	{
		System.out.println("window multipul option");
	}
	
	@Test
	public void Mac()
	{
		System.out.println("IOS king");
	}
}
