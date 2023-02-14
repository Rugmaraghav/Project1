package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Draganddrop {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}

	@Test
	public void test1()
	{
		
		driver.get("https://demoqa.com/droppable/");
		WebElement drag=driver.findElement(By.name(""));
		WebElement drop=driver.findElement(By.name(""));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(drag, drop);
		ac.perform();
		String text=drop.getText();
		if(text.equals("Dropped!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	

}
