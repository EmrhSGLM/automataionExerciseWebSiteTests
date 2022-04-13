package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import pages.ProductsPage;
import utilities.Driver;

public class productsStepDefinitions {
    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @And("Click on Product button")
    public void clickOnProductButton() {
        homePage.productsButtonElement.click();
    }

    @Given("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("products"));
    }
    @Given("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertTrue(productsPage.allProductsTextElement.isDisplayed());
    }
    @Then("Click on View Product of first product")
    public void click_on_view_products_of_first_product() {
        jse.executeScript("arguments[0].click();",
                        productsPage.firstProductViewButtonElement);
    }
    @And("Verify that user is landed to product detail page")
    public void verifyThatUserIsLandedToProductDetailPage() {
        Assert.assertTrue(productsPage.addToCartButtonElement.isEnabled());
    }
    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(productsPage.firstProductNameTextElement.isDisplayed());
        Assert.assertTrue(productsPage.firstProductCategoryTextElement.isDisplayed());
        Assert.assertTrue(productsPage.firstPriceTextElement.isDisplayed());
        Assert.assertTrue(productsPage.firstAvailabilityTextElement.isDisplayed());
        Assert.assertTrue(productsPage.firstConditionTextElement.isDisplayed());
        Assert.assertTrue(productsPage.firstBrandTextElement.isDisplayed());
    }


}
