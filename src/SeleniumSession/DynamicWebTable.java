package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("180020203039.rahul@gdgu.org");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Crmpro@123");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.switchTo().frame(2);
		
		////*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]/a
		////*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]/a
		
		
		
		//Method 1
		
//		String before_xpath="//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
//		String after_xpath="]/td[2]/a";
//		
//		for(int i=1;i<4;i++) {
//		String name	=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
//		
//		if(name.contains("rahul k1")) {
//			driver.findElement(By.xpath("//*[@id=\\\"main-content\\\"]/div/div[2]/div/table/tbody/tr[+i+]/td[2]/a")).click();
//		}
//		}
		
		
		//Method 2 good way
		
		driver.findElement(By.xpath("//a[contains(text(),'rahul k2')]/parent::td//preceding-sibling::td//input[contains(@name,'id')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'rahul k1')]/parent::td//preceding-sibling::td//input[contains(@name,'id')]")).click();


		
		
	}

}
