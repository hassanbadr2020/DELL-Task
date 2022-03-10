package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement HomeTitle;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement sauceLabsBackpackBtn;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeSauceLabsBackpackBtn;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement sauceLabsBikeLightBtn;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement sauceLabsBoltTShirtBtn;

    @FindBy(id = "shopping_cart_container")
    WebElement shopping_cart_container;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuBtn;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutBtn;

    @FindBy(className = "shopping_cart_badge")
    WebElement numOfEItems;

    // actions need in home page
    public String getActualTitle() {
        System.out.println(getTextElement(HomeTitle));
        return getTextElement(HomeTitle);
    }

    public void clickOnAddBackPackBtn() {
        clickButton(sauceLabsBackpackBtn);
    }

    public void clickOnAddBackLightBtn() {
        clickButton(sauceLabsBikeLightBtn);
    }

    public void clickOnAddBoltTShirtBtn() {
        clickButton(sauceLabsBoltTShirtBtn);
    }

    public void clickOnShopping_cart_containerBtn() {
        clickButton(shopping_cart_container);
    }

    public void clickOnMenuBtn() {
        clickButton(menuBtn);
    }

    public void clickOnRemoveBackPackBtn() {
        clickButton(removeSauceLabsBackpackBtn);
    }

    public void clickOnLogoutBtn() {
        clickButton(logoutBtn);
    }

    public String getNumberOfItems() {
        return getTextElement(numOfEItems);
    }

}
