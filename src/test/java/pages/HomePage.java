package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Scenario: Register User

    @FindBy (xpath = "//a[@href='/login']")
    public WebElement signUpLoginButtonElement;

    @FindBy (xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignUpTextElement;

    @FindBy (xpath = "//h2[.='Login to your account']")
    public WebElement loginYourAccountTextElement;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement newUserLoginNameBoxElement;

    @FindBy (xpath = "//input[@data-qa='signup-email']")
    public WebElement newUserLoginEmailBoxElement;

    @FindBy (xpath = "//button[@data-qa='signup-button']")
    public WebElement NewUserLoginSignUpButtonElement;

   // @FindBy (xpath = "//p[.='Email Address already exist!']")
  //  public WebElement NewUserLogingirisYapilamadiTextElement;

    @FindBy (xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountInformationTextElement;

    @FindBy (xpath = "//input[@id='id_gender1']")
    public WebElement mrRadioButtontElement;

    @FindBy (id = "password")
    public WebElement newUserPasswordBoxElement;


    @FindBy (xpath = "//input[@name='newsletter']")
    public WebElement signUpForOurNewsLetterBoxElement;


    @FindBy (xpath = "//input[@name='optin']")
    public WebElement specialOffersFromOurPartnersBoxElement;

    @FindBy (xpath = "//input[@name='first_name']")
    public WebElement firstNameBoxElement;

    @FindBy (xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButtonElement;

    @FindBy (tagName = "b")
    public WebElement accountCreatedTextElement;

    @FindBy (xpath = "//a[.='Continue']")
    public WebElement continueButtontElement;

    @FindBy (xpath = "//li//a[text()=' Logged in as ']")
    public WebElement loggedInAsButtontElement;

}
