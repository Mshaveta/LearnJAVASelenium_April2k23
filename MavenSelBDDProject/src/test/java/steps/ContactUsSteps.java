package steps;

import io.cucumber.java.en.*;

public class ContactUsSteps {

    @Given("The user launches the application with url")
    public void launchTheApplication(){
        //calling methods defined in Contactus Page
        System.out.println("launchTheApplication");
    }

    @Then("The user clicks on contact us Link")
    public void clickOnContactUsLink(){
        System.out.println("clickOnContactUsLink");
    }
}
