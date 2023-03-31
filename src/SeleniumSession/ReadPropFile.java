package SeleniumSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream ip=new FileInputStream("C:\\Users\\thinksysuser\\eclipse-workspace\\NaveenAutomation\\src\\SeleniumSession\\config.properties");
		
		prop.load(ip);
		
		System.out.print(prop.getProperty("name"));
		
		String browserName=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");

			 driver=new ChromeDriver();
		}
		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\geckodriver.exe");

			 driver=new FirefoxDriver();
		}
		else if (browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");

			 driver=new InternetExplorerDriver();
//			
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
		
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
	}

}
