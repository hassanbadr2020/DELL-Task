package stepDefinitions.testSteps;

import apiRequests.ApiRequests;
import apitUtilities.ApiMethodHelper;
import base.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.junit.Assert;

public class CreateCategory implements En {
    ApiMethodHelper apiMethodHelper = new ApiMethodHelper();
    ApiRequests apiRequests = new ApiRequests();
    private Base base;

    public CreateCategory(Base base) {
        this.base = base;
        Given("^user has the name and id of a new Category$", (DataTable dataTable) -> {
            base.requestBody = apiMethodHelper.covertDTtoJO(dataTable);
        });
        When("^User Send a post request to create the Category$", () -> {
            base.response = apiRequests.createCategory(base.requestBody);
        });
        Then("^Category has been (.* ?) with \"([^\"]*)\" and \"([^\"]*)\" that we've provided$", (String dummyFlag, String name, String id) -> {
            Assert.assertEquals(name, base.response.jsonPath().get("name"));
            Assert.assertEquals(id, base.response.jsonPath().get("id"));
        });

    }
}
