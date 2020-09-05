package com.msn.weather;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestScenarios extends ReusableActionsClass{
	
/*==============Test case 1 handling drop-downs & travel tickets booking============*/
	public static WebDriver driver;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println("System path is"+path );
		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		//Deleting all the cookies
		driver.manage().deleteAllCookies();
		//Specifying pageLoadTimeout and Implicit wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.msn.com/en-in/weather");
		/*System.out.println(driver.getPageSource());*/
		System.out.println("Opened MSN");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		WebElement dropdown = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(" //a[contains(@href,'/en-in/weather') and @class='vertical']")));
		dropdown.click();
		/*driver.findElement(By.xpath("//a[@class='vertical']")).click();*/
		System.out.println("Clicked on expandable link");
		driver.findElement(By.xpath("//a[contains(text(),'Travel')]")).click();
		System.out.println("Clicked on Travel link");
        /* ========Encountering issues while navigating to travel pages Whoops Error*/
	}

}
