package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("180020203039.rahul@gdgu.org");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Crmpro@123");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		
		driver.switchTo().frame("downloadFrame");
		
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/i")).click();
		driver.switchTo().defaultContent();
		
		
	//	driver.switchTo().parentFrame();  //switch to parent frame from child frame 
	}

}
