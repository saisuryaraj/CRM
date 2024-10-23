package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import javax.print.DocFlavor.URL;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;
	public Logger logger;
	public Properties p;
	@BeforeClass(groups = {"Sanity","Regression","Master"})
	@Parameters({"os","broswer"})
	public void setup(String os,String br) throws IOException
	{	
		//loading config properties
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		logger = LogManager.getLogger(this.getClass());	
		
		if(p.getProperty("execution_env").equals("remote")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			if(os.equalsIgnoreCase("windows")) {
				capabilities.setPlatform(Platform.WIN11);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else {
				System.out.println("no matching os");
				return;
			}
			switch (br.toLowerCase()) {
			case "chrome": capabilities.setBrowserName("chrome");break;
			case "edge": capabilities.setBrowserName("edge");break;
			default:System.out.println("no matching broswer");return;
			}
			driver= new RemoteWebDriver((CommandExecutor) new URL("http://10.149.22.53:4444/ui/"),capabilities);
		}

		if(p.getProperty("execution.env").equalsIgnoreCase("remote"))
		{
			switch(br.toLowerCase())
			{
			case "chrome" :driver=new ChromeDriver();break;
			case "edge" :driver=new EdgeDriver();break;
			default: System.out.println("Invalid broswer"); return;
			}
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("http://localhost/opencart/upload/index.php");
		driver.get(p.getProperty("appURL"));//reading url from properties file
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public String randomAlphaNumeric() {
		String generatedstring = RandomStringUtils.randomAlphanumeric(10);
		return generatedstring ;
	}
	public String randomeString()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	public String randomeNumber()
	{
		String generatedstring = RandomStringUtils.randomNumeric(10);
		return generatedstring ;
	}
	public String captureScreen(String tname) throws IOException {
		String timeStamp =  new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takeScreenshot= (TakesScreenshot) driver;
		File sourceFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath= System.getProperty("user.dir")+"\\screenshots\\" + tname + "_"+ timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
		return targetFilePath;
	}
}
