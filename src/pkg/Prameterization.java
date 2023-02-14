package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prameterization {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Parameters("b")
	@Test
	public void test1(String s)
	{
		System.out.println(s);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys(s);
	}
	
	
	

}
