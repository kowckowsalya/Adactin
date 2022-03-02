package com.Maven_Project;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Runner extends Base_Class{
	
	public static void main(String[] args) throws InterruptedException {
		launch("chrome");
		driver.get("https://twitter.com/");
		Thread.sleep(3000);
		//WebElement login = driver.findElement(By.xpath("(//div[@dir='auto'])[5]"));
		Pom_sigin ps = new Pom_sigin(driver);
	   click(ps.getLogin());
	
}
   }