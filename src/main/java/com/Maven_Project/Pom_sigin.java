package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_sigin {
	
	@FindBy (xpath="//a[@class='login']")
	private WebElement login;
	private WebDriver driver;

	public WebElement getLogin() {
		return login;
	}
	public Pom_sigin(WebDriver driver) {
	this.driver= driver;	
	PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
    private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	
	
}
