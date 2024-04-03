package pages;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;
import support.Browser;

@ScenarioScoped
public class BasePage {

    @Inject
    Browser browser;

    WebDriver driver;

    public void launchApplication(String appUrl){
        browser.startBrowser();
        driver = browser.getWebDriver();
        driver.get(appUrl);
        System.out.println(driver);
    }

    public void navigateToUrl(String pageUrl){
      driver.navigate().to(pageUrl);
    }


}
