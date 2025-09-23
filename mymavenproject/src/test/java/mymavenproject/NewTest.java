package mymavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
  @Test
  public void sampleTest() {
	  
	  System.out.println("Sample Test calling");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod calling");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod calling");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass calling");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass calling");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest calling");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest calling");
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite calling");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite calling");
  }
  
  @Test
  public void sampleTest1() {
	  
	  System.out.println("Sample Test1 calling");
  }

}
