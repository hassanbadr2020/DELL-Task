package Environments.EnviromnetHandler;

public class DataManager {
    Environments.EnviromnetHandler.ConfigurationManager configurationManager = Environments.EnviromnetHandler.ConfigurationManager.getConfigurationManager();

    public String getApiUri() {
        String apiUri = configurationManager.environmentProperties.getProperty("apiURI");
        return apiUri;
    }


    public String getUIUrl() {
        String uiURL = configurationManager.environmentProperties.getProperty("uiURL");
        return uiURL;
    }
}
