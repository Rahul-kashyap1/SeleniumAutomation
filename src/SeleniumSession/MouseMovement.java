package SeleniumSession;

import java.awt.Window;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions actions=new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/button"))).build().perform();//By hovering the mouse on the link it will display submenu of that link
		Thread.sleep(3000);
		driver.findElement(By.id("")).click();
	}

}
