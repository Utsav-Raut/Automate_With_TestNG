package config_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseClass1 {
	
  @Test
  public void test_scenario1() {
	  System.out.println("     (5)Hi! This is our test scenario 1");
  }
  
  @Test
  public void test_scenario2() {
	  System.out.println("     (5)Hi! This is our test scenario 2");
  }
  
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
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("   (3)Runs after every class runs");
	  System.out.println();
  }
}
