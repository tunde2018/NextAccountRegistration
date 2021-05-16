package co.uk.next.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class BasePage implements Driver {
    public String BASE_URL = "https://www.next.co.uk/";
    public Select select;
    protected WebDriver driver;

    public void launchURL()
    {
        driver.navigate().to(BASE_URL);
    }
    public void selectByText(WebElement element, String text)
    {
        select = new Select(element);
        select.deselectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);

    }

    public void selectByIndex(WebElement element, int index)
    {
       select = new Select(element);
       select.selectByIndex(index);

    }

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        return null;
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return false;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
