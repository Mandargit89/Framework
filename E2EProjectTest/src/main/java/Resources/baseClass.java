package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class baseClass 
{

public WebDriver driver; //its declare global so that it can be user everywhere, & we should not have to create object of Webdriver class everywhere.
	
public WebDriver initializeDriver() throws IOException
  {
	
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Mandar\\git\\Framework\\E2EProjectTest\\src\\main\\java\\Resources\\data.properties");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\mandar_new\\ChromeDriver\\ChromeDriver79\\chromedriver.exe");
	      driver=new ChromeDriver();
		
	}
	
	else if (browserName.equals("Firefox"))
	{
		//launch firefox 
		//driver=new FirefoxDriver();
	}
	
	else if (browserName.equals("IE"))
	{
		
		//Launch IE
	}
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;  
  }
	

}
