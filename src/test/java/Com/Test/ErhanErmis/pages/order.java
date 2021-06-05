package Com.Test.ErhanErmis.pages;

import Com.Test.ErhanErmis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class order extends base{

    public order (){
        PageFactory.initElements(Driver.get(),this);

    }
    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    public WebElement tShirtImage;
    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement daddtocart;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    public WebElement fpopup;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    public WebElement addtocard;

    @FindBy(xpath = "//*[contains(text(),'Proceed to checkout')]")
    public WebElement popup;

    @FindBy(xpath = "(//*[contains(text(),'Proceed to checkout')])[2]")
    public WebElement summaryPC;
    @FindBy(xpath = "(//*[contains(text(),'Proceed to checkout')])[2]")
    public WebElement addressPC;
    @FindBy(id ="cgv")
    public WebElement TC;

    @FindBy(xpath = "(//*[contains(text(),'Proceed to checkout')])[2]")
    public WebElement shippingPC;
    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    public WebElement payment;
    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    public WebElement confirmOrder;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/text()[6]")
    public WebElement orderRef;

    @FindBy(xpath = "//*[@class=\"price\"]")
    public WebElement price;

    @FindBy(xpath = "//*[@title=\"View my customer account\"]")
    public WebElement myAccount;

    @FindBy(xpath = "//*[text()='Order history and details']")
    public WebElement orderHistory;

    //span[contains(text(),'My personal information')]








}
