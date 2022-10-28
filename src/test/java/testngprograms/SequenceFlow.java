package testngprograms;

import org.testng.annotations.*;

public class SequenceFlow
{
  @BeforeSuite
    public void setProperties(){
      System.out.println("Setting before Suite");
  }
  @BeforeClass
    public void openBrowser () {
      System.out.println("Open before Class");
  }
  @BeforeTest
    public void openHomePage(){
      System.out.println("Open Before Test");
  }
  @BeforeMethod
    public void openMethod(){
      System.out.println("opening before method ");
  }
  @Test
    public void openTest(){
      System.out.println("Opening Test");
  }
  @AfterTest
    public void afterTest(){
      System.out.println("AfterTest");
  }
  @AfterClass
    public void afterClass(){
      System.out.println("AfterClass");
  }
  @AfterMethod
    public void afterMethod()
  {
      System.out.println("AfterMethod");
  }
  @AfterSuite
    public void afterSuite(){
    System.out.println("afterSuite");
    }

}
