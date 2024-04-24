package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null) {
            DesiredCapabilities capabilities= new DesiredCapabilities();
            capabilities.setCapability("browserName","chrome");

            try {
                driver = new RemoteWebDriver(new URL("http://10.174.31.76:4444"),capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }
        return driver;
    }
}