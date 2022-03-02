package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	private void SetProperty() {
         System.out.println("Set Property");
	}
	@BeforeTest
	private void browserLaunch() {
         System.out.println("browserLaunch");
	}
	@BeforeClass
   private void url() {
       System.out.println("url");
}
	@BeforeMethod
   private void signin() {
     System.out.println("signin");
}
	@Test
   private void women() {
         System.out.println("women");
}
	@AfterMethod
    private void signoff() {
         System.out.println("signoff");
	}
	@AfterClass
    private void homepage() {
         System.out.println("homepage");
	}
	@AfterTest
    private void close() {
       System.out.println("close");
	}
	@Test
    private void dress() {
        System.out.println("dress");
	}
	@Test
        private void tshirts() {
   System.out.println("tshirts");
		}
	@AfterSuite
        private void deleteCookies() {
   System.out.println("deleteCookies");
		}
}
