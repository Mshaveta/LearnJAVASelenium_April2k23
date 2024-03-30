package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.startBrowser();
        System.out.println(browser.getWebDriver());
    }
}
