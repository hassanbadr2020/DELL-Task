package base;

import environments.handler.DataManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Base {
    public WebDriver driver;
    DataManager dataManager = new DataManager();

    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        Dimension initial_size = driver.manage().window().getSize();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to(dataManager.getUIUrl());

    }

    public void tearBrowser() {
        driver.quit();
    }

}
