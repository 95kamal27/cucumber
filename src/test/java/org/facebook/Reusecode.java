package org.facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusecode {
	public static WebDriver driver;
	 public void launch(String url) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-popups");
			options.addArguments("--remote-allow-origins");
			options.addArguments("--disable-notifications");
			options.addArguments("--no-sendbox");
			options.addArguments("--disable-dev-sim-usage");
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			driver.get(url);
	 }
		
		public static String screenCapture(String imgLocation) {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File(imgLocation));
				//Reporter.addStepLogPass("Captured screen successfully");
			} catch (IOException e) {
				//Reporter.addStepLogInfo("Screen is not captured" + e.toString());
			}
			return imgLocation;

}
}

