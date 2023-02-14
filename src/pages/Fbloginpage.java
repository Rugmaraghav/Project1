package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver driver;
	
	By email=By.id("email");
	By pswd=By.id("pass");
	By loginbutton=By.name("login");
	
	
	public Fbloginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
public void setvalues(String email1,String password)
{
	driver.findElement(email).sendKeys(email1);
	driver.findElement(pswd).sendKeys(password);
}
public void login() {
	driver.findElement(loginbutton).click();
}
}
