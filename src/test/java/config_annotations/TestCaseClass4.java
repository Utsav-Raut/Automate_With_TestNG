package config_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCaseClass4 {
	
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
	
	
	  @Test(groups= {"regression", "smoke"})
	  public void test_scenario5() {
		  System.out.println("     (5)Hi! This is our test scenario 5");
	  }
	  
	  @Test(groups= {"regression"})
	  public void test_scenario6() {
		  System.out.println("     (5)Hi! This is our test scenario 6");
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("  (2)This is a warnning from before test method Haa Ha Haa");
		  System.out.println();
	  }
	  
	  @AfterTest
	  public void afterTest() {
		  System.out.println("  (2)This is a warnning from after test method Hee Hee Haa");
		  System.out.println();
	  }
	  
	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("THIS RUNS BEFORE EVERY SUITE...");
	  }
	  
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("THIS RUNS After EVERY SUITE...");
	  }
	  
	  @BeforeGroups(groups= {"regression", "smoke"})
	  public void before_Groups() {
		  System.out.println("This runs before every group");
	  }
	  
	  @AfterGroups(groups= {"regression", "smoke"})
	  public void after_Groups() {
		  System.out.println("This runs after every group");
	  }

}
