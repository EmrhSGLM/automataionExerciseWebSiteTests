package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;

public class testCaseStepDefinitions {
    HomePage homePage = new HomePage();

    @Given("Click on Test Cases button")
    public void click_on_test_cases_button() {
        homePage.testCasesButtonElement.click();
    }
    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertTrue(homePage.testCasesButtonElement.isDisplayed());
    }

}
