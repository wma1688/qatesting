package demo;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;

public class TorontoSun {

	private String url;
	private WebDriver driver;
	
	public TorontoSun (WebDriver driver){
		this.driver = driver;
		this.url = "http://torontosun.com";
	}
	
	public String getUrl(){	
		return url;
	}
	
	public void testTitle(){
		String actualTitle = driver.getTitle();
		String expectedTitle = "Toronto News | Latest Headlines & Breaking News | Toronto Sun";
		AssertJUnit.assertEquals(expectedTitle, actualTitle);
	}

}
