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

    // actions need in home page
    public String getActualTitle() {
        System.out.println(getTextElement(HomeTitle));
        return getTextElement(HomeTitle);
    }
}
