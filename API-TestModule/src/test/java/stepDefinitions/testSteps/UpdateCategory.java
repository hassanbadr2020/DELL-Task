package stepDefinitions.testSteps;

import apiRequests.ApiRequests;
import apitUtilities.ApiMethodHelper;
import base.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.json.simple.JSONObject;


public class UpdateCategory implements En {
    ApiMethodHelper apiMethodHelper = new ApiMethodHelper();
    ApiRequests apiRequests = new ApiRequests();
    private Base base;

    public UpdateCategory(Base base) {
        this.base = base;
        And("^the category already created before$", (DataTable datatable) -> {
            JSONObject body = apiMethodHelper.covertDTtoJO(datatable);
            System.out.println(body);
            base.response= apiRequests.createCategory(body);
            System.out.println(base.response);
        });
        When("^User send a patch request to update a Category$", (DataTable datatable) -> {
            JSONObject body = apiMethodHelper.covertDTtoJO(datatable);
            base.response = apiRequests.updateCategory(base.id, body);
        });

    }
}
