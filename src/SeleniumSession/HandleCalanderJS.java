package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalanderJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		WebElement date=driver.findElement(By.xpath(""));
		String dateVal="30-12-2017";
		selectDateByJs(driver, date, dateVal);
		
		
	}
	
	public static void selectDateByJs(WebDriver driver,WebElement element,String dateVal) {
		JavaScriptExecutor js=((JavaScriptExecutor)driver);
//		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"')",element);
	}

}
