package com.newproject.selenium.first;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test2 {
  @Test
  public void f() {
	  System.out.println("i am from f test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am from before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am from after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am from before class");
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("i am from after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am from before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am from after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am from before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am from after suite");
  }

}
