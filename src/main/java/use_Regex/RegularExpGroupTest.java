package use_Regex;

import org.testng.annotations.Test;

public class RegularExpGroupTest {

	
	@Test(groups= {"include-test-one"})
	public void testMethodOne()
	{
		System.out.println("Test method # 1");
	}
	
	@Test(groups= {"include-test-two"})
	public void testMethodTwo()
	{
		System.out.println("Test method # 2");
	}
	
	@Test(groups= {"test-one-exclude"})
	public void testMethodThree()
	{
		System.out.println("Test method # 3");
	}
	
	@Test(groups= {"test-two-exclude"})
	public void testMethodFour()
	{
		System.out.println("Test method # 4");
	}
}
