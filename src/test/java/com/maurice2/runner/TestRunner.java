package com.maurice2.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maurice2.poms.Login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="classpath:features", glue = "com/maurice2/steps")
public class TestRunner {
    
    public static WebDriver driver;
    public static Login login;
    public static WebDriverWait Wait;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        login = new Login(driver);
        Wait = new WebDriverWait(driver, 2);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
     
    @AfterClass
    public static void teardown(){
        driver.quit();
        
    }
}
