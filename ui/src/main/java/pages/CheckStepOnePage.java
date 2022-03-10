package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckStepOnePage extends BasePage {
    public CheckStepOnePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    WebElement firstNameField;

    @FindBy(id = "last-name")
    WebElement lastNameField;

    @FindBy(id = "postal-code")
    WebElement postalCodeField;

    @FindBy(id = "continue")
    WebElement continueBtn;

    public void paymentInformation(String firstName, String lastName, String postalCode) {
        setTextElementText(firstNameField, firstName);
        setTextElementText(lastNameField, lastName);
        setTextElementText(postalCodeField, postalCode);
    }

    public void clickOnContinueBtn() {
        clickButton(continueBtn);
    }

}
