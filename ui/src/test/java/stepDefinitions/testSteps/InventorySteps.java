package stepDefinitions.testSteps;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.InventoryPage;

public class InventorySteps extends Base {

    private Base base;
    InventoryPage inventoryPage;

    public InventorySteps(Base base) {
        this.base = base;
    }

    @Then("user in the home page")
    public void userInTheHomePage() {
        inventoryPage = new InventoryPage(base.driver);
        Assert.assertEquals("PRODUCTS", inventoryPage.getActualTitle());
    }

    @And("remove one item from the cart")
    public void removeOneItemFromTheCart() {
        inventoryPage.clickOnRemoveBackPackBtn();

    }

    @Then("number of items in the cart is {string}")
    public void numberOfItemsInTheCartIs(String expItemNumber) {
        Assert.assertEquals(expItemNumber, inventoryPage.getNumberOfItems());
    }

    @When("select  one of the sorting type {string}")
    public void selectOneOfTheSortingType(String sortType) {
        inventoryPage.clickOnSortContainer(sortType);
    }

    @Then("the {string} have been sorted based the selection")
    public void theItemsHaveBeenSortedBasedTheSelection(String firstItem) {
        Assert.assertEquals(firstItem,inventoryPage.getNameTheFirstItem());

    }
}
