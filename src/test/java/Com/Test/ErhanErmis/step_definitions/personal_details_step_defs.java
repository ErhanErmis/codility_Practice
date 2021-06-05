package Com.Test.ErhanErmis.step_definitions;

import Com.Test.ErhanErmis.pages.personalAccount;
import Com.Test.ErhanErmis.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class personal_details_step_defs {

    @And("the use navigates to my personal information page")
    public void theUseNavigatesToMyPersonalInformationPage() throws InterruptedException {
        Thread.sleep(1000);
        new personalAccount().personalInfo.click();
    }

    @Then("the user updates name")
    public void the_user_updates_name() {
        personalAccount PA= new personalAccount();
        PA.name.clear();
        PA.name.sendKeys("newname");
        PA.password.sendKeys(ConfigurationReader.get("password"));
        PA.saveButton.click();

    }

    @Then("the user verifies that name is updated")
    public void the_user_verifies_that_name_is_updated() {
        Assert.assertTrue(new personalAccount().confirmText.getText().contains("has been successfully"));
    }


}
