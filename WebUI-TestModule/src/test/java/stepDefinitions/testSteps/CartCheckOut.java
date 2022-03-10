package stepDefinitions.testSteps;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.InventoryPage;
import pages.SigInPage;

public class CartCheckOut extends Base {
    SigInPage signInPage;
    InventoryPage inventoryPage;
    private Base base;

    public CartCheckOut(Base base) {
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
        } else {
            inventoryPage.clickOnAddBoltTShirtBtn();
            inventoryPage.clickOnAddBackPackBtn();
            inventoryPage.clickOnAddBackLightBtn();
        }
    }

    @And("user clicks on the shopping cart to checkout")
    public void userClicksOnTheShoppingCartToCheckout() {
        inventoryPage = new InventoryPage(base.driver);
        inventoryPage.clickOnShopping_cart_containerBtn();
    }
}
