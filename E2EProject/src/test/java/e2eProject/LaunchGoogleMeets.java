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

public class LaunchGoogleMeets extends base {
	public WebDriver driver;
	
	@Test
	
	public void getUrl() throws IOException
	{		
	driver=	InitializeDriver();
	driver.get(prop.getProperty("url"));
	
	
	}

	
	  @AfterTest public void endTest() 
	  { 
		  driver.close(); 
		  
	  }
	 
	
	
}
