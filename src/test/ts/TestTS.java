package test.ts;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demo.TorontoSun;
import demo.util.DriverInit;


public class TestTS {
	
	private WebDriver driver;
	private String browser = "HTMLUnit";	// Which browser to test: "Firefox", "Chrome", "Chrome-headless", "HTMLUnit"

  
  @Test (priority=1, enabled=true)
  public void testTS() {

	  TorontoSun ts = new TorontoSun (driver);
	  String url = ts.getUrl();
      driver.get(url);
	  ts.testTitle();
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  // Init driver
	  driver = DriverInit.getDriver(browser);
  }

  @AfterTest
  public void afterTest() {
	  
	  DriverInit.closeDriver(driver);
	  //driver.quit();
  }
  
}

