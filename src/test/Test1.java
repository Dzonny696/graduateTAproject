package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Test1 {
	
	private static WebDriver driver;
	private String URL;
	
	
	 @BeforeClass
	  public void beforeTest() {
		  driver = new FirefoxDriver();
			URL = "http://www.google.com";
	  }
	 
  @Test
  public void f()
  {
	  driver.get(URL);
	  driver.manage().window().maximize();
	  Sleeper.sleepTightInSeconds(5);
  }
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

 

}
