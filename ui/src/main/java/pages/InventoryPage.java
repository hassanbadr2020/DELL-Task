package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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


    @FindBy(tagName = "select")
    WebElement selectOption;

    Select select = new Select(selectOption);


    // actions need in home page
    public String getActualTitle() {
        System.out.println(getTextElement(HomeTitle));
        return getTextElement(HomeTitle);
    }

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]")
    WebElement firstElement;

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

    public void clickOnSortContainer(String sortType) {
        if (sortType.equals("AZ")) {
            select.selectByVisibleText("Name (A to Z)");
        } else if (sortType.equals("ZA")) {
            select.selectByVisibleText("Name (Z to A)");
        } else if (sortType.equals("low To High")) {
            select.selectByVisibleText("Price (low to high)");
        } else{
            select.selectByVisibleText("Price (high to low)");
        }
    }

    public String getNameTheFirstItem() {
        return getTextElement(firstElement);
    }
}
