package steps;

import io.cucumber.java.en.*;

public class LoginSteps {

    @When("The user enters the valid username in username text field")
    public void enterValidUsername(){
        System.out.println("enterValidUsername");
    }

    @And ("The user enters the valid password in password text field")
    public void enterValidPassword(){
        System.out.println("enterValidPassword");
    }

    @When("The user enters the invalid username in username text field")
    public void enterInvalidUsername(){
        System.out.println("enterInvalidUsername");
    }

    @And ("The user enters the invalid password in password text field")
    public void enterInvalidPassword(){
        System.out.println("enterInvalidPassword");
    }
}
