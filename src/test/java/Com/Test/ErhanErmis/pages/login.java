package Com.Test.ErhanErmis.pages;

import Com.Test.ErhanErmis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends base {

    public login (){
        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;

    @FindBy(id = "email")
    public WebElement emailbox;

    @FindBy(id = "passwd")
    public WebElement passwdbox;

    @FindBy(id = "SubmitLogin")
    public WebElement submit;

    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/span[2]")
    public WebElement submitConfirm;



}
