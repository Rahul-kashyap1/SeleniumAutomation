package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thinksysuser\\Documents\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String date="06-08-2022";
		
		driver.findElement(By.xpath("//span[text()=' flights']")).click();
		WebElement timeInput= driver.findElement(By.id("departure"));
//		timeInput.clear();
//		timeInput.sendKeys(date);
		timeInput.click();
		WebElement month= driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[2]"));
		
		while(true) {
			
		}
		
	}

}
