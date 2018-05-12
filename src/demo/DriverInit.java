package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class DriverInit {
	
    public static WebDriver getDriver(String browserName) {
        WebDriver driver = null;

        if (browserName.equals("Firefox")) {
        	
            System.setProperty("webdriver.gecko.driver", "/home/don/Testings/Servers/geckodriver");
            driver = new FirefoxDriver();
            
        } else if (browserName.equals("Edge")) {
        	
            System.setProperty("webdriver.edge.driver", "/home/don/Testings/Servers/MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
            
        } else if (browserName.equals("Chrome")) {
        	
            System.setProperty("webdriver.chrome.driver", "/home/don/Testings/Servers/chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equals("Chrome-headless")){
        	System.setProperty("webdriver.chrome.driver", "/home/don/Testings/Servers/chromedriver");
        	ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            options.addArguments("window-size=1200x600");
            driver = new ChromeDriver(options);
        } else if (browserName.equals("HTMLUnit")) {
        	driver = new HtmlUnitDriver();
        }
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        return driver;
    }

    public static void closeDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}
