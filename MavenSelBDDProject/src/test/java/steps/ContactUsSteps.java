package steps;

import com.google.inject.Inject;
import io.cucumber.java.en.*;
import pages.BasePage;

public class ContactUsSteps {

    @Inject
    BasePage basePage;

    @Given("The user launches the application with url {string}")
    public void theUserLaunchesTheApplicationWithUrl(String appUrl) {
        basePage.launchApplication(appUrl);
    }

    @When("The user redirects to contact us page with url {string}")
    public void theUserRedirectsToContactUsPageWithUrl(String contactPageUrl) {
        basePage.navigateToUrl(contactPageUrl);
    }
}
