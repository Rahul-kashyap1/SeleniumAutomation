package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_ya_signin&prevRID=KS65Q9F7WGXZQY38468S&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Rahul");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("Rahul@gmail.com");
		Thread.sleep(2000);
//		2. By ID
//		3. By Name 
		
//		4. By Linktext
//		driver.findElement(By.linkText("Sign in")).click();
//		Thread.sleep(2000);
//		
////		5. partial link text -------not recommended
//		driver.findElement(By.partialLinkText("Create a free business account")).click();  // only for long link text
//		Thread.sleep(2000);
////		6. CSS selector
//		driver.findElement(By.cssSelector("#ap_password_check")).sendKeys("12 street");
		
//		7. class name ---- not useful
		
		driver.findElement(By.className(null));
		
		
	}

}
 