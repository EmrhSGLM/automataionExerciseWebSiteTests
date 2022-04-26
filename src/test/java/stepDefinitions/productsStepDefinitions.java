package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.ProductsPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static utilities.ReusableMethods.waitFor;

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

    // Scenario TC_09
    @Given("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
        waitFor(2);
        jse.executeScript("arguments[0].click();",
                productsPage.searchBoxElement);
        productsPage.searchBoxElement.sendKeys("T-Shirt");
        productsPage.searchButtonElement.click();
    }
    @Given("Verify {string} is visible")
    public void verify_is_visible(String str) {
        jse.executeScript("arguments[0].scrollIntoView;",
                productsPage.searchedProductsTextElement);
        assertEquals(str,productsPage.searchedProductsTextElement.getText());
    }
    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
        Assert.assertTrue(productsPage.firstProductTextElement.isDisplayed());
        Assert.assertTrue(productsPage.secondProductTextElement.isDisplayed());
        Assert.assertTrue(productsPage.thirdProductTextElement.isDisplayed());

    }

    // TC_12


    @Given("Hover over first product and click {string}")
    public void hover_over_first_product_and_click(String string) {
        productsPage.firstAddToCartElement.click();
    }
    @Given("Click {string} button")
    public void click_button(String string) {
        productsPage.continueButtontElement.click();
    }
    @Given("Hover over second product and click {string}")
    public void hover_over_second_product_and_click(String string) {
        waitFor(2);
        productsPage.secondAddToCartElement.click();
        waitFor(2);
    }
    @Given("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {

        productsPage.viewCartButtonElement.click();
    }
    @Given("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        List<WebElement> allProducts = Driver.getDriver().findElements(By.xpath("//td[@class='cart_product']"));
        assertEquals(2, allProducts.size());
    }



}
