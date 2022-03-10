package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutCompletePage extends BasePage {
    public CheckOutCompletePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "complete-text")
    WebElement textCompleted;


    public String getTextOfCompletedOrder() {
        return getTextElement(textCompleted);
    }
}
