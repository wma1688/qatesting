package demo;

import org.openqa.selenium.WebDriver;


public class Website {

	protected String url;
	protected WebDriver driver;
	
	public Website(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public String getUrl(){	
		return url;
	}
	
	
}