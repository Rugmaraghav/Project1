package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chromeversion {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	
		driver=new ChromeDriver();
		driver.get("https://www.keka.com/");
	}
	
	@Test
	public void test1()
	{
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul[2]/li[1]/a")).click();
	}

}
