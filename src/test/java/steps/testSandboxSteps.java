package steps;

import cucumber.api.java.en.*;
import pages.testSandboxPage;

public class testSandboxSteps {

    testSandboxPage sandboxPage = new testSandboxPage();

    @Given("^I navigate to the sandbox page$")
    public void navigateToSandboxSite(){
        sandboxPage.navigateToSandbox();
    }

    @And("^select a value from dropdown$")
    public void selectState(){
        sandboxPage.selectCategory("4");
    }
    
}