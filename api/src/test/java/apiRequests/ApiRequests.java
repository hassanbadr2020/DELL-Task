package apiRequests;

import apitUtilities.ApiRequestBuilder;
import apitUtilities.Endpoints;
import environments.handler.DataManager;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class ApiRequests {


    DataManager dataManager = new DataManager();
    ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();
    Endpoints endpoints = new Endpoints();


    public Response createCategory(JSONObject body) {
        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getCategories(), "POST", body, null, null, null);
    }
    public Response updateCategory(String CategoryId,JSONObject body) {
        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getCategories()+ "/" + CategoryId, "PATCH", body, null, null, null);
    }

    public Response getAllCategories() {
        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getCategories(), "GET", null, null, null, null);
    }

    public Response getOneCategory(String CategoryId) {
        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getCategories() + "/" + CategoryId, "GET", null, null, null, null);
    }
    public Response deleteCategory(String CategoryId) {
        return apiRequestBuilder.performRequest(dataManager.getApiUri(), endpoints.getCategories() + "/" + CategoryId, "DELETE", null, null, null, null);
    }

}
