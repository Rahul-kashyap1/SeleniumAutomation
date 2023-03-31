package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[2]/div/div[1]/a/button")).click();
		
		 Set<String> handler = driver.getWindowHandles();     // if there are pop on parent window then we will say there are two window, for handlle
		 //those window we have method getwindowhandles which return set object of string type 
		Iterator<String> it= handler.iterator();// we can not use for loop for iterating the set bcz every time index change in set
		String parentWindowID=it.next();// using this we will go to the next object means parentwindow
		System.out.println("Parent window id is : "+parentWindowID);
		
		String childWindowID=it.next();
		System.out.println("Parent window id is : "+childWindowID);
		
		driver.switchTo().window(childWindowID);
		String childWindowTitle=driver.getTitle();
		System.out.println("child window title is : "+childWindowTitle);
		driver.close(); 
		//driver. close() closes only the current window on which Selenium is running automated tests. ...
//		On the other hand, the driver. quit() method closes all browser windows and ends the WebDriver session.
		driver.switchTo().window(parentWindowID);
		String parentWindowTitle=driver.getTitle();
		System.out.println("parent window title is : "+parentWindowTitle);
		
		

	}

}
