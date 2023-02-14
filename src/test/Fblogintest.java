package test;

import org.testng.annotations.Test;

import pages.Fbloginpage;

public class Fblogintest extends Baseclass{
	
	
	@Test
	public void test1()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		
		ob.setvalues("abc2gmail.com", "65547bab");
		ob.login();
		
	}
	
	
	
	
	
	

}
