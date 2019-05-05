package use_ParallelTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


// run a set of test cases together is called "test suite"
public class ParallelTestSuite {

	
	String testName = "";
	
	
	
	@BeforeTest
	@Parameters({"test-name"})
	public void beforeTest(String testName)
	{
		this.testName = testName;
		
		// get Thread id
		long id = Thread.currentThread().getId();
		
		System.out.println("Before Test " + testName + ". Thread id is: " + id);
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		long id = Thread.currentThread().getId();
		
		System.out.println("Before Class " + testName + ". Thread id is: " + id); 
	}
	
	
	@Test
	public void testMethodOne()
	{
		long id = Thread.currentThread().getId();
		
		System.out.println("Sample test-method " + testName + ". Thread id is: " + id);
		
	}
	
	
	@AfterClass
	public void afterClass()
	{
		long id = Thread.currentThread().getId();
		
		System.out.println("After Class " + testName + ". Thread id is: " + id); 
	}
	
	
	@AfterTest
	public void afterTest()
	{
		long id = Thread.currentThread().getId();
		
		System.out.println("After Test " + testName + ". Thread id is: " + id); 
	}
	
}
