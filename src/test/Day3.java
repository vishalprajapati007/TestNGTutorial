package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@Parameters({"URL"})
	@Test
	public void D4(String urlname)
	{
		System.out.println("xyz");
		System.out.println(urlname);
	}
	
	@Test
	public void A2()
	{
		System.out.println("wxy");
	}

}
