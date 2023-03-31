package SeleniumSession;

import org.openqa.selenium.WebDriver;
public class HtmlUnitDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");

		/*hmtlunit driver is not available in selenium 3.x version.
		 * htmleunitdriver--- to use this, we have to download htmlunitdriver
		 * 
		 * Advantages :
		 * 1. testing is happening behind the scene---no browser is launched
		 * 2. very fast -- execution of test case very fast
		 * 3. not suitable for action class---user action---mouse movement double click drag and drop
		 * 4. Ghost driver-----Headless browser
		 * 		// ----htmlunitdriver-----java
		 * 		//-----phantomJS-----js
		 */
		
		
		WebDriver driver=(WebDriver) new HtmlUnitDriver();
		
		driver.get("http://www.google.com");
	}

}
