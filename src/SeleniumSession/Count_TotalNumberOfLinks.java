package SeleniumSession;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v97.page.Page.GetAppIdResponse;

public class Count_TotalNumberOfLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		 //get the total count of links on the page
		// get the text of each link on the page
		
		List linkList=driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		
//		for(int i=0;i<linkList.size();i++) {
//			String linkText=linkList.get(i).getText();
//			System.out.println(linkText);
//		}
		
		driver.findElement(By.linkText("Advanced")).click();
	}

}
