package stepDefinitions.testSteps;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.InventoryPage;

public class LogoutSteps extends Base {
    InventoryPage inventoryPage;
    private Base base;

    public LogoutSteps(Base base) {
        this.base = base;
    }

    @When("user click on menu button")
    public void userClickOnMenuButton() {
        inventoryPage = new InventoryPage(base.driver);
        inventoryPage.clickOnMenuBtn();
    }

    @And("click on logout button")
    public void clickOnLogoutButton() {
        inventoryPage = new InventoryPage(base.driver);
        inventoryPage.clickOnLogoutBtn();
    }
}
