package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {

    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//h2[@class='title text-center']")
    public WebElement allProductsTextElement;

    @FindBy(xpath="//a[@href='/product_details/1']")
    public WebElement firstProductViewButtonElement;

   @FindBy(xpath="//button[@class='btn btn-default cart']")
    public WebElement addToCartButtonElement;

   @FindBy(xpath="//h2[.='Blue Top']")
    public WebElement firstProductNameTextElement;

   @FindBy(xpath="//p[.='Category: Women > Tops']")
    public WebElement firstProductCategoryTextElement;

   @FindBy(xpath="//span[.='Rs. 500']")
    public WebElement firstPriceTextElement;

   @FindBy(xpath="//b[.='Availability:']")
    public WebElement firstAvailabilityTextElement;

   @FindBy(xpath="//b[.='Condition:']")
    public WebElement firstConditionTextElement;

   @FindBy(xpath="//b[.='Brand:']")
    public WebElement firstBrandTextElement;


}
