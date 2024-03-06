package config_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class TestCaseClass2 {
	
	@BeforeMethod
	  public void beforeMethod() {
		  System.out.println("    (4)Runs before every test method.");
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("    (4)Runs after every test method.");
		  System.out.println();
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("   (3)Runs before every class runs");
		  System.out.println();
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  System.out.println("   (3)Runs after every class runs");
		  System.out.println();
	  }
	
	
	  public void test_scenario3() {
		  System.out.println("     (5)Hi! This is our test scenario 3");
	  }
	  
	  public void test_scenario4() {
		  System.out.println("     (5)Hi! This is our test scenario 4");
	  }

}
