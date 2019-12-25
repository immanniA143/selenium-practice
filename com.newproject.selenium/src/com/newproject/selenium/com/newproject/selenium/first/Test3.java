package com.newproject.selenium.com.newproject.selenium.first;

import org.testng.annotations.Test;

public class Test3 {
  @Test (priority=1)
  public void f() {
	  System.out.println("i am f test");
  }
  @Test (priority=2)
  public void z() {
	  System.out.println("i am z test");
  }
  @Test (priority=3)
  public void b() {
	System.out.println("i am b test");
}
}

