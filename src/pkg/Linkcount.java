package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test1()
	{
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links="+l.size());
		
		for(WebElement e:l)
		{
			String link=e.getAttribute("href");
			System.out.println(link);
		}
		
		
		
//		for(int i=0;i<l.size();i++)
//		{
//			WebElement element=l.get(i);
//			   String link= element.getAttribute("href");
//			   String text=element.getText();
//			   System.out.println(link +" ----"+text);
//			   
//		}
		
		
		
	}
}
