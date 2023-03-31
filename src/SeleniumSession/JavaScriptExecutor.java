package SeleniumSession;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.OnbeforeunloadHandler;

import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutor {
	public static WebDriver driver;
//public static JavaScriptExecutor js;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thinksysuser\\Documents\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
//		

//		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("rahul");
//		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("test@123");

		WebElement login = driver.findElement(By.linkText("Resizable"));
//		flash(login, driver);
//		drawBorder(login, driver);

//		TakeScreenShot 

//		generateAlert
//		generateAlert(driver, "There is issue with login button");

//		click on any element using	js	
		
	Test.jsClick(login, driver);

		// refresh page using selenium
//		driver.navigate().refresh();
		// refresh page using js
//		refreshBrowser(driver);

//		get title of web page
//		System.out.println((getTitle(driver)));

//		get page text
//		System.out.println(getPageInnerText(driver));

//		scrollPageDown(driver);

		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		scrollIntoView(driver, forgotPwdLink);

	}

	public static void flash(WebElement element, WebDriver driver) {

		JavaScriptExecutor js = (JavaScriptExecutor) driver;

		String bgcolor = element.getCssValue("backgroundColor");

		for (int i = 0; i < 100; i++) {

			changeColor("rgb(255,0,0)", element);
			changeColor(bgcolor, element);
		}

	}

	public static void changeColor(String color, WebElement element) {
		JavaScriptExecutor js = (JavaScriptExecutor) driver;
		((JavascriptExecutor) js).executeScript("arguments[0].style.backgroundColor='" + color + "'", element);

	

	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavaScriptExecutor js = ((JavaScriptExecutor) driver);
//		 js.executeScript("arguments[0].style.border='3px solid red'",element);
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavaScriptExecutor js = ((JavaScriptExecutor) driver);
//		 js.executeScript("alert('"+message+"')");
	}

//	public static void jsClick(WebElement element) {
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		js.executeScript("arguments[0].click();", element);
//	}

	
//	public static void jsClick(WebElement element) {
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		js.executeScript("arguments[0].click();", element);
//	}

	public static void refreshBrowser() {
//		 js = (JavaScriptExecutor) driver;
//		 js.executeScript("history.go(0)");

	}

//	public static String getTitle(WebDriver driver) {
//		 JavaScriptExecutor js=((JavaScriptExecutor)driver);
////		String title =js.executeScript("return document.title;").toString();
////		return title;
//	}

//	public static String getPageInnerText(WebDriver driver) {
//		 JavaScriptExecutor js=((JavaScriptExecutor)driver);
//		String pageText =js.executeScript("return document.documentElement.innerText").toString();
//		return pageText;
//	}

//	public static void scrollPageDown(WebDriver driver) {
//		 JavaScriptExecutor js=((JavaScriptExecutor)driver);
//		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	
//	}

	public static void scrollIntoView(WebDriver driver, WebElement element) {
		// keep scrolling until we dont get choice element
		JavaScriptExecutor js = ((JavaScriptExecutor) driver);
//		 js.executeScript("arguments[0].scrollIntoView(true);",element);

	}

}
