package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "summary_total_label")
    WebElement totalPrice;

    @FindBy(id = "finish")
    WebElement finishBtn;

    public String getTotalPrice() {
        return getTextElement(totalPrice);
    }

    public void clickOnFinishBtn() {
        clickButton(finishBtn);
    }
}
