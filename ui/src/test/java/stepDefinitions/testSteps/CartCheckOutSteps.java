package stepDefinitions.testSteps;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;

public class CartCheckOutSteps extends Base {
    SigInPage signInPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    CheckOutCompletePage checkOutCompletePage;

    private Base base;

    public CartCheckOutSteps(Base base) {
        this.base = base;
    }

    @Given("user has been logged in with valid user name {string} and password {string}")
    public void userHasBeenLoggedInWithValidUserNameAndPassword(String userName, String password) {
        signInPage = new SigInPage(base.driver);
        signInPage.login(userName, password);
        signInPage.clickOnLoginBtn();
    }

    @When("user add one or more than one {string} to the shopping cart")
    public void userAddOneOrMoreThanOneToTheShoppingCart(String numberOfItems) {
        inventoryPage = new InventoryPage(base.driver);
        if (numberOfItems.equals("1")) {
            inventoryPage.clickOnAddBackPackBtn();
        } else if (numberOfItems.equals("2")) {
            inventoryPage.clickOnAddBackPackBtn();
            inventoryPage.clickOnAddBackLightBtn();
        } else if (numberOfItems.equals("3")) {
            inventoryPage.clickOnAddBoltTShirtBtn();
            inventoryPage.clickOnAddBackPackBtn();
            inventoryPage.clickOnAddBackLightBtn();
        } else {
            System.out.println("there is no items selected ");
        }
    }

    @And("user clicks on the shopping cart to checkout")
    public void userClicksOnTheShoppingCartToCheckout() {
        inventoryPage = new InventoryPage(base.driver);
        inventoryPage.clickOnShopping_cart_containerBtn();
    }

    @And("click on the checkout button")
    public void clickOnTheCheckoutButton() {
        cartPage = new CartPage(base.driver);
        cartPage.clickOnCheckoutBtn();
    }


    @And("the total price is {string}")
    public void theTotalPriceIs(String totalPrice) {

        checkoutPage = new CheckoutPage(base.driver);
        Assert.assertEquals(totalPrice, checkoutPage.getTotalPrice());

    }

    @And("clicks on the finish button")
    public void clicksOnTheFinishButton() {
        checkoutPage = new CheckoutPage(base.driver);
        checkoutPage.clickOnFinishBtn();
    }

    @Then("the order has been created with thanks word {string}")
    public void theOrderHasBeenCreatedWithThanksWord(String message) {
        checkOutCompletePage = new CheckOutCompletePage(base.driver);
        Assert.assertEquals(message, checkOutCompletePage.getTextOfCompletedOrder());
    }
}
