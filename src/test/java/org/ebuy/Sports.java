package org.ebuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sports {
 public static WebDriver driver;
 @Given("user launched the browser")
 public void user_launched_the_browser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-popups");
		options.addArguments("--remote-allow-origins");
		options.addArguments("--disable-notifications");
		options.addArguments("--no-sendbox");
		options.addArguments("--disable-dev-sim-usage");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.ebay.com/");
 }

 @When("user navigate to the sports")
 public void user_navigate_to_the_sports() {
     
	  driver.findElement(By.xpath("(//a[text()='Sports'])[1]")).click();
 }

 @Then("check items to be displayed")
 public void check_items_to_be_displayed() {
  WebElement fashion = driver.findElement(By.xpath("//h2[text()='Shop By Category']"));
  if(fashion.isDisplayed()) {
	  System.out.println("shop by category is available");
  }else {
	  System.out.println("shop by category is not available");
  }
 }

 @Then("close the browser")
 public void close_the_browser() {
     driver.quit();
 }
}
