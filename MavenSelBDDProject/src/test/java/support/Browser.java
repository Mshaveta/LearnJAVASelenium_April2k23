package support;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@ScenarioScoped
public class Browser {
    private WebDriver driver;

    public void startBrowser(){
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
    }

    public WebDriver getWebDriver(){
        return driver;
    }

    public void closeBrowser(){
        driver.quit();
    }

}
