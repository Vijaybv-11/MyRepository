package com.Framework.Library;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenCapture extends BaseTest {
	
	public static String screenCapture() {
	
	LocalDateTime sysDate = LocalDateTime.now();
	String screenShotName = sysDate.toString().replaceAll(":", "-");
	String imgPath = "./Screenshots/"+screenShotName+".png";
	TakesScreenshot ts= (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File(imgPath);
	 try {
			FileHandler.copy(temp, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
					System.out.println("Exception Handled");
		}	
     return "."+imgPath;
	}
}