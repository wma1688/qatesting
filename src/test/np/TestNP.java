package test.np;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demo.DriverInit;
import demo.NationalPost;

public class TestNP {
	
	private WebDriver driver;
	private String browser = "HTMLUnit";	// Which browser to test: "Firefox", "Chrome", "Chrome-headless", "HTMLUnit"

  @Test (priority=1, enabled=true)
  public void testNP() {

	  NationalPost np = new NationalPost(driver);
	  String url = np.getUrl();
      driver.get(url);
	  np.testTitle();
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
