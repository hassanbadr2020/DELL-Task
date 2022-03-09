package stepDefinitions.testSteps;


import apiRequests.ApiRequests;
import apitUtilities.ApiMethodHelper;
import base.Base;
import io.cucumber.java8.En;
import org.junit.Assert;

public class GetACategory implements En {
    ApiMethodHelper apiMethodHelper = new ApiMethodHelper();
    ApiRequests apiRequests = new ApiRequests();
    private Base base;

    public GetACategory(Base base) {
        this.base = base;
        Given("^user send a request to get Category with (invalid|valid) \"([^\"]*)\"$", (String flag, String id) -> {
            base.response = apiRequests.getOneCategory(id);
        });
        And("^the name of the Category is \"([^\"]*)\"$", (String categoryName) -> {
            Assert.assertEquals(categoryName, base.response.jsonPath().get("name"));
        });
        And("^there is no \"([^\"]*)\" found for this id$", (String actualMessage) -> {
            Assert.assertEquals( base.response.jsonPath().get("message"),actualMessage);
        });
    }
}
