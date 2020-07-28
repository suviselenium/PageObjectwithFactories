package com.w2a.base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.w2a.page.actions.TopNavigations;
import com.w2a.utilities.ExcelReader;
import com.w2a.utilities.ExtentManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Page {
    /*
    * WebDriver initilization
    * Excel reading
    * LOgs
    * WebDriverWait
    * ExtentReports
    *
    * */

    public static WebDriver driver;
    public static Properties OR = new Properties();
    public static FileInputStream fis;
    public static Logger log = Logger.getLogger("devpinoyLogger");
    public static ExcelReader excel = new ExcelReader(
            System.getProperty("user.dir") + "//src//test//resources//excel//testdata.xlsx");
    public static WebDriverWait wait;
    public ExtentReports rep = ExtentManager.getInstance();
    public static ExtentTest test;
    public static String browser;
    public static TopNavigations top;

    public static void initConfiguration()
    {
        if(Constants.broswer.equals("firefox")){
            System.setProperty("webdriver.gecko.driver",
                    System.getProperty("user.dir") + "//src//test//resources/executables//geckodriver");
            driver = new FirefoxDriver();
            log.debug("Launching Firefox!!!!");
        }else if(Constants.broswer.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "//src//test//resources/executables//chromedriver");

            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-infobars");

            driver = new ChromeDriver(options);
            log.debug("Launching Chrome!!!!");
        }else if (Constants.broswer.equals("ie")) {

            System.setProperty("webdriver.ie.driver",
                    System.getProperty("user.dir") + "//src//test//resources//executables//IEDriverServer");
            driver = new InternetExplorerDriver();
        }

        driver.get(Constants.testsiteurl);
        log.debug("Navigated to : " + Constants.testsiteurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.implicit,TimeUnit.SECONDS);

        wait = new WebDriverWait(driver, 5);
        top = new TopNavigations(driver);
}

    public static void click(WebElement element) {

        element.click();
        log.debug("Clicking on an Element : "+element);
        test.log(LogStatus.INFO, "Clicking on : " + element);
    }

    public static void type(WebElement element, String value) {

        element.sendKeys(value);
        log.debug("Typing in an Element : "+element+" entered value as : "+value);

        test.log(LogStatus.INFO, "Typing in : " + element + " entered value as " + value);

    }

    public static void quitBrowser(){
            if(driver!=null){
                driver.quit();
            }
    }
}
