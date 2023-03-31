package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowseFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
//		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\thinksysuser\\Documents\\login.xlsx");
	}

}




