package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementVisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		//isdisplayed() : applicable for all element
	boolean b1=	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).isDisplayed();
	System.out.println(b1);
	
	// isenabled() : use to check the button is enabled or displayed
		
	//isSelected() : only applicable for checkbox, dropdown,radiobutton
	
	}

}
