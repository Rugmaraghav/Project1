package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorspgm {
	WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void locatorspgm()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("cdsg");
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("6vuhs");
		driver.findElement(By.name("login")).click();
		driver.navigate().back();
		
		
	}
	
	

}

//relative xpath

//tagname[@attributename='value']