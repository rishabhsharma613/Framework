package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	
	By email= By.id("email");
	By password= By.id("pass");	
	By login=By.name("login");
	
	public WebElement clickLogin()
	{
		return driver.findElement(login);
		
	}

	public WebElement getpassword()
	{
		return driver.findElement(password);
		
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
		
	}

}
