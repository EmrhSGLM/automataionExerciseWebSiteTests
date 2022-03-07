package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//a[@href='/login']")
    public WebElement signUpLoginButtonElement;

    @FindBy(xpath="//a[normalize-space()='Home']")
    public WebElement homeButtonElement;

    @FindBy(xpath ="//a[@href='/products']")
    public WebElement productButtonElement;

    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    public WebElement cartButtonElement;

    @FindBy(xpath ="//a[normalize-space()='Contact us']")
    public WebElement contactUsButtonElement;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement accountEmailBoxElement;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement accountPasswordBoxElement;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement newUserNameBoxElement;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement newEmailBoxElement;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement accountLoginButtonElement;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public WebElement newUserSignUpButtonElement;

    @FindBy(xpath = "//a[@href='/test_cases']")
    public WebElement testCasesButtonElement;






}
