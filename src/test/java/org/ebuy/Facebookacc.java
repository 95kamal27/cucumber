package org.ebuy;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Util;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.facebook.Reusecode;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.facebookobject.Facebookaccpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.And.Ands;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookacc extends Reusecode{

Reusecode r = new Reusecode();
Facebookaccpage f=new Facebookaccpage();
	@Given("user launched the browser {string}")
	public void user_launched_the_browser(String url) {
		//r.launch("https://www.facebook.com/");
	}
	@When("click on createaccount button")
	public void click_on_createaccount_button() {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
	//driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("arguments[0].click()",creat);
	f.getCreateaccountbutton().click();
	}
	@And("user enter the firstusername {string}")
	public void user_enter_the_firstusername(String firstname) throws InterruptedException {
	 // driver.findElement(By.name("firstname")).sendKeys(firstname);
		Thread.sleep(5000);
		f.getEnterfirstname().sendKeys(firstname);
	}
	@And("user enter the surname {string}")
	public void user_enter_the_surname(String surname) {
	  // driver.findElement(By.name("lastname")).sendKeys(surname);
		f.getEnterElementlastnamElement().sendKeys(surname);
	}
	@And("user enter the mobilenumber {string}")
	public void user_enter_the_mobilenumber(String mobilenumber) throws InterruptedException {
	//driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(mobilenumber);
	f.getEntermobilenumberElement().sendKeys(mobilenumber);	
	}
	@And("user enter the enterpassword {string}")
	public void user_enter_the_enterpassword(String password) {
	//driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(password);
	f.getEnterpassword().sendKeys(password);	
	}
	@And("user select gender")
	public void user_select_gender() {
		//driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		f.getSelectgender().click();
	}
	@And("click on sign button")
	public void click_on_sign_button() {
	  // driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		f.getClickonsignupbutton().click();
	}
	@And("user click on month")
	public void user_click_on_month() {
		WebElement monthslist=driver.findElement(By.id("month"));
		monthslist.click();
		Select s2=new Select(monthslist);
		s2.selectByVisibleText("Feb");
	}
	@And("user click on year")
	public void user_click_on_year() {
		WebElement yearlist=driver.findElement(By.id("year"));
		yearlist.click();
		Select s3=new Select(yearlist);
		s3.selectByValue("1993");
	}
	@And("user click on date")
	public void user_click_on_date() {
		WebElement days =driver.findElement(By.id("day"));
		days.click();
		Select s1=new Select(days);
		java.util.List<WebElement> day=s1.getOptions();
		for(int i=0;i<day.size();i++) {
			day.get(9).click();
	}
}
	@And("validate the output before sign pagecase1")
	public void validate_the_output_before_sign_pagecase1() throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source=tk.getScreenshotAs(OutputType.FILE);
		File traget=new File("D:\\Seleniumproject\\signinbefore(1).png");
		FileUtils.copyFile(source, traget);
	}

	@And("validate the outputcase1")
	public void validate_the_outputcase1() throws InterruptedException, IOException {
		Thread.sleep(6000);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source=tk.getScreenshotAs(OutputType.FILE);
		File traget=new File("D:\\Seleniumproject\\signinafter(1).png");
		FileUtils.copyFile(source, traget);
	}
	@And("validate the output before sign pagecase2")
	public void validate_the_output_before_sign_pagecase2() throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source=tk.getScreenshotAs(OutputType.FILE);
		File traget=new File("D:\\Seleniumproject\\signinbefore(2).png");
		FileUtils.copyFile(source, traget);
	}
	@And("validate the outputcase2")
	public void validate_the_outputcase2() throws InterruptedException, IOException {
		Thread.sleep(5000);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source=tk.getScreenshotAs(OutputType.FILE);
		File traget=new File("D:\\Seleniumproject\\signinafter(2).png");
		FileUtils.copyFile(source, traget);
	}

	@And("validate the output before sign pagecase3")
	public void validate_the_output_before_sign_pagecase3() throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source=tk.getScreenshotAs(OutputType.FILE);
		File traget=new File("D:\\Seleniumproject\\signinbefore(3).png");
		FileUtils.copyFile(source, traget);
	}

	@And("validate the outputcase3")
	public void validate_the_outputcase3() throws InterruptedException, IOException {
		Thread.sleep(6000);
//		TakesScreenshot tk=(TakesScreenshot)driver;
//		File source=tk.getScreenshotAs(OutputType.FILE);
//		File traget=new File("D:\\Seleniumproject\\signinafter(3).png");
//		FileUtils.copyFile(source, traget);
		r.screenCapture("D:\\\\Seleniumproject\\\\signinafter(5).png");
	}
	@And("validate the output before sign pagecase4")
	public void validate_the_output_before_sign_pagecase4() throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source=tk.getScreenshotAs(OutputType.FILE);
		File traget=new File("D:\\Seleniumproject\\signinbefore(4).png");
		FileUtils.copyFile(source, traget);
	}
	@And("validate the outputcase4")
	public void validate_the_outputcase4() throws Throwable {
		Thread.sleep(5000);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source=tk.getScreenshotAs(OutputType.FILE);
		File traget=new File("D:\\Seleniumproject\\signinafter(4).png");
		FileUtils.copyFile(source, traget);
	}
}