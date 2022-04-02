package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsFormPage {

    public ContactUsFormPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//a[@href='/contact_us']")
    public WebElement contactUsFormButtonElement;

    @FindBy(xpath="//h2[text()='Get In Touch']")
    public WebElement getInTouchTextElement;

    @FindBy(xpath="//input[@data-qa='name']")
    public WebElement nameBoxElement;

    @FindBy(xpath="//input[@data-qa='email']")
    public WebElement emailBoxElement;

    @FindBy(xpath="//input[@data-qa='subject']")
    public WebElement subjectBoxElement;

    @FindBy(xpath="//textarea[@data-qa='message']")
    public WebElement messageBoxElement;

    @FindBy(xpath="//input[@name='upload_file']")
    public WebElement uploadFileButtonElement;

    @FindBy(xpath="//input[@data-qa='submit-button']")
    public WebElement submitButtonElement;

    @FindBy(xpath="(//div[@style='display: block;'])[1]")
    public WebElement recordWasDoneTextElement;

    @FindBy(xpath="//i[@class='fa fa-angle-double-left']")
    public WebElement homeButtonElement;

    @FindBy(xpath="//h2[.='Full-Fledged practice website for Automation Engineers']")
    public WebElement homePageTextElement;




}
