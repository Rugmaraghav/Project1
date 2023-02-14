package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {
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
			verify(link);
		}
	}

	private void verify(String link) {
	try {
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection) u.openConnection();  
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("succesful----"+link);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("broken link---"+link);
		}
		                                           
	
		
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
		
		
		
		
		
	}
	
	
	
	
	
}
