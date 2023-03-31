package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		Thread.sleep(10); it is the static wait it will wait every time 10 second
		
		//below two line of dynamic wait , if have 30 sec for rendering element if the require element render in 5 sec then 25 sec will be ignore
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // if page doesnot open in 40 sec then error will show
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); // it will wait until all component doesnt display then some action will perform on event like button

	}

}
