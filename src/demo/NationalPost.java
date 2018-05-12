package demo;


import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;


public class NationalPost extends Website{

	public NationalPost(WebDriver driver){
		
		super(driver, "http://nationalpost.com");
	}

	public void testTitle(){
		String actualTitle = driver.getTitle();
		String expectedTitle = "National Post";
		//AssertJUnit.assertEquals(expectedTitle, actualTitle);
		AssertJUnit.assertTrue(actualTitle.contains(expectedTitle));
	}

	
}
