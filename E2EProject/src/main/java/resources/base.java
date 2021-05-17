package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class base {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver InitializeDriver() throws IOException
	{
		
		prop= new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Nidhi\\workspaceRishabh\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E2EProject\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
			driver= new ChromeDriver(co);
			driver.manage().window().maximize();
		}
		
		else if(browserName.equals("firefox"))
		{
			
			//FirefoxOptions fo = new FirefoxOptions();
		}
		
		else if(browserName.equals("ie"))
		{
			
			//ie code
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		return driver;
		
		
	}
	
	public void getScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String destinationFile= System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		//FileHandler.copy(source, new File(destinationFile));
		//Files.copy(source, new File(destinationFile));
		
		try {
		FileUtils.copyFile(source,new File(destinationFile));
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
	
	}
	
}
