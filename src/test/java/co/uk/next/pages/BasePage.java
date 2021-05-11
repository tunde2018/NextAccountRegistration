package co.uk.next.pages;

import co.uk.next.common.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager
{
    public String BASE_URL = "https://www3.next.co.uk/";
    public Select select;

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
}
