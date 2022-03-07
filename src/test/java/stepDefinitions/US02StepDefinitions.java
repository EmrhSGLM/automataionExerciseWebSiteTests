package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.US02Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US02StepDefinitions {

    US02Page qa=new US02Page();
    HomePage qa1=new HomePage();

    @Given("Launch browser")
    public void launch_browser() {

        Driver.getDriver();

    }
    @Then("Navigate to url automation")
    public void navigate_to_url_automation() {

        Driver.getDriver().get(ConfigReader.getProperty("AutoExcsUrl"));

    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        Assert.assertTrue(qa.automationExerciseLogo.isDisplayed());

    }
    @When("Click on Signup Login button")
    public void click_on_signup_login_button() {

        qa1.signUpLoginButtonElement.click();

    }
    @When("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(qa.newUserSignUpTextElement.isDisplayed());
    }
    @When("Enter name and already registered email address")
    public void enter_name_and_already_registered_email_address() {
        qa1.newUserNameBoxElement.sendKeys(Faker.instance().name().firstName());
        qa1.newEmailBoxElement.sendKeys(ConfigReader.getProperty("emailEmrah"));

    }
    @When("Click Signup button")
    public void click_signup_button() {
        qa1.newUserSignUpButtonElement.click();
    }
    @When("Verify error Email Address already exist! is visible")
    public void verify_error_email_address_already_exist_is_visible() {
        Assert.assertTrue(qa.alreadyRegisteredEmailTextElement.isDisplayed());
    }

    // TC06

    @When("Click on Contact Us button")
    public void click_on_contact_us_button() {
        qa1.contactUsButtonElement.click();

    }
    @When("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {
        Assert.assertTrue(qa.getInTouchTextElement.isDisplayed());
    }
    @When("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(qa.nameBoxElement).
                sendKeys(ConfigReader.getProperty("name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("emailEmrah")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("subject")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("message")).
                perform();

    }
    @When("Upload file")
    public void upload_file() {

        qa.uploadFileElement.sendKeys("C:\\Users\\derdi\\OneDrive\\Masaüstü\\Selenium.png");
    }
    @When("Click Submit button")
    public void click_submit_button() {
        qa.submitBoxElement.click();
    }
    @When("Click OK button")
    public void click_ok_button() {
        Driver.driver.switchTo().alert().accept();
    }


    @And("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertTrue(qa.successMessageTextElement.isDisplayed());
    }


    @And("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        qa.homeButtonElement.click();
        Assert.assertTrue(qa.automationExerciseLogo.isDisplayed());
    }



    // TC07

    @When("Click on Test Cases button")
    public void clickOnTestCasesButton() {

        qa1.testCasesButtonElement.click();
    }


    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(qa.testCasesTextElement.isDisplayed());
    }

    // TC08

    @When("Click on Products button")
    public void click_on_products_button() {
        qa1.productButtonElement.click();
    }
    @When("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(qa.allProductTextElement.isDisplayed());
    }
    @When("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertTrue(qa.brandsTextElement.isDisplayed());
    }
    @When("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        qa.firstProductElement.click();
    }
    @When("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {

    }
    @When("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
            Assert.assertTrue(qa.productNameElement.isDisplayed());
            Assert.assertTrue(qa.categoryNameElement.isDisplayed());
            Assert.assertTrue(qa.priceNameElement.isDisplayed());
            Assert.assertTrue(qa.availableTextElement.isDisplayed());
            Assert.assertTrue(qa.conditionTextElement.isDisplayed());
            Assert.assertTrue(qa.brandTextElement.isDisplayed());
    }

}
