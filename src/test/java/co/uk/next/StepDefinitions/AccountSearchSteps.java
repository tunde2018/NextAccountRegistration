package co.uk.next.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AccountSearchSteps {

    // importing selenium into my project

    WebDriver driver;

    // here i create an object
    // is selenium

    // webDriver here is library where driver is stored

    @Given("I navigate to next homepage")
    public void i_navigate_to_next_homepage() {

        //Launch a browser
        //Enter the URL
        //Navigate to the URL

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.navigate().to("https://www.next.co.uk/");
        driver.findElement(By.className("class=\"nxbtn primary large\"")).sendKeys();


        // I want driver to launch chrome for (driver = new ChromeDriver();)

       // WebDriverManager.edgedriver();
       // driver = new EdgeDriver();




        //WebDriverManager is all browsers
        //Chromedriver() is the browser you want to run the application on
        // Setup() the webDriver has been set up to chromedriver
    }

    @When("I click on {string} button")
    public void i_click_on_button(String string) {

    }

    @When("I select {string} from Title dropdown")
    public void i_select_from_Title_dropdown(String string) {

    }

    @When("I enter {string} into the Name field")
    public void i_enter_into_the_Name_field(String string) {

    }

    @When("I enter {string} into the Last name text box")
    public void i_enter_into_the_Last_name_text_box(String string) {

    }

    @When("I enter {string} into the Email field")
    public void i_enter_into_the_Email_field(String string) {

    }

    @When("I enter {string} into the Password text box")
    public void i_enter_into_the_Password_text_box(String string) {

    }

    @When("I enter {string} in the Date of birth searchfield")
    public void i_enter_in_the_Date_of_birth_searchfield(String string) {

    }

    @When("I enter {string} into the Telephone text box")
    public void i_enter_into_the_Telephone_text_box(String string) {

    }

    @When("I enter {string} into the text box")
    public void i_enter_into_the_text_box(String string) {

    }

    @When("I click on FIND button")
    public void i_click_on_FIND_button() {

    }

    @Then("I select address from {string} dropdown")
    public void i_select_address_from_dropdown(String string) {

    }

    @Then("I click on click {string} button")
    public void i_click_on_click_button(String string) {

    }

    @Then("welcome to next is displayed")
    public void welcome_to_next_is_displayed() {

    }

    @Then("I click on {string} tab button")
    public void i_click_on_tab_button(String string) {

    }

    @Then("my account is displayed")
    public void my_account_is_displayed() {

    }

}
