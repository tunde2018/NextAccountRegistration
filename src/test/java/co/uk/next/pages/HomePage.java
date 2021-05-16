package co.uk.next.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    WebDriver driver;
    public HomePage(WebDriver driver)
    {
        // THIS CONSTRUCTOR

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(className = "myAccount")
    private WebElement MyAccount;
    @FindBy(id = "aFindOutMore")
    private WebElement aFindOutMore;
    @FindBy(className = "nxbtn primary large")
    private WebElement RegisterNow;

    public void enterLocationValue(String myAccount)
    {
        MyAccount.sendKeys(myAccount);
    }
    public void clickOnaFindOutMore()
    {
        aFindOutMore.click();
    }
}
