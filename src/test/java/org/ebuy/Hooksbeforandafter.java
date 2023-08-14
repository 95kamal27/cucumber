package org.ebuy;


import org.facebook.Reusecode;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksbeforandafter extends Reusecode{
	
	Reusecode r= new Reusecode();
@Before
public void beforescenario() {
	r.launch("http://www.facebook.com/");
}
@After
public void Afterscenario() {
	System.out.println("afterlaunch");
	driver.quit();
}
}
