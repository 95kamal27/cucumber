package com.facebookobject;

import org.facebook.Reusecode;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookaccpage extends Reusecode {
	
public  Facebookaccpage() {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//*[text()='Create new account']")
private WebElement createaccountbutton;

@FindBy(xpath = "(//*[@type='text'])[2]")
private WebElement enterfirstname;

@FindBy(name = "lastname")
private WebElement enterElementlastnamElement;

@FindBy(name = "reg_email__")
private WebElement entermobilenumberElement;

@FindBy(xpath = "//*[@id=\"password_step_input\"]")
private WebElement enterpassword;

@FindBy(xpath = "(//input[@type='radio'])[2]")
private WebElement selectgender;

@FindBy(xpath = "(//button[@type='submit'])[2]")
private WebElement clickonsignupbutton;

public WebElement getCreateaccountbutton() {
	return createaccountbutton;
}

public WebElement getEnterfirstname() {
	return enterfirstname;
}

public WebElement getEnterElementlastnamElement() {
	return enterElementlastnamElement;
}

public WebElement getEntermobilenumberElement() {
	return entermobilenumberElement;
}

public WebElement getEnterpassword() {
	return enterpassword;
}

public WebElement getSelectgender() {
	return selectgender;
}

public WebElement getClickonsignupbutton() {
	return clickonsignupbutton;
}


}


