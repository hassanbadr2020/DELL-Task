package stepDefinitions.testSteps;

import base.Base;
import io.cucumber.java.en.Then;
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
        Assert.assertEquals("PRODUCTS",inventoryPage.getActualTitle());
    }
}
