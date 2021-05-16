package co.uk.next.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

// METHODS THAT OPENS BROWSERS


public class BrowsersManager extends DriverManager
{
    private WebDriver initChrome()
    {
        // this setup chromeDriver for me that can be seen
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private WebDriver initHeadlessChrome()
    {
        // this setup chromeDriver for me that cant be seen and setup for chrome driver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu", "-headless");


        return new ChromeDriver(options);
    }

    private WebDriver initFirefox()
    {
        // this setup chromeDriver for me that can be seen and setup for firefox driver
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private WebDriver initHeadlessFirefox()
    {
        // this setup chromeDriver for me that cant be seen
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions( );
        options.addArguments("--disable-gpu", "-headless");


        return new FirefoxDriver(options);
    }

    public void launchBrowser(String browser)
    {
        switch(browser)
        {
            case "Chrome":
                driver = initChrome();
                break;
            case "HeadlessChrome":
                driver = initHeadlessChrome();
                break;
            case "Firefox":
                driver = initFirefox();
                break;

            case "HeadlessFirefox":
                driver = initHeadlessFirefox();
                break;
            default:
                driver = initHeadlessChrome();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }

    public void closeBrowser()
    {
        WebDriver driver = null;
        driver.manage().deleteAllCookies();
    }
}
