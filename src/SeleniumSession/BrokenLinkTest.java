package SeleniumSession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vueschool.io/");
		driver.manage().window().maximize();

		
	List<WebElement> linkList=	driver.findElements(By.tagName("a"));
	linkList.addAll(driver.findElements(By.tagName("img")));
	
	List<WebElement> activeLinks=new ArrayList<WebElement>();
	
	System.out.println(linkList.size());
	//iterate linklist : exclue all the links/images-doesnt have any href attribute
	
	for(int i=0;i<linkList.size();i++) {
		System.out.println(linkList.get(i).getAttribute("href"));
		if(linkList.get(i).getAttribute("href")!=null && !(linkList.get(i).getAttribute("href").contains("javascript"))) {
			activeLinks.add(linkList.get(i));
		}
	}
	
	
	/*check the url httpconnection api:
	 * 200---ok
	 * 404---not found
	 * 500---internal error
	 * 400---bad request
	 */
	
	System.out.println(activeLinks.size());
	for(int j=0;j<activeLinks.size();j++) {
		HttpURLConnection connection=	(HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response=connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activeLinks.get(j).getAttribute("href")+"----->"+response);
	}
		
	
	
	
	
	driver.quit();
	}

}
