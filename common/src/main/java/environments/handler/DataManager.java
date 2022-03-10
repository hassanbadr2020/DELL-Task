package environments.handler;

public class DataManager {
    environments.handler.ConfigurationManager configurationManager = environments.handler.ConfigurationManager.getConfigurationManager();

    public String getApiUri() {
        String apiUri = configurationManager.environmentProperties.getProperty("apiURI");
        return apiUri;
    }


    public String getUIUrl() {
        String uiURL = configurationManager.environmentProperties.getProperty("uiURL");
        return uiURL;
    }
}
