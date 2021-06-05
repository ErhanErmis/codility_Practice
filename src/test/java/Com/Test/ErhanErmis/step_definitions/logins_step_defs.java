package Com.Test.ErhanErmis.step_definitions;

import Com.Test.ErhanErmis.pages.login;
import Com.Test.ErhanErmis.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logins_step_defs {
    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        login login=new login();
        login.signInButton.click();
        login.emailbox.sendKeys(ConfigurationReader.get("username"));
        login.passwdbox.sendKeys(ConfigurationReader.get("password"));
        login.submit.click();


    }

    @Then("the users personal account is displayed")
    public void the_users_personal_account_is_displayed() {
        Assert.assertTrue(new login().submitConfirm.isDisplayed());
    }


}
