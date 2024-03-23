import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumManagerTest {
    WebDriver driver;
    public void launchBrowser(){
        //launch browser
        driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
    }

    public void navigationMethods(){
        //to launch the application
        driver.get("https://www.antiersolutions.com/");

        //to get the application Title
        String appTitle = driver.getTitle();
        System.out.println(appTitle);

        //to get the application URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
    }

    public void closeBrowser(){
       // driver.close();
        driver.quit();
    }


}
