package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.domsnapshot.model.TextBoxSnapshot;

public class XpathGenerator {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
//		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("rahul");
//		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("kashyap");
//		driver.findElement(By.xpath("//input[starts-with(@name,'firstname')]")).sendKeys("kashyap");
//		driver.findElement(By.xpath("//input[ends-with(@name,'firstname')]")).sendKeys("kashyap");
		
		
//		for Link
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	}

}
