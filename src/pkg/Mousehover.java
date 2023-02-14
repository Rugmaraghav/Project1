package pkg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehover {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}

	@Test
	public void test1()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		Actions ac=new Actions(driver);
		ac.contextClick(right).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		ac.doubleClick(doubleclick).perform();
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
