package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePageStepDefinitions {
    HomePage homePage = new HomePage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Scroll down to footer")
    public void scroll_down_to_footer() {
        /*
        jse.executeScript("arguments[0], scrollIntoView(true);",
                homePage.subscriptionTextElement);
                */
        actions.sendKeys(Keys.END).perform();
    }

    @Then("Verify text {string}")
    public void verify_text(String str) {
        assertTrue(homePage.subscriptionTextElement.getText().equalsIgnoreCase(str));
    }

    @Then("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
        homePage.subscripeEmailBoxElement.
                sendKeys(ConfigReader.getProperty("emailEmrah"));
        homePage.subscripeEmailButtonElement.click();

    }

    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        assertTrue(homePage.successfullySubscripeTextElement.isDisplayed());
    }

    // TC_11

    @Then("Click Cart button")
    public void clickCartButton() {
        homePage.cartButtonElement.click();
    }
}
