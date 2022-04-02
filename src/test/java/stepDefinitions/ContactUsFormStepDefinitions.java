package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ContactUsFormPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class ContactUsFormStepDefinitions {

    ContactUsFormPage contact=new ContactUsFormPage();
    private WebDriver driver2 = Driver.getDriver();

    @Then("Click on Contact Us button")
    public void click_on_contact_us_button() {
        contact.contactUsFormButtonElement.click();
    }
    @Then("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {
        Assert.assertEquals("GET IN TOUCH",
                contact.getInTouchTextElement.getText());

    }
    @Then("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        contact.nameBoxElement.sendKeys(ConfigReader.getProperty("firstName"));
        contact.emailBoxElement.sendKeys(ConfigReader.getProperty("emailEmrah"));
        contact.subjectBoxElement.sendKeys("Automation is a very succesfully application");
        contact.messageBoxElement.sendKeys("I wait day that will be beautiful everything");
    }
    @Then("Upload file")
    public void upload_file() {
        contact.uploadFileButtonElement.sendKeys("C:\\Users\\derdi\\OneDrive\\Masaüstü\\resimler\\Selenium.png");

    }
    @Then("Click Submit button")
    public void click_submit_button() {
        contact.submitButtonElement.click();
    }
    @Then("Click OK button")
    public void click_ok_button() {
        ReusableMethods.waitFor(2);
        driver2.switchTo().alert().accept();
    }
    @Then("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
        Assert.assertTrue(contact.recordWasDoneTextElement.isDisplayed());
    }
    @Then("Click Home button and verify that landed to home page successfully")
    public void click_home_button_and_verify_that_landed_to_home_page_successfully() {
        contact.homeButtonElement.click();
        Assert.assertTrue(contact.homePageTextElement.isDisplayed());

    }

}
