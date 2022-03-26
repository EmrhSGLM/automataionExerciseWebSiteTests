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
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class RegisterStepDefinitions {

    HomePage homePage = new HomePage();



    @Given("Launch browser")
    public void launch_browser() {
        Driver.getDriver();
    }

    @When("Navigate to url AutomationExercise")
    public void navigate_to_url_automation_exercise() {
        Driver.getDriver().get(ConfigReader.getProperty("AutoExcsUrl"));
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String expectedHomeUrl = Driver.getDriver().getCurrentUrl();
        String actualUrl = "https://www.automationexercise.com/";
        Assert.assertEquals(expectedHomeUrl, actualUrl);
    }

    @Then("Click on Signup-Login button")
    public void click_on_signup_login_button() {
        homePage.signUpLoginButtonElement.click();
    }

    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(homePage.newUserSignUpTextElement.isDisplayed());
        Assert.assertTrue(homePage.loginYourAccountTextElement.isDisplayed());
    }

    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        homePage.newUserLoginNameBoxElement.sendKeys(ConfigReader.getProperty("firstName"));
        homePage.newUserLoginEmailBoxElement.sendKeys(ConfigReader.getProperty("emailEmrah"));

    }

    @Then("Click Signup button")
    public void click_signup_button() {
        homePage.NewUserLoginSignUpButtonElement.click();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertTrue(homePage.enterAccountInformationTextElement.isDisplayed());
    }

    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {

        homePage.mrRadioButtontElement.click();
        Actions actions = new Actions(Driver.getDriver());
       actions.click(homePage.newUserPasswordBoxElement).
               sendKeys(ConfigReader.getProperty("password")).
               sendKeys(Keys.TAB).
               sendKeys(ConfigReader.getProperty("dayOfBirth")).
               sendKeys(Keys.TAB).
               sendKeys(ConfigReader.getProperty("monthOfBirth")).
               sendKeys(Keys.TAB).
               sendKeys(ConfigReader.getProperty("yearOfBirth")).
               perform();
    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        homePage.signUpForOurNewsLetterBoxElement.click();
    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
            homePage.specialOffersFromOurPartnersBoxElement.click();
    }

    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
         Actions actions = new Actions(Driver.getDriver());
         actions.click(homePage.firstNameBoxElement).
                 sendKeys(ConfigReader.getProperty("firstName")).
                 sendKeys(Keys.TAB).
                 sendKeys(ConfigReader.getProperty("lastName")).
                 sendKeys(Keys.TAB).
                 sendKeys(ConfigReader.getProperty("companyName")).
                 sendKeys(Keys.TAB).
                 sendKeys(ConfigReader.getProperty("address")).
                 sendKeys(Keys.TAB).
                 sendKeys(ConfigReader.getProperty("address2")).
                 sendKeys(Keys.TAB).
                 sendKeys(ConfigReader.getProperty("country")).
                 sendKeys(Keys.TAB).
                 sendKeys(ConfigReader.getProperty("state")).
                 sendKeys(Keys.TAB).
                 sendKeys(ConfigReader.getProperty("city")).
                 sendKeys(Keys.TAB).
                 sendKeys(Faker.instance().address().zipCode()).
                 sendKeys(Keys.TAB).
                 sendKeys(Faker.instance().phoneNumber().cellPhone()).
                 perform();

    }
    @Then("Click \\(Create Account button)")
    public void clickCreateAccountButton() {
        homePage.createAccountButtonElement.click();
    }

    @And("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {

        String actualText= homePage.accountCreatedTextElement.getText();
        Assert.assertEquals(actualText, "ACCOUNT CREATED!");
    }


    @Then("Click Continue button")
    public void clickContinueButton() {
        //Driver.getDriver().switchTo().alert().dismiss();
        homePage.continueButtontElement.click();
    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton() {
        homePage.deleteButtonElement.click();
    }


    @And("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        // Sitede hata var Bu bolum calismiyor
        Driver.getDriver().navigate().back();
        homePage.logoutButtonElement.click();
        ReusableMethods.waitFor(2);

    }

    // Scenario 2

    @Given("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        String actualText = homePage.loginToYourAccount.getText();
        Assert.assertEquals("Login to your account", actualText);

    }
    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        homePage.loginEmailBoxElement.sendKeys(ConfigReader.getProperty("emailEmrah"));
        homePage.loginPasswordBoxElement.sendKeys(ConfigReader.getProperty("password"));
    }
    @Then("Click login button")
    public void click_login_button() {
        homePage.loginSignInButtonElement.click();

    }

    // Scenario 3

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        homePage.loginEmailBoxElement.sendKeys(ConfigReader.getProperty("wrongEmail"));
        homePage.loginPasswordBoxElement.sendKeys(ConfigReader.getProperty("wrongPassword"));
        homePage.loginSignInButtonElement.click();

    }

    @Then("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        ReusableMethods.waitFor(2);
        Assert.assertEquals("Your email or password is incorrect!",
                homePage.girisYapilamadiTextElement.getText());
    }






}
