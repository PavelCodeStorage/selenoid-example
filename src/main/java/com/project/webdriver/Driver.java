package com.project.webdriver;

import org.omg.CORBA.SystemException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


public class Driver {

    private static RemoteWebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            DesiredCapabilities browser = new DesiredCapabilities();
            browser.setBrowserName("chrome");
            browser.setVersion("58.0");
            browser.setCapability("enableVNC", true);

            try {
                driver = new RemoteWebDriver(URI.create("http://localhost:4444/wd/hub").toURL(), browser);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}