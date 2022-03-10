package stepDefinitions.testSteps;

import base.Base;
import io.cucumber.java.en.And;
import pages.CheckStepOnePage;


public class PaymentInformationSteps extends Base {
    CheckStepOnePage checkStepOnePage;
    private Base base;

    public PaymentInformationSteps(Base base) {
        this.base = base;
    }

    @And("fill payment information first name {string} last name {string} and postal code {string}")
    public void fillPaymentInformationFirstNameLastNameAndPostalCode(String firstName, String lastName, String postalCode) {
        checkStepOnePage = new CheckStepOnePage(base.driver);
        checkStepOnePage.paymentInformation(firstName, lastName, postalCode);

    }

    @And("Click on continue button")
    public void clickOnContinueButton() {
        checkStepOnePage = new CheckStepOnePage(base.driver);
        checkStepOnePage.clickOnContinueBtn();
    }
}
