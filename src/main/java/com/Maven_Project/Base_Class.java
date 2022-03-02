package com.Maven_Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Base_Class {
	
	//driver (WebDriver driver = new ChromeDriver)
	public static WebDriver driver; 

	//launch  browser
	public static void launch(String browser) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	//Click
	
	public static void click(WebElement elementclick) {
		elementclick.click();
	}
	//SendKeys
	public static void inputvalues(WebElement element, String Value) {
	element.sendKeys(Value);
	}
    //URL--(GET)
	public static void website(String url) {
    driver.get(url);
	}
	//close
	public static void Tclose() {
		driver.close();
	}
	//Quit
	public static void Tquit() {
        driver.quit();
	}
	//Title
	public static void title() {
        driver.getTitle();
	}
	//Navigate(back,forward,refresh)
    public static void navigateMethods(String nmeth) {
    	 if (nmeth.equalsIgnoreCase("back")) {
		driver.navigate().back();	
		}
    	else if (nmeth.equalsIgnoreCase("forward")) {
		driver.navigate().forward();	
		}
    	else if (nmeth.equalsIgnoreCase("refresh")) {
        driver.navigate().refresh();
		}
		}
    //navigate(to)
	 public static void naviTo(String moveurl) {
		driver.navigate().to(moveurl);
	}
    	//WEbElement Methods
    	
    	public static void Emeth(String is,WebElement webe) {
    		if (is.equals("isenabled")) {
    			boolean enable = webe.isEnabled();
    			System.out.println(enable);
    			
    		}
    		else if (is.equalsIgnoreCase("isselected")) {
    			boolean selected = webe.isSelected();
    			System.out.println(selected);
    			
    		}
    		else if (is.equalsIgnoreCase("isdisplayed")) {
    			boolean dispaly = webe.isDisplayed();
    			System.out.println(dispaly);
    		}
    		else if (is.equalsIgnoreCase("getText")) {
				String text = webe.getText();
				System.out.println(text);
			}
    		else if (is.equalsIgnoreCase("getAttribute")) {
				String attribute = webe.getAttribute("value");
				System.out.println(attribute);
			}
    	}
    	//Alert Methods
    	public static void Alertmeth(WebElement aweb, String value) {
    		
            Alert alert = driver.switchTo().alert();
            alert.accept();
			Alert alert1 = driver.switchTo().alert();
			alert1.dismiss();
			alert1.accept();
			}
    	
    	//Frame
    	public static void Framemeth(String ftype, String id, WebElement element, int index) {
    		if (ftype.equalsIgnoreCase("id")) {
			driver.switchTo().frame(id);
			}
    		else if (ftype.equalsIgnoreCase("element")) {
			driver.switchTo().frame(index);	
			}
    		else if (ftype.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();	
			}
    		else if (ftype.equalsIgnoreCase("defaultContent")) {
			driver.switchTo().defaultContent();	
			}

		}
    	
    	//scroll up scroll down
    	  public static void scrollme( WebElement scrollp,String option,int zero,int scroll) {
    		  
    		JavascriptExecutor j=(JavascriptExecutor) driver;
    		if (option.equalsIgnoreCase("scroll down")) {
    			
    		
    		j.executeScript("arguments[0].scrollIntoView();",scrollp);
    		}
    		else if (option.equalsIgnoreCase("scroll up")) {
    			j.executeScript("windows.scrollBy(zero,-scroll)");
    		}
    		else if (option.equalsIgnoreCase("scroll down2")) {
    			j.executeScript("windows.scrollBy(zero,scroll)");
    		
    		}
    	}
    	
    	//DROP DOWN
    	  public static void singledropdown(String option,int index,String selectby,WebElement elem) {
    		  	Select s=new Select(elem);
    		if (option.equalsIgnoreCase("selectbyvalue")) {
    		
    			s.selectByValue(selectby);
    		}
    		else if (option.equalsIgnoreCase("selectbyvisibletext")) {
    			
    			s.selectByVisibleText(selectby);
    			
    		}
    		else if (option.equalsIgnoreCase("selectbyindex")) {
    		
    			s.selectByIndex(index);
    			
    		}
    		//Multiple DropDown
    		
    		else if (option.equalsIgnoreCase("is multiple")) {
    		
    			s.isMultiple();
    		}
    			
    		else if (option.equalsIgnoreCase("getallselectedoptions")) {

    			WebElement firstSelop = s.getFirstSelectedOption();
    			System.out.println(firstSelop.getText());
    		}
    		else if (option.equalsIgnoreCase("deselectbyvalue")) {
    			s.deselectByValue(selectby);
    		}
    		else if (option.equalsIgnoreCase("deselectbyvisibletext")) {
    			s.deselectByVisibleText(selectby);
    		}
    		else if (option.equalsIgnoreCase("deselectbyindex")) {
    			s.deselectByIndex(index);
    		}
    		else if (option.equalsIgnoreCase("deselectall")) {
    			s.deselectAll();
    		}
    		else if (option.equalsIgnoreCase("getfirstselectoption")) {
    			WebElement firstseleopt = s.getFirstSelectedOption();
    			System.out.println(firstseleopt.getText());
    		}
    		}
    	
    	//Get Options
    	  

    	  
    	
    	
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
