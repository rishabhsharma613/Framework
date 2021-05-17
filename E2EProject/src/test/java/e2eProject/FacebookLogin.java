package e2eProject;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class FacebookLogin extends base {
	
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
	
	}
	
	@AfterTest
	public void endTest()
	{
		driver.close();
	}
	
}