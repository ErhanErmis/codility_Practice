package Com.Test.ErhanErmis.step_definitions;

import Com.Test.ErhanErmis.pages.order;
import Com.Test.ErhanErmis.utilities.BrowserUtils;
import Com.Test.ErhanErmis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.sql.SQLOutput;

public class orders_step_defs {
String refNum= "";
    @Given("the user is on the Mystore page")
    public void the_user_is_on_the_Mystore_page() {

    }

    @Then("the user navigates to t-shirts page")
    public void the_user_navigates_to_t_shirts_page() {
new order().tShirt.click();
    }

    @Then("the user selects a t-shirt")
    public void the_user_selects_a_t_shirt() {
        BrowserUtils.waitFor(3);
        JavascriptExecutor JSE = (JavascriptExecutor)Driver.get();
        JSE.executeScript("arguments[0].scrollIntoView(true);",new order().tShirtImage);
        BrowserUtils.waitFor(3);
        new Actions(Driver.get()).moveToElement(new order().tShirtImage).perform();
        new order().daddtocart.click();
    }

//    @Then("the user clicks the add to cart button")
//    public void the_user_clicks_the_add_to_cart_button() {
//        BrowserUtils.waitFor(3);
//        new order().fpopup.click();
//    }

    @Then("the user clicks on proceed to checkout button at the pop up screen")
    public void the_user_clicks_on_proceed_to_checkout_button_at_the_pop_up_screen() {
        BrowserUtils.waitFor(3);
        new order().popup.click();
    }

    @Then("the user clicks on proceed to checkout button at the shopping summary")
    public void the_user_clicks_on_proceed_to_checkout_button_at_the_shopping_summary() {
        new order().summaryPC.click();
    }

    @Then("the user clicks on proceed to checkout button at the addresses")
    public void the_user_clicks_on_proceed_to_checkout_button_at_the_addresses() {
        new order().addressPC.click();
    }

    @Then("the user accepts the terms and conditions")
    public void the_user_accepts_the_terms_and_conditions() {
        new order().TC.click();
    }

    @Then("the user clicks on proceed to checkout button at the shipping")
    public void the_user_clicks_on_proceed_to_checkout_button_at_the_shipping() {
        new order().shippingPC.click();
    }

    @Then("the user select the payment option")
    public void the_user_select_the_payment_option() {
        new order().payment.click();
        BrowserUtils.waitFor(3);
    }
    @Then("the user confirms the order")
    public void theUserConfirmsTheOrder() {
        new order().confirmOrder.click();
    }

    @Then("the user views to confirmation page")
    public void theUserViewsToConfirmationPage() {
        System.out.println(Driver.get().getTitle());
        Assert.assertTrue(Driver.get().getTitle().contains("Order confirmation"));



    }


    @Then("the user navigates to personal account")
    public void theNavigatesToPersonalAccount() {
        new order().myAccount.click();

    }

    @Then("the user clicks on order history button")
    public void theUserClicksOnOrderHistoryButton() {
        new order().orderHistory.click();
        
    }

    @Then("the user confirms the order number")
    public void theUserConfirmsTheOrderNumber() {
        Assert.assertFalse(new order().price.getText().isEmpty());
    }
}
