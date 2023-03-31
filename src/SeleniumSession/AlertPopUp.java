package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mypage.rediff.com/login/dologin");
		
		driver.findElement(By.xpath("//*[@id=\"pass_div\"]/input[3]")).click();
		
		// Types of popUps
		/* Alerts----javascript popup
		 * file upload popup------browse button
		 * browser window popup-----advertisment popup
		 */
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();// get the text of alert box
		if(text.equals("Please enter valid email")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		Thread.sleep(5000);
		alert.accept();  // accept the button
//		alert.dismiss();   // dismiss the button
	
	}

}
