package co.uk.next.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage extends BasePage
{
    public ProductDetailPage(WebDriver driver)
    {
        // THIS CONSTRUCTOR
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
