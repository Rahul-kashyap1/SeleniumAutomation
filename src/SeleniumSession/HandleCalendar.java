package SeleniumSession;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalendar {

	public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
//		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); 
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		
//	
//	WebElement element=	driver.findElement(By.name("bdaytime"));
//	
//	element.sendKeys("12052022");
//    element.sendKeys(Keys.TAB);
//	element.sendKeys("1245PM");
//	driver.findElement(By.xpath("/html/body/form/input[2]")).click();

		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/calendar");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String date = "18-September-2017";

		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select.selectByVisibleText(year);

		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1];
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2];
		// *[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[3];

		String beforeXpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";

		final int totalWeekDays = 7;
		boolean flag = false;
		String dayVal = null;
		for (int rowNum = 2; rowNum <= 7; rowNum++) {
			for (int colNum = 1; colNum <= totalWeekDays; colNum++) {
				try {
					dayVal = driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).getText();
				} catch (NoSuchElementException e) {
					System.out.println("Please enter a valid date");
				}
				System.out.println(dayVal);
				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).click();
					flag = true;
					break;
				}

			}
			if (flag) {
				break;
			}
		}

	}

}
