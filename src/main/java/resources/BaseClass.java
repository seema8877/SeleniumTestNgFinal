package resources;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	// Browser code
	public static WebDriver driver;
	public Properties prop;
	public static String email = generateRandomEmailID();

	public void driverInitilization() throws IOException { // Read properties file data---
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
		// Access the data from properties files---
		Properties prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("Url");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Please choose proper driver value");
		}
	}

	public static String generateRandomEmailID() {
		return "abc" + System.currentTimeMillis() + "@gmail.com";
	}
	@BeforeMethod
	public void launchBrowserAndUrl() throws IOException
	{
		driverInitilization();
		driver.get(prop.getProperty("Url"));
	}

}
