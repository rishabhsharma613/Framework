package e2eProject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class FacebookLogin extends base {
	public WebDriver driver;
		
	@Test
	
	public void basePageNavigation() throws IOException
	{	
		
	driver=	InitializeDriver();
	driver.get(prop.getProperty("url"));	
	
	//making object of LandingPage class
	LandingPage l= new LandingPage(driver);
	l.getEmail().sendKeys("rishabh.s.rishi"); // driver.findElement(by.id)
	l.getpassword().sendKeys("hgdjkhnsdjkcbhdjcb");
	l.clickLogin().click();
	
	Assert.assertTrue(false);
	
	
	}
	
	
	  @AfterTest public void endTest() 
	  { 
		  driver.close(); 
		  
	  }
	 
	
}
