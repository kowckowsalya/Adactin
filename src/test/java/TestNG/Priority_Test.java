package TestNG;

import org.testng.annotations.Test;

public class Priority_Test {
	
	@Test(priority= 1)
    private void GetURL() {
              System.out.println("Get URL");
	}
	@Test(priority= 2)
    private void signin() {
         System.out.println("signin");
	}
	@Test(priority= 4)
    private void womens_Shirt() {
        System.out.println("Exection");
	}
	@Test(priority= 3)
    private void signout() {
          System.out.println("signout");
	}
	@Test(priority= -1)
	private void setProperty() {
         System.out.println("Set Property");
	}
	@Test(priority= 0)
    private void browserLaunch() {
         System.out.println("B Launch");
	}
    
}
