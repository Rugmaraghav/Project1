package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		
		//1.open browser
		WebDriver driver=new ChromeDriver();
	
		//2.launch application
		
		
		
		
		driver.get("https://www.google.com");
	
		String actualtitle=driver.getTitle();
		String exp="google";
		if(actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("fail");
		}
		
		
		
		
		
		
		

	}

}
