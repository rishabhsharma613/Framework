package e2eProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateFields extends base {
	public WebDriver driver;
	
	@Test
	
	public void getFields() throws IOException
	{		
	driver=	InitializeDriver();
	driver.get(prop.getProperty("url"));	
	
	//making object of LandingPage class
		LandingPage l= new LandingPage(driver);
		l.getEmail().isDisplayed();
		l.getpassword().isDisplayed();
		l.clickLogin().isDisplayed();
		
		Assert.assertTrue(false);
	
	}

	
	  @AfterTest public void endTest() 
	  { 
	  driver.close(); 
	  }
	 
	
}
