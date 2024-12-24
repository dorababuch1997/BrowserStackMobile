package com.browserstack;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class AppiumTest {

    public AppiumDriver driver;

    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
        MutableCapabilities capabilities = new UiAutomator2Options();
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

    }

//    @AfterMethod(alwaysRun=true)
//    public void tearDown() throws Exception {
//        driver.quit();
//    }
}
