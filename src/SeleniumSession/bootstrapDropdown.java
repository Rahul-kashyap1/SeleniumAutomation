package SeleniumSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
	List<WebElement> ls	=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));;
	
	
	//selecting angular checkbox
	System.out.println(ls.size());
//	for(int i=0;i<ls.size();i++) {
//		System.out.println(ls.get(i).getText());
//		
//		if(ls.get(i).getText().contains("Angular")) {
//			ls.get(i).click();
//			break;
//		}
//		
//	}
	
	//selecting for all the checkbox
	for(int i=0;i<ls.size();i++) {
		System.out.println(ls.get(i).getText());
		
			ls.get(i).click();
			
	}
//		
	}

}
