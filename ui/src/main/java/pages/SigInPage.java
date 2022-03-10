package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigInPage extends BasePage {

    public SigInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    @FindBy(tagName = "h3")
    WebElement errorMessagelogin;

    //Actions needed login fields
    public void login(String email, String password) {
        setTextElementText(emailField, email);
        setTextElementText(passwordField, password);
    }

    public void clickOnLoginBtn() {
        clickButton(loginBtn);
    }

    public String getActualMessage() {
        return getTextElement(errorMessagelogin);
    }

}
