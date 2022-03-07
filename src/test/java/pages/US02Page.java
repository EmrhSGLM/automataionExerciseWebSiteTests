package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US02Page {

    public US02Page(){PageFactory.initElements(Driver.getDriver(),this);   }

    @FindBy(xpath="//img[@src='/static/images/home/logo.png']")
    public WebElement automationExerciseLogo;

    @FindBy (xpath = "//*[.='New User Signup!']")
    public WebElement newUserSignUpTextElement;

    @FindBy (xpath = "//p[.='Email Address already exist!']")
    public WebElement alreadyRegisteredEmailTextElement;

    // TC06

    @FindBy (xpath = "//h2[.='Get In Touch']")
    public WebElement getInTouchTextElement;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement nameBoxElement;

    @FindBy (xpath = "//input[@name='upload_file']")
    public WebElement uploadFileElement;

    @FindBy (xpath = "//input[@name='submit']")
    public WebElement submitBoxElement;

    @FindBy (xpath = "(//div[@style='display: block;'])[1]")
    public WebElement successMessageTextElement;

    @FindBy (tagName="span")
    public WebElement homeButtonElement;

    @FindBy (tagName="b")
    public WebElement testCasesTextElement;

    @FindBy (xpath="//h2[@class='title text-center']")
    public WebElement allProductTextElement;

    @FindBy (xpath="//h2[.='Brands']")
    public WebElement brandsTextElement;

    @FindBy (xpath="//a[@href='/product_details/1']")
    public WebElement firstProductElement;

    @FindBy (xpath="//*[.='Blue Top']")
    public WebElement productNameElement;

    @FindBy (xpath="//p[.='Category: Women > Tops']")
    public WebElement categoryNameElement;

    @FindBy (xpath="//span[.='Rs. 500']")
    public WebElement priceNameElement;

    @FindBy (xpath="//b[.='Availability:']")
    public WebElement availableTextElement;

    @FindBy (xpath="//b[.='Condition:']")
    public WebElement conditionTextElement;

    @FindBy (xpath="//b[.='Brand:']")
    public WebElement brandTextElement;

}
