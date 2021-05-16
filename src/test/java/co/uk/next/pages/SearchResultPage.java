package co.uk.next.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage
{
    public SearchResultPage(WebDriver driver)
    {
        // THIS CONSTRUCTOR
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
