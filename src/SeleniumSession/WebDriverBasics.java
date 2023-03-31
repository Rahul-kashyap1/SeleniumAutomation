package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\thinksysuser\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://www.google.com");
//		String title=driver.getTitle();
////		System.out.println(title);
//		if(title.equals("Google")) {
//			System.out.println("Pass");
//		}
//		else { 
//			System.out.println("Fail"); 
//		}
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
////		System.out.println(driver.getPageSource());
//		driver.quit();// Close the browser
		
//		drop down selection 
		
		Select select=new Select(driver.findElement(By.id(null)));
		select.selectByVisibleText("california");
		
	}

}
