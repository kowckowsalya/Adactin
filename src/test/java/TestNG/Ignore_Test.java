package TestNG;

import org.testng.annotations.Test;

public class Ignore_Test {
	
	@Test
	private void Desktop() {
         System.out.println("Method add one");
	}
	@Test
	private void Laptop() {
          System.out.println("Method add Two");
	}
	@Test(enabled = false)
      private void Television() {
          System.out.println("Method add Three");
	}
}
