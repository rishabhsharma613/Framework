package e2eProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateFacebookTitle extends base {
	
	@Test
	
	public void basePageNavigation() throws IOException
	{		
	driver=	InitializeDriver();
	driver.get(prop.getProperty("url"));	
	
	Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");	
	
	}

	
	@AfterTest
	public void endTest()
	{
		driver.close();
	}
}
