package SeleniumSession;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicDesktopPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headLessChromeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		//it will not open chrome whole work will be done without opening the chrome

		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://ui.freecrm.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("180020203039.rahul@gdgu.org");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Crmpro@123");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		System.out.println(driver.getTitle());
	}

}
