package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Junitdemo {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void textverification()
	{
		String src=driver.getTitle();
		
		Assert.assertEquals(src, "google.com");

		
		
//		if(src.equals("gmail"))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
	System.out.println("helooo");
		
		
		
	}
	
	@After
	public void browserclose()
	{
		driver.quit();
	}

	
}
