package stepDefinitions.testSteps;

import apiRequests.ApiRequests;
import base.Base;
import io.cucumber.java8.En;

public class DeleteCategory implements En {
    private Base base;
    ApiRequests apiRequests = new ApiRequests();

    public DeleteCategory(Base base) {
        this.base = base;
        Given("^user wants to (.*) a category with the category \"([^\"]*)\"$", (String flag,String id) -> {
            base.id = id;
        });
        When("^user sends a delete request to the category service$", () -> {
            base.response = apiRequests.deleteCategory(base.id);
        });
        And("^the test data already cleaned with the \"([^\"]*)\"$", (String id) -> {
            base.response = apiRequests.deleteCategory(id);
        });
    }
}
