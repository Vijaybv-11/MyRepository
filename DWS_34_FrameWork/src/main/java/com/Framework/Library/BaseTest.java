package com.Framework.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest  implements FrameworkConstants{
	
	public static WebDriver driver;
	
	@Parameters("browsers")
	
	@BeforeTest
	public void openBroswer(@Optional("chrome") String browser){
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty(Chrome_Key, Chrome_path);
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
			else if(browser.equalsIgnoreCase("Firefox")){
				System.setProperty(Firefox_key, Firefox_path);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
			}
		}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();	
	}
}
