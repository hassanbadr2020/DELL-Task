package stepDefinitions.testSteps;

import apiRequests.ApiRequests;
import apitUtilities.ApiMethodHelper;
import base.Base;
import io.cucumber.java8.En;
import org.junit.Assert;

public class GetAllCategories implements En {
    ApiMethodHelper apiMethodHelper = new ApiMethodHelper();
    ApiRequests apiRequests = new ApiRequests();
    private Base base;

    public GetAllCategories(Base base) {
        this.base =base;
        And("^the number of Posts is \"([^\"]*)\"$", (Integer numberOfCategories) -> {
            Integer actualNumberOfCategories = base.response.jsonPath().getList("id").size();
            Assert.assertEquals(actualNumberOfCategories,numberOfCategories);
        });
        Given("^User send a get request to list all Categories$", () -> {
            base.response =apiRequests.getAllCategories();
        });
        Then("^status code is \"([^\"]*)\"$", (String statusCode) -> {
            Assert.assertEquals(Integer.parseInt(statusCode), base.response.statusCode());
        });
        Then("^response body matches \"([^\"]*)\" in Api contract$", (String schemaName) ->
        {
            apiMethodHelper.validateSchema(schemaName, base.response);
        });
    }
}
